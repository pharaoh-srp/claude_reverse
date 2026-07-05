    var ael;
    cse("duration", {
      Duration: ael = {
        fields: {
          seconds: {
            type: "int64",
            id: 1
          },
          nanos: {
            type: "int32",
            id: 2
          }
        }
      }
    });
    cse("timestamp", {
      Timestamp: ael
    });
    cse("empty", {
      Empty: {
        fields: {}
      }
    });
    cse("struct", {
      Struct: {
        fields: {
          fields: {
            keyType: "string",
            type: "Value",
            id: 1
          }
        }
      },
      Value: {
        oneofs: {
          kind: {
            oneof: ["nullValue", "numberValue", "stringValue", "boolValue", "structValue", "listValue"]
          }
        },
        fields: {
          nullValue: {
            type: "NullValue",
            id: 1
          },
          numberValue: {
            type: "double",
            id: 2
          },
          stringValue: {
            type: "string",
            id: 3
          },
          boolValue: {
            type: "bool",
            id: 4
          },
          structValue: {
            type: "Struct",
            id: 5
          },
          listValue: {
            type: "ListValue",
            id: 6
          }
        }
      },
      NullValue: {
        values: {
          NULL_VALUE: 0
        }
      },
      ListValue: {
        fields: {
          values: {
            rule: "repeated",
            type: "Value",
            id: 1
          }
        }
      }
    });
    cse("wrappers", {
      DoubleValue: {
        fields: {
          value: {
            type: "double",
            id: 1
          }
        }
      },
      FloatValue: {
        fields: {
          value: {
            type: "float",
            id: 1
          }
        }
      },
      Int64Value: {
        fields: {
          value: {
            type: "int64",
            id: 1
          }
        }
      },
      UInt64Value: {
        fields: {
          value: {
            type: "uint64",
            id: 1
          }
        }
      },
      Int32Value: {
        fields: {
          value: {
            type: "int32",
            id: 1
          }
        }
      },
      UInt32Value: {
        fields: {
          value: {
            type: "uint32",
            id: 1
          }
        }
      },
      BoolValue: {
        fields: {
          value: {
            type: "bool",
            id: 1
          }
        }
      },
      StringValue: {
        fields: {
          value: {
            type: "string",
            id: 1
          }
        }
      },
      BytesValue: {
        fields: {
          value: {
            type: "bytes",
            id: 1
          }
        }
      }
    });
    cse("field_mask", {
      FieldMask: {
        fields: {
          paths: {
            rule: "repeated",
            type: "string",
            id: 1
          }
        }
      }
    });
    cse.get = function (t) {
      return cse[t] || null;
    };
  });