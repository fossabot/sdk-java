# Authorize.Net Java SDK

[![Authorize.net Java CI](https://github.com/AuthorizeNet/sdk-java/actions/workflows/java-workflow.yml/badge.svg?branch=master)](https://github.com/AuthorizeNet/sdk-java/actions/workflows/java-workflow.yml)
[![Maven Central](https://img.shields.io/maven-central/v/net.authorize/anet-java-sdk.svg?style=flat)](http://mvnrepository.com/artifact/net.authorize/anet-java-sdk)
[![FOSSA Status](https://app.fossa.com/api/projects/git%2Bgithub.com%2FAremixdj%2Fsdk-java.svg?type=shield)](https://app.fossa.com/projects/git%2Bgithub.com%2FAremixdj%2Fsdk-java?ref=badge_shield)

## IMPORTANT NOTE

### Support for Java 1.8

**A new version that supports Java 1.8 is `v2.0.7`. This is the _LAST_ release with support for Java 1.8.**

### Support for Java 9 and higher

**A new version of the SDK has been released that supports Java 9 and higher. This new version is `v3.0.0`.**

## Requirements
* JDK 9 and higher
* Ant 1.6.2 or higher (build SDK only)
* Maven 2.2.0 or higher (build SDK only)
* An Authorize.Net account (see _Registration & Configuration_ section below)

_Note 1: Support for building the SDK with either Ant or Maven has been made. Please see the respective build processes below.  All initial jars and docs were built with Ant, however._

### Dependencies
* commons-logging-1.3.3
* log4j-2.23.1
* log4j-jcl-2.23.1
* log4j-api-2.23.1
* log4j-core-2.23.1
* log4j-1.2-api-2.23.1
* httpclient5-5.3.1
* httpcore5-5.2.5
* gson-2.11.0
* jakarta.xml.bind-api-4.0.2
* jaxb-runtime-4.0.5
* jackson-module-jakarta-xmlbind-annotations-2.17.2
* junit-4.13.1
* hamcrest-core-1.3
* hamcrest-library-1.3
* jmock-2.6.0

### Migrating from older versions
Since August 2018, the Authorize.Net API has been reorganized to be more merchant focused. Authorize.Net AIM, ARB, CIM, Transaction Reporting, and SIM classes have been deprecated in favor of `net\authorize\api`. To see the full list of mapping of new features corresponding to the deprecated features, see [MIGRATING.md](MIGRATING.md).

### Contribution
  - If you need information or clarification about Authorize.Net features, create an issue with your question. You can also search the [Authorize.Net developer community](https://community.developer.authorize.net/) for discussions related to your question.
  - Before creating pull requests, read [the contributors guide](CONTRIBUTING.md).

### TLS 1.2
The Authorize.Net APIs only support connections using the TLS 1.2 security protocol. Make sure to upgrade all required components to support TLS 1.2. Keep these components up to date to mitigate the risk of new security flaws.


## Installation
```
  <groupId>net.authorize</groupId>
  <artifactId>anet-java-sdk</artifactId>
  <version>LATEST</version>
```

## Registration & Configuration
Use of this SDK and the Authorize.Net APIs requires having an account on the Authorize.Net system. You can find these details in the Settings section.
If you don't currently have a production Authorize.Net account, [sign up for a sandbox account](https://developer.authorize.net/sandbox/).

### Authentication
To authenticate with the Authorize.Net API, use your account's API Login ID and Transaction Key. If you don't have these credentials, obtain them from the Merchant Interface.  For production accounts, the Merchant Interface is located at (https://account.authorize.net/), and for sandbox accounts, at (https://sandbox.authorize.net).

After you have your credentials, load them into the appropriate variables in your code. The below sample code shows how to set the credentials as part of the API request.

#### To set your API credentials for an API request:
```java
    MerchantAuthenticationType merchantAuthenticationType  = new MerchantAuthenticationType() ;
    merchantAuthenticationType.setName("YOUR_API_LOGIN_ID");
    merchantAuthenticationType.setTransactionKey("YOUR_TRANSACTION_KEY");
    ApiOperationBase.setMerchantAuthentication(merchantAuthenticationType);
```

Never include your API Login ID and Transaction Key directly in a file in a publicly accessible portion of your website. As a best practice, define the API Login ID and Transaction Key in a constants file, and reference those constants in your code.

### Switching between the sandbox environment and the production environment
Authorize.Net maintains a complete sandbox environment for testing and development purposes. The sandbox environment is an exact replica of our production environment, with simulated transaction authorization and settlement. By default, this SDK is configured to use the sandbox environment. To switch to the production environment, set the appropriate environment constant using ApiOperationBase `setEnvironment` method. For example:
```java
// For PRODUCTION use
ApiOperationBase.setEnvironment(Environment.PRODUCTION);
```

API credentials are different for each environment, so be sure to switch to the appropriate credentials when switching environments.

## SDK Usage Examples and Sample Code
When using this SDK, downloading the Authorize.Net sample code repository is recommended.
* [Authorize.Net Java Sample Code Repository (on GitHub)](https://github.com/AuthorizeNet/sample-code-java)

The repository contains comprehensive sample code for common uses of the Authorize.Net API.

The API Reference contains details and examples of the structure and formatting of the Authorize.Net API.
* [Developer Center API Reference](http://developer.authorize.net/api/reference/index.html)

Use the examples in the API Reference to determine which methods and information to include in an API request using this SDK.

## Create a Chase Pay Transaction

Use this method to authorize and capture a payment using a tokenized credit card number issued by Chase Pay. Chase Pay transactions are only available to merchants using the Paymentech processor.

The following information is required in the request:
- **payment token**
- **expiration date**
- **cryptogram** received from the token provider
- **tokenRequestorName**
- **tokenRequestorId**
- **tokenRequestorEci**

When using the SDK to submit Chase Pay transactions, consider the following points:
- `tokenRequesterName` must be populated with **`”CHASE_PAY”`**
- `tokenRequestorId` must be populated with the **`Token Requestor ID`** provided by Chase Pay services for each transaction during consumer checkout
- `tokenRequesterEci` must be populated with the **`ECI Indicator`** provided by Chase Pay services for each transaction during consumer checkout

## Building & Testing the SDK
Build the SDK with Maven
------------------------

To compile the SDK and create a .jar file:

 ` $ mvn clean package`

Build the SDK with Ant
----------------------

To compile the SDK and create a .jar file:

 ` $ ant jar`

To run the unit tests:

 ` $ ant unit-test`

To create the javadocs:

 ` $ ant javadoc`

### Running the SDK Tests
* Note:  To properly run the unit tests, please reference the anet-java-sdk.properties file, which contains the API credentials for testing the SDK.

### Testing Guide
For additional help in testing your own code, Authorize.Net maintains a [comprehensive testing guide](http://developer.authorize.net/hello_world/testing_guide/) that includes test credit card numbers to use and special triggers to generate certain responses from the sandbox environment.

## Logging Sensitive Data

The Authorize.Net Java SDK uses Log4J2 framework for logging purposes. Enable the logger by keeping a configuration file `log4j2.xml` in the resources folder of the application. A sample [log4j2.xml](https://github.com/AuthorizeNet/sdk-java/blob/master/resources/log4j2.xml) file has been provided as a reference.

The possible log levels are `DEBUG, INFO, WARN, ERROR` and `FATAL`. There is a new pattern layout introduced to mask sensitive data while logging and can be used with the application by making the following configurations in the `log4j2.xml` file:

1. Create your own appender under `<Appenders></Appenders>` and insert the `<PatternLayout><pattern></pattern></PatternLayout>` section. (Example is present in the `log4j2.xml` file)
    * To enable masking of sensitive data, replace `%m` with `%maskedMessage`.
    * To disable masking, replace `%maskedMessage` with `%m`.
2. Create a logger under `<Loggers></Loggers>`
3. The `name` field in the `<Logger>` should contain the namespace from where log messages needs to be written to file.
4. Attach an `<AppenderRef>` section where the `ref` field uses one of the Appenders that have been created under the `<Appenders>` section.
5. Do **NOT** modify the logger with `<Root>`.

By default the logger comes with two appenders, **LogToConsole** and **RollingFile**.

The sensitive fields that are masked during logging are:
* Card Number
* Card Code
* Expiration Date
* Transaction Key
* Account Number
* Name on Account

There is also a list of regular expressions which the sensitive logger uses to mask credit card numbers while logging.

More information on the regular expressions used during sensitive data logging [can be found here](https://github.com/AuthorizeNet/sdk-java/blob/master/resources/AuthorizedNetSensitiveTagsConfig.json).

### Transaction Hash Upgrade
Authorize.Net is phasing out the MD5 based `transHash` element in favor of the SHA-512 based `transHashSHA2`. The setting in the Merchant Interface which controlled the MD5 Hash option is no longer available, and the `transHash` element will stop returning values at a later date to be determined. For information on how to use `transHashSHA2`, see the [Transaction Hash Upgrade Guide](https://developer.authorize.net/support/hash_upgrade/).

## License
This repository is distributed under a proprietary license. See the provided [`LICENSE.txt`](/LICENSE.txt) file.


[![FOSSA Status](https://app.fossa.com/api/projects/git%2Bgithub.com%2FAremixdj%2Fsdk-java.svg?type=large)](https://app.fossa.com/projects/git%2Bgithub.com%2FAremixdj%2Fsdk-java?ref=badge_large)