# API-for-Package-Measurement-Conversion

API For Package Measurement Conversion is a RESTful API that provides measurement conversion functionality. It allows users to convert input strings into processed measurement results.

## Usage
The API provides the following endpoint:

**Endpoint**: `/convert-measurements`

**Method**: GET

**Parameters**:
- `input`: The input string to be converted.

**Response**:
The processed measurement result as an array of integers.

## Example
```
GET /convert-measurements?input=aa
```
This will return the processed measurement result as an array of integers: `[1]`

## Input Format
The measurement input should be a string consisting of alphabetic characters ('a' to 'z'), underscores ('_'), and the letter 'z'. The input represents measurements where each alphabetic character represents a unit and each 'z' represents a multiplier. Underscores represent a zero value. The API converts the input into a list of integers representing the measurements.

## Error Handling
If the API receives an invalid or unsupported measurement input, it will return a 400 Bad Request response with an error message.
## Prerequisites
Before running the API, ensure that you have the following prerequisites installed on your system:
- Java 17
- Maven
- Docker or Docker Compose

## Running with Docker Compose
To run the API using Docker Compose, follow these steps using cmd:
1. Clone the repository to your local machine. 
   ```
   git clone https://github.com/AnwaarAlbusaidi/APIPackageMeasurementConversion.git
   ```
2. Navigate to the project directory.
   ```
   cd your-repository
   ```
3. Run the following command to build the Docker image:
   ```
   docker-compose build
   ```
4. Once the image is built, start the container:
   ```
   docker-compose up
   ```
5. The API will be accessible at http://localhost:8080/convert-measurements.

## Running without Docker
If you prefer not to use Docker, you can run the API locally using the following steps:
1. Clone the repository to your local machine.
2. Navigate to the project directory.
3. Build the project using Maven:
   ```
   mvn clean package
   ```
4. Start the API using the following command:
   ```
   java -jar target/apiformeasurementconversion-0.0.1-SNAPSHOT.jar
   ```
5. The API will be accessible at http://localhost:8080/convert-measurements.

Make sure to replace `target/apiformeasurementconversion-0.0.1-SNAPSHOT.jar` with the correct path to the JAR file generated during the build process.

## Contributing
Contributions to the API-for-Package-Measurement-Conversion project are welcome. If you encounter any issues or have suggestions for improvement, please open an issue or submit a pull request on the GitHub repository.

