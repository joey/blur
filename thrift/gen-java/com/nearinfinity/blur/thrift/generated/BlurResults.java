/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package com.nearinfinity.blur.thrift.generated;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.apache.thrift.*;
import org.apache.thrift.async.*;
import org.apache.thrift.meta_data.*;
import org.apache.thrift.transport.*;
import org.apache.thrift.protocol.*;

public class BlurResults implements TBase<BlurResults, BlurResults._Fields>, java.io.Serializable, Cloneable {
  private static final TStruct STRUCT_DESC = new TStruct("BlurResults");

  private static final TField TOTAL_RESULTS_FIELD_DESC = new TField("totalResults", TType.I64, (short)1);
  private static final TField SHARD_INFO_FIELD_DESC = new TField("shardInfo", TType.MAP, (short)2);
  private static final TField RESULTS_FIELD_DESC = new TField("results", TType.LIST, (short)3);
  private static final TField EXCEPTIONS_FIELD_DESC = new TField("exceptions", TType.LIST, (short)4);
  private static final TField QUERY_FIELD_DESC = new TField("query", TType.STRUCT, (short)5);
  private static final TField REAL_TIME_FIELD_DESC = new TField("realTime", TType.I64, (short)6);
  private static final TField CPU_TIME_FIELD_DESC = new TField("cpuTime", TType.I64, (short)7);
  private static final TField FACET_COUNTS_FIELD_DESC = new TField("facetCounts", TType.LIST, (short)8);

