package com.alex.olap.org.saiku.olap.query2.util.olap.query2.dto.service.olap.totals.aggregators;

import org.olap4j.metadata.Measure;
import mondrian.util.Format;
public class SumAggregator extends TotalAggregator {

  SumAggregator(Format format) {
    super( format );
  }

  private double sum = 0.0;

  @Override
  public void addData( double data ) {
    sum += data;
  }

  @Override
  public Double getValue() {
    return sum;
  }

  @Override
  public TotalAggregator newInstance() {
    return new SumAggregator( format );
  }

  public TotalAggregator newInstance( Format format, Measure measure ) {
    return new SumAggregator( format );
  }

}