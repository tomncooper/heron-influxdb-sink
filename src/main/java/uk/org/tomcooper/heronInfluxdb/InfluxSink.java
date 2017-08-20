package uk.org.tomcooper.heronInfluxdb;

import java.util.Map;
import java.util.logging.Logger;

import org.influxdb.InfluxDB;

import com.twitter.heron.spi.metricsmgr.metrics.MetricsRecord;
import com.twitter.heron.spi.metricsmgr.sink.IMetricsSink;
import com.twitter.heron.spi.metricsmgr.sink.SinkContext;

public class InfluxSink implements IMetricsSink {
	
	private static final Logger LOG = Logger.getLogger(InfluxSink.class.getName());
   
	/** InluxDB connection instance **/
	private InfluxDB influxDB;	
	/** Heron Topology ID string **/
	private String topologyName;
	
	public void init(Map<String, Object> conf, SinkContext context) {

		LOG.info("Configuration: " + conf.toString());	

		topologyName = context.getTopologyName();
	
	}

	public void processRecord(MetricsRecord arg0) {
		// TODO Auto-generated method stub
		
	}

	public void flush() {
		// TODO Auto-generated method stub
		
	}

	public void close() {
		// TODO Auto-generated method stub
		
	}

}
