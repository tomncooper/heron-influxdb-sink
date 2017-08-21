InfluxDB Metric Sink for Heron
==============================

This is a metric sink for the [Heron](www.heronstreaming.io) distributed stream
processing engine. It forwards all metrics for given topology to an
[InfluxDB](https://www.influxdata.com/) instance.

Testing
-------

To test this sink you can use the docker development environment that Heron 
provides and spin up a seperate InfluxDB instance in a docker container:

```
$ docker pull influxdb

$ docker run --name=influxdb -d -p 8086:8086 influxdb
```
