InfluxDB Metric Sink for Heron
------------------------------

This is a metric sink for the [Heron](www.heronstreaming.io) distributed stream
processing engine. It forwards all metrics for given topology to an
[InfluxDB](https://www.influxdata.com/) instance.

Testing
=======

The easiest way to test this sink is to spin up a docker container:

```
$ docker pull influxdb

$ docker run --name=influxdb -d -p 8086:8086 influxdb
```
