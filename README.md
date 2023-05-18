# API-for-Package-Measurement-Conversion

API For Package Measurement Conversion is a RESTful API that provides measurement conversion functionality. It allows users to convert input strings into processed measurement results.

# Usage
The API provides the following endpoint:

/convert-measurements: Converts an input string into processed measurement results.

Parameters:

input: The input string to be converted.

Response:

The processed measurement result as array of integers.

# Example:
GET /convert-measurements?input=aa

This will return the processed measurement result as array of integers {1}

# Docker Configuration
To run the API using Docker, make sure you have Docker installed on your system. Then, follow these steps:

Run the Docker compose:
docker-compose up

The API will be accessible at http://localhost:8080/convert-measurements.


