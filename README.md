# ISO 3166 Country Codes
Java implementation of the ISO ([International Organization for Standardization](https://www.iso.org)) standard ISO [3166 - Country Codes](https://www.iso.org/iso-3166-country-codes.html).

  ## Table of Contents
  - [Description](#Description)
    - [Overview](#Overview)
    - [Supported ISO standards](#supported)
  - [Installation](#Installation)
  	- [Maven dependency](#Maven)
	- [Gradle dependency](#Gradle)
  - [Usage](#Usage)
  - [Maintainers](#maintainers)
  - [Contribute](#contribute)
  - [License](#license)

  ## Description
    ### Overview
 refdata-iso-countries is a Java 8 implementation of the ISO 3166 standard, officially named Country 
 codes and codes for their subdivisions.
 
 ISO 3166 is one of the most used ISO standards over the world. It defines a standard and unique way to 
 identify countries and territories.
 
 It is used as a basis in the Oracle JDK (???) to configure Locales (???), but is commonly integrated 
 within others languages APIs, such as Microsoft (???) or Python ().
 
 This artifact can be easy used as a reference data (domain) enumeration, providing a very simple interface 
 (package.enum link), allowing you to deal with country codes into your program
 or as a standard to communicate with others systems (i.e. FIX protocol,SWIFT, I18N ?). 
 
   ### Supported ISO standards
 ISO 3166 is a kind of "umbrella" standard as it contains several ISO sub-standards. The table below represents 
 those sub-standards and their level of support in refdata-iso- (??)country-codes:
 
 ISO 3166 parts | Description | Example | Supported in version
 ------------ | ------------- | ------------- | -------------
 ISO 3166-1 alpha-2 | Content cell 2 | badge release
 ISO 3166-1 alpha-3 | Content column 2 | badge release
 ISO 3166-1 numeric | Content column 2 | badge release
 4 ?
 3166-2 ?

## Installation
 ### Maven dependency
 ```xml
 <dependency>
    <groupId>io.refdata</groupId>
    <artifactId>refdata-iso-country-codes</artifactId>
    <version>1.0.0</version>
 </dependency>
 ```
 ### Gradle dependency
 ```groovy
 compile group: 'io.refdata', name: 'refdata-iso-country-codes', version: '1.0.0'
 ```
 
## Usage
test
```java

```

## API Design

The choice to build this ISO-3166 standard as a simple Java enumeration is quite simple:
 * Java enumerations are powerful and easy to test,
 * The country codes are not updated frequently,
 * Weak data complexity
 * Everything is in a single class, without i/o to an external resource storage containing the ISO-3166 country codes (JSON or XML),
 * The implementations found in various code repositories (as Github) are partial or not API design driven.
 
## Maintainers

You can contact the development team by sending an email to xxxx@gmail.com.

## Contribute

Pull requests are welcome !

## License