  public long totalResults;
  public Map<String,Long> shardInfo;
  public List<BlurResult> results;
  public List<BlurException> exceptions;
  public BlurQuery query;
  public long realTime;
  public long cpuTime;
  public List<Long> facetCounts;

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements TFieldIdEnum {
    TOTAL_RESULTS((short)1, "totalResults"),
    SHARD_INFO((short)2, "shardInfo"),
    RESULTS((short)3, "results"),
    EXCEPTIONS((short)4, "exceptions"),
    QUERY((short)5, "query"),
    REAL_TIME((short)6, "realTime"),
    CPU_TIME((short)7, "cpuTime"),
    FACET_COUNTS((short)8, "facetCounts");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // TOTAL_RESULTS
          return TOTAL_RESULTS;
        case 2: // SHARD_INFO
          return SHARD_INFO;
        case 3: // RESULTS
          return RESULTS;
        case 4: // EXCEPTIONS
          return EXCEPTIONS;
        case 5: // QUERY
          return QUERY;
        case 6: // REAL_TIME
          return REAL_TIME;
        case 7: // CPU_TIME
          return CPU_TIME;
        case 8: // FACET_COUNTS
          return FACET_COUNTS;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __TOTALRESULTS_ISSET_ID = 0;
  private static final int __REALTIME_ISSET_ID = 1;
  private static final int __CPUTIME_ISSET_ID = 2;
  private BitSet __isset_bit_vector = new BitSet(3);

  public static final Map<_Fields, FieldMetaData> metaDataMap;
  static {
    Map<_Fields, FieldMetaData> tmpMap = new EnumMap<_Fields, FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.TOTAL_RESULTS, new FieldMetaData("totalResults", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.I64)));
    tmpMap.put(_Fields.SHARD_INFO, new FieldMetaData("shardInfo", TFieldRequirementType.DEFAULT, 
        new MapMetaData(TType.MAP, 
            new FieldValueMetaData(TType.STRING), 
            new FieldValueMetaData(TType.I64))));
    tmpMap.put(_Fields.RESULTS, new FieldMetaData("results", TFieldRequirementType.DEFAULT, 
        new ListMetaData(TType.LIST, 
            new StructMetaData(TType.STRUCT, BlurResult.class))));
    tmpMap.put(_Fields.EXCEPTIONS, new FieldMetaData("exceptions", TFieldRequirementType.DEFAULT, 
        new ListMetaData(TType.LIST, 
            new FieldValueMetaData(TType.STRUCT))));
    tmpMap.put(_Fields.QUERY, new FieldMetaData("query", TFieldRequirementType.DEFAULT, 
        new StructMetaData(TType.STRUCT, BlurQuery.class)));
    tmpMap.put(_Fields.REAL_TIME, new FieldMetaData("realTime", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.I64)));
    tmpMap.put(_Fields.CPU_TIME, new FieldMetaData("cpuTime", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.I64)));
    tmpMap.put(_Fields.FACET_COUNTS, new FieldMetaData("facetCounts", TFieldRequirementType.DEFAULT, 
        new ListMetaData(TType.LIST, 
            new FieldValueMetaData(TType.I64))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    FieldMetaData.addStructMetaDataMap(BlurResults.class, metaDataMap);
  }

  public BlurResults() {
    this.totalResults = 0L;

  }

  public BlurResults(
    long totalResults,
    Map<String,Long> shardInfo,
    List<BlurResult> results,
    List<BlurException> exceptions,
    BlurQuery query,
    long realTime,
    long cpuTime,
    List<Long> facetCounts)
  {
    this();
    this.totalResults = totalResults;
    setTotalResultsIsSet(true);
    this.shardInfo = shardInfo;
    this.results = results;
    this.exceptions = exceptions;
    this.query = query;
    this.realTime = realTime;
    setRealTimeIsSet(true);
    this.cpuTime = cpuTime;
    setCpuTimeIsSet(true);
    this.facetCounts = facetCounts;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public BlurResults(BlurResults other) {
    __isset_bit_vector.clear();
    __isset_bit_vector.or(other.__isset_bit_vector);
    this.totalResults = other.totalResults;
    if (other.isSetShardInfo()) {
      Map<String,Long> __this__shardInfo = new HashMap<String,Long>();
      for (Map.Entry<String, Long> other_element : other.shardInfo.entrySet()) {

        String other_element_key = other_element.getKey();
        Long other_element_value = other_element.getValue();

        String __this__shardInfo_copy_key = other_element_key;

        Long __this__shardInfo_copy_value = other_element_value;

        __this__shardInfo.put(__this__shardInfo_copy_key, __this__shardInfo_copy_value);
      }
      this.shardInfo = __this__shardInfo;
    }
    if (other.isSetResults()) {
      List<BlurResult> __this__results = new ArrayList<BlurResult>();
      for (BlurResult other_element : other.results) {
        __this__results.add(new BlurResult(other_element));
      }
      this.results = __this__results;
    }
    if (other.isSetExceptions()) {
      List<BlurException> __this__exceptions = new ArrayList<BlurException>();
      for (BlurException other_element : other.exceptions) {
        __this__exceptions.add(new BlurException(other_element));
      }
      this.exceptions = __this__exceptions;
    }
    if (other.isSetQuery()) {
      this.query = new BlurQuery(other.query);
    }
    this.realTime = other.realTime;
    this.cpuTime = other.cpuTime;
    if (other.isSetFacetCounts()) {
      List<Long> __this__facetCounts = new ArrayList<Long>();
      for (Long other_element : other.facetCounts) {
        __this__facetCounts.add(other_element);
      }
      this.facetCounts = __this__facetCounts;
    }
  }

  public BlurResults deepCopy() {
    return new BlurResults(this);
  }

  @Override
  public void clear() {
    this.totalResults = 0L;

    this.shardInfo = null;
    this.results = null;
    this.exceptions = null;
    this.query = null;
    setRealTimeIsSet(false);
    this.realTime = 0;
    setCpuTimeIsSet(false);
    this.cpuTime = 0;
    this.facetCounts = null;
  }

  public long getTotalResults() {
    return this.totalResults;
  }

  public BlurResults setTotalResults(long totalResults) {
    this.totalResults = totalResults;
    setTotalResultsIsSet(true);
    return this;
  }

  public void unsetTotalResults() {
    __isset_bit_vector.clear(__TOTALRESULTS_ISSET_ID);
  }

  /** Returns true if field totalResults is set (has been asigned a value) and false otherwise */
  public boolean isSetTotalResults() {
    return __isset_bit_vector.get(__TOTALRESULTS_ISSET_ID);
  }

  public void setTotalResultsIsSet(boolean value) {
    __isset_bit_vector.set(__TOTALRESULTS_ISSET_ID, value);
  }

  public int getShardInfoSize() {
    return (this.shardInfo == null) ? 0 : this.shardInfo.size();
  }

  public void putToShardInfo(String key, long val) {
    if (this.shardInfo == null) {
      this.shardInfo = new HashMap<String,Long>();
    }
    this.shardInfo.put(key, val);
  }

  public Map<String,Long> getShardInfo() {
    return this.shardInfo;
  }

  public BlurResults setShardInfo(Map<String,Long> shardInfo) {
    this.shardInfo = shardInfo;
    return this;
  }

  public void unsetShardInfo() {
    this.shardInfo = null;
  }

  /** Returns true if field shardInfo is set (has been asigned a value) and false otherwise */
  public boolean isSetShardInfo() {
    return this.shardInfo != null;
  }

  public void setShardInfoIsSet(boolean value) {
    if (!value) {
      this.shardInfo = null;
    }
  }

  public int getResultsSize() {
    return (this.results == null) ? 0 : this.results.size();
  }

  public java.util.Iterator<BlurResult> getResultsIterator() {
    return (this.results == null) ? null : this.results.iterator();
  }

  public void addToResults(BlurResult elem) {
    if (this.results == null) {
      this.results = new ArrayList<BlurResult>();
    }
    this.results.add(elem);
  }

  public List<BlurResult> getResults() {
    return this.results;
  }

  public BlurResults setResults(List<BlurResult> results) {
    this.results = results;
    return this;
  }

  public void unsetResults() {
    this.results = null;
  }

  /** Returns true if field results is set (has been asigned a value) and false otherwise */
  public boolean isSetResults() {
    return this.results != null;
  }

  public void setResultsIsSet(boolean value) {
    if (!value) {
      this.results = null;
    }
  }

  public int getExceptionsSize() {
    return (this.exceptions == null) ? 0 : this.exceptions.size();
  }

  public java.util.Iterator<BlurException> getExceptionsIterator() {
    return (this.exceptions == null) ? null : this.exceptions.iterator();
  }

  public void addToExceptions(BlurException elem) {
    if (this.exceptions == null) {
      this.exceptions = new ArrayList<BlurException>();
    }
    this.exceptions.add(elem);
  }

  public List<BlurException> getExceptions() {
    return this.exceptions;
  }

  public BlurResults setExceptions(List<BlurException> exceptions) {
    this.exceptions = exceptions;
    return this;
  }

  public void unsetExceptions() {
    this.exceptions = null;
  }

  /** Returns true if field exceptions is set (has been asigned a value) and false otherwise */
  public boolean isSetExceptions() {
    return this.exceptions != null;
  }

  public void setExceptionsIsSet(boolean value) {
    if (!value) {
      this.exceptions = null;
    }
  }

  public BlurQuery getQuery() {
    return this.query;
  }

  public BlurResults setQuery(BlurQuery query) {
    this.query = query;
    return this;
  }

  public void unsetQuery() {
    this.query = null;
  }

  /** Returns true if field query is set (has been asigned a value) and false otherwise */
  public boolean isSetQuery() {
    return this.query != null;
  }

  public void setQueryIsSet(boolean value) {
    if (!value) {
      this.query = null;
    }
  }

  public long getRealTime() {
    return this.realTime;
  }

  public BlurResults setRealTime(long realTime) {
    this.realTime = realTime;
    setRealTimeIsSet(true);
    return this;
  }

  public void unsetRealTime() {
    __isset_bit_vector.clear(__REALTIME_ISSET_ID);
  }

  /** Returns true if field realTime is set (has been asigned a value) and false otherwise */
  public boolean isSetRealTime() {
    return __isset_bit_vector.get(__REALTIME_ISSET_ID);
  }

  public void setRealTimeIsSet(boolean value) {
    __isset_bit_vector.set(__REALTIME_ISSET_ID, value);
  }

  public long getCpuTime() {
    return this.cpuTime;
  }

  public BlurResults setCpuTime(long cpuTime) {
    this.cpuTime = cpuTime;
    setCpuTimeIsSet(true);
    return this;
  }

  public void unsetCpuTime() {
    __isset_bit_vector.clear(__CPUTIME_ISSET_ID);
  }

  /** Returns true if field cpuTime is set (has been asigned a value) and false otherwise */
  public boolean isSetCpuTime() {
    return __isset_bit_vector.get(__CPUTIME_ISSET_ID);
  }

  public void setCpuTimeIsSet(boolean value) {
    __isset_bit_vector.set(__CPUTIME_ISSET_ID, value);
  }

  public int getFacetCountsSize() {
    return (this.facetCounts == null) ? 0 : this.facetCounts.size();
  }

  public java.util.Iterator<Long> getFacetCountsIterator() {
    return (this.facetCounts == null) ? null : this.facetCounts.iterator();
  }

  public void addToFacetCounts(long elem) {
    if (this.facetCounts == null) {
      this.facetCounts = new ArrayList<Long>();
    }
    this.facetCounts.add(elem);
  }

  public List<Long> getFacetCounts() {
    return this.facetCounts;
  }

  public BlurResults setFacetCounts(List<Long> facetCounts) {
    this.facetCounts = facetCounts;
    return this;
  }

  public void unsetFacetCounts() {
    this.facetCounts = null;
  }

  /** Returns true if field facetCounts is set (has been asigned a value) and false otherwise */
  public boolean isSetFacetCounts() {
    return this.facetCounts != null;
  }

  public void setFacetCountsIsSet(boolean value) {
    if (!value) {
      this.facetCounts = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case TOTAL_RESULTS:
      if (value == null) {
        unsetTotalResults();
      } else {
        setTotalResults((Long)value);
      }
      break;

    case SHARD_INFO:
      if (value == null) {
        unsetShardInfo();
      } else {
        setShardInfo((Map<String,Long>)value);
      }
      break;

    case RESULTS:
      if (value == null) {
        unsetResults();
      } else {
        setResults((List<BlurResult>)value);
      }
      break;

    case EXCEPTIONS:
      if (value == null) {
        unsetExceptions();
      } else {
        setExceptions((List<BlurException>)value);
      }
      break;

    case QUERY:
      if (value == null) {
        unsetQuery();
      } else {
        setQuery((BlurQuery)value);
      }
      break;

    case REAL_TIME:
      if (value == null) {
        unsetRealTime();
      } else {
        setRealTime((Long)value);
      }
      break;

    case CPU_TIME:
      if (value == null) {
        unsetCpuTime();
      } else {
        setCpuTime((Long)value);
      }
      break;

    case FACET_COUNTS:
      if (value == null) {
        unsetFacetCounts();
      } else {
        setFacetCounts((List<Long>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case TOTAL_RESULTS:
      return new Long(getTotalResults());

    case SHARD_INFO:
      return getShardInfo();

    case RESULTS:
      return getResults();

    case EXCEPTIONS:
      return getExceptions();

    case QUERY:
      return getQuery();

    case REAL_TIME:
      return new Long(getRealTime());

    case CPU_TIME:
      return new Long(getCpuTime());

    case FACET_COUNTS:
      return getFacetCounts();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been asigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case TOTAL_RESULTS:
      return isSetTotalResults();
    case SHARD_INFO:
      return isSetShardInfo();
    case RESULTS:
      return isSetResults();
    case EXCEPTIONS:
      return isSetExceptions();
    case QUERY:
      return isSetQuery();
    case REAL_TIME:
      return isSetRealTime();
    case CPU_TIME:
      return isSetCpuTime();
    case FACET_COUNTS:
      return isSetFacetCounts();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof BlurResults)
      return this.equals((BlurResults)that);
    return false;
  }

  public boolean equals(BlurResults that) {
    if (that == null)
      return false;

    boolean this_present_totalResults = true;
    boolean that_present_totalResults = true;
    if (this_present_totalResults || that_present_totalResults) {
      if (!(this_present_totalResults && that_present_totalResults))
        return false;
      if (this.totalResults != that.totalResults)
        return false;
    }

    boolean this_present_shardInfo = true && this.isSetShardInfo();
    boolean that_present_shardInfo = true && that.isSetShardInfo();
    if (this_present_shardInfo || that_present_shardInfo) {
      if (!(this_present_shardInfo && that_present_shardInfo))
        return false;
      if (!this.shardInfo.equals(that.shardInfo))
        return false;
    }

    boolean this_present_results = true && this.isSetResults();
    boolean that_present_results = true && that.isSetResults();
    if (this_present_results || that_present_results) {
      if (!(this_present_results && that_present_results))
        return false;
      if (!this.results.equals(that.results))
        return false;
    }

    boolean this_present_exceptions = true && this.isSetExceptions();
    boolean that_present_exceptions = true && that.isSetExceptions();
    if (this_present_exceptions || that_present_exceptions) {
      if (!(this_present_exceptions && that_present_exceptions))
        return false;
      if (!this.exceptions.equals(that.exceptions))
        return false;
    }

    boolean this_present_query = true && this.isSetQuery();
    boolean that_present_query = true && that.isSetQuery();
    if (this_present_query || that_present_query) {
      if (!(this_present_query && that_present_query))
        return false;
      if (!this.query.equals(that.query))
        return false;
    }

    boolean this_present_realTime = true;
    boolean that_present_realTime = true;
    if (this_present_realTime || that_present_realTime) {
      if (!(this_present_realTime && that_present_realTime))
        return false;
      if (this.realTime != that.realTime)
        return false;
    }

    boolean this_present_cpuTime = true;
    boolean that_present_cpuTime = true;
    if (this_present_cpuTime || that_present_cpuTime) {
      if (!(this_present_cpuTime && that_present_cpuTime))
        return false;
      if (this.cpuTime != that.cpuTime)
        return false;
    }

    boolean this_present_facetCounts = true && this.isSetFacetCounts();
    boolean that_present_facetCounts = true && that.isSetFacetCounts();
    if (this_present_facetCounts || that_present_facetCounts) {
      if (!(this_present_facetCounts && that_present_facetCounts))
        return false;
      if (!this.facetCounts.equals(that.facetCounts))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(BlurResults other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    BlurResults typedOther = (BlurResults)other;

    lastComparison = Boolean.valueOf(isSetTotalResults()).compareTo(typedOther.isSetTotalResults());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTotalResults()) {
      lastComparison = TBaseHelper.compareTo(this.totalResults, typedOther.totalResults);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetShardInfo()).compareTo(typedOther.isSetShardInfo());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetShardInfo()) {
      lastComparison = TBaseHelper.compareTo(this.shardInfo, typedOther.shardInfo);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetResults()).compareTo(typedOther.isSetResults());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetResults()) {
      lastComparison = TBaseHelper.compareTo(this.results, typedOther.results);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetExceptions()).compareTo(typedOther.isSetExceptions());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetExceptions()) {
      lastComparison = TBaseHelper.compareTo(this.exceptions, typedOther.exceptions);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetQuery()).compareTo(typedOther.isSetQuery());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetQuery()) {
      lastComparison = TBaseHelper.compareTo(this.query, typedOther.query);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetRealTime()).compareTo(typedOther.isSetRealTime());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRealTime()) {
      lastComparison = TBaseHelper.compareTo(this.realTime, typedOther.realTime);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetCpuTime()).compareTo(typedOther.isSetCpuTime());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCpuTime()) {
      lastComparison = TBaseHelper.compareTo(this.cpuTime, typedOther.cpuTime);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetFacetCounts()).compareTo(typedOther.isSetFacetCounts());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetFacetCounts()) {
      lastComparison = TBaseHelper.compareTo(this.facetCounts, typedOther.facetCounts);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(TProtocol iprot) throws TException {
    TField field;
    iprot.readStructBegin();
    while (true)
    {
      field = iprot.readFieldBegin();
      if (field.type == TType.STOP) { 
        break;
      }
      switch (field.id) {
        case 1: // TOTAL_RESULTS
          if (field.type == TType.I64) {
            this.totalResults = iprot.readI64();
            setTotalResultsIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 2: // SHARD_INFO
          if (field.type == TType.MAP) {
            {
              TMap _map17 = iprot.readMapBegin();
              this.shardInfo = new HashMap<String,Long>(2*_map17.size);
              for (int _i18 = 0; _i18 < _map17.size; ++_i18)
              {
                String _key19;
                long _val20;
                _key19 = iprot.readString();
                _val20 = iprot.readI64();
                this.shardInfo.put(_key19, _val20);
              }
              iprot.readMapEnd();
            }
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 3: // RESULTS
          if (field.type == TType.LIST) {
            {
              TList _list21 = iprot.readListBegin();
              this.results = new ArrayList<BlurResult>(_list21.size);
              for (int _i22 = 0; _i22 < _list21.size; ++_i22)
              {
                BlurResult _elem23;
                _elem23 = new BlurResult();
                _elem23.read(iprot);
                this.results.add(_elem23);
              }
              iprot.readListEnd();
            }
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 4: // EXCEPTIONS
          if (field.type == TType.LIST) {
            {
              TList _list24 = iprot.readListBegin();
              this.exceptions = new ArrayList<BlurException>(_list24.size);
              for (int _i25 = 0; _i25 < _list24.size; ++_i25)
              {
                BlurException _elem26;
                _elem26 = new BlurException();
                _elem26.read(iprot);
                this.exceptions.add(_elem26);
              }
              iprot.readListEnd();
            }
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 5: // QUERY
          if (field.type == TType.STRUCT) {
            this.query = new BlurQuery();
            this.query.read(iprot);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 6: // REAL_TIME
          if (field.type == TType.I64) {
            this.realTime = iprot.readI64();
            setRealTimeIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 7: // CPU_TIME
          if (field.type == TType.I64) {
            this.cpuTime = iprot.readI64();
            setCpuTimeIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 8: // FACET_COUNTS
          if (field.type == TType.LIST) {
            {
              TList _list27 = iprot.readListBegin();
              this.facetCounts = new ArrayList<Long>(_list27.size);
              for (int _i28 = 0; _i28 < _list27.size; ++_i28)
              {
                long _elem29;
                _elem29 = iprot.readI64();
                this.facetCounts.add(_elem29);
              }
              iprot.readListEnd();
            }
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        default:
          TProtocolUtil.skip(iprot, field.type);
      }
      iprot.readFieldEnd();
    }
    iprot.readStructEnd();

    // check for required fields of primitive type, which can't be checked in the validate method
    validate();
  }

  public void write(TProtocol oprot) throws TException {
    validate();

    oprot.writeStructBegin(STRUCT_DESC);
    oprot.writeFieldBegin(TOTAL_RESULTS_FIELD_DESC);
    oprot.writeI64(this.totalResults);
    oprot.writeFieldEnd();
    if (this.shardInfo != null) {
      oprot.writeFieldBegin(SHARD_INFO_FIELD_DESC);
      {
        oprot.writeMapBegin(new TMap(TType.STRING, TType.I64, this.shardInfo.size()));
        for (Map.Entry<String, Long> _iter30 : this.shardInfo.entrySet())
        {
          oprot.writeString(_iter30.getKey());
          oprot.writeI64(_iter30.getValue());
        }
        oprot.writeMapEnd();
      }
      oprot.writeFieldEnd();
    }
    if (this.results != null) {
      oprot.writeFieldBegin(RESULTS_FIELD_DESC);
      {
        oprot.writeListBegin(new TList(TType.STRUCT, this.results.size()));
        for (BlurResult _iter31 : this.results)
        {
          _iter31.write(oprot);
        }
        oprot.writeListEnd();
      }
      oprot.writeFieldEnd();
    }
    if (this.exceptions != null) {
      oprot.writeFieldBegin(EXCEPTIONS_FIELD_DESC);
      {
        oprot.writeListBegin(new TList(TType.STRUCT, this.exceptions.size()));
        for (BlurException _iter32 : this.exceptions)
        {
          _iter32.write(oprot);
        }
        oprot.writeListEnd();
      }
      oprot.writeFieldEnd();
    }
    if (this.query != null) {
      oprot.writeFieldBegin(QUERY_FIELD_DESC);
      this.query.write(oprot);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldBegin(REAL_TIME_FIELD_DESC);
    oprot.writeI64(this.realTime);
    oprot.writeFieldEnd();
    oprot.writeFieldBegin(CPU_TIME_FIELD_DESC);
    oprot.writeI64(this.cpuTime);
    oprot.writeFieldEnd();
    if (this.facetCounts != null) {
      oprot.writeFieldBegin(FACET_COUNTS_FIELD_DESC);
      {
        oprot.writeListBegin(new TList(TType.I64, this.facetCounts.size()));
        for (long _iter33 : this.facetCounts)
        {
          oprot.writeI64(_iter33);
        }
        oprot.writeListEnd();
      }
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("BlurResults(");
    boolean first = true;

    sb.append("totalResults:");
    sb.append(this.totalResults);
    first = false;
    if (!first) sb.append(", ");
    sb.append("shardInfo:");
    if (this.shardInfo == null) {
      sb.append("null");
    } else {
      sb.append(this.shardInfo);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("results:");
    if (this.results == null) {
      sb.append("null");
    } else {
      sb.append(this.results);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("exceptions:");
    if (this.exceptions == null) {
      sb.append("null");
    } else {
      sb.append(this.exceptions);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("query:");
    if (this.query == null) {
      sb.append("null");
    } else {
      sb.append(this.query);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("realTime:");
    sb.append(this.realTime);
    first = false;
    if (!first) sb.append(", ");
    sb.append("cpuTime:");
    sb.append(this.cpuTime);
    first = false;
    if (!first) sb.append(", ");
    sb.append("facetCounts:");
    if (this.facetCounts == null) {
      sb.append("null");
    } else {
      sb.append(this.facetCounts);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
  }

}

