  var del = __commonJS((HJ_, uel) => {
    var p1e = uel.exports = XZa();
    p1e.build = "full";
    p1e.tokenize = rko();
    p1e.parse = iel();
    p1e.common = cel();
    p1e.Root._configure(p1e.Type, p1e.parse, p1e.common);
  });
  var ezn = __commonJS((jJ_, pel) => {
    pel.exports = del();
  });
  var oko = __commonJS((qJ_, Bem) => {
    Bem.exports = {
      nested: {
        google: {
          nested: {
            protobuf: {
              options: {
                go_package: "google.golang.org/protobuf/types/descriptorpb",
                java_package: "com.google.protobuf",
                java_outer_classname: "DescriptorProtos",
                csharp_namespace: "Google.Protobuf.Reflection",
                objc_class_prefix: "GPB",
                cc_enable_arenas: true,
                optimize_for: "SPEED"
              },
              nested: {
                FileDescriptorSet: {
                  edition: "proto2",
                  fields: {
                    file: {
                      rule: "repeated",
                      type: "FileDescriptorProto",
                      id: 1
                    }
                  },
                  extensions: [[536000000, 536000000]]
                },
                Edition: {
                  edition: "proto2",
                  values: {
                    EDITION_UNKNOWN: 0,
                    EDITION_LEGACY: 900,
                    EDITION_PROTO2: 998,
                    EDITION_PROTO3: 999,
                    EDITION_2023: 1000,
                    EDITION_2024: 1001,
                    EDITION_1_TEST_ONLY: 1,
                    EDITION_2_TEST_ONLY: 2,
                    EDITION_99997_TEST_ONLY: 99997,
                    EDITION_99998_TEST_ONLY: 99998,
                    EDITION_99999_TEST_ONLY: 99999,
                    EDITION_MAX: 2147483647
                  }
                },
                FileDescriptorProto: {
                  edition: "proto2",
                  fields: {
                    name: {
                      type: "string",
                      id: 1
                    },
                    package: {
                      type: "string",
                      id: 2
                    },
                    dependency: {
                      rule: "repeated",
                      type: "string",
                      id: 3
                    },
                    publicDependency: {
                      rule: "repeated",
                      type: "int32",
                      id: 10
                    },
                    weakDependency: {
                      rule: "repeated",
                      type: "int32",
                      id: 11
                    },
                    optionDependency: {
                      rule: "repeated",
                      type: "string",
                      id: 15
                    },
                    messageType: {
                      rule: "repeated",
                      type: "DescriptorProto",
                      id: 4
                    },
                    enumType: {
                      rule: "repeated",
                      type: "EnumDescriptorProto",
                      id: 5
                    },
                    service: {
                      rule: "repeated",
                      type: "ServiceDescriptorProto",
                      id: 6
                    },
                    extension: {
                      rule: "repeated",
                      type: "FieldDescriptorProto",
                      id: 7
                    },
                    options: {
                      type: "FileOptions",
                      id: 8
                    },
                    sourceCodeInfo: {
                      type: "SourceCodeInfo",
                      id: 9
                    },
                    syntax: {
                      type: "string",
                      id: 12
                    },
                    edition: {
                      type: "Edition",
                      id: 14
                    }
                  }
                },
                DescriptorProto: {
                  edition: "proto2",
                  fields: {
                    name: {
                      type: "string",
                      id: 1
                    },
                    field: {
                      rule: "repeated",
                      type: "FieldDescriptorProto",
                      id: 2
                    },
                    extension: {
                      rule: "repeated",
                      type: "FieldDescriptorProto",
                      id: 6
                    },
                    nestedType: {
                      rule: "repeated",
                      type: "DescriptorProto",
                      id: 3
                    },
                    enumType: {
                      rule: "repeated",
                      type: "EnumDescriptorProto",
                      id: 4
                    },
                    extensionRange: {
                      rule: "repeated",
                      type: "ExtensionRange",
                      id: 5
                    },
                    oneofDecl: {
                      rule: "repeated",
                      type: "OneofDescriptorProto",
                      id: 8
                    },
                    options: {
                      type: "MessageOptions",
                      id: 7
                    },
                    reservedRange: {
                      rule: "repeated",
                      type: "ReservedRange",
                      id: 9
                    },
                    reservedName: {
                      rule: "repeated",
                      type: "string",
                      id: 10
                    },
                    visibility: {
                      type: "SymbolVisibility",
                      id: 11
                    }
                  },
                  nested: {
                    ExtensionRange: {
                      fields: {
                        start: {
                          type: "int32",
                          id: 1
                        },
                        end: {
                          type: "int32",
                          id: 2
                        },
                        options: {
                          type: "ExtensionRangeOptions",
                          id: 3
                        }
                      }
                    },
                    ReservedRange: {
                      fields: {
                        start: {
                          type: "int32",
                          id: 1
                        },
                        end: {
                          type: "int32",
                          id: 2
                        }
                      }
                    }
                  }
                },
                ExtensionRangeOptions: {
                  edition: "proto2",
                  fields: {
                    uninterpretedOption: {
                      rule: "repeated",
                      type: "UninterpretedOption",
                      id: 999
                    },
                    declaration: {
                      rule: "repeated",
                      type: "Declaration",
                      id: 2,
                      options: {
                        retention: "RETENTION_SOURCE"
                      }
                    },
                    features: {
                      type: "FeatureSet",
                      id: 50
                    },
                    verification: {
                      type: "VerificationState",
                      id: 3,
                      options: {
                        default: "UNVERIFIED",
                        retention: "RETENTION_SOURCE"
                      }
                    }
                  },
                  extensions: [[1000, 536870911]],
                  nested: {
                    Declaration: {
                      fields: {
                        number: {
                          type: "int32",
                          id: 1
                        },
                        fullName: {
                          type: "string",
                          id: 2
                        },
                        type: {
                          type: "string",
                          id: 3
                        },
                        reserved: {
                          type: "bool",
                          id: 5
                        },
                        repeated: {
                          type: "bool",
                          id: 6
                        }
                      },
                      reserved: [[4, 4]]
                    },
                    VerificationState: {
                      values: {
                        DECLARATION: 0,
                        UNVERIFIED: 1
                      }
                    }
                  }
                },
                FieldDescriptorProto: {
                  edition: "proto2",
                  fields: {
                    name: {
                      type: "string",
                      id: 1
                    },
                    number: {
                      type: "int32",
                      id: 3
                    },
                    label: {
                      type: "Label",
                      id: 4
                    },
                    type: {
                      type: "Type",
                      id: 5
                    },
                    typeName: {
                      type: "string",
                      id: 6
                    },
                    extendee: {
                      type: "string",
                      id: 2
                    },
                    defaultValue: {
                      type: "string",
                      id: 7
                    },
                    oneofIndex: {
                      type: "int32",
                      id: 9
                    },
                    jsonName: {
                      type: "string",
                      id: 10
                    },
                    options: {
                      type: "FieldOptions",
                      id: 8
                    },
                    proto3Optional: {
                      type: "bool",
                      id: 17
                    }
                  },
                  nested: {
                    Type: {
                      values: {
                        TYPE_DOUBLE: 1,
                        TYPE_FLOAT: 2,
                        TYPE_INT64: 3,
                        TYPE_UINT64: 4,
                        TYPE_INT32: 5,
                        TYPE_FIXED64: 6,
                        TYPE_FIXED32: 7,
                        TYPE_BOOL: 8,
                        TYPE_STRING: 9,
                        TYPE_GROUP: 10,
                        TYPE_MESSAGE: 11,
                        TYPE_BYTES: 12,
                        TYPE_UINT32: 13,
                        TYPE_ENUM: 14,
                        TYPE_SFIXED32: 15,
                        TYPE_SFIXED64: 16,
                        TYPE_SINT32: 17,
                        TYPE_SINT64: 18
                      }
                    },
                    Label: {
                      values: {
                        LABEL_OPTIONAL: 1,
                        LABEL_REPEATED: 3,
                        LABEL_REQUIRED: 2
                      }
                    }
                  }
                },
                OneofDescriptorProto: {
                  edition: "proto2",
                  fields: {
                    name: {
                      type: "string",
                      id: 1
                    },
                    options: {
                      type: "OneofOptions",
                      id: 2
                    }
                  }
                },
                EnumDescriptorProto: {
                  edition: "proto2",
                  fields: {
                    name: {
                      type: "string",
                      id: 1
                    },
                    value: {
                      rule: "repeated",
                      type: "EnumValueDescriptorProto",
                      id: 2
                    },
                    options: {
                      type: "EnumOptions",
                      id: 3
                    },
                    reservedRange: {
                      rule: "repeated",
                      type: "EnumReservedRange",
                      id: 4
                    },
                    reservedName: {
                      rule: "repeated",
                      type: "string",
                      id: 5
                    },
                    visibility: {
                      type: "SymbolVisibility",
                      id: 6
                    }
                  },
                  nested: {
                    EnumReservedRange: {
                      fields: {
                        start: {
                          type: "int32",
                          id: 1
                        },
                        end: {
                          type: "int32",
                          id: 2
                        }
                      }
                    }
                  }
                },
                EnumValueDescriptorProto: {
                  edition: "proto2",
                  fields: {
                    name: {
                      type: "string",
                      id: 1
                    },
                    number: {
                      type: "int32",
                      id: 2
                    },
                    options: {
                      type: "EnumValueOptions",
                      id: 3
                    }
                  }
                },
                ServiceDescriptorProto: {
                  edition: "proto2",
                  fields: {
                    name: {
                      type: "string",
                      id: 1
                    },
                    method: {
                      rule: "repeated",
                      type: "MethodDescriptorProto",
                      id: 2
                    },
                    options: {
                      type: "ServiceOptions",
                      id: 3
                    }
                  }
                },
                MethodDescriptorProto: {
                  edition: "proto2",
                  fields: {
                    name: {
                      type: "string",
                      id: 1
                    },
                    inputType: {
                      type: "string",
                      id: 2
                    },
                    outputType: {
                      type: "string",
                      id: 3
                    },
                    options: {
                      type: "MethodOptions",
                      id: 4
                    },
                    clientStreaming: {
                      type: "bool",
                      id: 5
                    },
                    serverStreaming: {
                      type: "bool",
                      id: 6
                    }
                  }
                },
                FileOptions: {
                  edition: "proto2",
                  fields: {
                    javaPackage: {
                      type: "string",
                      id: 1
                    },
                    javaOuterClassname: {
                      type: "string",
                      id: 8
                    },
                    javaMultipleFiles: {
                      type: "bool",
                      id: 10
                    },
                    javaGenerateEqualsAndHash: {
                      type: "bool",
                      id: 20,
                      options: {
                        deprecated: true
                      }
                    },
                    javaStringCheckUtf8: {
                      type: "bool",
                      id: 27
                    },
                    optimizeFor: {
                      type: "OptimizeMode",
                      id: 9,
                      options: {
                        default: "SPEED"
                      }
                    },
                    goPackage: {
                      type: "string",
                      id: 11
                    },
                    ccGenericServices: {
                      type: "bool",
                      id: 16
                    },
                    javaGenericServices: {
                      type: "bool",
                      id: 17
                    },
                    pyGenericServices: {
                      type: "bool",
                      id: 18
                    },
                    deprecated: {
                      type: "bool",
                      id: 23
                    },
                    ccEnableArenas: {
                      type: "bool",
                      id: 31,
                      options: {
                        default: true
                      }
                    },
                    objcClassPrefix: {
                      type: "string",
                      id: 36
                    },
                    csharpNamespace: {
                      type: "string",
                      id: 37
                    },
                    swiftPrefix: {
                      type: "string",
                      id: 39
                    },
                    phpClassPrefix: {
                      type: "string",
                      id: 40
                    },
                    phpNamespace: {
                      type: "string",
                      id: 41
                    },
                    phpMetadataNamespace: {
                      type: "string",
                      id: 44
                    },
                    rubyPackage: {
                      type: "string",
                      id: 45
                    },
                    features: {
                      type: "FeatureSet",
                      id: 50
                    },
                    uninterpretedOption: {
                      rule: "repeated",
                      type: "UninterpretedOption",
                      id: 999
                    }
                  },
                  extensions: [[1000, 536870911]],
                  reserved: [[42, 42], [38, 38], "php_generic_services"],
                  nested: {
                    OptimizeMode: {
                      values: {
                        SPEED: 1,
                        CODE_SIZE: 2,
                        LITE_RUNTIME: 3
                      }
                    }
                  }
                },
                MessageOptions: {
                  edition: "proto2",
                  fields: {
                    messageSetWireFormat: {
                      type: "bool",
                      id: 1
                    },
                    noStandardDescriptorAccessor: {
                      type: "bool",
                      id: 2
                    },
                    deprecated: {
                      type: "bool",
                      id: 3
                    },
                    mapEntry: {
                      type: "bool",
                      id: 7
                    },
                    deprecatedLegacyJsonFieldConflicts: {
                      type: "bool",
                      id: 11,
                      options: {
                        deprecated: true
                      }
                    },
                    features: {
                      type: "FeatureSet",
                      id: 12
                    },
                    uninterpretedOption: {
                      rule: "repeated",
                      type: "UninterpretedOption",
                      id: 999
                    }
                  },
                  extensions: [[1000, 536870911]],
                  reserved: [[4, 4], [5, 5], [6, 6], [8, 8], [9, 9]]
                },
                FieldOptions: {
                  edition: "proto2",
                  fields: {
                    ctype: {
                      type: "CType",
                      id: 1,
                      options: {
                        default: "STRING"
                      }
                    },
                    packed: {
                      type: "bool",
                      id: 2
                    },
                    jstype: {
                      type: "JSType",
                      id: 6,
                      options: {
                        default: "JS_NORMAL"
                      }
                    },
                    lazy: {
                      type: "bool",
                      id: 5
                    },
                    unverifiedLazy: {
                      type: "bool",
                      id: 15
                    },
                    deprecated: {
                      type: "bool",
                      id: 3
                    },
                    weak: {
                      type: "bool",
                      id: 10,
                      options: {
                        deprecated: true
                      }
                    },
                    debugRedact: {
                      type: "bool",
                      id: 16
                    },
                    retention: {
                      type: "OptionRetention",
                      id: 17
                    },
                    targets: {
                      rule: "repeated",
                      type: "OptionTargetType",
                      id: 19
                    },
                    editionDefaults: {
                      rule: "repeated",
                      type: "EditionDefault",
                      id: 20
                    },
                    features: {
                      type: "FeatureSet",
                      id: 21
                    },
                    featureSupport: {
                      type: "FeatureSupport",
                      id: 22
                    },
                    uninterpretedOption: {
                      rule: "repeated",
                      type: "UninterpretedOption",
                      id: 999
                    }
                  },
                  extensions: [[1000, 536870911]],
                  reserved: [[4, 4], [18, 18]],
                  nested: {
                    CType: {
                      values: {
                        STRING: 0,
                        CORD: 1,
                        STRING_PIECE: 2
                      }
                    },
                    JSType: {
                      values: {
                        JS_NORMAL: 0,
                        JS_STRING: 1,
                        JS_NUMBER: 2
                      }
                    },
                    OptionRetention: {
                      values: {
                        RETENTION_UNKNOWN: 0,
                        RETENTION_RUNTIME: 1,
                        RETENTION_SOURCE: 2
                      }
                    },
                    OptionTargetType: {
                      values: {
                        TARGET_TYPE_UNKNOWN: 0,
                        TARGET_TYPE_FILE: 1,
                        TARGET_TYPE_EXTENSION_RANGE: 2,
                        TARGET_TYPE_MESSAGE: 3,
                        TARGET_TYPE_FIELD: 4,
                        TARGET_TYPE_ONEOF: 5,
                        TARGET_TYPE_ENUM: 6,
                        TARGET_TYPE_ENUM_ENTRY: 7,
                        TARGET_TYPE_SERVICE: 8,
                        TARGET_TYPE_METHOD: 9
                      }
                    },
                    EditionDefault: {
                      fields: {
                        edition: {
                          type: "Edition",
                          id: 3
                        },
                        value: {
                          type: "string",
                          id: 2
                        }
                      }
                    },
                    FeatureSupport: {
                      fields: {
                        editionIntroduced: {
                          type: "Edition",
                          id: 1
                        },
                        editionDeprecated: {
                          type: "Edition",
                          id: 2
                        },
                        deprecationWarning: {
                          type: "string",
                          id: 3
                        },
                        editionRemoved: {
                          type: "Edition",
                          id: 4
                        }
                      }
                    }
                  }
                },
                OneofOptions: {
                  edition: "proto2",
                  fields: {
                    features: {
                      type: "FeatureSet",
                      id: 1
                    },
                    uninterpretedOption: {
                      rule: "repeated",
                      type: "UninterpretedOption",
                      id: 999
                    }
                  },
                  extensions: [[1000, 536870911]]
                },
                EnumOptions: {
                  edition: "proto2",
                  fields: {
                    allowAlias: {
                      type: "bool",
                      id: 2
                    },
                    deprecated: {
                      type: "bool",
                      id: 3
                    },
                    deprecatedLegacyJsonFieldConflicts: {
                      type: "bool",
                      id: 6,
                      options: {
                        deprecated: true
                      }
                    },
                    features: {
                      type: "FeatureSet",
                      id: 7
                    },
                    uninterpretedOption: {
                      rule: "repeated",
                      type: "UninterpretedOption",
                      id: 999
                    }
                  },
                  extensions: [[1000, 536870911]],
                  reserved: [[5, 5]]
                },
                EnumValueOptions: {
                  edition: "proto2",
                  fields: {
                    deprecated: {
                      type: "bool",
                      id: 1
                    },
                    features: {
                      type: "FeatureSet",
                      id: 2
                    },
                    debugRedact: {
                      type: "bool",
                      id: 3
                    },
                    featureSupport: {
                      type: "FieldOptions.FeatureSupport",
                      id: 4
                    },
                    uninterpretedOption: {
                      rule: "repeated",
                      type: "UninterpretedOption",
                      id: 999
                    }
                  },
                  extensions: [[1000, 536870911]]
                },
                ServiceOptions: {
                  edition: "proto2",
                  fields: {
                    features: {
                      type: "FeatureSet",
                      id: 34
                    },
                    deprecated: {
                      type: "bool",
                      id: 33
                    },
                    uninterpretedOption: {
                      rule: "repeated",
                      type: "UninterpretedOption",
                      id: 999
                    }
                  },
                  extensions: [[1000, 536870911]]
                },
                MethodOptions: {
                  edition: "proto2",
                  fields: {
                    deprecated: {
                      type: "bool",
                      id: 33
                    },
                    idempotencyLevel: {
                      type: "IdempotencyLevel",
                      id: 34,
                      options: {
                        default: "IDEMPOTENCY_UNKNOWN"
                      }
                    },
                    features: {
                      type: "FeatureSet",
                      id: 35
                    },
                    uninterpretedOption: {
                      rule: "repeated",
                      type: "UninterpretedOption",
                      id: 999
                    }
                  },
                  extensions: [[1000, 536870911]],
                  nested: {
                    IdempotencyLevel: {
                      values: {
                        IDEMPOTENCY_UNKNOWN: 0,
                        NO_SIDE_EFFECTS: 1,
                        IDEMPOTENT: 2
                      }
                    }
                  }
                },
                UninterpretedOption: {
                  edition: "proto2",
                  fields: {
                    name: {
                      rule: "repeated",
                      type: "NamePart",
                      id: 2
                    },
                    identifierValue: {
                      type: "string",
                      id: 3
                    },
                    positiveIntValue: {
                      type: "uint64",
                      id: 4
                    },
                    negativeIntValue: {
                      type: "int64",
                      id: 5
                    },
                    doubleValue: {
                      type: "double",
                      id: 6
                    },
                    stringValue: {
                      type: "bytes",
                      id: 7
                    },
                    aggregateValue: {
                      type: "string",
                      id: 8
                    }
                  },
                  nested: {
                    NamePart: {
                      fields: {
                        namePart: {
                          rule: "required",
                          type: "string",
                          id: 1
                        },
                        isExtension: {
                          rule: "required",
                          type: "bool",
                          id: 2
                        }
                      }
                    }
                  }
                },
                FeatureSet: {
                  edition: "proto2",
                  fields: {
                    fieldPresence: {
                      type: "FieldPresence",
                      id: 1,
                      options: {
                        retention: "RETENTION_RUNTIME",
                        targets: "TARGET_TYPE_FILE",
                        "feature_support.edition_introduced": "EDITION_2023",
                        "edition_defaults.edition": "EDITION_2023",
                        "edition_defaults.value": "EXPLICIT"
                      }
                    },
                    enumType: {
                      type: "EnumType",
                      id: 2,
                      options: {
                        retention: "RETENTION_RUNTIME",
                        targets: "TARGET_TYPE_FILE",
                        "feature_support.edition_introduced": "EDITION_2023",
                        "edition_defaults.edition": "EDITION_PROTO3",
                        "edition_defaults.value": "OPEN"
                      }
                    },
                    repeatedFieldEncoding: {
                      type: "RepeatedFieldEncoding",
                      id: 3,
                      options: {
                        retention: "RETENTION_RUNTIME",
                        targets: "TARGET_TYPE_FILE",
                        "feature_support.edition_introduced": "EDITION_2023",
                        "edition_defaults.edition": "EDITION_PROTO3",
                        "edition_defaults.value": "PACKED"
                      }
                    },
                    utf8Validation: {
                      type: "Utf8Validation",
                      id: 4,
                      options: {
                        retention: "RETENTION_RUNTIME",
                        targets: "TARGET_TYPE_FILE",
                        "feature_support.edition_introduced": "EDITION_2023",
                        "edition_defaults.edition": "EDITION_PROTO3",
                        "edition_defaults.value": "VERIFY"
                      }
                    },
                    messageEncoding: {
                      type: "MessageEncoding",
                      id: 5,
                      options: {
                        retention: "RETENTION_RUNTIME",
                        targets: "TARGET_TYPE_FILE",
                        "feature_support.edition_introduced": "EDITION_2023",
                        "edition_defaults.edition": "EDITION_LEGACY",
                        "edition_defaults.value": "LENGTH_PREFIXED"
                      }
                    },
                    jsonFormat: {
                      type: "JsonFormat",
                      id: 6,
                      options: {
                        retention: "RETENTION_RUNTIME",
                        targets: "TARGET_TYPE_FILE",
                        "feature_support.edition_introduced": "EDITION_2023",
                        "edition_defaults.edition": "EDITION_PROTO3",
                        "edition_defaults.value": "ALLOW"
                      }
                    },
                    enforceNamingStyle: {
                      type: "EnforceNamingStyle",
                      id: 7,
                      options: {
                        retention: "RETENTION_SOURCE",
                        targets: "TARGET_TYPE_METHOD",
                        "feature_support.edition_introduced": "EDITION_2024",
                        "edition_defaults.edition": "EDITION_2024",
                        "edition_defaults.value": "STYLE2024"
                      }
                    },
                    defaultSymbolVisibility: {
                      type: "VisibilityFeature.DefaultSymbolVisibility",
                      id: 8,
                      options: {
                        retention: "RETENTION_SOURCE",
                        targets: "TARGET_TYPE_FILE",
                        "feature_support.edition_introduced": "EDITION_2024",
                        "edition_defaults.edition": "EDITION_2024",
                        "edition_defaults.value": "EXPORT_TOP_LEVEL"
                      }
                    }
                  },
                  extensions: [[1000, 9994], [9995, 9999], [1e4, 1e4]],
                  reserved: [[999, 999]],
                  nested: {
                    FieldPresence: {
                      values: {
                        FIELD_PRESENCE_UNKNOWN: 0,
                        EXPLICIT: 1,
                        IMPLICIT: 2,
                        LEGACY_REQUIRED: 3
                      }
                    },
                    EnumType: {
                      values: {
                        ENUM_TYPE_UNKNOWN: 0,
                        OPEN: 1,
                        CLOSED: 2
                      }
                    },
                    RepeatedFieldEncoding: {
                      values: {
                        REPEATED_FIELD_ENCODING_UNKNOWN: 0,
                        PACKED: 1,
                        EXPANDED: 2
                      }
                    },
                    Utf8Validation: {
                      values: {
                        UTF8_VALIDATION_UNKNOWN: 0,
                        VERIFY: 2,
                        NONE: 3
                      }
                    },
                    MessageEncoding: {
                      values: {
                        MESSAGE_ENCODING_UNKNOWN: 0,
                        LENGTH_PREFIXED: 1,
                        DELIMITED: 2
                      }
                    },
                    JsonFormat: {
                      values: {
                        JSON_FORMAT_UNKNOWN: 0,
                        ALLOW: 1,
                        LEGACY_BEST_EFFORT: 2
                      }
                    },
                    EnforceNamingStyle: {
                      values: {
                        ENFORCE_NAMING_STYLE_UNKNOWN: 0,
                        STYLE2024: 1,
                        STYLE_LEGACY: 2
                      }
                    },
                    VisibilityFeature: {
                      fields: {},
                      reserved: [[1, 536870911]],
                      nested: {
                        DefaultSymbolVisibility: {
                          values: {
                            DEFAULT_SYMBOL_VISIBILITY_UNKNOWN: 0,
                            EXPORT_ALL: 1,
                            EXPORT_TOP_LEVEL: 2,
                            LOCAL_ALL: 3,
                            STRICT: 4
                          }
                        }
                      }
                    }
                  }
                },
                FeatureSetDefaults: {
                  edition: "proto2",
                  fields: {
                    defaults: {
                      rule: "repeated",
                      type: "FeatureSetEditionDefault",
                      id: 1
                    },
                    minimumEdition: {
                      type: "Edition",
                      id: 4
                    },
                    maximumEdition: {
                      type: "Edition",
                      id: 5
                    }
                  },
                  nested: {
                    FeatureSetEditionDefault: {
                      fields: {
                        edition: {
                          type: "Edition",
                          id: 3
                        },
                        overridableFeatures: {
                          type: "FeatureSet",
                          id: 4
                        },
                        fixedFeatures: {
                          type: "FeatureSet",
                          id: 5
                        }
                      },
                      reserved: [[1, 1], [2, 2], "features"]
                    }
                  }
                },
                SourceCodeInfo: {
                  edition: "proto2",
                  fields: {
                    location: {
                      rule: "repeated",
                      type: "Location",
                      id: 1
                    }
                  },
                  extensions: [[536000000, 536000000]],
                  nested: {
                    Location: {
                      fields: {
                        path: {
                          rule: "repeated",
                          type: "int32",
                          id: 1,
                          options: {
                            packed: true
                          }
                        },
                        span: {
                          rule: "repeated",
                          type: "int32",
                          id: 2,
                          options: {
                            packed: true
                          }
                        },
                        leadingComments: {
                          type: "string",
                          id: 3
                        },
                        trailingComments: {
                          type: "string",
                          id: 4
                        },
                        leadingDetachedComments: {
                          rule: "repeated",
                          type: "string",
                          id: 6
                        }
                      }
                    }
                  }
                },
                GeneratedCodeInfo: {
                  edition: "proto2",
                  fields: {
                    annotation: {
                      rule: "repeated",
                      type: "Annotation",
                      id: 1
                    }
                  },
                  nested: {
                    Annotation: {
                      fields: {
                        path: {
                          rule: "repeated",
                          type: "int32",
                          id: 1,
                          options: {
                            packed: true
                          }
                        },
                        sourceFile: {
                          type: "string",
                          id: 2
                        },
                        begin: {
                          type: "int32",
                          id: 3
                        },
                        end: {
                          type: "int32",
                          id: 4
                        },
                        semantic: {
                          type: "Semantic",
                          id: 5
                        }
                      },
                      nested: {
                        Semantic: {
                          values: {
                            NONE: 0,
                            SET: 1,
                            ALIAS: 2
                          }
                        }
                      }
                    }
                  }
                },
                SymbolVisibility: {
                  edition: "proto2",
                  values: {
                    VISIBILITY_UNSET: 0,
                    VISIBILITY_LOCAL: 1,
                    VISIBILITY_EXPORT: 2
                  }
                }
              }
            }
          }
        }
      }
    };
  });
  var Sel = __commonJS((xf, bel) => {
    var F9 = ezn();
    bel.exports = xf = F9.descriptor = F9.Root.fromJSON(oko()).lookup(".google.protobuf");
    var {
      Namespace: mel,
      Root: fVt,
      Enum: nve,
      Type: use,
      Field: m1e,
      MapField: $em,
      OneOf: tzn,
      Service: hVt,
      Method: nzn
    } = F9;
    var fel = F9.util.patterns;
    var Hem = fel.numberRe;
    var rzn = fel.typeRefRe;
    fVt.fromDescriptor = function (t) {
      if (typeof t.length === "number") {
        t = xf.FileDescriptorSet.oC(t);
      }
      var n = new fVt();
      if (t.file) {
        var r;
        var o;
        for (var s = 0, i; s < t.file.length; ++s) {
          if (o = n, (r = t.file[s]).package && r.package.length) {
            o = n.define(r.package);
          }
          var a = Jem(r);
          if (r.name && r.name.length) {
            n.files.push(o.filename = r.name);
          }
          if (r.messageType) {
            for (i = 0; i < r.messageType.length; ++i) {
              o.add(use.fromDescriptor(r.messageType[i], a));
            }
          }
          if (r.enumType) {
            for (i = 0; i < r.enumType.length; ++i) {
              o.add(nve.fromDescriptor(r.enumType[i], a));
            }
          }
          if (r.extension) {
            for (i = 0; i < r.extension.length; ++i) {
              o.add(m1e.fromDescriptor(r.extension[i], a));
            }
          }
          if (r.service) {
            for (i = 0; i < r.service.length; ++i) {
              o.add(hVt.fromDescriptor(r.service[i], a));
            }
          }
          var l = Oyt(r.options, xf.FileOptions);
          if (l) {
            var c = Object.keys(l);
            for (i = 0; i < c.length; ++i) {
              o.setOption(c[i], l[c[i]]);
            }
          }
        }
      }
      return n.resolveAll();
    };
    fVt.prototype.toDescriptor = function (t) {
      var n = xf.FileDescriptorSet.create();
      hel(this, n.file, t);
      return n;
    };
    function hel(e, t, n) {
      var r = xf.FileDescriptorProto.create({
        name: e.filename || (e.fullName.substring(1).replace(/\./g, "_") || "root") + ".proto"
      });
      if (Xem(n, r), !(e instanceof fVt)) {
        r.package = e.fullName.substring(1);
      }
      for (var o = 0, s; o < e.nestedArray.length; ++o) {
        if ((s = e._nestedArray[o]) instanceof use) {
          r.messageType.push(s.toDescriptor(n));
        } else if (s instanceof nve) {
          r.enumType.push(s.toDescriptor());
        } else if (s instanceof m1e) {
          r.extension.push(s.toDescriptor(n));
        } else if (s instanceof hVt) {
          r.service.push(s.toDescriptor());
        } else if (s instanceof mel) {
          hel(s, t, n);
        }
      }
      if (r.options = Dyt(e.options, xf.FileOptions), r.messageType.length + r.enumType.length + r.extension.length + r.service.length) {
        t.push(r);
      }
    }
    var jem = 0;
    use.fromDescriptor = function (t, n, r) {
      if (typeof t.length === "number") {
        t = xf.DescriptorProto.oC(t);
      }
      var o = new use(t.name.length ? t.name : "Type" + jem++, Oyt(t.options, xf.MessageOptions));
      var s;
      if (!r) {
        o._edition = n;
      }
      if (t.oneofDecl) {
        for (s = 0; s < t.oneofDecl.length; ++s) {
          o.add(tzn.fromDescriptor(t.oneofDecl[s]));
        }
      }
      if (t.field) {
        for (s = 0; s < t.field.length; ++s) {
          var i = m1e.fromDescriptor(t.field[s], n, true);
          if (o.add(i), t.field[s].hasOwnProperty("oneofIndex")) {
            o.oneofsArray[t.field[s].oneofIndex].add(i);
          }
        }
      }
      if (t.extension) {
        for (s = 0; s < t.extension.length; ++s) {
          o.add(m1e.fromDescriptor(t.extension[s], n, true));
        }
      }
      if (t.nestedType) {
        for (s = 0; s < t.nestedType.length; ++s) {
          if (o.add(use.fromDescriptor(t.nestedType[s], n, true)), t.nestedType[s].options && t.nestedType[s].options.mapEntry) {
            o.setOption("map_entry", true);
          }
        }
      }
      if (t.enumType) {
        for (s = 0; s < t.enumType.length; ++s) {
          o.add(nve.fromDescriptor(t.enumType[s], n, true));
        }
      }
      if (t.extensionRange && t.extensionRange.length) {
        o.extensions = [];
        for (s = 0; s < t.extensionRange.length; ++s) {
          o.extensions.push([t.extensionRange[s].start, t.extensionRange[s].end]);
        }
      }
      if (t.reservedRange && t.reservedRange.length || t.reservedName && t.reservedName.length) {
        if (o.reserved = [], t.reservedRange) {
          for (s = 0; s < t.reservedRange.length; ++s) {
            o.reserved.push([t.reservedRange[s].start, t.reservedRange[s].end]);
          }
        }
        if (t.reservedName) {
          for (s = 0; s < t.reservedName.length; ++s) {
            o.reserved.push(t.reservedName[s]);
          }
        }
      }
      return o;
    };
    use.prototype.toDescriptor = function (t) {
      var n = xf.DescriptorProto.create({
        name: this.name
      });
      var r;
      for (r = 0; r < this.fieldsArray.length; ++r) {
        var o;
        if (n.field.push(o = this._fieldsArray[r].toDescriptor(t)), this._fieldsArray[r] instanceof $em) {
          var s = sko(this._fieldsArray[r].keyType, this._fieldsArray[r].resolvedKeyType, false);
          var i = sko(this._fieldsArray[r].type, this._fieldsArray[r].resolvedType, false);
          var a = i === 11 || i === 14 ? this._fieldsArray[r].resolvedType && _el(this.parent, this._fieldsArray[r].resolvedType) || this._fieldsArray[r].type : undefined;
          n.nestedType.push(xf.DescriptorProto.create({
            name: o.typeName,
            field: [xf.FieldDescriptorProto.create({
              name: "key",
              number: 1,
              label: 1,
              type: s
            }), xf.FieldDescriptorProto.create({
              name: "value",
              number: 2,
              label: 1,
              type: i,
              typeName: a
            })],
            options: xf.MessageOptions.create({
              mapEntry: true
            })
          }));
        }
      }
      for (r = 0; r < this.oneofsArray.length; ++r) {
        n.oneofDecl.push(this._oneofsArray[r].toDescriptor());
      }
      for (r = 0; r < this.nestedArray.length; ++r) {
        if (this._nestedArray[r] instanceof m1e) {
          n.field.push(this._nestedArray[r].toDescriptor(t));
        } else if (this._nestedArray[r] instanceof use) {
          n.nestedType.push(this._nestedArray[r].toDescriptor(t));
        } else if (this._nestedArray[r] instanceof nve) {
          n.enumType.push(this._nestedArray[r].toDescriptor());
        }
      }
      if (this.extensions) {
        for (r = 0; r < this.extensions.length; ++r) {
          n.extensionRange.push(xf.DescriptorProto.ExtensionRange.create({
            start: this.extensions[r][0],
            end: this.extensions[r][1]
          }));
        }
      }
      if (this.reserved) {
        for (r = 0; r < this.reserved.length; ++r) {
          if (typeof this.reserved[r] === "string") {
            n.reservedName.push(this.reserved[r]);
          } else {
            n.reservedRange.push(xf.DescriptorProto.ReservedRange.create({
              start: this.reserved[r][0],
              end: this.reserved[r][1]
            }));
          }
        }
      }
      n.options = Dyt(this.options, xf.MessageOptions);
      return n;
    };
    m1e.fromDescriptor = function (t, n, r) {
      if (typeof t.length === "number") {
        t = xf.DescriptorProto.oC(t);
      }
      if (typeof t.number !== "number") {
        throw Error("missing field id");
      }
      var o = t.typeName;
      var s;
      if (o != null && o !== "") {
        if (typeof o !== "string" || !rzn.test(o)) {
          throw Error("illegal type name: " + o);
        }
        s = o;
      } else {
        s = zem(t.type);
      }
      var i;
      switch (t.label) {
        case 1:
          i = undefined;
          break;
        case 2:
          i = "required";
          break;
        case 3:
          i = "repeated";
          break;
        default:
          throw Error("illegal label: " + t.label);
      }
      var a = t.extendee;
      if (a != null && a !== "") {
        if (typeof a !== "string" || !rzn.test(a)) {
          throw Error("illegal type name: " + a);
        }
      } else {
        a = undefined;
      }
      var l = new m1e(t.name.length ? t.name : "field" + t.number, t.number, s, i, a);
      if (!r) {
        l._edition = n;
      }
      if (l.options = Oyt(t.options, xf.FieldOptions), t.proto3_optional) {
        l.options.proto3_optional = true;
      }
      if (t.defaultValue && t.defaultValue.length) {
        var c = t.defaultValue;
        switch (c) {
          case "true":
          case "TRUE":
            c = true;
            break;
          case "false":
          case "FALSE":
            c = false;
            break;
          default:
            var u = Hem.exec(c);
            if (u) {
              c = parseInt(c);
            }
            break;
        }
        l.setOption("default", c);
      }
      if (Kem(t.type)) {
        if (n === "proto3") {
          if (t.options && !t.options.packed) {
            l.setOption("packed", false);
          }
        } else if ((!n || n === "proto2") && t.options && t.options.packed) {
          l.setOption("packed", true);
        }
      }
      return l;
    };
    m1e.prototype.toDescriptor = function (t) {
      var n = xf.FieldDescriptorProto.create({
        name: this.name,
        number: this.id
      });
      if (this.map) {
        n.type = 11;
        n.typeName = F9.util.ucFirst(this.name);
        n.label = 3;
      } else {
        switch (n.type = sko(this.type, this.resolve().resolvedType, this.delimited)) {
          case 10:
          case 11:
          case 14:
            n.typeName = this.resolvedType ? _el(this.parent, this.resolvedType) : this.type;
            break;
        }
        if (this.rule === "repeated") {
          n.label = 3;
        } else if (this.required && t === "proto2") {
          n.label = 2;
        } else {
          n.label = 1;
        }
      }
      if (n.extendee = this.extensionField ? this.extensionField.parent.fullName : this.extend, this.partOf && this.parent instanceof use) {
        if ((n.oneofIndex = this.parent.oneofsArray.indexOf(this.partOf)) < 0) {
          throw Error("missing oneof");
        }
      }
      if (this.options) {
        if (n.options = Dyt(this.options, xf.FieldOptions), this.options.default != null) {
          n.defaultValue = String(this.options.default);
        }
        if (this.options.proto3_optional) {
          n.proto3_optional = true;
        }
      }
      if (t === "proto3") {
        if (!this.packed) {
          (n.options || (n.options = xf.FieldOptions.create())).packed = false;
        }
      } else if ((!t || t === "proto2") && this.packed) {
        (n.options || (n.options = xf.FieldOptions.create())).packed = true;
      }
      return n;
    };
    var qem = 0;
    nve.fromDescriptor = function (t, n, r) {
      if (typeof t.length === "number") {
        t = xf.EnumDescriptorProto.oC(t);
      }
      var o = {};
      if (t.value) {
        for (var s = 0; s < t.value.length; ++s) {
          var i = t.value[s].name;
          var a = t.value[s].number || 0;
          o[i && i.length ? i : "NAME" + a] = a;
        }
      }
      var l = new nve(t.name && t.name.length ? t.name : "Enum" + qem++, o, Oyt(t.options, xf.EnumOptions));
      if (!r) {
        l._edition = n;
      }
      return l;
    };
    nve.prototype.toDescriptor = function () {
      var t = [];
      for (var n = 0, r = Object.keys(this.values); n < r.length; ++n) {
        t.push(xf.EnumValueDescriptorProto.create({
          name: r[n],
          number: this.values[r[n]]
        }));
      }
      return xf.EnumDescriptorProto.create({
        name: this.name,
        value: t,
        options: Dyt(this.options, xf.EnumOptions)
      });
    };
    var Wem = 0;
    tzn.fromDescriptor = function (t) {
      if (typeof t.length === "number") {
        t = xf.OneofDescriptorProto.oC(t);
      }
      return new tzn(t.name && t.name.length ? t.name : "oneof" + Wem++);
    };
    tzn.prototype.toDescriptor = function () {
      return xf.OneofDescriptorProto.create({
        name: this.name
      });
    };
    var Gem = 0;
    hVt.fromDescriptor = function (t, n, r) {
      if (typeof t.length === "number") {
        t = xf.ServiceDescriptorProto.oC(t);
      }
      var o = new hVt(t.name && t.name.length ? t.name : "Service" + Gem++, Oyt(t.options, xf.ServiceOptions));
      if (!r) {
        o._edition = n;
      }
      if (t.method) {
        for (var s = 0; s < t.method.length; ++s) {
          o.add(nzn.fromDescriptor(t.method[s]));
        }
      }
      return o;
    };
    hVt.prototype.toDescriptor = function () {
      var t = [];
      for (var n = 0; n < this.methodsArray.length; ++n) {
        t.push(this._methodsArray[n].toDescriptor());
      }
      return xf.ServiceDescriptorProto.create({
        name: this.name,
        method: t,
        options: Dyt(this.options, xf.ServiceOptions)
      });
    };
    var Vem = 0;
    nzn.fromDescriptor = function (t) {
      if (typeof t.length === "number") {
        t = xf.MethodDescriptorProto.oC(t);
      }
      var {
        inputType: n,
        outputType: r
      } = t;
      if (n != null && n !== "") {
        if (typeof n !== "string" || !rzn.test(n)) {
          throw Error("illegal type name: " + n);
        }
      }
      if (r != null && r !== "") {
        if (typeof r !== "string" || !rzn.test(r)) {
          throw Error("illegal type name: " + r);
        }
      }
      return new nzn(t.name && t.name.length ? t.name : "Method" + Vem++, "rpc", n, r, Boolean(t.clientStreaming), Boolean(t.serverStreaming), Oyt(t.options, xf.MethodOptions));
    };
    nzn.prototype.toDescriptor = function () {
      return xf.MethodDescriptorProto.create({
        name: this.name,
        inputType: this.resolvedRequestType ? this.resolvedRequestType.fullName : this.requestType,
        outputType: this.resolvedResponseType ? this.resolvedResponseType.fullName : this.responseType,
        clientStreaming: this.requestStream,
        serverStreaming: this.responseStream,
        options: Dyt(this.options, xf.MethodOptions)
      });
    };
    function zem(e) {
      switch (e) {
        case 1:
          return "double";
        case 2:
          return "float";
        case 3:
          return "int64";
        case 4:
          return "uint64";
        case 5:
          return "int32";
        case 6:
          return "fixed64";
        case 7:
          return "fixed32";
        case 8:
          return "bool";
        case 9:
          return "string";
        case 12:
          return "bytes";
        case 13:
          return "uint32";
        case 15:
          return "sfixed32";
        case 16:
          return "sfixed64";
        case 17:
          return "sint32";
        case 18:
          return "sint64";
      }
      throw Error("illegal type: " + e);
    }
    function Kem(e) {
      switch (e) {
        case 1:
        case 2:
        case 3:
        case 4:
        case 5:
        case 6:
        case 7:
        case 8:
        case 13:
        case 14:
        case 15:
        case 16:
        case 17:
        case 18:
          return true;
      }
      return false;
    }
    function sko(e, t, n) {
      switch (e) {
        case "double":
          return 1;
        case "float":
          return 2;
        case "int64":
          return 3;
        case "uint64":
          return 4;
        case "int32":
          return 5;
        case "fixed64":
          return 6;
        case "fixed32":
          return 7;
        case "bool":
          return 8;
        case "string":
          return 9;
        case "bytes":
          return 12;
        case "uint32":
          return 13;
        case "sfixed32":
          return 15;
        case "sfixed64":
          return 16;
        case "sint32":
          return 17;
        case "sint64":
          return 18;
      }
      if (t instanceof nve) {
        return 14;
      }
      if (t instanceof use) {
        return n ? 10 : 11;
      }
      throw Error("illegal type: " + e);
    }
    function gel(e, t) {
      var n = {};
      for (var r = 0, o, s; r < t.fieldsArray.length; ++r) {
        if ((s = (o = t._fieldsArray[r]).name) === "uninterpretedOption") {
          continue;
        }
        if (!Object.prototype.hasOwnProperty.call(e, s)) {
          continue;
        }
        var i = Yem(s);
        if (o.resolvedType instanceof use) {
          n[i] = gel(e[s], o.resolvedType);
        } else if (o.resolvedType instanceof nve) {
          n[i] = o.resolvedType.valuesById[e[s]];
        } else {
          n[i] = e[s];
        }
      }
      return n;
    }
    function Oyt(e, t) {
      if (!e) {
        return;
      }
      return gel(t.toObject(e), t);
    }
    function yel(e, t) {
      var n = {};
      var r = Object.keys(e);
      for (var o = 0; o < r.length; ++o) {
        var s = r[o];
        var i = F9.util.camelCase(s);
        if (!Object.prototype.hasOwnProperty.call(t.fields, i)) {
          continue;
        }
        var a = t.fields[i];
        if (a.resolvedType instanceof use) {
          n[i] = yel(e[s], a.resolvedType);
        } else {
          n[i] = e[s];
        }
        if (a.repeated && !Array.isArray(n[i])) {
          n[i] = [n[i]];
        }
      }
      return n;
    }
    function Dyt(e, t) {
      if (!e) {
        return;
      }
      return t.fromObject(yel(e, t));
    }
    function _el(e, t) {
      var n = e.fullName.split(".");
      var r = t.fullName.split(".");
      var o = 0;
      var s = 0;
      var i = r.length - 1;
      if (!(e instanceof fVt) && t instanceof mel) {
        while (o < n.length && s < i && n[o] === r[s]) {
          var a = t.lookup(n[o++], true);
          if (a !== null && a !== t) {
            break;
          }
          ++s;
        }
      } else {
        for (; o < n.length && s < i && n[o] === r[s]; ++o, ++s) {
          ;
        }
      }
      return r.slice(s).join(".");
    }
    function Yem(e) {
      return e.substring(0, 1) + e.substring(1).replace(/([A-Z])(?=[a-z]|$)/g, function (t, n) {
        return "_" + n.toLowerCase();
      });
    }
    function Jem(e) {
      if (e.syntax === "editions") {
        switch (e.edition) {
          case xf.Edition.EDITION_2023:
            return "2023";
          default:
            throw Error("Unsupported edition " + e.edition);
        }
      }
      if (e.syntax === "proto3") {
        return "proto3";
      }
      return "proto2";
    }
    function Xem(e, t) {
      if (!e) {
        return;
      }
      if (e === "proto2" || e === "proto3") {
        t.syntax = e;
      } else {
        switch (t.syntax = "editions", e) {
          case "2023":
            t.edition = xf.Edition.EDITION_2023;
            break;
          default:
            throw Error("Unsupported edition " + e);
        }
      }
    }
  });
  var Tel = __commonJS((WJ_, Qem) => {
    Qem.exports = {
      nested: {
        google: {
          nested: {
            protobuf: {
              nested: {
                Api: {
                  fields: {
                    name: {
                      type: "string",
                      id: 1
                    },
                    methods: {
                      rule: "repeated",
                      type: "Method",
                      id: 2
                    },
                    options: {
                      rule: "repeated",
                      type: "Option",
                      id: 3
                    },
                    version: {
                      type: "string",
                      id: 4
                    },
                    sourceContext: {
                      type: "SourceContext",
                      id: 5
                    },
                    mixins: {
                      rule: "repeated",
                      type: "Mixin",
                      id: 6
                    },
                    syntax: {
                      type: "Syntax",
                      id: 7
                    }
                  }
                },
                Method: {
                  fields: {
                    name: {
                      type: "string",
                      id: 1
                    },
                    requestTypeUrl: {
                      type: "string",
                      id: 2
                    },
                    requestStreaming: {
                      type: "bool",
                      id: 3
                    },
                    responseTypeUrl: {
                      type: "string",
                      id: 4
                    },
                    responseStreaming: {
                      type: "bool",
                      id: 5
                    },
                    options: {
                      rule: "repeated",
                      type: "Option",
                      id: 6
                    },
                    syntax: {
                      type: "Syntax",
                      id: 7
                    }
                  }
                },
                Mixin: {
                  fields: {
                    name: {
                      type: "string",
                      id: 1
                    },
                    root: {
                      type: "string",
                      id: 2
                    }
                  }
                },
                SourceContext: {
                  fields: {
                    fileName: {
                      type: "string",
                      id: 1
                    }
                  }
                },
                Option: {
                  fields: {
                    name: {
                      type: "string",
                      id: 1
                    },
                    value: {
                      type: "Any",
                      id: 2
                    }
                  }
                },
                Syntax: {
                  values: {
                    SYNTAX_PROTO2: 0,
                    SYNTAX_PROTO3: 1
                  }
                }
              }
            }
          }
        }
      }
    };
  });
  var Eel = __commonJS((GJ_, Zem) => {
    Zem.exports = {
      nested: {
        google: {
          nested: {
            protobuf: {
              nested: {
                SourceContext: {
                  fields: {
                    fileName: {
                      type: "string",
                      id: 1
                    }
                  }
                }
              }
            }
          }
        }
      }
    };
  });
  var vel = __commonJS((VJ_, etm) => {
    etm.exports = {
      nested: {
        google: {
          nested: {
            protobuf: {
              nested: {
                Type: {
                  fields: {
                    name: {
                      type: "string",
                      id: 1
                    },
                    fields: {
                      rule: "repeated",
                      type: "Field",
                      id: 2
                    },
                    oneofs: {
                      rule: "repeated",
                      type: "string",
                      id: 3
                    },
                    options: {
                      rule: "repeated",
                      type: "Option",
                      id: 4
                    },
                    sourceContext: {
                      type: "SourceContext",
                      id: 5
                    },
                    syntax: {
                      type: "Syntax",
                      id: 6
                    }
                  }
                },
                Field: {
                  fields: {
                    kind: {
                      type: "Kind",
                      id: 1
                    },
                    cardinality: {
                      type: "Cardinality",
                      id: 2
                    },
                    number: {
                      type: "int32",
                      id: 3
                    },
                    name: {
                      type: "string",
                      id: 4
                    },
                    typeUrl: {
                      type: "string",
                      id: 6
                    },
                    oneofIndex: {
                      type: "int32",
                      id: 7
                    },
                    packed: {
                      type: "bool",
                      id: 8
                    },
                    options: {
                      rule: "repeated",
                      type: "Option",
                      id: 9
                    },
                    jsonName: {
                      type: "string",
                      id: 10
                    },
                    defaultValue: {
                      type: "string",
                      id: 11
                    }
                  },
                  nested: {
                    Kind: {
                      values: {
                        TYPE_UNKNOWN: 0,
                        TYPE_DOUBLE: 1,
                        TYPE_FLOAT: 2,
                        TYPE_INT64: 3,
                        TYPE_UINT64: 4,
                        TYPE_INT32: 5,
                        TYPE_FIXED64: 6,
                        TYPE_FIXED32: 7,
                        TYPE_BOOL: 8,
                        TYPE_STRING: 9,
                        TYPE_GROUP: 10,
                        TYPE_MESSAGE: 11,
                        TYPE_BYTES: 12,
                        TYPE_UINT32: 13,
                        TYPE_ENUM: 14,
                        TYPE_SFIXED32: 15,
                        TYPE_SFIXED64: 16,
                        TYPE_SINT32: 17,
                        TYPE_SINT64: 18
                      }
                    },
                    Cardinality: {
                      values: {
                        CARDINALITY_UNKNOWN: 0,
                        CARDINALITY_OPTIONAL: 1,
                        CARDINALITY_REQUIRED: 2,
                        CARDINALITY_REPEATED: 3
                      }
                    }
                  }
                },
                Enum: {
                  fields: {
                    name: {
                      type: "string",
                      id: 1
                    },
                    enumvalue: {
                      rule: "repeated",
                      type: "EnumValue",
                      id: 2
                    },
                    options: {
                      rule: "repeated",
                      type: "Option",
                      id: 3
                    },
                    sourceContext: {
                      type: "SourceContext",
                      id: 4
                    },
                    syntax: {
                      type: "Syntax",
                      id: 5
                    }
                  }
                },
                EnumValue: {
                  fields: {
                    name: {
                      type: "string",
                      id: 1
                    },
                    number: {
                      type: "int32",
                      id: 2
                    },
                    options: {
                      rule: "repeated",
                      type: "Option",
                      id: 3
                    }
                  }
                },
                Option: {
                  fields: {
                    name: {
                      type: "string",
                      id: 1
                    },
                    value: {
                      type: "Any",
                      id: 2
                    }
                  }
                },
                Syntax: {
                  values: {
                    SYNTAX_PROTO2: 0,
                    SYNTAX_PROTO3: 1
                  }
                },
                Any: {
                  fields: {
                    type_url: {
                      type: "string",
                      id: 1
                    },
                    value: {
                      type: "bytes",
                      id: 2
                    }
                  }
                },
                SourceContext: {
                  fields: {
                    fileName: {
                      type: "string",
                      id: 1
                    }
                  }
                }
              }
            }
          }
        }
      }
    };
  });
  var xel = __commonJS(f1e => {
    Object.defineProperty(f1e, "__esModule", {
      value: true
    });
    f1e.addCommonProtos = f1e.loadProtosWithOptionsSync = f1e.loadProtosWithOptions = undefined;
    var wel = require("fs");
    var Cel = require("path");
    var Myt = ezn();
    function Rel(e, t) {
      let n = e.resolvePath;
      e.resolvePath = (r, o) => {
        if (Cel.isAbsolute(o)) {
          return o;
        }
        for (let s of t) {
          let i = Cel.join(s, o);
          try {
            wel.accessSync(i, wel.constants.R_OK);
            return i;
          } catch (a) {
            continue;
          }
        }
        process.emitWarning(`${o} not found in any of the include paths ${t}`);
        return n(r, o);
      };
    }
    async function ttm(e, t) {
      let n = new Myt.Root();
      if (t = t || {}, t.includeDirs) {
        if (!Array.isArray(t.includeDirs)) {
          return Promise.reject(Error("The includeDirs option must be an array"));
        }
        Rel(n, t.includeDirs);
      }
      let r = await n.load(e, t);
      r.resolveAll();
      return r;
    }
    f1e.loadProtosWithOptions = ttm;
    function ntm(e, t) {
      let n = new Myt.Root();
      if (t = t || {}, t.includeDirs) {
        if (!Array.isArray(t.includeDirs)) {
          throw Error("The includeDirs option must be an array");
        }
        Rel(n, t.includeDirs);
      }
      let r = n.loadSync(e, t);
      r.resolveAll();
      return r;
    }
    f1e.loadProtosWithOptionsSync = ntm;
    function rtm() {
      let e = Tel();
      let t = oko();
      let n = Eel();
      let r = vel();
      Myt.common("api", e.nested.google.nested.protobuf.nested);
      Myt.common("descriptor", t.nested.google.nested.protobuf.nested);
      Myt.common("source_context", n.nested.google.nested.protobuf.nested);
      Myt.common("type", r.nested.google.nested.protobuf.nested);
    }
    f1e.addCommonProtos = rtm;
  });
  var kel = __commonJS((gVt, iko) => {
    (function (e, t) {
      function n(r) {
        return "default" in r ? r.default : r;
      }
      if (typeof define === "function" && define.amd) {
        define([], function () {
          var r = {};
          t(r);
          return n(r);
        });
      } else if (typeof gVt === "object") {
        if (t(gVt), typeof iko === "object") {
          iko.exports = n(gVt);
        }
      } else {
        (function () {
          var r = {};
          t(r);
          e.Long = n(r);
        })();
      }
    })(typeof globalThis < "u" ? globalThis : typeof self < "u" ? self : gVt, function (e) {
      Object.defineProperty(e, "__esModule", {
        value: true
      });
      e.default = undefined;
      var t = null;
      try {
        t = new WebAssembly.Instance(new WebAssembly.Module(new Uint8Array([0, 97, 115, 109, 1, 0, 0, 0, 1, 13, 2, 96, 0, 1, 127, 96, 4, 127, 127, 127, 127, 1, 127, 3, 7, 6, 0, 1, 1, 1, 1, 1, 6, 6, 1, 127, 1, 65, 0, 11, 7, 50, 6, 3, 109, 117, 108, 0, 1, 5, 100, 105, 118, 95, 115, 0, 2, 5, 100, 105, 118, 95, 117, 0, 3, 5, 114, 101, 109, 95, 115, 0, 4, 5, 114, 101, 109, 95, 117, 0, 5, 8, 103, 101, 116, 95, 104, 105, 103, 104, 0, 0, 10, 191, 1, 6, 4, 0, 35, 0, 11, 36, 1, 1, 126, 32, 0, 173, 32, 1, 173, 66, 32, 134, 132, 32, 2, 173, 32, 3, 173, 66, 32, 134, 132, 126, 34, 4, 66, 32, 135, 167, 36, 0, 32, 4, 167, 11, 36, 1, 1, 126, 32, 0, 173, 32, 1, 173, 66, 32, 134, 132, 32, 2, 173, 32, 3, 173, 66, 32, 134, 132, 127, 34, 4, 66, 32, 135, 167, 36, 0, 32, 4, 167, 11, 36, 1, 1, 126, 32, 0, 173, 32, 1, 173, 66, 32, 134, 132, 32, 2, 173, 32, 3, 173, 66, 32, 134, 132, 128, 34, 4, 66, 32, 135, 167, 36, 0, 32, 4, 167, 11, 36, 1, 1, 126, 32, 0, 173, 32, 1, 173, 66, 32, 134, 132, 32, 2, 173, 32, 3, 173, 66, 32, 134, 132, 129, 34, 4, 66, 32, 135, 167, 36, 0, 32, 4, 167, 11, 36, 1, 1, 126, 32, 0, 173, 32, 1, 173, 66, 32, 134, 132, 32, 2, 173, 32, 3, 173, 66, 32, 134, 132, 130, 34, 4, 66, 32, 135, 167, 36, 0, 32, 4, 167, 11])), {}).exports;
      } catch {}
      function n(L, P, F) {
        this.low = L | 0;
        this.high = P | 0;
        this.unsigned = !!F;
      }
      n.prototype.__isLong__;
      Object.defineProperty(n.prototype, "__isLong__", {
        value: true
      });
      function r(L) {
        return (L && L.__isLong__) === true;
      }
      function o(L) {
        var P = Math.clz32(L & -L);
        return L ? 31 - P : P;
      }
      n.isLong = r;
      var s = {};
      var i = {};
      function a(L, P) {
        var F;
        var H;
        var U;
        if (P) {
          if (L >>>= 0, U = 0 <= L && L < 256) {
            if (H = i[L], H) {
              return H;
            }
          }
          if (F = c(L, 0, true), U) {
            i[L] = F;
          }
          return F;
        } else {
          if (L |= 0, U = -128 <= L && L < 128) {
            if (H = s[L], H) {
              return H;
            }
          }
          if (F = c(L, L < 0 ? -1 : 0, false), U) {
            s[L] = F;
          }
          return F;
        }
      }
      n.fromInt = a;
      function l(L, P) {
        if (isNaN(L)) {
          return P ? S : b;
        }
        if (P) {
          if (L < 0) {
            return S;
          }
          if (L >= g) {
            return k;
          }
        } else {
          if (L <= -y) {
            return I;
          }
          if (L + 1 >= y) {
            return A;
          }
        }
        if (L < 0) {
          return l(-L, P).neg();
        }
        return c(L % h | 0, L / h | 0, P);
      }
      n.fromNumber = l;
      function c(L, P, F) {
        return new n(L, P, F);
      }
      n.fromBits = c;
      var u = Math.pow;
      function d(L, P, F) {
        if (L.length === 0) {
          throw Error("empty string");
        }
        if (typeof P === "number") {
          F = P;
          P = false;
        } else {
          P = !!P;
        }
        if (L === "NaN" || L === "Infinity" || L === "+Infinity" || L === "-Infinity") {
          return P ? S : b;
        }
        if (F = F || 10, F < 2 || 36 < F) {
          throw RangeError("radix");
        }
        var H;
        if ((H = L.indexOf("-")) > 0) {
          throw Error("interior hyphen");
        } else if (H === 0) {
          return d(L.substring(1), P, F).neg();
        }
        var U = l(u(F, 8));
        var N = b;
        for (var W = 0; W < L.length; W += 8) {
          var j = Math.min(8, L.length - W);
          var z = parseInt(L.substring(W, W + j), F);
          if (j < 8) {
            var V = l(u(F, j));
            N = N.mul(V).add(l(z));
          } else {
            N = N.mul(U);
            N = N.add(l(z));
          }
        }
        N.unsigned = P;
        return N;
      }
      n.fromString = d;
      function p(L, P) {
        if (typeof L === "number") {
          return l(L, P);
        }
        if (typeof L === "string") {
          return d(L, P);
        }
        return c(L.low, L.high, typeof P === "boolean" ? P : L.unsigned);
      }
      n.fromValue = p;
      var m = 65536;
      var f = 16777216;
      var h = m * m;
      var g = h * h;
      var y = g / 2;
      var _ = a(f);
      var b = a(0);
      n.ZERO = b;
      var S = a(0, true);
      n.UZERO = S;
      var E = a(1);
      n.ONE = E;
      var C = a(1, true);
      n.UONE = C;
      var x = a(-1);
      n.NEG_ONE = x;
      var A = c(-1, 2147483647, false);
      n.MAX_VALUE = A;
      var k = c(-1, -1, true);
      n.MAX_UNSIGNED_VALUE = k;
      var I = c(0, -2147483648, false);
      n.MIN_VALUE = I;
      var O = n.prototype;
      if (O.toInt = function () {
        return this.unsigned ? this.low >>> 0 : this.low;
      }, O.toNumber = function () {
        if (this.unsigned) {
          return (this.high >>> 0) * h + (this.low >>> 0);
        }
        return this.high * h + (this.low >>> 0);
      }, O.toString = function (P) {
        if (P = P || 10, P < 2 || 36 < P) {
          throw RangeError("radix");
        }
        if (this.isZero()) {
          return "0";
        }
        if (this.isNegative()) {
          if (this.eq(I)) {
            var F = l(P);
            var H = this.div(F);
            var U = H.mul(F).sub(this);
            return H.toString(P) + U.toInt().toString(P);
          } else {
            return "-" + this.neg().toString(P);
          }
        }
        var N = l(u(P, 6), this.unsigned);
        var W = this;
        var j = "";
        while (true) {
          var z = W.div(N);
          var V = W.sub(z.mul(N)).toInt() >>> 0;
          var K = V.toString(P);
          if (W = z, W.isZero()) {
            return K + j;
          } else {
            while (K.length < 6) {
              K = "0" + K;
            }
            j = "" + K + j;
          }
        }
      }, O.getHighBits = function () {
        return this.high;
      }, O.getHighBitsUnsigned = function () {
        return this.high >>> 0;
      }, O.getLowBits = function () {
        return this.low;
      }, O.getLowBitsUnsigned = function () {
        return this.low >>> 0;
      }, O.getNumBitsAbs = function () {
        if (this.isNegative()) {
          return this.eq(I) ? 64 : this.neg().getNumBitsAbs();
        }
        var P = this.high != 0 ? this.high : this.low;
        for (var F = 31; F > 0; F--) {
          if ((P & 1 << F) != 0) {
            break;
          }
        }
        return this.high != 0 ? F + 33 : F + 1;
      }, O.isSafeInteger = function () {
        var P = this.high >> 21;
        if (!P) {
          return true;
        }
        if (this.unsigned) {
          return false;
        }
        return P === -1 && !(this.low === 0 && this.high === -2097152);
      }, O.isZero = function () {
        return this.high === 0 && this.low === 0;
      }, O.eqz = O.isZero, O.isNegative = function () {
        return !this.unsigned && this.high < 0;
      }, O.isPositive = function () {
        return this.unsigned || this.high >= 0;
      }, O.isOdd = function () {
        return (this.low & 1) === 1;
      }, O.isEven = function () {
        return (this.low & 1) === 0;
      }, O.equals = function (P) {
        if (!r(P)) {
          P = p(P);
        }
        if (this.unsigned !== P.unsigned && this.high >>> 31 === 1 && P.high >>> 31 === 1) {
          return false;
        }
        return this.high === P.high && this.low === P.low;
      }, O.eq = O.equals, O.notEquals = function (P) {
        return !this.eq(P);
      }, O.neq = O.notEquals, O.ne = O.notEquals, O.lessThan = function (P) {
        return this.comp(P) < 0;
      }, O.lt = O.lessThan, O.lessThanOrEqual = function (P) {
        return this.comp(P) <= 0;
      }, O.lte = O.lessThanOrEqual, O.le = O.lessThanOrEqual, O.greaterThan = function (P) {
        return this.comp(P) > 0;
      }, O.gt = O.greaterThan, O.greaterThanOrEqual = function (P) {
        return this.comp(P) >= 0;
      }, O.gte = O.greaterThanOrEqual, O.ge = O.greaterThanOrEqual, O.compare = function (P) {
        if (!r(P)) {
          P = p(P);
        }
        if (this.eq(P)) {
          return 0;
        }
        var F = this.isNegative();
        var H = P.isNegative();
        if (F && !H) {
          return -1;
        }
        if (!F && H) {
          return 1;
        }
        if (!this.unsigned) {
          return this.sub(P).isNegative() ? -1 : 1;
        }
        return P.high >>> 0 > this.high >>> 0 || P.high === this.high && P.low >>> 0 > this.low >>> 0 ? -1 : 1;
      }, O.comp = O.compare, O.negate = function () {
        if (!this.unsigned && this.eq(I)) {
          return I;
        }
        return this.not().add(E);
      }, O.neg = O.negate, O.add = function (P) {
        if (!r(P)) {
          P = p(P);
        }
        var F = this.high >>> 16;
        var H = this.high & 65535;
        var U = this.low >>> 16;
        var N = this.low & 65535;
        var W = P.high >>> 16;
        var j = P.high & 65535;
        var z = P.low >>> 16;
        var V = P.low & 65535;
        var K = 0;
        var J = 0;
        var Q = 0;
        var Z = 0;
        Z += N + V;
        Q += Z >>> 16;
        Z &= 65535;
        Q += U + z;
        J += Q >>> 16;
        Q &= 65535;
        J += H + j;
        K += J >>> 16;
        J &= 65535;
        K += F + W;
        K &= 65535;
        return c(Q << 16 | Z, K << 16 | J, this.unsigned);
      }, O.subtract = function (P) {
        if (!r(P)) {
          P = p(P);
        }
        return this.add(P.neg());
      }, O.sub = O.subtract, O.multiply = function (P) {
        if (this.isZero()) {
          return this;
        }
        if (!r(P)) {
          P = p(P);
        }
        if (t) {
          var F = t.mul(this.low, this.high, P.low, P.high);
          return c(F, t.get_high(), this.unsigned);
        }
        if (P.isZero()) {
          return this.unsigned ? S : b;
        }
        if (this.eq(I)) {
          return P.isOdd() ? I : b;
        }
        if (P.eq(I)) {
          return this.isOdd() ? I : b;
        }
        if (this.isNegative()) {
          if (P.isNegative()) {
            return this.neg().mul(P.neg());
          } else {
            return this.neg().mul(P).neg();
          }
        } else if (P.isNegative()) {
          return this.mul(P.neg()).neg();
        }
        if (this.lt(_) && P.lt(_)) {
          return l(this.toNumber() * P.toNumber(), this.unsigned);
        }
        var H = this.high >>> 16;
        var U = this.high & 65535;
        var N = this.low >>> 16;
        var W = this.low & 65535;
        var j = P.high >>> 16;
        var z = P.high & 65535;
        var V = P.low >>> 16;
        var K = P.low & 65535;
        var J = 0;
        var Q = 0;
        var Z = 0;
        var ne = 0;
        ne += W * K;
        Z += ne >>> 16;
        ne &= 65535;
        Z += N * K;
        Q += Z >>> 16;
        Z &= 65535;
        Z += W * V;
        Q += Z >>> 16;
        Z &= 65535;
        Q += U * K;
        J += Q >>> 16;
        Q &= 65535;
        Q += N * V;
        J += Q >>> 16;
        Q &= 65535;
        Q += W * z;
        J += Q >>> 16;
        Q &= 65535;
        J += H * K + U * V + N * z + W * j;
        J &= 65535;
        return c(Z << 16 | ne, J << 16 | Q, this.unsigned);
      }, O.mul = O.multiply, O.divide = function (P) {
        if (!r(P)) {
          P = p(P);
        }
        if (P.isZero()) {
          throw Error("division by zero");
        }
        if (t) {
          if (!this.unsigned && this.high === -2147483648 && P.low === -1 && P.high === -1) {
            return this;
          }
          var F = (this.unsigned ? t.div_u : t.div_s)(this.low, this.high, P.low, P.high);
          return c(F, t.get_high(), this.unsigned);
        }
        if (this.isZero()) {
          return this.unsigned ? S : b;
        }
        var H;
        var U;
        var N;
        if (!this.unsigned) {
          if (this.eq(I)) {
            if (P.eq(E) || P.eq(x)) {
              return I;
            } else if (P.eq(I)) {
              return E;
            } else {
              var W = this.shr(1);
              if (H = W.div(P).shl(1), H.eq(b)) {
                return P.isNegative() ? E : x;
              } else {
                U = this.sub(P.mul(H));
                N = H.add(U.div(P));
                return N;
              }
            }
          } else if (P.eq(I)) {
            return this.unsigned ? S : b;
          }
          if (this.isNegative()) {
            if (P.isNegative()) {
              return this.neg().div(P.neg());
            }
            return this.neg().div(P).neg();
          } else if (P.isNegative()) {
            return this.div(P.neg()).neg();
          }
          N = b;
        } else {
          if (!P.unsigned) {
            P = P.toUnsigned();
          }
          if (P.gt(this)) {
            return S;
          }
          if (P.gt(this.shru(1))) {
            return C;
          }
          N = S;
        }
        U = this;
        while (U.gte(P)) {
          H = Math.max(1, Math.floor(U.toNumber() / P.toNumber()));
          var j = Math.ceil(Math.log(H) / Math.LN2);
          var z = j <= 48 ? 1 : u(2, j - 48);
          var V = l(H);
          var K = V.mul(P);
          while (K.isNegative() || K.gt(U)) {
            H -= z;
            V = l(H, this.unsigned);
            K = V.mul(P);
          }
          if (V.isZero()) {
            V = E;
          }
          N = N.add(V);
          U = U.sub(K);
        }
        return N;
      }, O.div = O.divide, O.modulo = function (P) {
        if (!r(P)) {
          P = p(P);
        }
        if (t) {
          var F = (this.unsigned ? t.rem_u : t.rem_s)(this.low, this.high, P.low, P.high);
          return c(F, t.get_high(), this.unsigned);
        }
        return this.sub(this.div(P).mul(P));
      }, O.mod = O.modulo, O.rem = O.modulo, O.not = function () {
        return c(~this.low, ~this.high, this.unsigned);
      }, O.countLeadingZeros = function () {
        return this.high ? Math.clz32(this.high) : Math.clz32(this.low) + 32;
      }, O.clz = O.countLeadingZeros, O.countTrailingZeros = function () {
        return this.low ? o(this.low) : o(this.high) + 32;
      }, O.ctz = O.countTrailingZeros, O.and = function (P) {
        if (!r(P)) {
          P = p(P);
        }
        return c(this.low & P.low, this.high & P.high, this.unsigned);
      }, O.or = function (P) {
        if (!r(P)) {
          P = p(P);
        }
        return c(this.low | P.low, this.high | P.high, this.unsigned);
      }, O.xor = function (P) {
        if (!r(P)) {
          P = p(P);
        }
        return c(this.low ^ P.low, this.high ^ P.high, this.unsigned);
      }, O.shiftLeft = function (P) {
        if (r(P)) {
          P = P.toInt();
        }
        if ((P &= 63) === 0) {
          return this;
        } else if (P < 32) {
          return c(this.low << P, this.high << P | this.low >>> 32 - P, this.unsigned);
        } else {
          return c(0, this.low << P - 32, this.unsigned);
        }
      }, O.shl = O.shiftLeft, O.shiftRight = function (P) {
        if (r(P)) {
          P = P.toInt();
        }
        if ((P &= 63) === 0) {
          return this;
        } else if (P < 32) {
          return c(this.low >>> P | this.high << 32 - P, this.high >> P, this.unsigned);
        } else {
          return c(this.high >> P - 32, this.high >= 0 ? 0 : -1, this.unsigned);
        }
      }, O.shr = O.shiftRight, O.shiftRightUnsigned = function (P) {
        if (r(P)) {
          P = P.toInt();
        }
        if ((P &= 63) === 0) {
          return this;
        }
        if (P < 32) {
          return c(this.low >>> P | this.high << 32 - P, this.high >>> P, this.unsigned);
        }
        if (P === 32) {
          return c(this.high, 0, this.unsigned);
        }
        return c(this.high >>> P - 32, 0, this.unsigned);
      }, O.shru = O.shiftRightUnsigned, O.shr_u = O.shiftRightUnsigned, O.rotateLeft = function (P) {
        var F;
        if (r(P)) {
          P = P.toInt();
        }
        if ((P &= 63) === 0) {
          return this;
        }
        if (P === 32) {
          return c(this.high, this.low, this.unsigned);
        }
        if (P < 32) {
          F = 32 - P;
          return c(this.low << P | this.high >>> F, this.high << P | this.low >>> F, this.unsigned);
        }
        P -= 32;
        F = 32 - P;
        return c(this.high << P | this.low >>> F, this.low << P | this.high >>> F, this.unsigned);
      }, O.rotl = O.rotateLeft, O.rotateRight = function (P) {
        var F;
        if (r(P)) {
          P = P.toInt();
        }
        if ((P &= 63) === 0) {
          return this;
        }
        if (P === 32) {
          return c(this.high, this.low, this.unsigned);
        }
        if (P < 32) {
          F = 32 - P;
          return c(this.high << F | this.low >>> P, this.low << F | this.high >>> P, this.unsigned);
        }
        P -= 32;
        F = 32 - P;
        return c(this.low << F | this.high >>> P, this.high << F | this.low >>> P, this.unsigned);
      }, O.rotr = O.rotateRight, O.toSigned = function () {
        if (!this.unsigned) {
          return this;
        }
        return c(this.low, this.high, false);
      }, O.toUnsigned = function () {
        if (this.unsigned) {
          return this;
        }
        return c(this.low, this.high, true);
      }, O.toBytes = function (P) {
        return P ? this.toBytesLE() : this.toBytesBE();
      }, O.toBytesLE = function () {
        var P = this.high;
        var F = this.low;
        return [F & 255, F >>> 8 & 255, F >>> 16 & 255, F >>> 24, P & 255, P >>> 8 & 255, P >>> 16 & 255, P >>> 24];
      }, O.toBytesBE = function () {
        var P = this.high;
        var F = this.low;
        return [P >>> 24, P >>> 16 & 255, P >>> 8 & 255, P & 255, F >>> 24, F >>> 16 & 255, F >>> 8 & 255, F & 255];
      }, n.fromBytes = function (P, F, H) {
        return H ? n.fromBytesLE(P, F) : n.fromBytesBE(P, F);
      }, n.fromBytesLE = function (P, F) {
        return new n(P[0] | P[1] << 8 | P[2] << 16 | P[3] << 24, P[4] | P[5] << 8 | P[6] << 16 | P[7] << 24, F);
      }, n.fromBytesBE = function (P, F) {
        return new n(P[4] << 24 | P[5] << 16 | P[6] << 8 | P[7], P[0] << 24 | P[1] << 16 | P[2] << 8 | P[3], F);
      }, typeof BigInt === "function") {
        n.fromBigInt = function (P, F) {
          var H = Number(BigInt.asIntN(32, P));
          var U = Number(BigInt.asIntN(32, P >> BigInt(32)));
          return c(H, U, F);
        };
        n.fromValue = function (P, F) {
          if (typeof P === "bigint") {
            return fromBigInt(P, F);
          }
          return p(P, F);
        };
        O.toBigInt = function () {
          var P = BigInt(this.low >>> 0);
          var F = BigInt(this.unsigned ? this.high >>> 0 : this.high);
          return F << BigInt(32) | P;
        };
      }
      var M = e.default = n;
    });
  });
  var pko = __commonJS(DM => {
    Object.defineProperty(DM, "__esModule", {
      value: true
    });
    DM.loadFileDescriptorSetFromObject = DM.loadFileDescriptorSetFromBuffer = DM.fromJSON = DM.loadSync = DM.load = DM.IdempotencyLevel = DM.isAnyExtension = DM.Long = undefined;
    var otm = sZa();
    var ome = ezn();
    var uko = Sel();
    var dko = xel();
    var stm = kel();
    DM.Long = stm;
    function itm(e) {
      return "@type" in e && typeof e["@type"] === "string";
    }
    DM.isAnyExtension = itm;
    var Ael;
    (function (e) {
      e.IDEMPOTENCY_UNKNOWN = "IDEMPOTENCY_UNKNOWN";
      e.NO_SIDE_EFFECTS = "NO_SIDE_EFFECTS";
      e.IDEMPOTENT = "IDEMPOTENT";
    })(Ael = DM.IdempotencyLevel || (DM.IdempotencyLevel = {}));
    var Iel = {
      longs: String,
      enums: String,
      bytes: String,
      defaults: true,
      oneofs: true,
      json: true
    };
    function atm(e, t) {
      if (e === "") {
        return t;
      } else {
        return e + "." + t;
      }
    }
    function ltm(e) {
      return e instanceof ome.Service || e instanceof ome.Type || e instanceof ome.Enum;
    }
    function ctm(e) {
      return e instanceof ome.Namespace || e instanceof ome.Root;
    }
    function Pel(e, t) {
      let n = atm(t, e.name);
      if (ltm(e)) {
        return [[n, e]];
      } else if (ctm(e) && typeof e.nested < "u") {
        return Object.keys(e.nested).map(r => Pel(e.nested[r], n)).reduce((r, o) => r.concat(o), []);
      }
      return [];
    }
    function ako(e, t) {
      return function (r) {
        return e.toObject(e.oC(r), t);
      };
    }
    function lko(e) {
      return function (n) {
        if (Array.isArray(n)) {
          throw Error(`Failed to serialize message: expected object with ${e.name} structure, got array instead`);
        }
        let r = e.fromObject(n);
        return e.HS(r).finish();
      };
    }
    function utm(e) {
      return (e || []).reduce((t, n) => {
        for (let [r, o] of Object.entries(n)) {
          switch (r) {
            case "uninterpreted_option":
              t.uninterpreted_option.push(n.uninterpreted_option);
              break;
            default:
              t[r] = o;
          }
        }
        return t;
      }, {
        deprecated: false,
        idempotency_level: Ael.IDEMPOTENCY_UNKNOWN,
        uninterpreted_option: []
      });
    }
    function dtm(e, t, n, r) {
      let {
        resolvedRequestType: o,
        resolvedResponseType: s
      } = e;
      return {
        path: "/" + t + "/" + e.name,
        requestStream: !!e.requestStream,
        responseStream: !!e.responseStream,
        requestSerialize: lko(o),
        requestDeserialize: ako(o, n),
        responseSerialize: lko(s),
        responseDeserialize: ako(s, n),
        originalName: otm(e.name),
        requestType: cko(o, n, r),
        responseType: cko(s, n, r),
        options: utm(e.parsedOptions)
      };
    }
    function ptm(e, t, n, r) {
      let o = {};
      for (let s of e.methodsArray) {
        o[s.name] = dtm(s, t, n, r);
      }
      return o;
    }
    function cko(e, t, n) {
      let r = e.toDescriptor("proto3");
      return {
        format: "Protocol Buffer 3 DescriptorProto",
        type: r.$type.toObject(r, Iel),
        fileDescriptorProtos: n,
        serialize: lko(e),
        deserialize: ako(e, t)
      };
    }
    function mtm(e, t) {
      let n = e.toDescriptor("proto3");
      return {
        format: "Protocol Buffer 3 EnumDescriptorProto",
        type: n.$type.toObject(n, Iel),
        fileDescriptorProtos: t
      };
    }
    function ftm(e, t, n, r) {
      if (e instanceof ome.Service) {
        return ptm(e, t, n, r);
      } else if (e instanceof ome.Type) {
        return cko(e, n, r);
      } else if (e instanceof ome.Enum) {
        return mtm(e, r);
      } else {
        throw Error("Type mismatch in reflection object handling");
      }
    }
    function ozn(e, t) {
      let n = {};
      e.resolveAll();
      let o = e.toDescriptor("proto3").file.map(s => Buffer.from(uko.FileDescriptorProto.HS(s).finish()));
      for (let [s, i] of Pel(e, "")) {
        n[s] = ftm(i, s, t, o);
      }
      return n;
    }
    function Oel(e, t) {
      t = t || {};
      let n = ome.Root.fromDescriptor(e);
      n.resolveAll();
      return ozn(n, t);
    }
    function htm(e, t) {
      return (0, dko.loadProtosWithOptions)(e, t).then(n => ozn(n, t));
    }
    DM.load = htm;
    function gtm(e, t) {
      let n = (0, dko.loadProtosWithOptionsSync)(e, t);
      return ozn(n, t);
    }
    DM.loadSync = gtm;
    function ytm(e, t) {
      t = t || {};
      let n = ome.Root.fromJSON(e);
      n.resolveAll();
      return ozn(n, t);
    }
    DM.fromJSON = ytm;
    function _tm(e, t) {
      let n = uko.FileDescriptorSet.oC(e);
      return Oel(n, t);
    }
    DM.loadFileDescriptorSetFromBuffer = _tm;
    function btm(e, t) {
      let n = uko.FileDescriptorSet.fromObject(e);
      return Oel(n, t);
    }
    DM.loadFileDescriptorSetFromObject = btm;
    (0, dko.addCommonProtos)();
  });
  var h1e = __commonJS($w => {
    var __dirname = "/home/runner/work/claude-cli-internal/claude-cli-internal/node_modules/@grpc/grpc-js/build/src";
    Object.defineProperty($w, "__esModule", {
      value: true
    });
    $w.registerChannelzSocket = $w.registerChannelzServer = $w.registerChannelzSubchannel = $w.registerChannelzChannel = $w.ChannelzCallTrackerStub = $w.ChannelzCallTracker = $w.ChannelzChildrenTrackerStub = $w.ChannelzChildrenTracker = $w.ChannelzTrace = $w.ChannelzTraceStub = undefined;
    $w.unregisterChannelzRef = wtm;
    $w.getChannelzHandlers = Wel;
    $w.getChannelzServiceDefinition = Gel;
    $w.setup = Ntm;
    var izn = require("net");
    var bVe = yQa();
    var yVt = T3();
    var _Vt = th();
    var Stm = L9();
    var Ttm = AVn();
    var Etm = DVn();
    function mko(e) {
      return {
        channel_id: e.id,
        name: e.name
      };
    }
    function fko(e) {
      return {
        subchannel_id: e.id,
        name: e.name
      };
    }
    function vtm(e) {
      return {
        server_id: e.id
      };
    }
    function azn(e) {
      return {
        socket_id: e.id,
        name: e.name
      };
    }
    class Fel {
      constructor() {
        this.events = [];
        this.creationTimestamp = new Date();
        this.eventsLogged = 0;
      }
      addTrace() {}
      getTraceMessage() {
        return {
          creation_timestamp: sme(this.creationTimestamp),
          num_events_logged: this.eventsLogged,
          events: []
        };
      }
    }
    $w.ChannelzTraceStub = Fel;
    class Uel {
      constructor() {
        this.events = [];
        this.eventsLogged = 0;
        this.creationTimestamp = new Date();
      }
      addTrace(e, t, n) {
        let r = new Date();
        if (this.events.push({
          description: t,
          severity: e,
          timestamp: r,
          childChannel: (n === null || n === undefined ? undefined : n.kind) === "channel" ? n : undefined,
          childSubchannel: (n === null || n === undefined ? undefined : n.kind) === "subchannel" ? n : undefined
        }), this.events.length >= 32 * 2) {
          this.events = this.events.slice(32);
        }
        this.eventsLogged += 1;
      }
      getTraceMessage() {
        return {
          creation_timestamp: sme(this.creationTimestamp),
          num_events_logged: this.eventsLogged,
          events: this.events.map(e => ({
            description: e.description,
            severity: e.severity,
            timestamp: sme(e.timestamp),
            channel_ref: e.childChannel ? mko(e.childChannel) : null,
            subchannel_ref: e.childSubchannel ? fko(e.childSubchannel) : null
          }))
        };
      }
    }
    $w.ChannelzTrace = Uel;
    class gko {
      constructor() {
        this.channelChildren = new bVe.OrderedMap();
        this.subchannelChildren = new bVe.OrderedMap();
        this.socketChildren = new bVe.OrderedMap();
        this.trackerMap = {
          channel: this.channelChildren,
          subchannel: this.subchannelChildren,
          socket: this.socketChildren
        };
      }
      refChild(e) {
        let t = this.trackerMap[e.kind];
        let n = t.find(e.id);
        if (n.equals(t.end())) {
          t.setElement(e.id, {
            ref: e,
            count: 1
          }, n);
        } else {
          n.pointer[1].count += 1;
        }
      }
      unrefChild(e) {
        let t = this.trackerMap[e.kind];
        let n = t.getElementByKey(e.id);
        if (n !== undefined) {
          if (n.count -= 1, n.count === 0) {
            t.eraseElementByKey(e.id);
          }
        }
      }
      getChildLists() {
        return {
          channels: this.channelChildren,
          subchannels: this.subchannelChildren,
          sockets: this.socketChildren
        };
      }
    }
    $w.ChannelzChildrenTracker = gko;
    class Bel extends gko {
      refChild() {}
      unrefChild() {}
    }
    $w.ChannelzChildrenTrackerStub = Bel;
    class yko {
      constructor() {
        this.callsStarted = 0;
        this.callsSucceeded = 0;
        this.callsFailed = 0;
        this.lastCallStartedTimestamp = null;
      }
      addCallStarted() {
        this.callsStarted += 1;
        this.lastCallStartedTimestamp = new Date();
      }
      addCallSucceeded() {
        this.callsSucceeded += 1;
      }
      addCallFailed() {
        this.callsFailed += 1;
      }
    }
    $w.ChannelzCallTracker = yko;
    class $el extends yko {
      addCallStarted() {}
      addCallSucceeded() {}
      addCallFailed() {}
    }
    $w.ChannelzCallTrackerStub = $el;
    var rve = {
      channel: new bVe.OrderedMap(),
      subchannel: new bVe.OrderedMap(),
      server: new bVe.OrderedMap(),
      socket: new bVe.OrderedMap()
    };
    var lzn = e => {
      let t = 1;
      function n() {
        return t++;
      }
      let r = rve[e];
      return (o, s, i) => {
        let a = n();
        let l = {
          id: a,
          name: o,
          kind: e
        };
        if (i) {
          r.setElement(a, {
            ref: l,
            getInfo: s
          });
        }
        return l;
      };
    };
    $w.registerChannelzChannel = lzn("channel");
    $w.registerChannelzSubchannel = lzn("subchannel");
    $w.registerChannelzServer = lzn("server");
    $w.registerChannelzSocket = lzn("socket");
    function wtm(e) {
      rve[e.kind].eraseElementByKey(e.id);
    }
    function Ctm(e) {
      let t = Number.parseInt(e, 16);
      return [t / 256 | 0, t % 256];
    }
    function Mel(e) {
      if (e === "") {
        return [];
      }
      let t = e.split(":").map(r => Ctm(r));
      return [].concat(...t);
    }
    function Rtm(e) {
      return (0, izn.isIPv6)(e) && e.toLowerCase().startsWith("::ffff:") && (0, izn.isIPv4)(e.substring(7));
    }
    function Nel(e) {
      return Buffer.from(Uint8Array.from(e.split(".").map(t => Number.parseInt(t))));
    }
    function xtm(e) {
      if ((0, izn.isIPv4)(e)) {
        return Nel(e);
      } else if (Rtm(e)) {
        return Nel(e.substring(7));
      } else if ((0, izn.isIPv6)(e)) {
        let t;
        let n;
        let r = e.indexOf("::");
        if (r === -1) {
          t = e;
          n = "";
        } else {
          t = e.substring(0, r);
          n = e.substring(r + 2);
        }
        let o = Buffer.from(Mel(t));
        let s = Buffer.from(Mel(n));
        let i = Buffer.alloc(16 - o.length - s.length, 0);
        return Buffer.concat([o, i, s]);
      } else {
        return null;
      }
    }
    function Hel(e) {
      switch (e) {
        case yVt.ConnectivityState.CONNECTING:
          return {
            state: "CONNECTING"
          };
        case yVt.ConnectivityState.IDLE:
          return {
            state: "IDLE"
          };
        case yVt.ConnectivityState.READY:
          return {
            state: "READY"
          };
        case yVt.ConnectivityState.SHUTDOWN:
          return {
            state: "SHUTDOWN"
          };
        case yVt.ConnectivityState.TRANSIENT_FAILURE:
          return {
            state: "TRANSIENT_FAILURE"
          };
        default:
          return {
            state: "UNKNOWN"
          };
      }
    }
    function sme(e) {
      if (!e) {
        return null;
      }
      let t = e.getTime();
      return {
        seconds: t / 1000 | 0,
        nanos: t % 1000 * 1e6
      };
    }
    function jel(e) {
      let t = e.getInfo();
      let n = [];
      let r = [];
      t.children.channels.forEach(o => {
        n.push(mko(o[1].ref));
      });
      t.children.subchannels.forEach(o => {
        r.push(fko(o[1].ref));
      });
      return {
        ref: mko(e.ref),
        data: {
          target: t.target,
          state: Hel(t.state),
          calls_started: t.callTracker.callsStarted,
          calls_succeeded: t.callTracker.callsSucceeded,
          calls_failed: t.callTracker.callsFailed,
          last_call_started_timestamp: sme(t.callTracker.lastCallStartedTimestamp),
          trace: t.trace.getTraceMessage()
        },
        channel_ref: n,
        subchannel_ref: r
      };
    }
    function ktm(e, t) {
      let n = parseInt(e.request.channel_id, 10);
      let r = rve.channel.getElementByKey(n);
      if (r === undefined) {
        t({
          code: _Vt.Status.NOT_FOUND,
          details: "No channel data found for id " + n
        });
        return;
      }
      t(null, {
        channel: jel(r)
      });
    }
    function Atm(e, t) {
      let n = parseInt(e.request.max_results, 10) || 100;
      let r = [];
      let o = parseInt(e.request.start_channel_id, 10);
      let s = rve.channel;
      let i;
      for (i = s.lowerBound(o); !i.equals(s.end()) && r.length < n; i = i.next()) {
        r.push(jel(i.pointer[1]));
      }
      t(null, {
        channel: r,
        end: i.equals(s.end())
      });
    }
    function qel(e) {
      let t = e.getInfo();
      let n = [];
      t.listenerChildren.sockets.forEach(r => {
        n.push(azn(r[1].ref));
      });
      return {
        ref: vtm(e.ref),
        data: {
          calls_started: t.callTracker.callsStarted,
          calls_succeeded: t.callTracker.callsSucceeded,
          calls_failed: t.callTracker.callsFailed,
          last_call_started_timestamp: sme(t.callTracker.lastCallStartedTimestamp),
          trace: t.trace.getTraceMessage()
        },
        listen_socket: n
      };
    }
    function Itm(e, t) {
      let n = parseInt(e.request.server_id, 10);
      let o = rve.server.getElementByKey(n);
      if (o === undefined) {
        t({
          code: _Vt.Status.NOT_FOUND,
          details: "No server data found for id " + n
        });
        return;
      }
      t(null, {
        server: qel(o)
      });
    }
    function Ptm(e, t) {
      let n = parseInt(e.request.max_results, 10) || 100;
      let r = parseInt(e.request.start_server_id, 10);
      let o = rve.server;
      let s = [];
      let i;
      for (i = o.lowerBound(r); !i.equals(o.end()) && s.length < n; i = i.next()) {
        s.push(qel(i.pointer[1]));
      }
      t(null, {
        server: s,
        end: i.equals(o.end())
      });
    }
    function Otm(e, t) {
      let n = parseInt(e.request.subchannel_id, 10);
      let r = rve.subchannel.getElementByKey(n);
      if (r === undefined) {
        t({
          code: _Vt.Status.NOT_FOUND,
          details: "No subchannel data found for id " + n
        });
        return;
      }
      let o = r.getInfo();
      let s = [];
      o.children.sockets.forEach(a => {
        s.push(azn(a[1].ref));
      });
      let i = {
        ref: fko(r.ref),
        data: {
          target: o.target,
          state: Hel(o.state),
          calls_started: o.callTracker.callsStarted,
          calls_succeeded: o.callTracker.callsSucceeded,
          calls_failed: o.callTracker.callsFailed,
          last_call_started_timestamp: sme(o.callTracker.lastCallStartedTimestamp),
          trace: o.trace.getTraceMessage()
        },
        socket_ref: s
      };
      t(null, {
        subchannel: i
      });
    }
    function Lel(e) {
      var t;
      if ((0, Stm.isTcpSubchannelAddress)(e)) {
        return {
          address: "tcpip_address",
          tcpip_address: {
            ip_address: (t = xtm(e.host)) !== null && t !== undefined ? t : undefined,
            port: e.port
          }
        };
      } else {
        return {
          address: "uds_address",
          uds_address: {
            filename: e.path
          }
        };
      }
    }
    function Dtm(e, t) {
      var n;
      var r;
      var o;
      var s;
      var i;
      let a = parseInt(e.request.socket_id, 10);
      let l = rve.socket.getElementByKey(a);
      if (l === undefined) {
        t({
          code: _Vt.Status.NOT_FOUND,
          details: "No socket data found for id " + a
        });
        return;
      }
      let c = l.getInfo();
      let u = c.security ? {
        model: "tls",
        Aeu: {
          cipher_suite: c.security.cipherSuiteStandardName ? "standard_name" : "other_name",
          standard_name: (n = c.security.cipherSuiteStandardName) !== null && n !== undefined ? n : undefined,
          other_name: (r = c.security.cipherSuiteOtherName) !== null && r !== undefined ? r : undefined,
          local_certificate: (o = c.security.localCertificate) !== null && o !== undefined ? o : undefined,
          remote_certificate: (s = c.security.remoteCertificate) !== null && s !== undefined ? s : undefined
        }
      } : null;
      let d = {
        ref: azn(l.ref),
        local: c.localAddress ? Lel(c.localAddress) : null,
        remote: c.remoteAddress ? Lel(c.remoteAddress) : null,
        remote_name: (i = c.remoteName) !== null && i !== undefined ? i : undefined,
        security: u,
        data: {
          keep_alives_sent: c.keepAlivesSent,
          streams_started: c.streamsStarted,
          streams_succeeded: c.streamsSucceeded,
          streams_failed: c.streamsFailed,
          last_local_stream_created_timestamp: sme(c.lastLocalStreamCreatedTimestamp),
          last_remote_stream_created_timestamp: sme(c.lastRemoteStreamCreatedTimestamp),
          messages_received: c.messagesReceived,
          messages_sent: c.messagesSent,
          last_message_received_timestamp: sme(c.lastMessageReceivedTimestamp),
          last_message_sent_timestamp: sme(c.lastMessageSentTimestamp),
          local_flow_control_window: c.localFlowControlWindow ? {
            value: c.localFlowControlWindow
          } : null,
          remote_flow_control_window: c.remoteFlowControlWindow ? {
            value: c.remoteFlowControlWindow
          } : null
        }
      };
      t(null, {
        socket: d
      });
    }
    function Mtm(e, t) {
      let n = parseInt(e.request.server_id, 10);
      let r = rve.server.getElementByKey(n);
      if (r === undefined) {
        t({
          code: _Vt.Status.NOT_FOUND,
          details: "No server data found for id " + n
        });
        return;
      }
      let o = parseInt(e.request.start_socket_id, 10);
      let s = parseInt(e.request.max_results, 10) || 100;
      let a = r.getInfo().sessionChildren.sockets;
      let l = [];
      let c;
      for (c = a.lowerBound(o); !c.equals(a.end()) && l.length < s; c = c.next()) {
        l.push(azn(c.pointer[1].ref));
      }
      t(null, {
        socket_ref: l,
        end: c.equals(a.end())
      });
    }
    function Wel() {
      return {
        GetChannel: ktm,
        GetTopChannels: Atm,
        GetServer: Itm,
        GetServers: Ptm,
        GetSubchannel: Otm,
        GetSocket: Dtm,
        GetServerSockets: Mtm
      };
    }
    var szn = null;
    function Gel() {
      if (szn) {
        return szn;
      }
      let e = pko().loadSync;
      let t = e("channelz.proto", {
        keepCase: true,
        longs: String,
        enums: String,
        defaults: true,
        oneofs: true,
        includeDirs: [`${__dirname}/../../proto`]
      });
      szn = (0, Etm.loadPackageDefinition)(t).grpc.channelz.v1.Channelz.service;
      return szn;
    }
    function Ntm() {
      (0, Ttm.registerAdminService)(Gel, Wel);
    }
  });
  var czn = __commonJS(_ko => {
    Object.defineProperty(_ko, "__esModule", {
      value: true
    });
    _ko.getNextCallNumber = Ftm;
    var Ltm = 0;
    function Ftm() {
      return Ltm++;
    }
  });
  var bko = __commonJS(uzn => {
    Object.defineProperty(uzn, "__esModule", {
      value: true
    });
    uzn.CompressionAlgorithms = undefined;
    var Vel;
    (function (e) {
      e[e.identity = 0] = "identity";
      e[e.deflate = 1] = "deflate";
      e[e.gzip = 2] = "gzip";
    })(Vel || (uzn.CompressionAlgorithms = Vel = {}));
  });
  var Sko = __commonJS(dzn => {
    Object.defineProperty(dzn, "__esModule", {
      value: true
    });
    dzn.BaseFilter = undefined;
    class zel {
      async sendMetadata(e) {
        return e;
      }
      receiveMetadata(e) {
        return e;
      }
      async sendMessage(e) {
        return e;
      }
      async receiveMessage(e) {
        return e;
      }
      receiveTrailers(e) {
        return e;
      }
    }
    dzn.BaseFilter = zel;
  });
  var Eko = __commonJS(Lyt => {
    Object.defineProperty(Lyt, "__esModule", {
      value: true
    });
    Lyt.CompressionFilterFactory = Lyt.CompressionFilter = undefined;
    var pzn = require("zlib");
    var Yel = bko();
    var g1e = th();
    var Utm = Sko();
    var Btm = Av();
    var $tm = e => typeof e === "number" && typeof Yel.CompressionAlgorithms[e] === "string";
    class bVt {
      async writeMessage(e, t) {
        let n = e;
        if (t) {
          n = await this.compressMessage(n);
        }
        let r = Buffer.allocUnsafe(n.length + 5);
        r.writeUInt8(t ? 1 : 0, 0);
        r.writeUInt32BE(n.length, 1);
        n.copy(r, 5);
        return r;
      }
      async readMessage(e) {
        let t = e.readUInt8(0) === 1;
        let n = e.slice(5);
        if (t) {
          n = await this.decompressMessage(n);
        }
        return n;
      }
    }
    class Nyt extends bVt {
      async compressMessage(e) {
        return e;
      }
      async writeMessage(e, t) {
        let n = Buffer.allocUnsafe(e.length + 5);
        n.writeUInt8(0, 0);
        n.writeUInt32BE(e.length, 1);
        e.copy(n, 5);
        return n;
      }
      decompressMessage(e) {
        return Promise.reject(Error('Received compressed message but "grpc-encoding" header was identity'));
      }
    }
    class Jel extends bVt {
      constructor(e) {
        super();
        this.maxRecvMessageLength = e;
      }
      compressMessage(e) {
        return new Promise((t, n) => {
          pzn.deflate(e, (r, o) => {
            if (r) {
              n(r);
            } else {
              t(o);
            }
          });
        });
      }
      decompressMessage(e) {
        return new Promise((t, n) => {
          let r = 0;
          let o = [];
          let s = pzn.createInflate();
          s.on("error", i => {
            n({
              code: g1e.Status.INTERNAL,
              details: "Failed to decompress deflate-encoded message"
            });
          });
          s.on("data", i => {
            if (o.push(i), r += i.byteLength, this.maxRecvMessageLength !== -1 && r > this.maxRecvMessageLength) {
              s.destroy();
              n({
                code: g1e.Status.RESOURCE_EXHAUSTED,
                details: `Received message that decompresses to a size larger than ${this.maxRecvMessageLength}`
              });
            }
          });
          s.on("end", () => {
            t(Buffer.concat(o));
          });
          s.write(e);
          s.end();
        });
      }
    }
    class Xel extends bVt {
      constructor(e) {
        super();
        this.maxRecvMessageLength = e;
      }
      compressMessage(e) {
        return new Promise((t, n) => {
          pzn.gzip(e, (r, o) => {
            if (r) {
              n(r);
            } else {
              t(o);
            }
          });
        });
      }
      decompressMessage(e) {
        return new Promise((t, n) => {
          let r = 0;
          let o = [];
          let s = pzn.createGunzip();
          s.on("error", i => {
            n({
              code: g1e.Status.INTERNAL,
              details: "Failed to decompress gzip-encoded message"
            });
          });
          s.on("data", i => {
            if (o.push(i), r += i.byteLength, this.maxRecvMessageLength !== -1 && r > this.maxRecvMessageLength) {
              s.destroy();
              n({
                code: g1e.Status.RESOURCE_EXHAUSTED,
                details: `Received message that decompresses to a size larger than ${this.maxRecvMessageLength}`
              });
            }
          });
          s.on("end", () => {
            t(Buffer.concat(o));
          });
          s.write(e);
          s.end();
        });
      }
    }
    class Qel extends bVt {
      constructor(e) {
        super();
        this.compressionName = e;
      }
      compressMessage(e) {
        return Promise.reject(Error(`Received message compressed with unsupported compression method ${this.compressionName}`));
      }
      decompressMessage(e) {
        return Promise.reject(Error(`Compression method not supported: ${this.compressionName}`));
      }
    }
    function Kel(e, t) {
      switch (e) {
        case "identity":
          return new Nyt();
        case "deflate":
          return new Jel(t);
        case "gzip":
          return new Xel(t);
        default:
          return new Qel(e);
      }
    }
    class Tko extends Utm.BaseFilter {
      constructor(e, t) {
        var n;
        var r;
        var o;
        super();
        this.sharedFilterConfig = t;
        this.sendCompression = new Nyt();
        this.receiveCompression = new Nyt();
        this.currentCompressionAlgorithm = "identity";
        let s = e["grpc.default_compression_algorithm"];
        if (this.maxReceiveMessageLength = (n = e["grpc.max_receive_message_length"]) !== null && n !== undefined ? n : g1e.DEFAULT_MAX_RECEIVE_MESSAGE_LENGTH, this.maxSendMessageLength = (r = e["grpc.max_send_message_length"]) !== null && r !== undefined ? r : g1e.DEFAULT_MAX_SEND_MESSAGE_LENGTH, s !== undefined) {
          if ($tm(s)) {
            let i = Yel.CompressionAlgorithms[s];
            let a = (o = t.serverSupportedEncodingHeader) === null || o === undefined ? undefined : o.split(",");
            if (!a || a.includes(i)) {
              this.currentCompressionAlgorithm = i;
              this.sendCompression = Kel(this.currentCompressionAlgorithm, -1);
            }
          } else {
            Btm.log(g1e.LogVerbosity.ERROR, `Invalid value provided for grpc.default_compression_algorithm option: ${s}`);
          }
        }
      }
      async sendMetadata(e) {
        let t = await e;
        if (t.set("grpc-accept-encoding", "identity,deflate,gzip"), t.set("accept-encoding", "identity"), this.currentCompressionAlgorithm === "identity") {
          t.remove("grpc-encoding");
        } else {
          t.set("grpc-encoding", this.currentCompressionAlgorithm);
        }
        return t;
      }
      receiveMetadata(e) {
        let t = e.get("grpc-encoding");
        if (t.length > 0) {
          let r = t[0];
          if (typeof r === "string") {
            this.receiveCompression = Kel(r, this.maxReceiveMessageLength);
          }
        }
        e.remove("grpc-encoding");
        let n = e.get("grpc-accept-encoding")[0];
        if (n) {
          if (this.sharedFilterConfig.serverSupportedEncodingHeader = n, !n.split(",").includes(this.currentCompressionAlgorithm)) {
            this.sendCompression = new Nyt();
            this.currentCompressionAlgorithm = "identity";
          }
        }
        e.remove("grpc-accept-encoding");
        return e;
      }
      async sendMessage(e) {
        var t;
        let n = await e;
        if (this.maxSendMessageLength !== -1 && n.message.length > this.maxSendMessageLength) {
          throw {
            code: g1e.Status.RESOURCE_EXHAUSTED,
            details: `Attempted to send message with a size larger than ${this.maxSendMessageLength}`
          };
        }
        let r;
        if (this.sendCompression instanceof Nyt) {
          r = false;
        } else {
          r = (((t = n.flags) !== null && t !== undefined ? t : 0) & 2) === 0;
        }
        return {
          message: await this.sendCompression.writeMessage(n.message, r),
          flags: n.flags
        };
      }
      async receiveMessage(e) {
        return this.receiveCompression.readMessage(await e);
      }
    }
    Lyt.CompressionFilter = Tko;
    class Zel {
      constructor(e, t) {
        this.options = t;
        this.sharedFilterConfig = {};
      }
      createFilter() {
        return new Tko(this.options, this.sharedFilterConfig);
      }
    }
    Lyt.CompressionFilterFactory = Zel;
  });
  var SVt = __commonJS(vko => {
    Object.defineProperty(vko, "__esModule", {
      value: true
    });
    vko.restrictControlPlaneStatusCode = jtm;
    var ime = th();
    var Htm = [ime.Status.OK, ime.Status.INVALID_ARGUMENT, ime.Status.NOT_FOUND, ime.Status.ALREADY_EXISTS, ime.Status.FAILED_PRECONDITION, ime.Status.ABORTED, ime.Status.OUT_OF_RANGE, ime.Status.DATA_LOSS];
    function jtm(e, t) {
      if (Htm.includes(e)) {
        return {
          code: ime.Status.INTERNAL,
          details: `Invalid status from control plane: ${e} ${ime.Status[e]} ${t}`
        };
      } else {
        return {
          code: e,
          details: t
        };
      }
    }
  });
  var Fyt = __commonJS(SVe => {
    Object.defineProperty(SVe, "__esModule", {
      value: true
    });
    SVe.minDeadline = qtm;
    SVe.getDeadlineTimeoutString = Gtm;
    SVe.getRelativeTimeout = ztm;
    SVe.deadlineToString = Ktm;
    SVe.formatDateDifference = Ytm;
    function qtm(...e) {
      let t = 1 / 0;
      for (let n of e) {
        let r = n instanceof Date ? n.getTime() : n;
        if (r < t) {
          t = r;
        }
      }
      return t;
    }
    var Wtm = [["m", 1], ["S", 1000], ["M", 60000], ["H", 3600000]];
    function Gtm(e) {
      let t = new Date().getTime();
      if (e instanceof Date) {
        e = e.getTime();
      }
      let n = Math.max(e - t, 0);
      for (let [r, o] of Wtm) {
        let s = n / o;
        if (s < 1e8) {
          return String(Math.ceil(s)) + r;
        }
      }
      throw Error("Deadline is too far in the future");
    }
    function ztm(e) {
      let t = e instanceof Date ? e.getTime() : e;
      let n = new Date().getTime();
      let r = t - n;
      if (r < 0) {
        return 0;
      } else if (r > 2147483647) {
        return 1 / 0;
      } else {
        return r;
      }
    }
    function Ktm(e) {
      if (e instanceof Date) {
        return e.toISOString();
      } else {
        let t = new Date(e);
        if (Number.isNaN(t.getTime())) {
          return "" + e;
        } else {
          return t.toISOString();
        }
      }
    }
    function Ytm(e, t) {
      return ((t.getTime() - e.getTime()) / 1000).toFixed(3) + "s";
    }
  });
  var mzn = __commonJS(Uyt => {
    Object.defineProperty(Uyt, "__esModule", {
      value: true
    });
    Uyt.FilterStackFactory = Uyt.FilterStack = undefined;
    class wko {
      constructor(e) {
        this.filters = e;
      }
      sendMetadata(e) {
        let t = e;
        for (let n = 0; n < this.filters.length; n++) {
          t = this.filters[n].sendMetadata(t);
        }
        return t;
      }
      receiveMetadata(e) {
        let t = e;
        for (let n = this.filters.length - 1; n >= 0; n--) {
          t = this.filters[n].receiveMetadata(t);
        }
        return t;
      }
      sendMessage(e) {
        let t = e;
        for (let n = 0; n < this.filters.length; n++) {
          t = this.filters[n].sendMessage(t);
        }
        return t;
      }
      receiveMessage(e) {
        let t = e;
        for (let n = this.filters.length - 1; n >= 0; n--) {
          t = this.filters[n].receiveMessage(t);
        }
        return t;
      }
      receiveTrailers(e) {
        let t = e;
        for (let n = this.filters.length - 1; n >= 0; n--) {
          t = this.filters[n].receiveTrailers(t);
        }
        return t;
      }
      push(e) {
        this.filters.unshift(...e);
      }
      getFilters() {
        return this.filters;
      }
    }
    Uyt.FilterStack = wko;
    class Cko {
      constructor(e) {
        this.factories = e;
      }
      push(e) {
        this.factories.unshift(...e);
      }
      clone() {
        return new Cko([...this.factories]);
      }
      createFilter() {
        return new wko(this.factories.map(e => e.createFilter()));
      }
    }
    Uyt.FilterStackFactory = Cko;
  });
  var ntl = __commonJS(hzn => {
    Object.defineProperty(hzn, "__esModule", {
      value: true
    });
    hzn.SingleSubchannelChannel = undefined;
    var Jtm = czn();
    var TVt = h1e();
    var Xtm = Eko();
    var Qtm = T3();
    var EVt = th();
    var Ztm = SVt();
    var enm = Fyt();
    var tnm = mzn();
    var Rko = K1();
    var nnm = tse();
    var fzn = S3();
    class etl {
      constructor(e, t, n, r, o) {
        var s;
        var i;
        this.subchannel = e;
        this.method = t;
        this.options = r;
        this.callNumber = o;
        this.childCall = null;
        this.pendingMessage = null;
        this.readPending = false;
        this.halfClosePending = false;
        this.pendingStatus = null;
        this.readFilterPending = false;
        this.writeFilterPending = false;
        let a = this.method.split("/");
        let l = "";
        if (a.length >= 2) {
          l = a[1];
        }
        let c = (i = (s = (0, fzn.splitHostPort)(this.options.host)) === null || s === undefined ? undefined : s.host) !== null && i !== undefined ? i : "localhost";
        this.serviceUrl = `https://${c}/${l}`;
        let u = (0, enm.getRelativeTimeout)(r.deadline);
        if (u !== 1 / 0) {
          if (u <= 0) {
            this.cancelWithStatus(EVt.Status.DEADLINE_EXCEEDED, "Deadline exceeded");
          } else {
            setTimeout(() => {
              this.cancelWithStatus(EVt.Status.DEADLINE_EXCEEDED, "Deadline exceeded");
            }, u);
          }
        }
        this.filterStack = n.createFilter();
      }
      cancelWithStatus(e, t) {
        if (this.childCall) {
          this.childCall.cancelWithStatus(e, t);
        } else {
          this.pendingStatus = {
            code: e,
            details: t,
            metadata: new Rko.Metadata()
          };
        }
      }
      getPeer() {
        var e;
        var t;
        return (t = (e = this.childCall) === null || e === undefined ? undefined : e.getPeer()) !== null && t !== undefined ? t : this.subchannel.getAddress();
      }
      async start(e, t) {
        if (this.pendingStatus) {
          t.onReceiveStatus(this.pendingStatus);
          return;
        }
        if (this.subchannel.getConnectivityState() !== Qtm.ConnectivityState.READY) {
          t.onReceiveStatus({
            code: EVt.Status.UNAVAILABLE,
            details: "Subchannel not ready",
            metadata: new Rko.Metadata()
          });
          return;
        }
        let n = await this.filterStack.sendMetadata(Promise.resolve(e));
        let r;
        try {
          r = await this.subchannel.getCallCredentials().generateMetadata({
            method_name: this.method,
            service_url: this.serviceUrl
          });
        } catch (s) {
          let i = s;
          let {
            code: a,
            details: l
          } = (0, Ztm.restrictControlPlaneStatusCode)(typeof i.code === "number" ? i.code : EVt.Status.UNKNOWN, `Getting metadata from plugin failed with error: ${i.message}`);
          t.onReceiveStatus({
            code: a,
            details: l,
            metadata: new Rko.Metadata()
          });
          return;
        }
        r.merge(n);
        let o = {
          onReceiveMetadata: async s => {
            t.onReceiveMetadata(await this.filterStack.receiveMetadata(s));
          },
          onReceiveMessage: async s => {
            this.readFilterPending = true;
            let i = await this.filterStack.receiveMessage(s);
            if (this.readFilterPending = false, t.onReceiveMessage(i), this.pendingStatus) {
              t.onReceiveStatus(this.pendingStatus);
            }
          },
          onReceiveStatus: async s => {
            let i = await this.filterStack.receiveTrailers(s);
            if (this.readFilterPending) {
              this.pendingStatus = i;
            } else {
              t.onReceiveStatus(i);
            }
          }
        };
        if (this.childCall = this.subchannel.createCall(r, this.options.host, this.method, o), this.readPending) {
          this.childCall.startRead();
        }
        if (this.pendingMessage) {
          this.childCall.sendMessageWithContext(this.pendingMessage.context, this.pendingMessage.message);
        }
        if (this.halfClosePending && !this.writeFilterPending) {
          this.childCall.halfClose();
        }
      }
      async sendMessageWithContext(e, t) {
        this.writeFilterPending = true;
        let n = await this.filterStack.sendMessage(Promise.resolve({
          message: t,
          flags: e.flags
        }));
        if (this.writeFilterPending = false, this.childCall) {
          if (this.childCall.sendMessageWithContext(e, n.message), this.halfClosePending) {
            this.childCall.halfClose();
          }
        } else {
          this.pendingMessage = {
            context: e,
            message: n.message
          };
        }
      }
      startRead() {
        if (this.childCall) {
          this.childCall.startRead();
        } else {
          this.readPending = true;
        }
      }
      halfClose() {
        if (this.childCall && !this.writeFilterPending) {
          this.childCall.halfClose();
        } else {
          this.halfClosePending = true;
        }
      }
      getCallNumber() {
        return this.callNumber;
      }
      setCredentials(e) {
        throw Error("Method not implemented.");
      }
      getAuthContext() {
        if (this.childCall) {
          return this.childCall.getAuthContext();
        } else {
          return null;
        }
      }
    }
    class ttl {
      constructor(e, t, n) {
        if (this.subchannel = e, this.target = t, this.channelzEnabled = false, this.channelzTrace = new TVt.ChannelzTrace(), this.callTracker = new TVt.ChannelzCallTracker(), this.childrenTracker = new TVt.ChannelzChildrenTracker(), this.channelzEnabled = n["grpc.enable_channelz"] !== 0, this.channelzRef = (0, TVt.registerChannelzChannel)((0, fzn.uriToString)(t), () => ({
          target: `${(0, fzn.uriToString)(t)} (${e.getAddress()})`,
          state: this.subchannel.getConnectivityState(),
          trace: this.channelzTrace,
          callTracker: this.callTracker,
          children: this.childrenTracker.getChildLists()
        }), this.channelzEnabled), this.channelzEnabled) {
          this.childrenTracker.refChild(e.getChannelzRef());
        }
        this.filterStackFactory = new tnm.FilterStackFactory([new Xtm.CompressionFilterFactory(this, n)]);
      }
      close() {
        if (this.channelzEnabled) {
          this.childrenTracker.unrefChild(this.subchannel.getChannelzRef());
        }
        (0, TVt.unregisterChannelzRef)(this.channelzRef);
      }
      getTarget() {
        return (0, fzn.uriToString)(this.target);
      }
      getConnectivityState(e) {
        throw Error("Method not implemented.");
      }
      watchConnectivityState(e, t, n) {
        throw Error("Method not implemented.");
      }
      getChannelzRef() {
        return this.channelzRef;
      }
      createCall(e, t) {
        let n = {
          deadline: t,
          host: (0, nnm.getDefaultAuthority)(this.target),
          flags: EVt.Propagate.DEFAULTS,
          parentCall: null
        };
        return new etl(this.subchannel, e, this.filterStackFactory, n, (0, Jtm.getNextCallNumber)());
      }
    }
    hzn.SingleSubchannelChannel = ttl;
  });
  var otl = __commonJS(yzn => {
    Object.defineProperty(yzn, "__esModule", {
      value: true
    });
    yzn.Subchannel = undefined;
    var hE = T3();
    var rnm = Tyt();
    var xko = Av();
    var gzn = th();
    var onm = S3();
    var snm = L9();
    var ame = h1e();
    var inm = ntl();
    class rtl {
      constructor(e, t, n, r, o) {
        var s;
        this.channelTarget = e;
        this.subchannelAddress = t;
        this.options = n;
        this.connector = o;
        this.connectivityState = hE.ConnectivityState.IDLE;
        this.transport = null;
        this.continueConnecting = false;
        this.stateListeners = new Set();
        this.refcount = 0;
        this.channelzEnabled = true;
        this.dataProducers = new Map();
        this.subchannelChannel = null;
        let i = {
          initialDelay: n["grpc.initial_reconnect_backoff_ms"],
          maxDelay: n["grpc.max_reconnect_backoff_ms"]
        };
        if (this.backoffTimeout = new rnm.BackoffTimeout(() => {
          this.handleBackoffTimer();
        }, i), this.backoffTimeout.unref(), this.subchannelAddressString = (0, snm.subchannelAddressToString)(t), this.keepaliveTime = (s = n["grpc.keepalive_time_ms"]) !== null && s !== undefined ? s : -1, n["grpc.enable_channelz"] === 0) {
          this.channelzEnabled = false;
          this.channelzTrace = new ame.ChannelzTraceStub();
          this.callTracker = new ame.ChannelzCallTrackerStub();
          this.childrenTracker = new ame.ChannelzChildrenTrackerStub();
          this.streamTracker = new ame.ChannelzCallTrackerStub();
        } else {
          this.channelzTrace = new ame.ChannelzTrace();
          this.callTracker = new ame.ChannelzCallTracker();
          this.childrenTracker = new ame.ChannelzChildrenTracker();
          this.streamTracker = new ame.ChannelzCallTracker();
        }
        this.channelzRef = (0, ame.registerChannelzSubchannel)(this.subchannelAddressString, () => this.getChannelzInfo(), this.channelzEnabled);
        this.channelzTrace.addTrace("CT_INFO", "Subchannel created");
        this.trace("Subchannel constructed with options " + JSON.stringify(n, undefined, 2));
        this.secureConnector = r._createSecureConnector(e, n);
      }
      getChannelzInfo() {
        return {
          state: this.connectivityState,
          trace: this.channelzTrace,
          callTracker: this.callTracker,
          children: this.childrenTracker.getChildLists(),
          target: this.subchannelAddressString
        };
      }
      trace(e) {
        xko.trace(gzn.LogVerbosity.DEBUG, "subchannel", "(" + this.channelzRef.id + ") " + this.subchannelAddressString + " " + e);
      }
      refTrace(e) {
        xko.trace(gzn.LogVerbosity.DEBUG, "subchannel_refcount", "(" + this.channelzRef.id + ") " + this.subchannelAddressString + " " + e);
      }
      handleBackoffTimer() {
        if (this.continueConnecting) {
          this.transitionToState([hE.ConnectivityState.TRANSIENT_FAILURE], hE.ConnectivityState.CONNECTING);
        } else {
          this.transitionToState([hE.ConnectivityState.TRANSIENT_FAILURE], hE.ConnectivityState.IDLE);
        }
      }
      startBackoff() {
        this.backoffTimeout.runOnce();
      }
      stopBackoff() {
        this.backoffTimeout.stop();
        this.backoffTimeout.reset();
      }
      startConnectingInternal() {
        let e = this.options;
        if (e["grpc.keepalive_time_ms"]) {
          let t = Math.min(this.keepaliveTime, 2147483647);
          e = Object.assign(Object.assign({}, e), {
            "grpc.keepalive_time_ms": t
          });
        }
        this.connector.connect(this.subchannelAddress, this.secureConnector, e).then(t => {
          if (this.transitionToState([hE.ConnectivityState.CONNECTING], hE.ConnectivityState.READY)) {
            if (this.transport = t, this.channelzEnabled) {
              this.childrenTracker.refChild(t.getChannelzRef());
            }
            t.addDisconnectListener(n => {
              if (this.transitionToState([hE.ConnectivityState.READY], hE.ConnectivityState.IDLE), n && this.keepaliveTime > 0) {
                this.keepaliveTime *= 2;
                xko.log(gzn.LogVerbosity.ERROR, `Connection to ${(0, onm.uriToString)(this.channelTarget)} at ${this.subchannelAddressString} rejected by server because of excess pings. Increasing ping interval to ${this.keepaliveTime} ms`);
              }
            });
          } else {
            t.shutdown();
          }
        }, t => {
          this.transitionToState([hE.ConnectivityState.CONNECTING], hE.ConnectivityState.TRANSIENT_FAILURE, `${t}`);
        });
      }
      transitionToState(e, t, n) {
        var r;
        var o;
        if (e.indexOf(this.connectivityState) === -1) {
          return false;
        }
        if (n) {
          this.trace(hE.ConnectivityState[this.connectivityState] + " -> " + hE.ConnectivityState[t] + ' with error "' + n + '"');
        } else {
          this.trace(hE.ConnectivityState[this.connectivityState] + " -> " + hE.ConnectivityState[t]);
        }
        if (this.channelzEnabled) {
          this.channelzTrace.addTrace("CT_INFO", "Connectivity state change to " + hE.ConnectivityState[t]);
        }
        let s = this.connectivityState;
        switch (this.connectivityState = t, t) {
          case hE.ConnectivityState.READY:
            this.stopBackoff();
            break;
          case hE.ConnectivityState.CONNECTING:
            this.startBackoff();
            this.startConnectingInternal();
            this.continueConnecting = false;
            break;
          case hE.ConnectivityState.TRANSIENT_FAILURE:
            if (this.channelzEnabled && this.transport) {
              this.childrenTracker.unrefChild(this.transport.getChannelzRef());
            }
            if ((r = this.transport) === null || r === undefined || r.shutdown(), this.transport = null, !this.backoffTimeout.isRunning()) {
              process.nextTick(() => {
                this.handleBackoffTimer();
              });
            }
            break;
          case hE.ConnectivityState.IDLE:
            if (this.channelzEnabled && this.transport) {
              this.childrenTracker.unrefChild(this.transport.getChannelzRef());
            }
            (o = this.transport) === null || o === undefined || o.shutdown();
            this.transport = null;
            break;
          default:
            throw Error(`Invalid state: unknown ConnectivityState ${t}`);
        }
        for (let i of this.stateListeners) {
          i(this, s, t, this.keepaliveTime, n);
        }
        return true;
      }
      ref() {
        this.refTrace("refcount " + this.refcount + " -> " + (this.refcount + 1));
        this.refcount += 1;
      }
      unref() {
        if (this.refTrace("refcount " + this.refcount + " -> " + (this.refcount - 1)), this.refcount -= 1, this.refcount === 0) {
          this.channelzTrace.addTrace("CT_INFO", "Shutting down");
          (0, ame.unregisterChannelzRef)(this.channelzRef);
          this.secureConnector.destroy();
          process.nextTick(() => {
            this.transitionToState([hE.ConnectivityState.CONNECTING, hE.ConnectivityState.READY], hE.ConnectivityState.IDLE);
          });
        }
      }
      unrefIfOneRef() {
        if (this.refcount === 1) {
          this.unref();
          return true;
        }
        return false;
      }
      createCall(e, t, n, r) {
        if (!this.transport) {
          throw Error("Cannot create call, subchannel not READY");
        }
        let o;
        if (this.channelzEnabled) {
          this.callTracker.addCallStarted();
          this.streamTracker.addCallStarted();
          o = {
            onCallEnd: s => {
              if (s.code === gzn.Status.OK) {
                this.callTracker.addCallSucceeded();
              } else {
                this.callTracker.addCallFailed();
              }
            }
          };
        } else {
          o = {};
        }
        return this.transport.createCall(e, t, n, r, o);
      }
      startConnecting() {
        process.nextTick(() => {
          if (!this.transitionToState([hE.ConnectivityState.IDLE], hE.ConnectivityState.CONNECTING)) {
            if (this.connectivityState === hE.ConnectivityState.TRANSIENT_FAILURE) {
              this.continueConnecting = true;
            }
          }
        });
      }
      getConnectivityState() {
        return this.connectivityState;
      }
      addConnectivityStateListener(e) {
        this.stateListeners.add(e);
      }
      removeConnectivityStateListener(e) {
        this.stateListeners.delete(e);
      }
      resetBackoff() {
        process.nextTick(() => {
          this.backoffTimeout.reset();
          this.transitionToState([hE.ConnectivityState.TRANSIENT_FAILURE], hE.ConnectivityState.CONNECTING);
        });
      }
      getAddress() {
        return this.subchannelAddressString;
      }
      getChannelzRef() {
        return this.channelzRef;
      }
      isHealthy() {
        return true;
      }
      addHealthStateWatcher(e) {}
      removeHealthStateWatcher(e) {}
      getRealSubchannel() {
        return this;
      }
      realSubchannelEquals(e) {
        return e.getRealSubchannel() === this;
      }
      throttleKeepalive(e) {
        if (e > this.keepaliveTime) {
          this.keepaliveTime = e;
        }
      }
      getCallCredentials() {
        return this.secureConnector.getCallCredentials();
      }
      getChannel() {
        if (!this.subchannelChannel) {
          this.subchannelChannel = new inm.SingleSubchannelChannel(this, this.channelTarget, this.options);
        }
        return this.subchannelChannel;
      }
      addDataWatcher(e) {
        throw Error("Not implemented");
      }
      getOrCreateDataProducer(e, t) {
        let n = this.dataProducers.get(e);
        if (n) {
          return n;
        }
        let r = t(this);
        this.dataProducers.set(e, r);
        return r;
      }
      removeDataProducer(e) {
        this.dataProducers.delete(e);
      }
    }
    yzn.Subchannel = rtl;
  });
  var stl = __commonJS(_zn => {
    var kko;
    Object.defineProperty(_zn, "__esModule", {
      value: true
    });
    _zn.GRPC_NODE_USE_ALTERNATIVE_RESOLVER = undefined;
    _zn.GRPC_NODE_USE_ALTERNATIVE_RESOLVER = ((kko = process.env.GRPC_NODE_USE_ALTERNATIVE_RESOLVER) !== null && kko !== undefined ? kko : "false") === "true";
  });
  var Pko = __commonJS(TVe => {
    Object.defineProperty(TVe, "__esModule", {
      value: true
    });
    TVe.DEFAULT_PORT = undefined;
    TVe.setup = gnm;
    var itl = tse();
    var Ako = require("dns");
    var cnm = uxo();
    var Iko = th();
    var Byt = mVe();
    var unm = K1();
    var dnm = Av();
    var pnm = th();
    var y1e = S3();
    var atl = require("net");
    var mnm = Tyt();
    var ltl = stl();
    function lme(e) {
      dnm.trace(pnm.LogVerbosity.DEBUG, "dns_resolver", e);
    }
    TVe.DEFAULT_PORT = 443;
    class ctl {
      constructor(e, t, n) {
        var r;
        var o;
        var s;
        if (this.target = e, this.listener = t, this.pendingLookupPromise = null, this.pendingTxtPromise = null, this.latestLookupResult = null, this.latestServiceConfigResult = null, this.continueResolving = false, this.isNextResolutionTimerRunning = false, this.isServiceConfigEnabled = true, this.returnedIpResult = false, this.alternativeResolver = new Ako.promises.Resolver(), lme("Resolver constructed for target " + (0, y1e.uriToString)(e)), e.authority) {
          this.alternativeResolver.setServers([e.authority]);
        }
        let i = (0, y1e.splitHostPort)(e.path);
        if (i === null) {
          this.ipResult = null;
          this.dnsHostname = null;
          this.port = null;
        } else if ((0, atl.isIPv4)(i.host) || (0, atl.isIPv6)(i.host)) {
          this.ipResult = [{
            addresses: [{
              host: i.host,
              port: (r = i.port) !== null && r !== undefined ? r : TVe.DEFAULT_PORT
            }]
          }];
          this.dnsHostname = null;
          this.port = null;
        } else {
          this.ipResult = null;
          this.dnsHostname = i.host;
          this.port = (o = i.port) !== null && o !== undefined ? o : TVe.DEFAULT_PORT;
        }
        if (this.percentage = Math.random() * 100, n["grpc.service_config_disable_resolution"] === 1) {
          this.isServiceConfigEnabled = false;
        }
        this.defaultResolutionError = {
          code: Iko.Status.UNAVAILABLE,
          details: `Name resolution failed for target ${(0, y1e.uriToString)(this.target)}`,
          metadata: new unm.Metadata()
        };
        let a = {
          initialDelay: n["grpc.initial_reconnect_backoff_ms"],
          maxDelay: n["grpc.max_reconnect_backoff_ms"]
        };
        this.backoff = new mnm.BackoffTimeout(() => {
          if (this.continueResolving) {
            this.startResolutionWithBackoff();
          }
        }, a);
        this.backoff.unref();
        this.minTimeBetweenResolutionsMs = (s = n["grpc.dns_min_time_between_resolutions_ms"]) !== null && s !== undefined ? s : 30000;
        this.nextResolutionTimer = setTimeout(() => {}, 0);
        clearTimeout(this.nextResolutionTimer);
      }
      startResolution() {
        if (this.ipResult !== null) {
          if (!this.returnedIpResult) {
            lme("Returning IP address for target " + (0, y1e.uriToString)(this.target));
            setImmediate(() => {
              this.listener((0, Byt.statusOrFromValue)(this.ipResult), {}, null, "");
            });
            this.returnedIpResult = true;
          }
          this.backoff.stop();
          this.backoff.reset();
          this.stopNextResolutionTimer();
          return;
        }
        if (this.dnsHostname === null) {
          lme("Failed to parse DNS address " + (0, y1e.uriToString)(this.target));
          setImmediate(() => {
            this.listener((0, Byt.statusOrFromError)({
              code: Iko.Status.UNAVAILABLE,
              details: `Failed to parse DNS address ${(0, y1e.uriToString)(this.target)}`
            }), {}, null, "");
          });
          this.stopNextResolutionTimer();
        } else {
          if (this.pendingLookupPromise !== null) {
            return;
          }
          lme("Looking up DNS hostname " + this.dnsHostname);
          this.latestLookupResult = null;
          let e = this.dnsHostname;
          if (this.pendingLookupPromise = this.lookup(e), this.pendingLookupPromise.then(t => {
            if (this.pendingLookupPromise === null) {
              return;
            }
            this.pendingLookupPromise = null;
            this.latestLookupResult = (0, Byt.statusOrFromValue)(t.map(o => ({
              addresses: [o]
            })));
            let n = "[" + t.map(o => o.host + ":" + o.port).join(",") + "]";
            lme("Resolved addresses for target " + (0, y1e.uriToString)(this.target) + ": " + n);
            let r = this.listener(this.latestLookupResult, {}, this.latestServiceConfigResult, "");
            this.handleHealthStatus(r);
          }, t => {
            if (this.pendingLookupPromise === null) {
              return;
            }
            lme("Resolution error for target " + (0, y1e.uriToString)(this.target) + ": " + t.message);
            this.pendingLookupPromise = null;
            this.stopNextResolutionTimer();
            this.listener((0, Byt.statusOrFromError)(this.defaultResolutionError), {}, this.latestServiceConfigResult, "");
          }), this.isServiceConfigEnabled && this.pendingTxtPromise === null) {
            this.pendingTxtPromise = this.resolveTxt(e);
            this.pendingTxtPromise.then(t => {
              if (this.pendingTxtPromise === null) {
                return;
              }
              this.pendingTxtPromise = null;
              let n;
              try {
                if (n = (0, cnm.extractAndSelectServiceConfig)(t, this.percentage), n) {
                  this.latestServiceConfigResult = (0, Byt.statusOrFromValue)(n);
                } else {
                  this.latestServiceConfigResult = null;
                }
              } catch (r) {
                this.latestServiceConfigResult = (0, Byt.statusOrFromError)({
                  code: Iko.Status.UNAVAILABLE,
                  details: `Parsing service config failed with error ${r.message}`
                });
              }
              if (this.latestLookupResult !== null) {
                this.listener(this.latestLookupResult, {}, this.latestServiceConfigResult, "");
              }
            }, t => {});
          }
        }
      }
      handleHealthStatus(e) {
        if (e) {
          this.backoff.stop();
          this.backoff.reset();
        } else {
          this.continueResolving = true;
        }
      }
      async lookup(e) {
        if (ltl.GRPC_NODE_USE_ALTERNATIVE_RESOLVER) {
          lme("Using alternative DNS resolver.");
          let n = await Promise.allSettled([this.alternativeResolver.resolve4(e), this.alternativeResolver.resolve6(e)]);
          if (n.every(r => r.status === "rejected")) {
            throw Error(n[0].reason);
          }
          return n.reduce((r, o) => o.status === "fulfilled" ? [...r, ...o.value] : r, []).map(r => ({
            host: r,
            port: +this.port
          }));
        }
        return (await Ako.promises.lookup(e, {
          all: true
        })).map(n => ({
          host: n.address,
          port: +this.port
        }));
      }
      async resolveTxt(e) {
        if (ltl.GRPC_NODE_USE_ALTERNATIVE_RESOLVER) {
          lme("Using alternative DNS resolver.");
          return this.alternativeResolver.resolveTxt(e);
        }
        return Ako.promises.resolveTxt(e);
      }
      startNextResolutionTimer() {
        var e;
        var t;
        clearTimeout(this.nextResolutionTimer);
        this.nextResolutionTimer = setTimeout(() => {
          if (this.stopNextResolutionTimer(), this.continueResolving) {
            this.startResolutionWithBackoff();
          }
        }, this.minTimeBetweenResolutionsMs);
        (t = (e = this.nextResolutionTimer).unref) === null || t === undefined || t.call(e);
        this.isNextResolutionTimerRunning = true;
      }
      stopNextResolutionTimer() {
        clearTimeout(this.nextResolutionTimer);
        this.isNextResolutionTimerRunning = false;
      }
      startResolutionWithBackoff() {
        if (this.pendingLookupPromise === null) {
          this.continueResolving = false;
          this.backoff.runOnce();
          this.startNextResolutionTimer();
          this.startResolution();
        }
      }
      updateResolution() {
        if (this.pendingLookupPromise === null) {
          if (this.isNextResolutionTimerRunning || this.backoff.isRunning()) {
            if (this.isNextResolutionTimerRunning) {
              lme('resolution update delayed by "min time between resolutions" rate limit');
            } else {
              lme("resolution update delayed by backoff timer until " + this.backoff.getEndTime().toISOString());
            }
            this.continueResolving = true;
          } else {
            this.startResolutionWithBackoff();
          }
        }
      }
      destroy() {
        this.continueResolving = false;
        this.backoff.reset();
        this.backoff.stop();
        this.stopNextResolutionTimer();
        this.pendingLookupPromise = null;
        this.pendingTxtPromise = null;
        this.latestLookupResult = null;
        this.latestServiceConfigResult = null;
        this.returnedIpResult = false;
      }
      static getDefaultAuthority(e) {
        return e.path;
      }
    }
    function gnm() {
      (0, itl.registerResolver)("dns", ctl);
      (0, itl.registerDefaultScheme)("dns");
    }
  });
  var Oko = __commonJS(CVt => {
    Object.defineProperty(CVt, "__esModule", {
      value: true
    });
    CVt.parseCIDR = ptl;
    CVt.mapProxyName = Rnm;
    CVt.getProxiedConnection = xnm;
    var vVt = Av();
    var $yt = th();
    var dtl = require("net");
    var ynm = require("http");
    var _nm = Av();
    var utl = L9();
    var wVt = S3();
    var bnm = require("url");
    var Snm = Pko();
    function Hyt(e) {
      _nm.trace($yt.LogVerbosity.DEBUG, "proxy", e);
    }
    function Enm() {
      let e = "";
      let t = "";
      if (process.env.grpc_proxy) {
        t = "grpc_proxy";
        e = process.env.grpc_proxy;
      } else if (process.env.https_proxy) {
        t = "https_proxy";
        e = process.env.https_proxy;
      } else if (process.env.http_proxy) {
        t = "http_proxy";
        e = process.env.http_proxy;
      } else {
        return {};
      }
      let n;
      try {
        n = new bnm.URL(e);
      } catch (a) {
        (0, vVt.log)($yt.LogVerbosity.ERROR, `cannot parse value of "${t}" env var`);
        return {};
      }
      if (n.protocol !== "http:") {
        (0, vVt.log)($yt.LogVerbosity.ERROR, `"${n.protocol}" scheme not supported in proxy URI`);
        return {};
      }
      let r = null;
      if (n.username) {
        if (n.password) {
          (0, vVt.log)($yt.LogVerbosity.INFO, "userinfo found in proxy URI");
          r = decodeURIComponent(`${n.username}:${n.password}`);
        } else {
          r = n.username;
        }
      }
      let {
        hostname: o,
        port: s
      } = n;
      if (s === "") {
        s = "80";
      }
      let i = {
        address: `${o}:${s}`
      };
      if (r) {
        i.creds = r;
      }
      Hyt("Proxy server " + i.address + " set by environment variable " + t);
      return i;
    }
    function vnm() {
      let e = process.env.no_grpc_proxy;
      let t = "no_grpc_proxy";
      if (!e) {
        e = process.env.no_proxy;
        t = "no_proxy";
      }
      if (e) {
        Hyt("No proxy server list set by environment variable " + t);
        return e.split(",");
      } else {
        return [];
      }
    }
    function ptl(e) {
      let t = e.split("/");
      if (t.length !== 2) {
        return null;
      }
      let n = parseInt(t[1], 10);
      if (!(0, dtl.isIPv4)(t[0]) || Number.isNaN(n) || n < 0 || n > 32) {
        return null;
      }
      return {
        ip: mtl(t[0]),
        prefixLength: n
      };
    }
    function mtl(e) {
      return e.split(".").reduce((t, n) => (t << 8) + parseInt(n, 10), 0);
    }
    function wnm(e, t) {
      let n = e.ip;
      let r = -1 << 32 - e.prefixLength;
      return (mtl(t) & r) === (n & r);
    }
    function Cnm(e) {
      for (let t of vnm()) {
        let n = ptl(t);
        if ((0, dtl.isIPv4)(e) && n && wnm(n, e)) {
          return true;
        } else if (e.endsWith(t)) {
          return true;
        }
      }
      return false;
    }
    function Rnm(e, t) {
      var n;
      let r = {
        target: e,
        extraOptions: {}
      };
      if (((n = t["grpc.enable_http_proxy"]) !== null && n !== undefined ? n : 1) === 0) {
        return r;
      }
      if (e.scheme === "unix") {
        return r;
      }
      let o = Enm();
      if (!o.address) {
        return r;
      }
      let s = (0, wVt.splitHostPort)(e.path);
      if (!s) {
        return r;
      }
      let i = s.host;
      if (Cnm(i)) {
        Hyt("Not using proxy for target in no_proxy list: " + (0, wVt.uriToString)(e));
        return r;
      }
      let a = {
        "grpc.http_connect_target": (0, wVt.uriToString)(e)
      };
      if (o.creds) {
        a["grpc.http_connect_creds"] = o.creds;
      }
      return {
        target: {
          scheme: "dns",
          path: o.address
        },
        extraOptions: a
      };
    }
    function xnm(e, t) {
      var n;
      if (!("grpc.http_connect_target" in t)) {
        return Promise.resolve(null);
      }
      let r = t["grpc.http_connect_target"];
      let o = (0, wVt.parseUri)(r);
      if (o === null) {
        return Promise.resolve(null);
      }
      let s = (0, wVt.splitHostPort)(o.path);
      if (s === null) {
        return Promise.resolve(null);
      }
      let i = `${s.host}:${(n = s.port) !== null && n !== undefined ? n : Snm.DEFAULT_PORT}`;
      let a = {
        method: "CONNECT",
        path: i
      };
      let l = {
        Host: i
      };
      if ((0, utl.isTcpSubchannelAddress)(e)) {
        a.host = e.host;
        a.port = e.port;
      } else {
        a.socketPath = e.path;
      }
      if ("grpc.http_connect_creds" in t) {
        l["Proxy-Authorization"] = "Basic " + Buffer.from(t["grpc.http_connect_creds"]).toString("base64");
      }
      a.headers = l;
      let c = (0, utl.subchannelAddressToString)(e);
      Hyt("Using proxy " + c + " to connect to " + a.path);
      return new Promise((u, d) => {
        let p = ynm.request(a);
        p.once("connect", (m, f, h) => {
          if (p.removeAllListeners(), f.removeAllListeners(), m.statusCode === 200) {
            if (Hyt("Successfully connected to " + a.path + " through proxy " + c), h.length > 0) {
              f.unshift(h);
            }
            Hyt("Successfully established a plaintext connection to " + a.path + " through proxy " + c);
            u(f);
          } else {
            (0, vVt.log)($yt.LogVerbosity.ERROR, "Failed to connect to " + a.path + " through proxy " + c + " with status " + m.statusCode);
            d();
          }
        });
        p.once("error", m => {
          p.removeAllListeners();
          (0, vVt.log)($yt.LogVerbosity.ERROR, "Failed to connect to proxy " + c + " with error " + m.message);
          d();
        });
        p.end();
      });
    }
  });
  var Dko = __commonJS(bzn => {
    Object.defineProperty(bzn, "__esModule", {
      value: true
    });
    bzn.StreamDecoder = undefined;
    var cme;
    (function (e) {
      e[e.NO_DATA = 0] = "NO_DATA";
      e[e.READING_SIZE = 1] = "READING_SIZE";
      e[e.READING_MESSAGE = 2] = "READING_MESSAGE";
    })(cme || (cme = {}));
    class ftl {
      constructor(e) {
        this.maxReadMessageLength = e;
        this.readState = cme.NO_DATA;
        this.readCompressFlag = Buffer.alloc(1);
        this.readPartialSize = Buffer.alloc(4);
        this.readSizeRemaining = 4;
        this.readMessageSize = 0;
        this.readPartialMessage = [];
        this.readMessageRemaining = 0;
      }
      write(e) {
        let t = 0;
        let n;
        let r = [];
        while (t < e.length) {
          switch (this.readState) {
            case cme.NO_DATA:
              this.readCompressFlag = e.slice(t, t + 1);
              t += 1;
              this.readState = cme.READING_SIZE;
              this.readPartialSize.fill(0);
              this.readSizeRemaining = 4;
              this.readMessageSize = 0;
              this.readMessageRemaining = 0;
              this.readPartialMessage = [];
              break;
            case cme.READING_SIZE:
              if (n = Math.min(e.length - t, this.readSizeRemaining), e.copy(this.readPartialSize, 4 - this.readSizeRemaining, t, t + n), this.readSizeRemaining -= n, t += n, this.readSizeRemaining === 0) {
                if (this.readMessageSize = this.readPartialSize.readUInt32BE(0), this.maxReadMessageLength !== -1 && this.readMessageSize > this.maxReadMessageLength) {
                  throw Error(`Received message larger than max (${this.readMessageSize} vs ${this.maxReadMessageLength})`);
                }
                if (this.readMessageRemaining = this.readMessageSize, this.readMessageRemaining > 0) {
                  this.readState = cme.READING_MESSAGE;
                } else {
                  let o = Buffer.concat([this.readCompressFlag, this.readPartialSize], 5);
                  this.readState = cme.NO_DATA;
                  r.push(o);
                }
              }
              break;
            case cme.READING_MESSAGE:
              if (n = Math.min(e.length - t, this.readMessageRemaining), this.readPartialMessage.push(e.slice(t, t + n)), this.readMessageRemaining -= n, t += n, this.readMessageRemaining === 0) {
                let o = [this.readCompressFlag, this.readPartialSize].concat(this.readPartialMessage);
                let s = Buffer.concat(o, this.readMessageSize + 5);
                this.readState = cme.NO_DATA;
                r.push(s);
              }
              break;
            default:
              throw Error("Unexpected read state");
          }
        }
        return r;
      }
    }
    bzn.StreamDecoder = ftl;
  });
  var gtl = __commonJS(Szn => {
    Object.defineProperty(Szn, "__esModule", {
      value: true
    });
    Szn.Http2SubchannelCall = undefined;
    var ove = require("http2");
    var knm = require("os");
    var gE = th();
    var sve = K1();
    var Anm = Dko();
    var Inm = Av();
    var Pnm = th();
    function Dnm(e) {
      for (let [t, n] of Object.entries(knm.constants.errno)) {
        if (n === e) {
          return t;
        }
      }
      return "Unknown system error " + e;
    }
    function Mko(e) {
      let t = `Received HTTP status code ${e}`;
      let n;
      switch (e) {
        case 400:
          n = gE.Status.INTERNAL;
          break;
        case 401:
          n = gE.Status.UNAUTHENTICATED;
          break;
        case 403:
          n = gE.Status.PERMISSION_DENIED;
          break;
        case 404:
          n = gE.Status.UNIMPLEMENTED;
          break;
        case 429:
        case 502:
        case 503:
        case 504:
          n = gE.Status.UNAVAILABLE;
          break;
        default:
          n = gE.Status.UNKNOWN;
      }
      return {
        code: n,
        details: t,
        metadata: new sve.Metadata()
      };
    }
    class htl {
      constructor(e, t, n, r, o) {
        var s;
        this.http2Stream = e;
        this.callEventTracker = t;
        this.listener = n;
        this.transport = r;
        this.callId = o;
        this.isReadFilterPending = false;
        this.isPushPending = false;
        this.canPush = false;
        this.readsClosed = false;
        this.statusOutput = false;
        this.unpushedReadMessages = [];
        this.finalStatus = null;
        this.internalError = null;
        this.serverEndedCall = false;
        this.connectionDropped = false;
        let i = (s = r.getOptions()["grpc.max_receive_message_length"]) !== null && s !== undefined ? s : gE.DEFAULT_MAX_RECEIVE_MESSAGE_LENGTH;
        this.decoder = new Anm.StreamDecoder(i);
        e.on("response", (a, l) => {
          let c = "";
          for (let u of Object.keys(a)) {
            c += "\t\t" + u + ": " + a[u] + `
`;
          }
          if (this.trace(`Received server headers:
` + c), this.httpStatusCode = a[":status"], l & ove.constants.NGHTTP2_FLAG_END_STREAM) {
            this.handleTrailers(a);
          } else {
            let u;
            try {
              u = sve.Metadata.fromHttp2Headers(a);
            } catch (d) {
              this.endCall({
                code: gE.Status.UNKNOWN,
                details: d.message,
                metadata: new sve.Metadata()
              });
              return;
            }
            this.listener.onReceiveMetadata(u);
          }
        });
        e.on("trailers", a => {
          this.handleTrailers(a);
        });
        e.on("data", a => {
          if (this.statusOutput) {
            return;
          }
          this.trace("receive HTTP/2 data frame of length " + a.length);
          let l;
          try {
            l = this.decoder.write(a);
          } catch (c) {
            if (this.httpStatusCode !== undefined && this.httpStatusCode !== 200) {
              let u = Mko(this.httpStatusCode);
              this.cancelWithStatus(u.code, u.details);
            } else {
              this.cancelWithStatus(gE.Status.RESOURCE_EXHAUSTED, c.message);
            }
            return;
          }
          for (let c of l) {
            this.trace("parsed message of length " + c.length);
            this.callEventTracker.addMessageReceived();
            this.tryPush(c);
          }
        });
        e.on("end", () => {
          this.readsClosed = true;
          this.maybeOutputStatus();
        });
        e.on("close", () => {
          this.serverEndedCall = true;
          process.nextTick(() => {
            var a;
            if (this.trace("HTTP/2 stream closed with code " + e.rstCode), ((a = this.finalStatus) === null || a === undefined ? undefined : a.code) === gE.Status.OK) {
              return;
            }
            let l;
            let c = "";
            switch (e.rstCode) {
              case ove.constants.NGHTTP2_NO_ERROR:
                if (this.finalStatus !== null) {
                  return;
                }
                if (this.httpStatusCode && this.httpStatusCode !== 200) {
                  let u = Mko(this.httpStatusCode);
                  l = u.code;
                  c = u.details;
                } else {
                  l = gE.Status.INTERNAL;
                  c = `Received RST_STREAM with code ${e.rstCode} (Call ended without gRPC status)`;
                }
                break;
              case ove.constants.NGHTTP2_REFUSED_STREAM:
                l = gE.Status.UNAVAILABLE;
                c = "Stream refused by server";
                break;
              case ove.constants.NGHTTP2_CANCEL:
                if (this.connectionDropped) {
                  l = gE.Status.UNAVAILABLE;
                  c = "Connection dropped";
                } else {
                  l = gE.Status.CANCELLED;
                  c = "Call cancelled";
                }
                break;
              case ove.constants.NGHTTP2_ENHANCE_YOUR_CALM:
                l = gE.Status.RESOURCE_EXHAUSTED;
                c = "Bandwidth exhausted or memory limit exceeded";
                break;
              case ove.constants.NGHTTP2_INADEQUATE_SECURITY:
                l = gE.Status.PERMISSION_DENIED;
                c = "Protocol not secure enough";
                break;
              case ove.constants.NGHTTP2_INTERNAL_ERROR:
                if (l = gE.Status.INTERNAL, this.internalError === null) {
                  c = `Received RST_STREAM with code ${e.rstCode} (Internal server error)`;
                } else if (this.internalError.code === "ECONNRESET" || this.internalError.code === "ETIMEDOUT") {
                  l = gE.Status.UNAVAILABLE;
                  c = this.internalError.message;
                } else {
                  c = `Received RST_STREAM with code ${e.rstCode} triggered by internal client error: ${this.internalError.message}`;
                }
                break;
              default:
                l = gE.Status.INTERNAL;
                c = `Received RST_STREAM with code ${e.rstCode}`;
            }
            this.endCall({
              code: l,
              details: c,
              metadata: new sve.Metadata(),
              rstCode: e.rstCode
            });
          });
        });
        e.on("error", a => {
          if (a.code !== "ERR_HTTP2_STREAM_ERROR") {
            this.trace("Node error event: message=" + a.message + " code=" + a.code + " errno=" + Dnm(a.errno) + " syscall=" + a.syscall);
            this.internalError = a;
          }
          this.callEventTracker.onStreamEnd(false);
        });
      }
      getDeadlineInfo() {
        return [`remote_addr=${this.getPeer()}`];
      }
      onDisconnect() {
        this.connectionDropped = true;
        setImmediate(() => {
          this.endCall({
            code: gE.Status.UNAVAILABLE,
            details: "Connection dropped",
            metadata: new sve.Metadata()
          });
        });
      }
      outputStatus() {
        if (!this.statusOutput) {
          this.statusOutput = true;
          this.trace("ended with status: code=" + this.finalStatus.code + ' details="' + this.finalStatus.details + '"');
          this.callEventTracker.onCallEnd(this.finalStatus);
          process.nextTick(() => {
            this.listener.onReceiveStatus(this.finalStatus);
          });
          this.http2Stream.resume();
        }
      }
      trace(e) {
        Inm.trace(Pnm.LogVerbosity.DEBUG, "subchannel_call", "[" + this.callId + "] " + e);
      }
      endCall(e) {
        if (this.finalStatus === null || this.finalStatus.code === gE.Status.OK) {
          this.finalStatus = e;
          this.maybeOutputStatus();
        }
        this.destroyHttp2Stream();
      }
      maybeOutputStatus() {
        if (this.finalStatus !== null) {
          if (this.finalStatus.code !== gE.Status.OK || this.readsClosed && this.unpushedReadMessages.length === 0 && !this.isReadFilterPending && !this.isPushPending) {
            this.outputStatus();
          }
        }
      }
      push(e) {
        this.trace("pushing to reader message of length " + (e instanceof Buffer ? e.length : null));
        this.canPush = false;
        this.isPushPending = true;
        process.nextTick(() => {
          if (this.isPushPending = false, this.statusOutput) {
            return;
          }
          this.listener.onReceiveMessage(e);
          this.maybeOutputStatus();
        });
      }
      tryPush(e) {
        if (this.canPush) {
          this.http2Stream.pause();
          this.push(e);
        } else {
          this.trace("unpushedReadMessages.push message of length " + e.length);
          this.unpushedReadMessages.push(e);
        }
      }
      handleTrailers(e) {
        this.serverEndedCall = true;
        this.callEventTracker.onStreamEnd(true);
        let t = "";
        for (let s of Object.keys(e)) {
          t += "\t\t" + s + ": " + e[s] + `
`;
        }
        this.trace(`Received server trailers:
` + t);
        let n;
        try {
          n = sve.Metadata.fromHttp2Headers(e);
        } catch (s) {
          n = new sve.Metadata();
        }
        let r = n.getMap();
        let o;
        if (typeof r["grpc-status"] === "string") {
          let s = Number(r["grpc-status"]);
          this.trace("received status code " + s + " from server");
          n.remove("grpc-status");
          let i = "";
          if (typeof r["grpc-message"] === "string") {
            try {
              i = decodeURI(r["grpc-message"]);
            } catch (a) {
              i = r["grpc-message"];
            }
            n.remove("grpc-message");
            this.trace('received status details string "' + i + '" from server');
          }
          o = {
            code: s,
            details: i,
            metadata: n
          };
        } else if (this.httpStatusCode) {
          o = Mko(this.httpStatusCode);
          o.metadata = n;
        } else {
          o = {
            code: gE.Status.UNKNOWN,
            details: "No status information received",
            metadata: n
          };
        }
        this.endCall(o);
      }
      destroyHttp2Stream() {
        var e;
        if (this.http2Stream.destroyed) {
          return;
        }
        if (this.serverEndedCall) {
          this.http2Stream.end();
        } else {
          let t;
          if (((e = this.finalStatus) === null || e === undefined ? undefined : e.code) === gE.Status.OK) {
            t = ove.constants.NGHTTP2_NO_ERROR;
          } else {
            t = ove.constants.NGHTTP2_CANCEL;
          }
          this.trace("close http2 stream with code " + t);
          this.http2Stream.close(t);
        }
      }
      cancelWithStatus(e, t) {
        this.trace("cancelWithStatus code: " + e + ' details: "' + t + '"');
        this.endCall({
          code: e,
          details: t,
          metadata: new sve.Metadata()
        });
      }
      getStatus() {
        return this.finalStatus;
      }
      getPeer() {
        return this.transport.getPeerName();
      }
      getCallNumber() {
        return this.callId;
      }
      getAuthContext() {
        return this.transport.getAuthContext();
      }
      startRead() {
        if (this.finalStatus !== null && this.finalStatus.code !== gE.Status.OK) {
          this.readsClosed = true;
          this.maybeOutputStatus();
          return;
        }
        if (this.canPush = true, this.unpushedReadMessages.length > 0) {
          let e = this.unpushedReadMessages.shift();
          this.push(e);
          return;
        }
        this.http2Stream.resume();
      }
      sendMessageWithContext(e, t) {
        this.trace("write() called with message of length " + t.length);
        let n = r => {
          process.nextTick(() => {
            var o;
            let s = gE.Status.UNAVAILABLE;
            if ((r === null || r === undefined ? undefined : r.code) === "ERR_STREAM_WRITE_AFTER_END") {
              s = gE.Status.INTERNAL;
            }
            if (r) {
              this.cancelWithStatus(s, `Write error: ${r.message}`);
            }
            (o = e.callback) === null || o === undefined || o.call(e);
          });
        };
        this.trace("sending data chunk of length " + t.length);
        this.callEventTracker.addMessageSent();
        try {
          this.http2Stream.write(t, n);
        } catch (r) {
          this.endCall({
            code: gE.Status.UNAVAILABLE,
            details: `Write failed with error ${r.message}`,
            metadata: new sve.Metadata()
          });
        }
      }
      halfClose() {
        this.trace("end() called");
        this.trace("calling end() on HTTP/2 stream");
        this.http2Stream.end();
      }
    }
    Szn.Http2SubchannelCall = htl;
  });
  var btl = __commonJS(vzn => {
    Object.defineProperty(vzn, "__esModule", {
      value: true
    });
    vzn.Http2SubchannelConnector = undefined;
    var EVe = require("http2");
    var Mnm = require("tls");
    var Tzn = h1e();
    var RVt = th();
    var Nnm = Oko();
    var jyt = Av();
    var Lnm = tse();
    var Ezn = L9();
    var Nko = S3();
    var Fnm = require("net");
    var Unm = gtl();
    var Bnm = czn();
    var Hnm = KRo().version;
    var {
      HTTP2_HEADER_AUTHORITY: jnm,
      HTTP2_HEADER_CONTENT_TYPE: qnm,
      HTTP2_HEADER_METHOD: Wnm,
      HTTP2_HEADER_PATH: Gnm,
      HTTP2_HEADER_TE: Vnm,
      HTTP2_HEADER_USER_AGENT: znm
    } = EVe.constants;
    var Ynm = Buffer.from("too_many_pings", "ascii");
    class ytl {
      constructor(e, t, n, r) {
        if (this.session = e, this.options = n, this.remoteName = r, this.keepaliveTimer = null, this.pendingSendKeepalivePing = false, this.activeCalls = new Set(), this.disconnectListeners = [], this.disconnectHandled = false, this.channelzEnabled = true, this.keepalivesSent = 0, this.messagesSent = 0, this.messagesReceived = 0, this.lastMessageSentTimestamp = null, this.lastMessageReceivedTimestamp = null, this.subchannelAddressString = (0, Ezn.subchannelAddressToString)(t), n["grpc.enable_channelz"] === 0) {
          this.channelzEnabled = false;
          this.streamTracker = new Tzn.ChannelzCallTrackerStub();
        } else {
          this.streamTracker = new Tzn.ChannelzCallTracker();
        }
        if (this.channelzRef = (0, Tzn.registerChannelzSocket)(this.subchannelAddressString, () => this.getChannelzInfo(), this.channelzEnabled), this.userAgent = [n["grpc.primary_user_agent"], `grpc-node-js/${Hnm}`, n["grpc.secondary_user_agent"]].filter(o => o).join(" "), "grpc.keepalive_time_ms" in n) {
          this.keepaliveTimeMs = n["grpc.keepalive_time_ms"];
        } else {
          this.keepaliveTimeMs = -1;
        }
        if ("grpc.keepalive_timeout_ms" in n) {
          this.keepaliveTimeoutMs = n["grpc.keepalive_timeout_ms"];
        } else {
          this.keepaliveTimeoutMs = 20000;
        }
        if ("grpc.keepalive_permit_without_calls" in n) {
          this.keepaliveWithoutCalls = n["grpc.keepalive_permit_without_calls"] === 1;
        } else {
          this.keepaliveWithoutCalls = false;
        }
        if (e.once("close", () => {
          this.trace("session closed");
          this.handleDisconnect();
        }), e.once("goaway", (o, s, i) => {
          let a = false;
          if (o === EVe.constants.NGHTTP2_ENHANCE_YOUR_CALM && i && i.equals(Ynm)) {
            a = true;
          }
          this.trace("connection closed by GOAWAY with code " + o + " and data " + (i === null || i === undefined ? undefined : i.toString()));
          this.reportDisconnectToOwner(a);
        }), e.once("error", o => {
          this.trace("connection closed with error " + o.message);
          this.handleDisconnect();
        }), e.socket.once("close", o => {
          this.trace("connection closed. hadError=" + o);
          this.handleDisconnect();
        }), jyt.isTracerEnabled("transport")) {
          e.on("remoteSettings", o => {
            this.trace("new settings received" + (this.session !== e ? " on the old connection" : "") + ": " + JSON.stringify(o));
          });
          e.on("localSettings", o => {
            this.trace("local settings acknowledged by remote" + (this.session !== e ? " on the old connection" : "") + ": " + JSON.stringify(o));
          });
        }
        if (this.keepaliveWithoutCalls) {
          this.maybeStartKeepalivePingTimer();
        }
        if (e.socket instanceof Mnm.TLSSocket) {
          this.authContext = {
            transportSecurityType: "ssl",
            sslPeerCertificate: e.socket.getPeerCertificate()
          };
        } else {
          this.authContext = {};
        }
      }
      getChannelzInfo() {
        var e;
        var t;
        var n;
        let r = this.session.socket;
        let o = r.remoteAddress ? (0, Ezn.stringToSubchannelAddress)(r.remoteAddress, r.remotePort) : null;
        let s = r.localAddress ? (0, Ezn.stringToSubchannelAddress)(r.localAddress, r.localPort) : null;
        let i;
        if (this.session.encrypted) {
          let l = r;
          let c = l.getCipher();
          let u = l.getCertificate();
          let d = l.getPeerCertificate();
          i = {
            cipherSuiteStandardName: (e = c.standardName) !== null && e !== undefined ? e : null,
            cipherSuiteOtherName: c.standardName ? null : c.name,
            localCertificate: u && "raw" in u ? u.raw : null,
            remoteCertificate: d && "raw" in d ? d.raw : null
          };
        } else {
          i = null;
        }
        return {
          remoteAddress: o,
          localAddress: s,
          security: i,
          remoteName: this.remoteName,
          streamsStarted: this.streamTracker.callsStarted,
          streamsSucceeded: this.streamTracker.callsSucceeded,
          streamsFailed: this.streamTracker.callsFailed,
          messagesSent: this.messagesSent,
          messagesReceived: this.messagesReceived,
          keepAlivesSent: this.keepalivesSent,
          lastLocalStreamCreatedTimestamp: this.streamTracker.lastCallStartedTimestamp,
          lastRemoteStreamCreatedTimestamp: null,
          lastMessageSentTimestamp: this.lastMessageSentTimestamp,
          lastMessageReceivedTimestamp: this.lastMessageReceivedTimestamp,
          localFlowControlWindow: (t = this.session.state.localWindowSize) !== null && t !== undefined ? t : null,
          remoteFlowControlWindow: (n = this.session.state.remoteWindowSize) !== null && n !== undefined ? n : null
        };
      }
      trace(e) {
        jyt.trace(RVt.LogVerbosity.DEBUG, "transport", "(" + this.channelzRef.id + ") " + this.subchannelAddressString + " " + e);
      }
      keepaliveTrace(e) {
        jyt.trace(RVt.LogVerbosity.DEBUG, "keepalive", "(" + this.channelzRef.id + ") " + this.subchannelAddressString + " " + e);
      }
      flowControlTrace(e) {
        jyt.trace(RVt.LogVerbosity.DEBUG, "transport_flowctrl", "(" + this.channelzRef.id + ") " + this.subchannelAddressString + " " + e);
      }
      internalsTrace(e) {
        jyt.trace(RVt.LogVerbosity.DEBUG, "transport_internals", "(" + this.channelzRef.id + ") " + this.subchannelAddressString + " " + e);
      }
      reportDisconnectToOwner(e) {
        if (this.disconnectHandled) {
          return;
        }
        this.disconnectHandled = true;
        this.disconnectListeners.forEach(t => t(e));
      }
      handleDisconnect() {
        this.clearKeepaliveTimeout();
        this.reportDisconnectToOwner(false);
        for (let e of this.activeCalls) {
          e.onDisconnect();
        }
        setImmediate(() => {
          this.session.destroy();
        });
      }
      addDisconnectListener(e) {
        this.disconnectListeners.push(e);
      }
      canSendPing() {
        return !this.session.destroyed && this.keepaliveTimeMs > 0 && (this.keepaliveWithoutCalls || this.activeCalls.size > 0);
      }
      maybeSendPing() {
        var e;
        var t;
        if (!this.canSendPing()) {
          this.pendingSendKeepalivePing = true;
          return;
        }
        if (this.keepaliveTimer) {
          console.error("keepaliveTimeout is not null");
          return;
        }
        if (this.channelzEnabled) {
          this.keepalivesSent += 1;
        }
        this.keepaliveTrace("Sending ping with timeout " + this.keepaliveTimeoutMs + "ms");
        this.keepaliveTimer = setTimeout(() => {
          this.keepaliveTimer = null;
          this.keepaliveTrace("Ping timeout passed without response");
          this.handleDisconnect();
        }, this.keepaliveTimeoutMs);
        (t = (e = this.keepaliveTimer).unref) === null || t === undefined || t.call(e);
        let n = "";
        try {
          if (!this.session.ping((o, s, i) => {
            if (this.clearKeepaliveTimeout(), o) {
              this.keepaliveTrace("Ping failed with error " + o.message);
              this.handleDisconnect();
            } else {
              this.keepaliveTrace("Received ping response");
              this.maybeStartKeepalivePingTimer();
            }
          })) {
            n = "Ping returned false";
          }
        } catch (r) {
          n = (r instanceof Error ? r.message : "") || "Unknown error";
        }
        if (n) {
          this.keepaliveTrace("Ping send failed: " + n);
          this.handleDisconnect();
        }
      }
      maybeStartKeepalivePingTimer() {
        var e;
        var t;
        if (!this.canSendPing()) {
          return;
        }
        if (this.pendingSendKeepalivePing) {
          this.pendingSendKeepalivePing = false;
          this.maybeSendPing();
        } else if (!this.keepaliveTimer) {
          this.keepaliveTrace("Starting keepalive timer for " + this.keepaliveTimeMs + "ms");
          this.keepaliveTimer = setTimeout(() => {
            this.keepaliveTimer = null;
            this.maybeSendPing();
          }, this.keepaliveTimeMs);
          (t = (e = this.keepaliveTimer).unref) === null || t === undefined || t.call(e);
        }
      }
      clearKeepaliveTimeout() {
        if (this.keepaliveTimer) {
          clearTimeout(this.keepaliveTimer);
          this.keepaliveTimer = null;
        }
      }
      removeActiveCall(e) {
        if (this.activeCalls.delete(e), this.activeCalls.size === 0) {
          this.session.unref();
        }
      }
      addActiveCall(e) {
        if (this.activeCalls.add(e), this.activeCalls.size === 1) {
          if (this.session.ref(), !this.keepaliveWithoutCalls) {
            this.maybeStartKeepalivePingTimer();
          }
        }
      }
      createCall(e, t, n, r, o) {
        let s = e.toHttp2Headers();
        s[jnm] = t;
        s[znm] = this.userAgent;
        s[qnm] = "application/grpc";
        s[Wnm] = "POST";
        s[Gnm] = n;
        s[Vnm] = "trailers";
        let i;
        try {
          i = this.session.request(s);
        } catch (c) {
          throw this.handleDisconnect(), c;
        }
        this.flowControlTrace("local window size: " + this.session.state.localWindowSize + " remote window size: " + this.session.state.remoteWindowSize);
        this.internalsTrace("session.closed=" + this.session.closed + " session.destroyed=" + this.session.destroyed + " session.socket.destroyed=" + this.session.socket.destroyed);
        let a;
        let l;
        if (this.channelzEnabled) {
          this.streamTracker.addCallStarted();
          a = {
            addMessageSent: () => {
              var c;
              this.messagesSent += 1;
              this.lastMessageSentTimestamp = new Date();
              (c = o.addMessageSent) === null || c === undefined || c.call(o);
            },
            addMessageReceived: () => {
              var c;
              this.messagesReceived += 1;
              this.lastMessageReceivedTimestamp = new Date();
              (c = o.addMessageReceived) === null || c === undefined || c.call(o);
            },
            onCallEnd: c => {
              var u;
              (u = o.onCallEnd) === null || u === undefined || u.call(o, c);
              this.removeActiveCall(l);
            },
            onStreamEnd: c => {
              var u;
              if (c) {
                this.streamTracker.addCallSucceeded();
              } else {
                this.streamTracker.addCallFailed();
              }
              (u = o.onStreamEnd) === null || u === undefined || u.call(o, c);
            }
          };
        } else {
          a = {
            addMessageSent: () => {
              var c;
              (c = o.addMessageSent) === null || c === undefined || c.call(o);
            },
            addMessageReceived: () => {
              var c;
              (c = o.addMessageReceived) === null || c === undefined || c.call(o);
            },
            onCallEnd: c => {
              var u;
              (u = o.onCallEnd) === null || u === undefined || u.call(o, c);
              this.removeActiveCall(l);
            },
            onStreamEnd: c => {
              var u;
              (u = o.onStreamEnd) === null || u === undefined || u.call(o, c);
            }
          };
        }
        l = new Unm.Http2SubchannelCall(i, a, r, this, (0, Bnm.getNextCallNumber)());
        this.addActiveCall(l);
        return l;
      }
      getChannelzRef() {
        return this.channelzRef;
      }
      getPeerName() {
        return this.subchannelAddressString;
      }
      getOptions() {
        return this.options;
      }
      getAuthContext() {
        return this.authContext;
      }
      shutdown() {
        this.session.close();
        (0, Tzn.unregisterChannelzRef)(this.channelzRef);
      }
    }
    class _tl {
      constructor(e) {
        this.channelTarget = e;
        this.session = null;
        this.isShutdown = false;
      }
      trace(e) {
        jyt.trace(RVt.LogVerbosity.DEBUG, "transport", (0, Nko.uriToString)(this.channelTarget) + " " + e);
      }
      createSession(e, t, n) {
        if (this.isShutdown) {
          return Promise.reject();
        }
        if (e.socket.closed) {
          return Promise.reject("Connection closed before starting HTTP/2 handshake");
        }
        return new Promise((r, o) => {
          var s;
          var i;
          var a;
          var l;
          var c;
          var u;
          var d;
          var p;
          let m = null;
          let f = this.channelTarget;
          if ("grpc.http_connect_target" in n) {
            let k = (0, Nko.parseUri)(n["grpc.http_connect_target"]);
            if (k) {
              f = k;
              m = (0, Nko.uriToString)(k);
            }
          }
          let h = e.secure ? "https" : "http";
          let g = (0, Lnm.getDefaultAuthority)(f);
          let y = () => {
            var k;
            (k = this.session) === null || k === undefined || k.destroy();
            this.session = null;
            setImmediate(() => {
              if (!A) {
                A = true;
                o(`${x.trim()} (${new Date().toISOString()})`);
              }
            });
          };
          let _ = k => {
            var I;
            if ((I = this.session) === null || I === undefined || I.destroy(), x = k.message, this.trace("connection failed with error " + x), !A) {
              A = true;
              o(`${x} (${new Date().toISOString()})`);
            }
          };
          let b = {
            createConnection: (k, I) => e.socket,
            settings: {
              initialWindowSize: (l = (s = n["grpc-node.flow_control_window"]) !== null && s !== undefined ? s : (a = (i = EVe.getDefaultSettings) === null || i === undefined ? undefined : i.call(EVe)) === null || a === undefined ? undefined : a.initialWindowSize) !== null && l !== undefined ? l : 65535
            },
            maxSendHeaderBlockLength: Number.MAX_SAFE_INTEGER,
            maxSessionMemory: (c = n["grpc-node.max_session_memory"]) !== null && c !== undefined ? c : Number.MAX_SAFE_INTEGER
          };
          let S = EVe.connect(`${h}://${g}`, b);
          let E = (p = (d = (u = EVe.getDefaultSettings) === null || u === undefined ? undefined : u.call(EVe)) === null || d === undefined ? undefined : d.initialWindowSize) !== null && p !== undefined ? p : 65535;
          let C = n["grpc-node.flow_control_window"];
          this.session = S;
          let x = "Failed to connect";
          let A = false;
          S.unref();
          S.once("remoteSettings", () => {
            var k;
            if (C && C > E) {
              try {
                S.setLocalWindowSize(C);
              } catch (I) {
                let O = C - ((k = S.state.localWindowSize) !== null && k !== undefined ? k : E);
                if (O > 0) {
                  S.incrementWindowSize(O);
                }
              }
            }
            S.removeAllListeners();
            e.socket.removeListener("close", y);
            e.socket.removeListener("error", _);
            r(new ytl(S, t, n, m));
            this.session = null;
          });
          S.once("close", y);
          S.once("error", _);
          e.socket.once("close", y);
          e.socket.once("error", _);
        });
      }
      tcpConnect(e, t) {
        return (0, Nnm.getProxiedConnection)(e, t).then(n => {
          if (n) {
            return n;
          } else {
            return new Promise((r, o) => {
              let s = () => {
                o(Error("Socket closed"));
              };
              let i = l => {
                o(l);
              };
              let a = Fnm.connect(e, () => {
                a.removeListener("close", s);
                a.removeListener("error", i);
                r(a);
              });
              a.once("close", s);
              a.once("error", i);
            });
          }
        });
      }
      async connect(e, t, n) {
        if (this.isShutdown) {
          return Promise.reject();
        }
        let r = null;
        let o = null;
        let s = (0, Ezn.subchannelAddressToString)(e);
        try {
          this.trace(s + " Waiting for secureConnector to be ready");
          await t.waitForReady();
          this.trace(s + " secureConnector is ready");
          r = await this.tcpConnect(e, n);
          r.setNoDelay();
          this.trace(s + " Established TCP connection");
          o = await t.connect(r);
          this.trace(s + " Established secure connection");
          return this.createSession(o, e, n);
        } catch (i) {
          throw r === null || r === undefined || r.destroy(), o === null || o === undefined || o.socket.destroy(), i;
        }
      }
      shutdown() {
        var e;
        this.isShutdown = true;
        (e = this.session) === null || e === undefined || e.close();
        this.session = null;
      }
    }
    vzn.Http2SubchannelConnector = _tl;
  });
  var Stl = __commonJS(xVt => {
    Object.defineProperty(xVt, "__esModule", {
      value: true
    });
    xVt.SubchannelPool = undefined;
    xVt.getSubchannelPool = rrm;
    var Jnm = sQa();
    var Xnm = otl();
    var Qnm = L9();
    var Znm = S3();
    var erm = btl();
    class wzn {
      constructor() {
        this.pool = Object.create(null);
        this.cleanupTimer = null;
      }
      unrefUnusedSubchannels() {
        let e = true;
        for (let t in this.pool) {
          let r = this.pool[t].filter(o => !o.subchannel.unrefIfOneRef());
          if (r.length > 0) {
            e = false;
          }
          this.pool[t] = r;
        }
        if (e && this.cleanupTimer !== null) {
          clearInterval(this.cleanupTimer);
          this.cleanupTimer = null;
        }
      }
      ensureCleanupTask() {
        var e;
        var t;
        if (this.cleanupTimer === null) {
          this.cleanupTimer = setInterval(() => {
            this.unrefUnusedSubchannels();
          }, 1e4);
          (t = (e = this.cleanupTimer).unref) === null || t === undefined || t.call(e);
        }
      }
      getOrCreateSubchannel(e, t, n, r) {
        this.ensureCleanupTask();
        let o = (0, Znm.uriToString)(e);
        if (o in this.pool) {
          let i = this.pool[o];
          for (let a of i) {
            if ((0, Qnm.subchannelAddressEqual)(t, a.subchannelAddress) && (0, Jnm.channelOptionsEqual)(n, a.channelArguments) && r._equals(a.channelCredentials)) {
              return a.subchannel;
            }
          }
        }
        let s = new Xnm.Subchannel(e, t, n, r, new erm.Http2SubchannelConnector(e));
        if (!(o in this.pool)) {
          this.pool[o] = [];
        }
        this.pool[o].push({
          subchannelAddress: t,
          channelArguments: n,
          channelCredentials: r,
          subchannel: s
        });
        s.ref();
        return s;
      }
    }
    xVt.SubchannelPool = wzn;
    var nrm = new wzn();
    function rrm(e) {
      if (e) {
        return nrm;
      } else {
        return new wzn();
      }
    }
  });
  var wtl = __commonJS(xzn => {
    Object.defineProperty(xzn, "__esModule", {
      value: true
    });
    xzn.LoadBalancingCall = undefined;
    var Ttl = T3();
    var Czn = th();
    var Etl = Fyt();
    var Rzn = K1();
    var kVt = YEe();
    var orm = S3();
    var srm = Av();
    var Fko = SVt();
    var irm = require("http2");
    class vtl {
      constructor(e, t, n, r, o, s, i) {
        var a;
        var l;
        this.channel = e;
        this.callConfig = t;
        this.methodName = n;
        this.host = r;
        this.credentials = o;
        this.deadline = s;
        this.callNumber = i;
        this.child = null;
        this.readPending = false;
        this.pendingMessage = null;
        this.pendingHalfClose = false;
        this.ended = false;
        this.metadata = null;
        this.listener = null;
        this.onCallEnded = null;
        this.childStartTime = null;
        let c = this.methodName.split("/");
        let u = "";
        if (c.length >= 2) {
          u = c[1];
        }
        let d = (l = (a = (0, orm.splitHostPort)(this.host)) === null || a === undefined ? undefined : a.host) !== null && l !== undefined ? l : "localhost";
        this.serviceUrl = `https://${d}/${u}`;
        this.startTime = new Date();
      }
      getDeadlineInfo() {
        var e;
        var t;
        let n = [];
        if (this.childStartTime) {
          if (this.childStartTime > this.startTime) {
            if ((e = this.metadata) === null || e === undefined ? undefined : e.getOptions().waitForReady) {
              n.push("wait_for_ready");
            }
            n.push(`LB pick: ${(0, Etl.formatDateDifference)(this.startTime, this.childStartTime)}`);
          }
          n.push(...this.child.getDeadlineInfo());
          return n;
        } else {
          if ((t = this.metadata) === null || t === undefined ? undefined : t.getOptions().waitForReady) {
            n.push("wait_for_ready");
          }
          n.push("Waiting for LB pick");
        }
        return n;
      }
      trace(e) {
        srm.trace(Czn.LogVerbosity.DEBUG, "load_balancing_call", "[" + this.callNumber + "] " + e);
      }
      outputStatus(e, t) {
        var n;
        var r;
        if (!this.ended) {
          this.ended = true;
          this.trace("ended with status: code=" + e.code + ' details="' + e.details + '" start time=' + this.startTime.toISOString());
          let o = Object.assign(Object.assign({}, e), {
            progress: t
          });
          (n = this.listener) === null || n === undefined || n.onReceiveStatus(o);
          (r = this.onCallEnded) === null || r === undefined || r.call(this, o.code, o.details, o.metadata);
        }
      }
      doPick() {
        var e;
        var t;
        if (this.ended) {
          return;
        }
        if (!this.metadata) {
          throw Error("doPick called before start");
        }
        this.trace("Pick called");
        let n = this.metadata.clone();
        let r = this.channel.doPick(n, this.callConfig.pickInformation);
        let o = r.subchannel ? "(" + r.subchannel.getChannelzRef().id + ") " + r.subchannel.getAddress() : "" + r.subchannel;
        switch (this.trace("Pick result: " + kVt.PickResultType[r.pickResultType] + " subchannel: " + o + " status: " + ((e = r.status) === null || e === undefined ? undefined : e.code) + " " + ((t = r.status) === null || t === undefined ? undefined : t.details)), r.pickResultType) {
          case kVt.PickResultType.COMPLETE:
            this.credentials.compose(r.subchannel.getCallCredentials()).generateMetadata({
              method_name: this.methodName,
              service_url: this.serviceUrl
            }).then(l => {
              var c;
              if (this.ended) {
                this.trace("Credentials metadata generation finished after call ended");
                return;
              }
              if (n.merge(l), n.get("authorization").length > 1) {
                this.outputStatus({
                  code: Czn.Status.INTERNAL,
                  details: '"authorization" metadata cannot have multiple values',
                  metadata: new Rzn.Metadata()
                }, "PROCESSED");
              }
              if (r.subchannel.getConnectivityState() !== Ttl.ConnectivityState.READY) {
                this.trace("Picked subchannel " + o + " has state " + Ttl.ConnectivityState[r.subchannel.getConnectivityState()] + " after getting credentials metadata. Retrying pick");
                this.doPick();
                return;
              }
              if (this.deadline !== 1 / 0) {
                n.set("grpc-timeout", (0, Etl.getDeadlineTimeoutString)(this.deadline));
              }
              try {
                this.child = r.subchannel.getRealSubchannel().createCall(n, this.host, this.methodName, {
                  onReceiveMetadata: u => {
                    this.trace("Received metadata");
                    this.listener.onReceiveMetadata(u);
                  },
                  onReceiveMessage: u => {
                    this.trace("Received message");
                    this.listener.onReceiveMessage(u);
                  },
                  onReceiveStatus: u => {
                    if (this.trace("Received status"), u.rstCode === irm.constants.NGHTTP2_REFUSED_STREAM) {
                      this.outputStatus(u, "REFUSED");
                    } else {
                      this.outputStatus(u, "PROCESSED");
                    }
                  }
                });
                this.childStartTime = new Date();
              } catch (u) {
                this.trace("Failed to start call on picked subchannel " + o + " with error " + u.message);
                this.outputStatus({
                  code: Czn.Status.INTERNAL,
                  details: "Failed to start HTTP/2 stream with error " + u.message,
                  metadata: new Rzn.Metadata()
                }, "NOT_STARTED");
                return;
              }
              if ((c = r.onCallStarted) === null || c === undefined || c.call(r), this.onCallEnded = r.onCallEnded, this.trace("Created child call [" + this.child.getCallNumber() + "]"), this.readPending) {
                this.child.startRead();
              }
              if (this.pendingMessage) {
                this.child.sendMessageWithContext(this.pendingMessage.context, this.pendingMessage.message);
              }
              if (this.pendingHalfClose) {
                this.child.halfClose();
              }
            }, l => {
              let {
                code: c,
                details: u
              } = (0, Fko.restrictControlPlaneStatusCode)(typeof l.code === "number" ? l.code : Czn.Status.UNKNOWN, `Getting metadata from plugin failed with error: ${l.message}`);
              this.outputStatus({
                code: c,
                details: u,
                metadata: new Rzn.Metadata()
              }, "PROCESSED");
            });
            break;
          case kVt.PickResultType.DROP:
            let {
              code: i,
              details: a
            } = (0, Fko.restrictControlPlaneStatusCode)(r.status.code, r.status.details);
            setImmediate(() => {
              this.outputStatus({
                code: i,
                details: a,
                metadata: r.status.metadata
              }, "DROP");
            });
            break;
          case kVt.PickResultType.TRANSIENT_FAILURE:
            if (this.metadata.getOptions().waitForReady) {
              this.channel.queueCallForPick(this);
            } else {
              let {
                code: l,
                details: c
              } = (0, Fko.restrictControlPlaneStatusCode)(r.status.code, r.status.details);
              setImmediate(() => {
                this.outputStatus({
                  code: l,
                  details: c,
                  metadata: r.status.metadata
                }, "PROCESSED");
              });
            }
            break;
          case kVt.PickResultType.QUEUE:
            this.channel.queueCallForPick(this);
        }
      }
      cancelWithStatus(e, t) {
        var n;
        this.trace("cancelWithStatus code: " + e + ' details: "' + t + '"');
        (n = this.child) === null || n === undefined || n.cancelWithStatus(e, t);
        this.outputStatus({
          code: e,
          details: t,
          metadata: new Rzn.Metadata()
        }, "PROCESSED");
      }
      getPeer() {
        var e;
        var t;
        return (t = (e = this.child) === null || e === undefined ? undefined : e.getPeer()) !== null && t !== undefined ? t : this.channel.getTarget();
      }
      start(e, t) {
        this.trace("start called");
        this.listener = t;
        this.metadata = e;
        this.doPick();
      }
      sendMessageWithContext(e, t) {
        if (this.trace("write() called with message of length " + t.length), this.child) {
          this.child.sendMessageWithContext(e, t);
        } else {
          this.pendingMessage = {
            context: e,
            message: t
          };
        }
      }
      startRead() {
        if (this.trace("startRead called"), this.child) {
          this.child.startRead();
        } else {
          this.readPending = true;
        }
      }
      halfClose() {
        if (this.trace("halfClose called"), this.child) {
          this.child.halfClose();
        } else {
          this.pendingHalfClose = true;
        }
      }
      setCredentials(e) {
        throw Error("Method not implemented.");
      }
      getCallNumber() {
        return this.callNumber;
      }
      getAuthContext() {
        if (this.child) {
          return this.child.getAuthContext();
        } else {
          return null;
        }
      }
    }
    xzn.LoadBalancingCall = vtl;
  });
  var xtl = __commonJS(kzn => {
    Object.defineProperty(kzn, "__esModule", {
      value: true
    });
    kzn.ResolvingCall = undefined;
    var lrm = fVn();
    var vVe = th();
    var wVe = Fyt();
    var Ctl = K1();
    var crm = Av();
    var urm = SVt();
    class Rtl {
      constructor(e, t, n, r, o) {
        if (this.channel = e, this.method = t, this.filterStackFactory = r, this.callNumber = o, this.child = null, this.readPending = false, this.pendingMessage = null, this.pendingHalfClose = false, this.ended = false, this.readFilterPending = false, this.writeFilterPending = false, this.pendingChildStatus = null, this.metadata = null, this.listener = null, this.statusWatchers = [], this.deadlineTimer = setTimeout(() => {}, 0), this.filterStack = null, this.deadlineStartTime = null, this.configReceivedTime = null, this.childStartTime = null, this.credentials = lrm.CallCredentials.createEmpty(), this.deadline = n.deadline, this.host = n.host, n.parentCall) {
          if (n.flags & vVe.Propagate.CANCELLATION) {
            n.parentCall.on("cancelled", () => {
              this.cancelWithStatus(vVe.Status.CANCELLED, "Cancelled by parent call");
            });
          }
          if (n.flags & vVe.Propagate.DEADLINE) {
            this.trace("Propagating deadline from parent: " + n.parentCall.getDeadline());
            this.deadline = (0, wVe.minDeadline)(this.deadline, n.parentCall.getDeadline());
          }
        }
        this.trace("Created");
        this.runDeadlineTimer();
      }
      trace(e) {
        crm.trace(vVe.LogVerbosity.DEBUG, "resolving_call", "[" + this.callNumber + "] " + e);
      }
      runDeadlineTimer() {
        clearTimeout(this.deadlineTimer);
        this.deadlineStartTime = new Date();
        this.trace("Deadline: " + (0, wVe.deadlineToString)(this.deadline));
        let e = (0, wVe.getRelativeTimeout)(this.deadline);
        if (e !== 1 / 0) {
          this.trace("Deadline will be reached in " + e + "ms");
          let t = () => {
            if (!this.deadlineStartTime) {
              this.cancelWithStatus(vVe.Status.DEADLINE_EXCEEDED, "Deadline exceeded");
              return;
            }
            let n = [];
            let r = new Date();
            if (n.push(`Deadline exceeded after ${(0, wVe.formatDateDifference)(this.deadlineStartTime, r)}`), this.configReceivedTime) {
              if (this.configReceivedTime > this.deadlineStartTime) {
                n.push(`name resolution: ${(0, wVe.formatDateDifference)(this.deadlineStartTime, this.configReceivedTime)}`);
              }
              if (this.childStartTime) {
                if (this.childStartTime > this.configReceivedTime) {
                  n.push(`metadata filters: ${(0, wVe.formatDateDifference)(this.configReceivedTime, this.childStartTime)}`);
                }
              } else {
                n.push("waiting for metadata filters");
              }
            } else {
              n.push("waiting for name resolution");
            }
            if (this.child) {
              n.push(...this.child.getDeadlineInfo());
            }
            this.cancelWithStatus(vVe.Status.DEADLINE_EXCEEDED, n.join(","));
          };
          if (e <= 0) {
            process.nextTick(t);
          } else {
            this.deadlineTimer = setTimeout(t, e);
          }
        }
      }
      outputStatus(e) {
        if (!this.ended) {
          if (this.ended = true, !this.filterStack) {
            this.filterStack = this.filterStackFactory.createFilter();
          }
          clearTimeout(this.deadlineTimer);
          let t = this.filterStack.receiveTrailers(e);
          this.trace("ended with status: code=" + t.code + ' details="' + t.details + '"');
          this.statusWatchers.forEach(n => n(t));
          process.nextTick(() => {
            var n;
            (n = this.listener) === null || n === undefined || n.onReceiveStatus(t);
          });
        }
      }
      sendMessageOnChild(e, t) {
        if (!this.child) {
          throw Error("sendMessageonChild called with child not populated");
        }
        let n = this.child;
        this.writeFilterPending = true;
        this.filterStack.sendMessage(Promise.resolve({
          message: t,
          flags: e.flags
        })).then(r => {
          if (this.writeFilterPending = false, n.sendMessageWithContext(e, r.message), this.pendingHalfClose) {
            n.halfClose();
          }
        }, r => {
          this.cancelWithStatus(r.code, r.details);
        });
      }
      getConfig() {
        if (this.ended) {
          return;
        }
        if (!this.metadata || !this.listener) {
          throw Error("getConfig called before start");
        }
        let e = this.channel.getConfig(this.method, this.metadata);
        if (e.type === "NONE") {
          this.channel.queueCallForConfig(this);
          return;
        } else if (e.type === "ERROR") {
          if (this.metadata.getOptions().waitForReady) {
            this.channel.queueCallForConfig(this);
          } else {
            this.outputStatus(e.error);
          }
          return;
        }
        this.configReceivedTime = new Date();
        let t = e.config;
        if (t.status !== vVe.Status.OK) {
          let {
            code: n,
            details: r
          } = (0, urm.restrictControlPlaneStatusCode)(t.status, "Failed to route call to method " + this.method);
          this.outputStatus({
            code: n,
            details: r,
            metadata: new Ctl.Metadata()
          });
          return;
        }
        if (t.methodConfig.timeout) {
          let n = new Date();
          n.setSeconds(n.getSeconds() + t.methodConfig.timeout.seconds);
          n.setMilliseconds(n.getMilliseconds() + t.methodConfig.timeout.nanos / 1e6);
          this.deadline = (0, wVe.minDeadline)(this.deadline, n);
          this.runDeadlineTimer();
        }
        this.filterStackFactory.push(t.dynamicFilterFactories);
        this.filterStack = this.filterStackFactory.createFilter();
        this.filterStack.sendMetadata(Promise.resolve(this.metadata)).then(n => {
          if (this.child = this.channel.createRetryingCall(t, this.method, this.host, this.credentials, this.deadline), this.trace("Created child [" + this.child.getCallNumber() + "]"), this.childStartTime = new Date(), this.child.start(n, {
            onReceiveMetadata: r => {
              this.trace("Received metadata");
              this.listener.onReceiveMetadata(this.filterStack.receiveMetadata(r));
            },
            onReceiveMessage: r => {
              this.trace("Received message");
              this.readFilterPending = true;
              this.filterStack.receiveMessage(r).then(o => {
                if (this.trace("Finished filtering received message"), this.readFilterPending = false, this.listener.onReceiveMessage(o), this.pendingChildStatus) {
                  this.outputStatus(this.pendingChildStatus);
                }
              }, o => {
                this.cancelWithStatus(o.code, o.details);
              });
            },
            onReceiveStatus: r => {
              if (this.trace("Received status"), this.readFilterPending) {
                this.pendingChildStatus = r;
              } else {
                this.outputStatus(r);
              }
            }
          }), this.readPending) {
            this.child.startRead();
          }
          if (this.pendingMessage) {
            this.sendMessageOnChild(this.pendingMessage.context, this.pendingMessage.message);
          } else if (this.pendingHalfClose) {
            this.child.halfClose();
          }
        }, n => {
          this.outputStatus(n);
        });
      }
      reportResolverError(e) {
        var t;
        if ((t = this.metadata) === null || t === undefined ? undefined : t.getOptions().waitForReady) {
          this.channel.queueCallForConfig(this);
        } else {
          this.outputStatus(e);
        }
      }
      cancelWithStatus(e, t) {
        var n;
        this.trace("cancelWithStatus code: " + e + ' details: "' + t + '"');
        (n = this.child) === null || n === undefined || n.cancelWithStatus(e, t);
        this.outputStatus({
          code: e,
          details: t,
          metadata: new Ctl.Metadata()
        });
      }
      getPeer() {
        var e;
        var t;
        return (t = (e = this.child) === null || e === undefined ? undefined : e.getPeer()) !== null && t !== undefined ? t : this.channel.getTarget();
      }
      start(e, t) {
        this.trace("start called");
        this.metadata = e.clone();
        this.listener = t;
        this.getConfig();
      }
      sendMessageWithContext(e, t) {
        if (this.trace("write() called with message of length " + t.length), this.child) {
          this.sendMessageOnChild(e, t);
        } else {
          this.pendingMessage = {
            context: e,
            message: t
          };
        }
      }
      startRead() {
        if (this.trace("startRead called"), this.child) {
          this.child.startRead();
        } else {
          this.readPending = true;
        }
      }
      halfClose() {
        if (this.trace("halfClose called"), this.child && !this.writeFilterPending) {
          this.child.halfClose();
        } else {
          this.pendingHalfClose = true;
        }
      }
      setCredentials(e) {
        this.credentials = e;
      }
      addStatusWatcher(e) {
        this.statusWatchers.push(e);
      }
      getCallNumber() {
        return this.callNumber;
      }
      getAuthContext() {
        if (this.child) {
          return this.child.getAuthContext();
        } else {
          return null;
        }
      }
    }
    kzn.ResolvingCall = Rtl;
  });
  var Ptl = __commonJS(_1e => {
    Object.defineProperty(_1e, "__esModule", {
      value: true
    });
    _1e.RetryingCall = _1e.MessageBufferTracker = _1e.RetryThrottler = undefined;
    var Azn = th();
    var prm = Fyt();
    var mrm = K1();
    var frm = Av();
    class ktl {
      constructor(e, t, n) {
        if (this.maxTokens = e, this.tokenRatio = t, n) {
          this.tokens = n.tokens * (e / n.maxTokens);
        } else {
          this.tokens = e;
        }
      }
      addCallSucceeded() {
        this.tokens = Math.min(this.tokens + this.tokenRatio, this.maxTokens);
      }
      addCallFailed() {
        this.tokens = Math.max(this.tokens - 1, 0);
      }
      canRetryCall() {
        return this.tokens > this.maxTokens / 2;
      }
    }
    _1e.RetryThrottler = ktl;
    class Atl {
      constructor(e, t) {
        this.totalLimit = e;
        this.limitPerCall = t;
        this.totalAllocated = 0;
        this.allocatedPerCall = new Map();
      }
      allocate(e, t) {
        var n;
        let r = (n = this.allocatedPerCall.get(t)) !== null && n !== undefined ? n : 0;
        if (this.limitPerCall - r < e || this.totalLimit - this.totalAllocated < e) {
          return false;
        }
        this.allocatedPerCall.set(t, r + e);
        this.totalAllocated += e;
        return true;
      }
      free(e, t) {
        var n;
        if (this.totalAllocated < e) {
          throw Error(`Invalid buffer allocation state: call ${t} freed ${e} > total allocated ${this.totalAllocated}`);
        }
        this.totalAllocated -= e;
        let r = (n = this.allocatedPerCall.get(t)) !== null && n !== undefined ? n : 0;
        if (r < e) {
          throw Error(`Invalid buffer allocation state: call ${t} freed ${e} > allocated for call ${r}`);
        }
        this.allocatedPerCall.set(t, r - e);
      }
      freeAll(e) {
        var t;
        let n = (t = this.allocatedPerCall.get(e)) !== null && t !== undefined ? t : 0;
        if (this.totalAllocated < n) {
          throw Error(`Invalid buffer allocation state: call ${e} allocated ${n} > total allocated ${this.totalAllocated}`);
        }
        this.totalAllocated -= n;
        this.allocatedPerCall.delete(e);
      }
    }
    _1e.MessageBufferTracker = Atl;
    class Itl {
      constructor(e, t, n, r, o, s, i, a, l) {
        var c;
        this.channel = e;
        this.callConfig = t;
        this.methodName = n;
        this.host = r;
        this.credentials = o;
        this.deadline = s;
        this.callNumber = i;
        this.bufferTracker = a;
        this.retryThrottler = l;
        this.listener = null;
        this.initialMetadata = null;
        this.underlyingCalls = [];
        this.writeBuffer = [];
        this.writeBufferOffset = 0;
        this.readStarted = false;
        this.transparentRetryUsed = false;
        this.attempts = 0;
        this.hedgingTimer = null;
        this.committedCallIndex = null;
        this.initialRetryBackoffSec = 0;
        this.nextRetryBackoffSec = 0;
        let u = (c = e.getOptions()["grpc-node.retry_max_attempts_limit"]) !== null && c !== undefined ? c : 5;
        if (e.getOptions()["grpc.enable_retries"] === 0) {
          this.state = "NO_RETRY";
          this.maxAttempts = 1;
        } else if (t.methodConfig.retryPolicy) {
          this.state = "RETRY";
          let d = t.methodConfig.retryPolicy;
          this.nextRetryBackoffSec = this.initialRetryBackoffSec = Number(d.initialBackoff.substring(0, d.initialBackoff.length - 1));
          this.maxAttempts = Math.min(d.maxAttempts, u);
        } else if (t.methodConfig.hedgingPolicy) {
          this.state = "HEDGING";
          this.maxAttempts = Math.min(t.methodConfig.hedgingPolicy.maxAttempts, u);
        } else {
          this.state = "TRANSPARENT_ONLY";
          this.maxAttempts = 1;
        }
        this.startTime = new Date();
      }
      getDeadlineInfo() {
        if (this.underlyingCalls.length === 0) {
          return [];
        }
        let e = [];
        let t = this.underlyingCalls[this.underlyingCalls.length - 1];
        if (this.underlyingCalls.length > 1) {
          e.push(`previous attempts: ${this.underlyingCalls.length - 1}`);
        }
        if (t.startTime > this.startTime) {
          e.push(`time to current attempt start: ${(0, prm.formatDateDifference)(this.startTime, t.startTime)}`);
        }
        e.push(...t.call.getDeadlineInfo());
        return e;
      }
      getCallNumber() {
        return this.callNumber;
      }
      trace(e) {
        frm.trace(Azn.LogVerbosity.DEBUG, "retrying_call", "[" + this.callNumber + "] " + e);
      }
      reportStatus(e) {
        this.trace("ended with status: code=" + e.code + ' details="' + e.details + '" start time=' + this.startTime.toISOString());
        this.bufferTracker.freeAll(this.callNumber);
        this.writeBufferOffset = this.writeBufferOffset + this.writeBuffer.length;
        this.writeBuffer = [];
        process.nextTick(() => {
          var t;
          (t = this.listener) === null || t === undefined || t.onReceiveStatus({
            code: e.code,
            details: e.details,
            metadata: e.metadata
          });
        });
      }
      cancelWithStatus(e, t) {
        this.trace("cancelWithStatus code: " + e + ' details: "' + t + '"');
        this.reportStatus({
          code: e,
          details: t,
          metadata: new mrm.Metadata()
        });
        for (let {
          call: n
        } of this.underlyingCalls) {
          n.cancelWithStatus(e, t);
        }
      }
      getPeer() {
        if (this.committedCallIndex !== null) {
          return this.underlyingCalls[this.committedCallIndex].call.getPeer();
        } else {
          return "unknown";
        }
      }
      getBufferEntry(e) {
        var t;
        return (t = this.writeBuffer[e - this.writeBufferOffset]) !== null && t !== undefined ? t : {
          entryType: "FREED",
          allocated: false
        };
      }
      getNextBufferIndex() {
        return this.writeBufferOffset + this.writeBuffer.length;
      }
      clearSentMessages() {
        if (this.state !== "COMMITTED") {
          return;
        }
        let e;
        if (this.underlyingCalls[this.committedCallIndex].state === "COMPLETED") {
          e = this.getNextBufferIndex();
        } else {
          e = this.underlyingCalls[this.committedCallIndex].nextMessageToSend;
        }
        for (let t = this.writeBufferOffset; t < e; t++) {
          let n = this.getBufferEntry(t);
          if (n.allocated) {
            this.bufferTracker.free(n.message.message.length, this.callNumber);
          }
        }
        this.writeBuffer = this.writeBuffer.slice(e - this.writeBufferOffset);
        this.writeBufferOffset = e;
      }
      commitCall(e) {
        var t;
        var n;
        if (this.state === "COMMITTED") {
          return;
        }
        this.trace("Committing call [" + this.underlyingCalls[e].call.getCallNumber() + "] at index " + e);
        this.state = "COMMITTED";
        (n = (t = this.callConfig).onCommitted) === null || n === undefined || n.call(t);
        this.committedCallIndex = e;
        for (let r = 0; r < this.underlyingCalls.length; r++) {
          if (r === e) {
            continue;
          }
          if (this.underlyingCalls[r].state === "COMPLETED") {
            continue;
          }
          this.underlyingCalls[r].state = "COMPLETED";
          this.underlyingCalls[r].call.cancelWithStatus(Azn.Status.CANCELLED, "Discarded in favor of other hedged attempt");
        }
        this.clearSentMessages();
      }
      commitCallWithMostMessages() {
        if (this.state === "COMMITTED") {
          return;
        }
        let e = -1;
        let t = -1;
        for (let [n, r] of this.underlyingCalls.entries()) {
          if (r.state === "ACTIVE" && r.nextMessageToSend > e) {
            e = r.nextMessageToSend;
            t = n;
          }
        }
        if (t === -1) {
          this.state = "TRANSPARENT_ONLY";
        } else {
          this.commitCall(t);
        }
      }
      isStatusCodeInList(e, t) {
        return e.some(n => {
          var r;
          return n === t || n.toString().toLowerCase() === ((r = Azn.Status[t]) === null || r === undefined ? undefined : r.toLowerCase());
        });
      }
      getNextRetryJitter() {
        return Math.random() * 0.3999999999999999 + 0.8;
      }
      getNextRetryBackoffMs() {
        var e;
        let t = (e = this.callConfig) === null || e === undefined ? undefined : e.methodConfig.retryPolicy;
        if (!t) {
          return 0;
        }
        let r = this.getNextRetryJitter() * this.nextRetryBackoffSec * 1000;
        let o = Number(t.maxBackoff.substring(0, t.maxBackoff.length - 1));
        this.nextRetryBackoffSec = Math.min(this.nextRetryBackoffSec * t.backoffMultiplier, o);
        return r;
      }
      maybeRetryCall(e, t) {
        if (this.state !== "RETRY") {
          t(false);
          return;
        }
        if (this.attempts >= this.maxAttempts) {
          t(false);
          return;
        }
        let n;
        if (e === null) {
          n = this.getNextRetryBackoffMs();
        } else if (e < 0) {
          this.state = "TRANSPARENT_ONLY";
          t(false);
          return;
        } else {
          n = e;
          this.nextRetryBackoffSec = this.initialRetryBackoffSec;
        }
        setTimeout(() => {
          var r;
          var o;
          if (this.state !== "RETRY") {
            t(false);
            return;
          }
          if ((o = (r = this.retryThrottler) === null || r === undefined ? undefined : r.canRetryCall()) !== null && o !== undefined ? o : true) {
            t(true);
            this.attempts += 1;
            this.startNewAttempt();
          } else {
            this.trace("Retry attempt denied by throttling policy");
            t(false);
          }
        }, n);
      }
      countActiveCalls() {
        let e = 0;
        for (let t of this.underlyingCalls) {
          if ((t === null || t === undefined ? undefined : t.state) === "ACTIVE") {
            e += 1;
          }
        }
        return e;
      }
      handleProcessedStatus(e, t, n) {
        var r;
        var o;
        var s;
        switch (this.state) {
          case "COMMITTED":
          case "NO_RETRY":
          case "TRANSPARENT_ONLY":
            this.commitCall(t);
            this.reportStatus(e);
            break;
          case "HEDGING":
            if (this.isStatusCodeInList((r = this.callConfig.methodConfig.hedgingPolicy.nonFatalStatusCodes) !== null && r !== undefined ? r : [], e.code)) {
              (o = this.retryThrottler) === null || o === undefined || o.addCallFailed();
              let i;
              if (n === null) {
                i = 0;
              } else if (n < 0) {
                this.state = "TRANSPARENT_ONLY";
                this.commitCall(t);
                this.reportStatus(e);
                return;
              } else {
                i = n;
              }
              setTimeout(() => {
                if (this.maybeStartHedgingAttempt(), this.countActiveCalls() === 0) {
                  this.commitCall(t);
                  this.reportStatus(e);
                }
              }, i);
            } else {
              this.commitCall(t);
              this.reportStatus(e);
            }
            break;
          case "RETRY":
            if (this.isStatusCodeInList(this.callConfig.methodConfig.retryPolicy.retryableStatusCodes, e.code)) {
              (s = this.retryThrottler) === null || s === undefined || s.addCallFailed();
              this.maybeRetryCall(n, i => {
                if (!i) {
                  this.commitCall(t);
                  this.reportStatus(e);
                }
              });
            } else {
              this.commitCall(t);
              this.reportStatus(e);
            }
            break;
        }
      }
      getPushback(e) {
        let t = e.get("grpc-retry-pushback-ms");
        if (t.length === 0) {
          return null;
        }
        try {
          return parseInt(t[0]);
        } catch (n) {
          return -1;
        }
      }
      handleChildStatus(e, t) {
        var n;
        if (this.underlyingCalls[t].state === "COMPLETED") {
          return;
        }
        if (this.trace("state=" + this.state + " handling status with progress " + e.progress + " from child [" + this.underlyingCalls[t].call.getCallNumber() + "] in state " + this.underlyingCalls[t].state), this.underlyingCalls[t].state = "COMPLETED", e.code === Azn.Status.OK) {
          (n = this.retryThrottler) === null || n === undefined || n.addCallSucceeded();
          this.commitCall(t);
          this.reportStatus(e);
          return;
        }
        if (this.state === "NO_RETRY") {
          this.commitCall(t);
          this.reportStatus(e);
          return;
        }
        if (this.state === "COMMITTED") {
          this.reportStatus(e);
          return;
        }
        let r = this.getPushback(e.metadata);
        switch (e.progress) {
          case "NOT_STARTED":
            this.startNewAttempt();
            break;
          case "REFUSED":
            if (this.transparentRetryUsed) {
              this.handleProcessedStatus(e, t, r);
            } else {
              this.transparentRetryUsed = true;
              this.startNewAttempt();
            }
            break;
          case "DROP":
            this.commitCall(t);
            this.reportStatus(e);
            break;
          case "PROCESSED":
            this.handleProcessedStatus(e, t, r);
            break;
        }
      }
      maybeStartHedgingAttempt() {
        if (this.state !== "HEDGING") {
          return;
        }
        if (!this.callConfig.methodConfig.hedgingPolicy) {
          return;
        }
        if (this.attempts >= this.maxAttempts) {
          return;
        }
        this.attempts += 1;
        this.startNewAttempt();
        this.maybeStartHedgingTimer();
      }
      maybeStartHedgingTimer() {
        var e;
        var t;
        var n;
        if (this.hedgingTimer) {
          clearTimeout(this.hedgingTimer);
        }
        if (this.state !== "HEDGING") {
          return;
        }
        if (!this.callConfig.methodConfig.hedgingPolicy) {
          return;
        }
        let r = this.callConfig.methodConfig.hedgingPolicy;
        if (this.attempts >= this.maxAttempts) {
          return;
        }
        let o = (e = r.hedgingDelay) !== null && e !== undefined ? e : "0s";
        let s = Number(o.substring(0, o.length - 1));
        this.hedgingTimer = setTimeout(() => {
          this.maybeStartHedgingAttempt();
        }, s * 1000);
        (n = (t = this.hedgingTimer).unref) === null || n === undefined || n.call(t);
      }
      startNewAttempt() {
        let e = this.channel.createLoadBalancingCall(this.callConfig, this.methodName, this.host, this.credentials, this.deadline);
        this.trace("Created child call [" + e.getCallNumber() + "] for attempt " + this.attempts);
        let t = this.underlyingCalls.length;
        this.underlyingCalls.push({
          state: "ACTIVE",
          call: e,
          nextMessageToSend: 0,
          startTime: new Date()
        });
        let n = this.attempts - 1;
        let r = this.initialMetadata.clone();
        if (n > 0) {
          r.set("grpc-previous-rpc-attempts", `${n}`);
        }
        let o = false;
        if (e.start(r, {
          onReceiveMetadata: s => {
            if (this.trace("Received metadata from child [" + e.getCallNumber() + "]"), this.commitCall(t), o = true, n > 0) {
              s.set("grpc-previous-rpc-attempts", `${n}`);
            }
            if (this.underlyingCalls[t].state === "ACTIVE") {
              this.listener.onReceiveMetadata(s);
            }
          },
          onReceiveMessage: s => {
            if (this.trace("Received message from child [" + e.getCallNumber() + "]"), this.commitCall(t), this.underlyingCalls[t].state === "ACTIVE") {
              this.listener.onReceiveMessage(s);
            }
          },
          onReceiveStatus: s => {
            if (this.trace("Received status from child [" + e.getCallNumber() + "]"), !o && n > 0) {
              s.metadata.set("grpc-previous-rpc-attempts", `${n}`);
            }
            this.handleChildStatus(s, t);
          }
        }), this.sendNextChildMessage(t), this.readStarted) {
          e.startRead();
        }
      }
      start(e, t) {
        this.trace("start called");
        this.listener = t;
        this.initialMetadata = e;
        this.attempts += 1;
        this.startNewAttempt();
        this.maybeStartHedgingTimer();
      }
      handleChildWriteCompleted(e, t) {
        var n;
        var r;
        (r = (n = this.getBufferEntry(t)).callback) === null || r === undefined || r.call(n);
        this.clearSentMessages();
        let o = this.underlyingCalls[e];
        o.nextMessageToSend += 1;
        this.sendNextChildMessage(e);
      }
      sendNextChildMessage(e) {
        let t = this.underlyingCalls[e];
        if (t.state === "COMPLETED") {
          return;
        }
        let n = t.nextMessageToSend;
        if (this.getBufferEntry(n)) {
          let r = this.getBufferEntry(n);
          switch (r.entryType) {
            case "MESSAGE":
              if (t.call.sendMessageWithContext({
                callback: s => {
                  this.handleChildWriteCompleted(e, n);
                }
              }, r.message.message), this.getBufferEntry(n + 1).entryType === "HALF_CLOSE") {
                this.trace("Sending halfClose immediately after message to child [" + t.call.getCallNumber() + "] - optimizing for unary/final message");
                t.nextMessageToSend += 1;
                t.call.halfClose();
              }
              break;
            case "HALF_CLOSE":
              t.nextMessageToSend += 1;
              t.call.halfClose();
              break;
            case "FREED":
              break;
          }
        }
      }
      sendMessageWithContext(e, t) {
        this.trace("write() called with message of length " + t.length);
        let n = {
          message: t,
          flags: e.flags
        };
        let r = this.getNextBufferIndex();
        let o = {
          entryType: "MESSAGE",
          message: n,
          allocated: this.bufferTracker.allocate(t.length, this.callNumber)
        };
        if (this.writeBuffer.push(o), o.allocated) {
          process.nextTick(() => {
            var s;
            (s = e.callback) === null || s === undefined || s.call(e);
          });
          for (let [s, i] of this.underlyingCalls.entries()) {
            if (i.state === "ACTIVE" && i.nextMessageToSend === r) {
              i.call.sendMessageWithContext({
                callback: a => {
                  this.handleChildWriteCompleted(s, r);
                }
              }, t);
            }
          }
        } else {
          if (this.commitCallWithMostMessages(), this.committedCallIndex === null) {
            return;
          }
          let s = this.underlyingCalls[this.committedCallIndex];
          if (o.callback = e.callback, s.state === "ACTIVE" && s.nextMessageToSend === r) {
            s.call.sendMessageWithContext({
              callback: i => {
                this.handleChildWriteCompleted(this.committedCallIndex, r);
              }
            }, t);
          }
        }
      }
      startRead() {
        this.trace("startRead called");
        this.readStarted = true;
        for (let e of this.underlyingCalls) {
          if ((e === null || e === undefined ? undefined : e.state) === "ACTIVE") {
            e.call.startRead();
          }
        }
      }
      halfClose() {
        this.trace("halfClose called");
        let e = this.getNextBufferIndex();
        this.writeBuffer.push({
          entryType: "HALF_CLOSE",
          allocated: false
        });
        for (let t of this.underlyingCalls) {
          if ((t === null || t === undefined ? undefined : t.state) === "ACTIVE") {
            if (t.nextMessageToSend === e || t.nextMessageToSend === e - 1) {
              this.trace("Sending halfClose immediately to child [" + t.call.getCallNumber() + "] - all messages already sent");
              t.nextMessageToSend += 1;
              t.call.halfClose();
            }
          }
        }
      }
      setCredentials(e) {
        throw Error("Method not implemented.");
      }
      getMethod() {
        return this.methodName;
      }
      getHost() {
        return this.host;
      }
      getAuthContext() {
        if (this.committedCallIndex !== null) {
          return this.underlyingCalls[this.committedCallIndex].call.getAuthContext();
        } else {
          return null;
        }
      }
    }
    _1e.RetryingCall = Itl;
  });
  var AVt = __commonJS(Izn => {
    Object.defineProperty(Izn, "__esModule", {
      value: true
    });
    Izn.BaseSubchannelWrapper = undefined;
    class Otl {
      constructor(e) {
        this.child = e;
        this.healthy = true;
        this.healthListeners = new Set();
        this.refcount = 0;
        this.dataWatchers = new Set();
        e.addHealthStateWatcher(t => {
          if (this.healthy) {
            this.updateHealthListeners();
          }
        });
      }
      updateHealthListeners() {
        for (let e of this.healthListeners) {
          e(this.isHealthy());
        }
      }
      getConnectivityState() {
        return this.child.getConnectivityState();
      }
      addConnectivityStateListener(e) {
        this.child.addConnectivityStateListener(e);
      }
      removeConnectivityStateListener(e) {
        this.child.removeConnectivityStateListener(e);
      }
      startConnecting() {
        this.child.startConnecting();
      }
      getAddress() {
        return this.child.getAddress();
      }
      throttleKeepalive(e) {
        this.child.throttleKeepalive(e);
      }
      ref() {
        this.child.ref();
        this.refcount += 1;
      }
      unref() {
        if (this.child.unref(), this.refcount -= 1, this.refcount === 0) {
          this.destroy();
        }
      }
      destroy() {
        for (let e of this.dataWatchers) {
          e.destroy();
        }
      }
      getChannelzRef() {
        return this.child.getChannelzRef();
      }
      isHealthy() {
        return this.healthy && this.child.isHealthy();
      }
      addHealthStateWatcher(e) {
        this.healthListeners.add(e);
      }
      removeHealthStateWatcher(e) {
        this.healthListeners.delete(e);
      }
      addDataWatcher(e) {
        e.setSubchannel(this.getRealSubchannel());
        this.dataWatchers.add(e);
      }
      setHealthy(e) {
        if (e !== this.healthy) {
          if (this.healthy = e, this.child.isHealthy()) {
            this.updateHealthListeners();
          }
        }
      }
      getRealSubchannel() {
        return this.child.getRealSubchannel();
      }
      realSubchannelEquals(e) {
        return this.getRealSubchannel() === e.getRealSubchannel();
      }
      getCallCredentials() {
        return this.child.getCallCredentials();
      }
      getChannel() {
        return this.child.getChannel();
      }
    }
    Izn.BaseSubchannelWrapper = Otl;
  });
  var jko = __commonJS(CVe => {
    Object.defineProperty(CVe, "__esModule", {
      value: true
    });
    CVe.InternalChannel = CVe.SUBCHANNEL_ARGS_EXCLUDE_KEY_PREFIX = undefined;
    var yrm = Syt();
    var _rm = oQa();
    var brm = Stl();
    var Hko = YEe();
    var Srm = K1();
    var b1e = th();
    var Trm = mzn();
    var Erm = Eko();
    var Dtl = tse();
    var Pzn = Av();
    var vrm = Oko();
    var Ozn = S3();
    var UQ = T3();
    var IVt = h1e();
    var wrm = wtl();
    var Crm = Fyt();
    var Rrm = xtl();
    var Bko = czn();
    var xrm = SVt();
    var $ko = Ptl();
    var krm = AVt();
    var Dzn = new Map();
    class Mtl extends krm.BaseSubchannelWrapper {
      constructor(e, t) {
        super(e);
        this.channel = t;
        this.refCount = 0;
        this.subchannelStateListener = (n, r, o, s) => {
          t.throttleKeepalive(s);
        };
      }
      ref() {
        if (this.refCount === 0) {
          this.child.addConnectivityStateListener(this.subchannelStateListener);
          this.channel.addWrappedSubchannel(this);
        }
        this.child.ref();
        this.refCount += 1;
      }
      unref() {
        if (this.child.unref(), this.refCount -= 1, this.refCount <= 0) {
          this.child.removeConnectivityStateListener(this.subchannelStateListener);
          this.channel.removeWrappedSubchannel(this);
        }
      }
    }
    class Ntl {
      pick(e) {
        return {
          pickResultType: Hko.PickResultType.DROP,
          status: {
            code: b1e.Status.UNAVAILABLE,
            details: "Channel closed before call started",
            metadata: new Srm.Metadata()
          },
          subchannel: null,
          onCallStarted: null,
          onCallEnded: null
        };
      }
    }
    CVe.SUBCHANNEL_ARGS_EXCLUDE_KEY_PREFIX = "grpc.internal.no_subchannel";
    class Ltl {
      constructor(e) {
        this.target = e;
        this.trace = new IVt.ChannelzTrace();
        this.callTracker = new IVt.ChannelzCallTracker();
        this.childrenTracker = new IVt.ChannelzChildrenTracker();
        this.state = UQ.ConnectivityState.IDLE;
      }
      getChannelzInfoCallback() {
        return () => ({
          target: this.target,
          state: this.state,
          trace: this.trace,
          callTracker: this.callTracker,
          children: this.childrenTracker.getChildLists()
        });
      }
    }
    class Ftl {
      constructor(e, t, n) {
        var r;
        var o;
        var s;
        var i;
        var a;
        var l;
        if (this.credentials = t, this.options = n, this.connectivityState = UQ.ConnectivityState.IDLE, this.currentPicker = new Hko.UnavailablePicker(), this.configSelectionQueue = [], this.pickQueue = [], this.connectivityStateWatchers = [], this.callRefTimer = null, this.configSelector = null, this.currentResolutionError = null, this.wrappedSubchannels = new Set(), this.callCount = 0, this.idleTimer = null, this.channelzEnabled = true, this.randomChannelId = Math.floor(Math.random() * Number.MAX_SAFE_INTEGER), typeof e !== "string") {
          throw TypeError("Channel target must be a string");
        }
        if (!(t instanceof yrm.ChannelCredentials)) {
          throw TypeError("Channel credentials must be a ChannelCredentials object");
        }
        if (n) {
          if (typeof n !== "object") {
            throw TypeError("Channel options must be an object");
          }
        }
        this.channelzInfoTracker = new Ltl(e);
        let c = (0, Ozn.parseUri)(e);
        if (c === null) {
          throw Error(`Could not parse target name "${e}"`);
        }
        let u = (0, Dtl.mapUriDefaultScheme)(c);
        if (u === null) {
          throw Error(`Could not find a default scheme for target name "${e}"`);
        }
        if (this.options["grpc.enable_channelz"] === 0) {
          this.channelzEnabled = false;
        }
        if (this.channelzRef = (0, IVt.registerChannelzChannel)(e, this.channelzInfoTracker.getChannelzInfoCallback(), this.channelzEnabled), this.channelzEnabled) {
          this.channelzInfoTracker.trace.addTrace("CT_INFO", "Channel created");
        }
        if (this.options["grpc.default_authority"]) {
          this.defaultAuthority = this.options["grpc.default_authority"];
        } else {
          this.defaultAuthority = (0, Dtl.getDefaultAuthority)(u);
        }
        let d = (0, vrm.mapProxyName)(u, n);
        this.target = d.target;
        this.options = Object.assign({}, this.options, d.extraOptions);
        this.subchannelPool = (0, brm.getSubchannelPool)(((r = this.options["grpc.use_local_subchannel_pool"]) !== null && r !== undefined ? r : 0) === 0);
        this.retryBufferTracker = new $ko.MessageBufferTracker((o = this.options["grpc.retry_buffer_size"]) !== null && o !== undefined ? o : 16777216, (s = this.options["grpc.per_rpc_retry_buffer_size"]) !== null && s !== undefined ? s : 1048576);
        this.keepaliveTime = (i = this.options["grpc.keepalive_time_ms"]) !== null && i !== undefined ? i : -1;
        this.idleTimeoutMs = Math.max((a = this.options["grpc.client_idle_timeout_ms"]) !== null && a !== undefined ? a : 1800000, 1000);
        let p = {
          createSubchannel: (f, h) => {
            let g = {};
            for (let [b, S] of Object.entries(h)) {
              if (!b.startsWith(CVe.SUBCHANNEL_ARGS_EXCLUDE_KEY_PREFIX)) {
                g[b] = S;
              }
            }
            let y = this.subchannelPool.getOrCreateSubchannel(this.target, f, g, this.credentials);
            if (y.throttleKeepalive(this.keepaliveTime), this.channelzEnabled) {
              this.channelzInfoTracker.trace.addTrace("CT_INFO", "Created subchannel or used existing subchannel", y.getChannelzRef());
            }
            return new Mtl(y, this);
          },
          updateState: (f, h) => {
            this.currentPicker = h;
            let g = this.pickQueue.slice();
            if (this.pickQueue = [], g.length > 0) {
              this.callRefTimerUnref();
            }
            for (let y of g) {
              y.doPick();
            }
            this.updateState(f);
          },
          requestReresolution: () => {
            throw Error("Resolving load balancer should never call requestReresolution");
          },
          addChannelzChild: f => {
            if (this.channelzEnabled) {
              this.channelzInfoTracker.childrenTracker.refChild(f);
            }
          },
          removeChannelzChild: f => {
            if (this.channelzEnabled) {
              this.channelzInfoTracker.childrenTracker.unrefChild(f);
            }
          }
        };
        this.resolvingLoadBalancer = new _rm.ResolvingLoadBalancer(this.target, p, this.options, (f, h) => {
          var g;
          if (f.retryThrottling) {
            Dzn.set(this.getTarget(), new $ko.RetryThrottler(f.retryThrottling.maxTokens, f.retryThrottling.tokenRatio, Dzn.get(this.getTarget())));
          } else {
            Dzn.delete(this.getTarget());
          }
          if (this.channelzEnabled) {
            this.channelzInfoTracker.trace.addTrace("CT_INFO", "Address resolution succeeded");
          }
          (g = this.configSelector) === null || g === undefined || g.unref();
          this.configSelector = h;
          this.currentResolutionError = null;
          process.nextTick(() => {
            let y = this.configSelectionQueue;
            if (this.configSelectionQueue = [], y.length > 0) {
              this.callRefTimerUnref();
            }
            for (let _ of y) {
              _.getConfig();
            }
          });
        }, f => {
          if (this.channelzEnabled) {
            this.channelzInfoTracker.trace.addTrace("CT_WARNING", "Address resolution failed with code " + f.code + ' and details "' + f.details + '"');
          }
          if (this.configSelectionQueue.length > 0) {
            this.trace("Name resolution failed with calls queued for config selection");
          }
          if (this.configSelector === null) {
            this.currentResolutionError = Object.assign(Object.assign({}, (0, xrm.restrictControlPlaneStatusCode)(f.code, f.details)), {
              metadata: f.metadata
            });
          }
          let h = this.configSelectionQueue;
          if (this.configSelectionQueue = [], h.length > 0) {
            this.callRefTimerUnref();
          }
          for (let g of h) {
            g.reportResolverError(f);
          }
        });
        this.filterStackFactory = new Trm.FilterStackFactory([new Erm.CompressionFilterFactory(this, this.options)]);
        this.trace("Channel constructed with options " + JSON.stringify(n, undefined, 2));
        let m = Error();
        if ((0, Pzn.isTracerEnabled)("channel_stacktrace")) {
          (0, Pzn.trace)(b1e.LogVerbosity.DEBUG, "channel_stacktrace", "(" + this.channelzRef.id + `) Channel constructed 
` + ((l = m.stack) === null || l === undefined ? undefined : l.substring(m.stack.indexOf(`
`) + 1)));
        }
        this.lastActivityTimestamp = new Date();
      }
      trace(e, t) {
        (0, Pzn.trace)(t !== null && t !== undefined ? t : b1e.LogVerbosity.DEBUG, "channel", "(" + this.channelzRef.id + ") " + (0, Ozn.uriToString)(this.target) + " " + e);
      }
      callRefTimerRef() {
        var e;
        var t;
        var n;
        var r;
        if (!this.callRefTimer) {
          this.callRefTimer = setInterval(() => {}, 2147483647);
        }
        if (!((t = (e = this.callRefTimer).hasRef) === null || t === undefined ? undefined : t.call(e))) {
          this.trace("callRefTimer.ref | configSelectionQueue.length=" + this.configSelectionQueue.length + " pickQueue.length=" + this.pickQueue.length);
          (r = (n = this.callRefTimer).ref) === null || r === undefined || r.call(n);
        }
      }
      callRefTimerUnref() {
        var e;
        var t;
        var n;
        if (!((e = this.callRefTimer) === null || e === undefined ? undefined : e.hasRef) || this.callRefTimer.hasRef()) {
          this.trace("callRefTimer.unref | configSelectionQueue.length=" + this.configSelectionQueue.length + " pickQueue.length=" + this.pickQueue.length);
          (n = (t = this.callRefTimer) === null || t === undefined ? undefined : t.unref) === null || n === undefined || n.call(t);
        }
      }
      removeConnectivityStateWatcher(e) {
        let t = this.connectivityStateWatchers.findIndex(n => n === e);
        if (t >= 0) {
          this.connectivityStateWatchers.splice(t, 1);
        }
      }
      updateState(e) {
        if ((0, Pzn.trace)(b1e.LogVerbosity.DEBUG, "connectivity_state", "(" + this.channelzRef.id + ") " + (0, Ozn.uriToString)(this.target) + " " + UQ.ConnectivityState[this.connectivityState] + " -> " + UQ.ConnectivityState[e]), this.channelzEnabled) {
          this.channelzInfoTracker.trace.addTrace("CT_INFO", "Connectivity state change to " + UQ.ConnectivityState[e]);
        }
        this.connectivityState = e;
        this.channelzInfoTracker.state = e;
        let t = this.connectivityStateWatchers.slice();
        for (let n of t) {
          if (e !== n.currentState) {
            if (n.timer) {
              clearTimeout(n.timer);
            }
            this.removeConnectivityStateWatcher(n);
            n.callback();
          }
        }
        if (e !== UQ.ConnectivityState.TRANSIENT_FAILURE) {
          this.currentResolutionError = null;
        }
      }
      throttleKeepalive(e) {
        if (e > this.keepaliveTime) {
          this.keepaliveTime = e;
          for (let t of this.wrappedSubchannels) {
            t.throttleKeepalive(e);
          }
        }
      }
      addWrappedSubchannel(e) {
        this.wrappedSubchannels.add(e);
      }
      removeWrappedSubchannel(e) {
        this.wrappedSubchannels.delete(e);
      }
      doPick(e, t) {
        return this.currentPicker.pick({
          metadata: e,
          extraPickInfo: t
        });
      }
      queueCallForPick(e) {
        this.pickQueue.push(e);
        this.callRefTimerRef();
      }
      getConfig(e, t) {
        if (this.connectivityState !== UQ.ConnectivityState.SHUTDOWN) {
          this.resolvingLoadBalancer.exitIdle();
        }
        if (this.configSelector) {
          return {
            type: "SUCCESS",
            config: this.configSelector.invoke(e, t, this.randomChannelId)
          };
        } else if (this.currentResolutionError) {
          return {
            type: "ERROR",
            error: this.currentResolutionError
          };
        } else {
          return {
            type: "NONE"
          };
        }
      }
      queueCallForConfig(e) {
        this.configSelectionQueue.push(e);
        this.callRefTimerRef();
      }
      enterIdle() {
        if (this.resolvingLoadBalancer.destroy(), this.updateState(UQ.ConnectivityState.IDLE), this.currentPicker = new Hko.QueuePicker(this.resolvingLoadBalancer), this.idleTimer) {
          clearTimeout(this.idleTimer);
          this.idleTimer = null;
        }
        if (this.callRefTimer) {
          clearInterval(this.callRefTimer);
          this.callRefTimer = null;
        }
      }
      startIdleTimeout(e) {
        var t;
        var n;
        this.idleTimer = setTimeout(() => {
          if (this.callCount > 0) {
            this.startIdleTimeout(this.idleTimeoutMs);
            return;
          }
          let o = new Date().valueOf() - this.lastActivityTimestamp.valueOf();
          if (o >= this.idleTimeoutMs) {
            this.trace("Idle timer triggered after " + this.idleTimeoutMs + "ms of inactivity");
            this.enterIdle();
          } else {
            this.startIdleTimeout(this.idleTimeoutMs - o);
          }
        }, e);
        (n = (t = this.idleTimer).unref) === null || n === undefined || n.call(t);
      }
      maybeStartIdleTimer() {
        if (this.connectivityState !== UQ.ConnectivityState.SHUTDOWN && !this.idleTimer) {
          this.startIdleTimeout(this.idleTimeoutMs);
        }
      }
      onCallStart() {
        if (this.channelzEnabled) {
          this.channelzInfoTracker.callTracker.addCallStarted();
        }
        this.callCount += 1;
      }
      onCallEnd(e) {
        if (this.channelzEnabled) {
          if (e.code === b1e.Status.OK) {
            this.channelzInfoTracker.callTracker.addCallSucceeded();
          } else {
            this.channelzInfoTracker.callTracker.addCallFailed();
          }
        }
        this.callCount -= 1;
        this.lastActivityTimestamp = new Date();
        this.maybeStartIdleTimer();
      }
      createLoadBalancingCall(e, t, n, r, o) {
        let s = (0, Bko.getNextCallNumber)();
        this.trace("createLoadBalancingCall [" + s + '] method="' + t + '"');
        return new wrm.LoadBalancingCall(this, e, t, n, r, o, s);
      }
      createRetryingCall(e, t, n, r, o) {
        let s = (0, Bko.getNextCallNumber)();
        this.trace("createRetryingCall [" + s + '] method="' + t + '"');
        return new $ko.RetryingCall(this, e, t, n, r, o, s, this.retryBufferTracker, Dzn.get(this.getTarget()));
      }
      createResolvingCall(e, t, n, r, o) {
        let s = (0, Bko.getNextCallNumber)();
        this.trace("createResolvingCall [" + s + '] method="' + e + '", deadline=' + (0, Crm.deadlineToString)(t));
        let i = {
          deadline: t,
          flags: o !== null && o !== undefined ? o : b1e.Propagate.DEFAULTS,
          host: n !== null && n !== undefined ? n : this.defaultAuthority,
          parentCall: r
        };
        let a = new Rrm.ResolvingCall(this, e, i, this.filterStackFactory.clone(), s);
        this.onCallStart();
        a.addStatusWatcher(l => {
          this.onCallEnd(l);
        });
        return a;
      }
      close() {
        var e;
        this.resolvingLoadBalancer.destroy();
        this.updateState(UQ.ConnectivityState.SHUTDOWN);
        this.currentPicker = new Ntl();
        for (let t of this.configSelectionQueue) {
          t.cancelWithStatus(b1e.Status.UNAVAILABLE, "Channel closed before call started");
        }
        this.configSelectionQueue = [];
        for (let t of this.pickQueue) {
          t.cancelWithStatus(b1e.Status.UNAVAILABLE, "Channel closed before call started");
        }
        if (this.pickQueue = [], this.callRefTimer) {
          clearInterval(this.callRefTimer);
        }
        if (this.idleTimer) {
          clearTimeout(this.idleTimer);
        }
        if (this.channelzEnabled) {
          (0, IVt.unregisterChannelzRef)(this.channelzRef);
        }
        this.subchannelPool.unrefUnusedSubchannels();
        (e = this.configSelector) === null || e === undefined || e.unref();
        this.configSelector = null;
      }
      getTarget() {
        return (0, Ozn.uriToString)(this.target);
      }
      getConnectivityState(e) {
        let t = this.connectivityState;
        if (e) {
          this.resolvingLoadBalancer.exitIdle();
          this.lastActivityTimestamp = new Date();
          this.maybeStartIdleTimer();
        }
        return t;
      }
      watchConnectivityState(e, t, n) {
        if (this.connectivityState === UQ.ConnectivityState.SHUTDOWN) {
          throw Error("Channel has been shut down");
        }
        let r = null;
        if (t !== 1 / 0) {
          let s = t instanceof Date ? t : new Date(t);
          let i = new Date();
          if (t === -1 / 0 || s <= i) {
            process.nextTick(n, Error("Deadline passed without connectivity state change"));
            return;
          }
          r = setTimeout(() => {
            this.removeConnectivityStateWatcher(o);
            n(Error("Deadline passed without connectivity state change"));
          }, s.getTime() - i.getTime());
        }
        let o = {
          currentState: e,
          callback: n,
          timer: r
        };
        this.connectivityStateWatchers.push(o);
      }
      getChannelzRef() {
        return this.channelzRef;
      }
      createCall(e, t, n, r, o) {
        if (typeof e !== "string") {
          throw TypeError("Channel#createCall: method must be a string");
        }
        if (!(typeof t === "number" || t instanceof Date)) {
          throw TypeError("Channel#createCall: deadline must be a number or Date");
        }
        if (this.connectivityState === UQ.ConnectivityState.SHUTDOWN) {
          throw Error("Channel has been shut down");
        }
        return this.createResolvingCall(e, t, n, r, o);
      }
      getOptions() {
        return this.options;
      }
    }
    CVe.InternalChannel = Ftl;
  });
  var Sxo = __commonJS(Mzn => {
    Object.defineProperty(Mzn, "__esModule", {
      value: true
    });
    Mzn.ChannelImplementation = undefined;
    var Mrm = Syt();
    var Nrm = jko();
    class Utl {
      constructor(e, t, n) {
        if (typeof e !== "string") {
          throw TypeError("Channel target must be a string");
        }
        if (!(t instanceof Mrm.ChannelCredentials)) {
          throw TypeError("Channel credentials must be a ChannelCredentials object");
        }
        if (n) {
          if (typeof n !== "object") {
            throw TypeError("Channel options must be an object");
          }
        }
        this.internalChannel = new Nrm.InternalChannel(e, t, n);
      }
      close() {
        this.internalChannel.close();
      }
      getTarget() {
        return this.internalChannel.getTarget();
      }
      getConnectivityState(e) {
        return this.internalChannel.getConnectivityState(e);
      }
      watchConnectivityState(e, t, n) {
        this.internalChannel.watchConnectivityState(e, t, n);
      }
      getChannelzRef() {
        return this.internalChannel.getChannelzRef();
      }
      createCall(e, t, n, r, o) {
        if (typeof e !== "string") {
          throw TypeError("Channel#createCall: method must be a string");
        }
        if (!(typeof t === "number" || t instanceof Date)) {
          throw TypeError("Channel#createCall: deadline must be a number or Date");
        }
        return this.internalChannel.createCall(e, t, n, r, o);
      }
    }
    Mzn.ChannelImplementation = Utl;
  });
  var Wtl = __commonJS(dse => {
    Object.defineProperty(dse, "__esModule", {
      value: true
    });
    dse.ServerDuplexStreamImpl = dse.ServerWritableStreamImpl = dse.ServerReadableStreamImpl = dse.ServerUnaryCallImpl = undefined;
    dse.serverErrorToStatus = Gko;
    var Lrm = require("events");
    var qko = require("stream");
    var Wko = th();
    var Btl = K1();
    function Gko(e, t) {
      var n;
      let r = {
        code: Wko.Status.UNKNOWN,
        details: "message" in e ? e.message : "Unknown Error",
        metadata: (n = t !== null && t !== undefined ? t : e.metadata) !== null && n !== undefined ? n : null
      };
      if ("code" in e && typeof e.code === "number" && Number.isInteger(e.code)) {
        if (r.code = e.code, "details" in e && typeof e.details === "string") {
          r.details = e.details;
        }
      }
      return r;
    }
    class $tl extends Lrm.EventEmitter {
      constructor(e, t, n, r) {
        super();
        this.path = e;
        this.call = t;
        this.metadata = n;
        this.request = r;
        this.cancelled = false;
      }
      getPeer() {
        return this.call.getPeer();
      }
      sendMetadata(e) {
        this.call.sendMetadata(e);
      }
      getDeadline() {
        return this.call.getDeadline();
      }
      getPath() {
        return this.path;
      }
      getHost() {
        return this.call.getHost();
      }
      getAuthContext() {
        return this.call.getAuthContext();
      }
      getMetricsRecorder() {
        return this.call.getMetricsRecorder();
      }
    }
    dse.ServerUnaryCallImpl = $tl;
    class Htl extends qko.Readable {
      constructor(e, t, n) {
        super({
          objectMode: true
        });
        this.path = e;
        this.call = t;
        this.metadata = n;
        this.cancelled = false;
      }
      _read(e) {
        this.call.startRead();
      }
      getPeer() {
        return this.call.getPeer();
      }
      sendMetadata(e) {
        this.call.sendMetadata(e);
      }
      getDeadline() {
        return this.call.getDeadline();
      }
      getPath() {
        return this.path;
      }
      getHost() {
        return this.call.getHost();
      }
      getAuthContext() {
        return this.call.getAuthContext();
      }
      getMetricsRecorder() {
        return this.call.getMetricsRecorder();
      }
    }
    dse.ServerReadableStreamImpl = Htl;
    class jtl extends qko.Writable {
      constructor(e, t, n, r) {
        super({
          objectMode: true
        });
        this.path = e;
        this.call = t;
        this.metadata = n;
        this.request = r;
        this.pendingStatus = {
          code: Wko.Status.OK,
          details: "OK"
        };
        this.cancelled = false;
        this.trailingMetadata = new Btl.Metadata();
        this.on("error", o => {
          this.pendingStatus = Gko(o);
          this.end();
        });
      }
      getPeer() {
        return this.call.getPeer();
      }
      sendMetadata(e) {
        this.call.sendMetadata(e);
      }
      getDeadline() {
        return this.call.getDeadline();
      }
      getPath() {
        return this.path;
      }
      getHost() {
        return this.call.getHost();
      }
      getAuthContext() {
        return this.call.getAuthContext();
      }
      getMetricsRecorder() {
        return this.call.getMetricsRecorder();
      }
      _write(e, t, n) {
        this.call.sendMessage(e, n);
      }
      _final(e) {
        var t;
        e(null);
        this.call.sendStatus(Object.assign(Object.assign({}, this.pendingStatus), {
          metadata: (t = this.pendingStatus.metadata) !== null && t !== undefined ? t : this.trailingMetadata
        }));
      }
      end(e) {
        if (e) {
          this.trailingMetadata = e;
        }
        return super.end();
      }
    }
    dse.ServerWritableStreamImpl = jtl;
    class qtl extends qko.Duplex {
      constructor(e, t, n) {
        super({
          objectMode: true
        });
        this.path = e;
        this.call = t;
        this.metadata = n;
        this.pendingStatus = {
          code: Wko.Status.OK,
          details: "OK"
        };
        this.cancelled = false;
        this.trailingMetadata = new Btl.Metadata();
        this.on("error", r => {
          this.pendingStatus = Gko(r);
          this.end();
        });
      }
      getPeer() {
        return this.call.getPeer();
      }
      sendMetadata(e) {
        this.call.sendMetadata(e);
      }
      getDeadline() {
        return this.call.getDeadline();
      }
      getPath() {
        return this.path;
      }
      getHost() {
        return this.call.getHost();
      }
      getAuthContext() {
        return this.call.getAuthContext();
      }
      getMetricsRecorder() {
        return this.call.getMetricsRecorder();
      }
      _read(e) {
        this.call.startRead();
      }
      _write(e, t, n) {
        this.call.sendMessage(e, n);
      }
      _final(e) {
        var t;
        e(null);
        this.call.sendStatus(Object.assign(Object.assign({}, this.pendingStatus), {
          metadata: (t = this.pendingStatus.metadata) !== null && t !== undefined ? t : this.trailingMetadata
        }));
      }
      end(e) {
        if (e) {
          this.trailingMetadata = e;
        }
        return super.end();
      }
    }
    dse.ServerDuplexStreamImpl = qtl;
  });
  var Nzn = __commonJS(Wyt => {
    Object.defineProperty(Wyt, "__esModule", {
      value: true
    });
    Wyt.ServerCredentials = undefined;
    Wyt.createCertificateProviderServerCredentials = Frm;
    Wyt.createServerCredentialsWithInterceptors = Urm;
    var Vko = oxo();
    class qyt {
      constructor(e, t) {
        this.serverConstructorOptions = e;
        this.watchers = new Set();
        this.latestContextOptions = null;
        this.latestContextOptions = t !== null && t !== undefined ? t : null;
      }
      _addWatcher(e) {
        this.watchers.add(e);
      }
      _removeWatcher(e) {
        this.watchers.delete(e);
      }
      getWatcherCount() {
        return this.watchers.size;
      }
      updateSecureContextOptions(e) {
        this.latestContextOptions = e;
        for (let t of this.watchers) {
          t(this.latestContextOptions);
        }
      }
      _isSecure() {
        return this.serverConstructorOptions !== null;
      }
      _getSecureContextOptions() {
        return this.latestContextOptions;
      }
      _getConstructorOptions() {
        return this.serverConstructorOptions;
      }
      _getInterceptors() {
        return [];
      }
      static createInsecure() {
        return new zko();
      }
      static createSsl(e, t, n = false) {
        var r;
        if (e !== null && !Buffer.isBuffer(e)) {
          throw TypeError("rootCerts must be null or a Buffer");
        }
        if (!Array.isArray(t)) {
          throw TypeError("keyCertPairs must be an array");
        }
        if (typeof n !== "boolean") {
          throw TypeError("checkClientCertificate must be a boolean");
        }
        let o = [];
        let s = [];
        for (let i = 0; i < t.length; i++) {
          let a = t[i];
          if (a === null || typeof a !== "object") {
            throw TypeError(`keyCertPair[${i}] must be an object`);
          }
          if (!Buffer.isBuffer(a.private_key)) {
            throw TypeError(`keyCertPair[${i}].private_key must be a Buffer`);
          }
          if (!Buffer.isBuffer(a.cert_chain)) {
            throw TypeError(`keyCertPair[${i}].cert_chain must be a Buffer`);
          }
          o.push(a.cert_chain);
          s.push(a.private_key);
        }
        return new Kko({
          requestCert: n,
          ciphers: Vko.CIPHER_SUITES
        }, {
          ca: (r = e !== null && e !== undefined ? e : (0, Vko.getDefaultRootsData)()) !== null && r !== undefined ? r : undefined,
          cert: o,
          key: s
        });
      }
    }
    Wyt.ServerCredentials = qyt;
    class zko extends qyt {
      constructor() {
        super(null);
      }
      _getSettings() {
        return null;
      }
      _equals(e) {
        return e instanceof zko;
      }
    }
    class Kko extends qyt {
      constructor(e, t) {
        super(e, t);
        this.options = Object.assign(Object.assign({}, e), t);
      }
      _equals(e) {
        if (this === e) {
          return true;
        }
        if (!(e instanceof Kko)) {
          return false;
        }
        if (Buffer.isBuffer(this.options.ca) && Buffer.isBuffer(e.options.ca)) {
          if (!this.options.ca.equals(e.options.ca)) {
            return false;
          }
        } else if (this.options.ca !== e.options.ca) {
          return false;
        }
        if (Array.isArray(this.options.cert) && Array.isArray(e.options.cert)) {
          if (this.options.cert.length !== e.options.cert.length) {
            return false;
          }
          for (let t = 0; t < this.options.cert.length; t++) {
            let n = this.options.cert[t];
            let r = e.options.cert[t];
            if (Buffer.isBuffer(n) && Buffer.isBuffer(r)) {
              if (!n.equals(r)) {
                return false;
              }
            } else if (n !== r) {
              return false;
            }
          }
        } else if (this.options.cert !== e.options.cert) {
          return false;
        }
        if (Array.isArray(this.options.key) && Array.isArray(e.options.key)) {
          if (this.options.key.length !== e.options.key.length) {
            return false;
          }
          for (let t = 0; t < this.options.key.length; t++) {
            let n = this.options.key[t];
            let r = e.options.key[t];
            if (Buffer.isBuffer(n) && Buffer.isBuffer(r)) {
              if (!n.equals(r)) {
                return false;
              }
            } else if (n !== r) {
              return false;
            }
          }
        } else if (this.options.key !== e.options.key) {
          return false;
        }
        if (this.options.requestCert !== e.options.requestCert) {
          return false;
        }
        return true;
      }
    }
    class Yko extends qyt {
      constructor(e, t, n) {
        super({
          requestCert: t !== null,
          rejectUnauthorized: n,
          ciphers: Vko.CIPHER_SUITES
        });
        this.identityCertificateProvider = e;
        this.caCertificateProvider = t;
        this.requireClientCertificate = n;
        this.latestCaUpdate = null;
        this.latestIdentityUpdate = null;
        this.caCertificateUpdateListener = this.handleCaCertificateUpdate.bind(this);
        this.identityCertificateUpdateListener = this.handleIdentityCertitificateUpdate.bind(this);
      }
      _addWatcher(e) {
        var t;
        if (this.getWatcherCount() === 0) {
          (t = this.caCertificateProvider) === null || t === undefined || t.addCaCertificateListener(this.caCertificateUpdateListener);
          this.identityCertificateProvider.addIdentityCertificateListener(this.identityCertificateUpdateListener);
        }
        super._addWatcher(e);
      }
      _removeWatcher(e) {
        var t;
        if (super._removeWatcher(e), this.getWatcherCount() === 0) {
          (t = this.caCertificateProvider) === null || t === undefined || t.removeCaCertificateListener(this.caCertificateUpdateListener);
          this.identityCertificateProvider.removeIdentityCertificateListener(this.identityCertificateUpdateListener);
        }
      }
      _equals(e) {
        if (this === e) {
          return true;
        }
        if (!(e instanceof Yko)) {
          return false;
        }
        return this.caCertificateProvider === e.caCertificateProvider && this.identityCertificateProvider === e.identityCertificateProvider && this.requireClientCertificate === e.requireClientCertificate;
      }
      calculateSecureContextOptions() {
        var e;
        if (this.latestIdentityUpdate === null) {
          return null;
        }
        if (this.caCertificateProvider !== null && this.latestCaUpdate === null) {
          return null;
        }
        return {
          ca: (e = this.latestCaUpdate) === null || e === undefined ? undefined : e.caCertificate,
          cert: [this.latestIdentityUpdate.certificate],
          key: [this.latestIdentityUpdate.privateKey]
        };
      }
      finalizeUpdate() {
        let e = this.calculateSecureContextOptions();
        this.updateSecureContextOptions(e);
      }
      handleCaCertificateUpdate(e) {
        this.latestCaUpdate = e;
        this.finalizeUpdate();
      }
      handleIdentityCertitificateUpdate(e) {
        this.latestIdentityUpdate = e;
        this.finalizeUpdate();
      }
    }
    function Frm(e, t, n) {
      return new Yko(e, t, n);
    }
    class Jko extends qyt {
      constructor(e, t) {
        super({});
        this.childCredentials = e;
        this.interceptors = t;
      }
      _isSecure() {
        return this.childCredentials._isSecure();
      }
      _equals(e) {
        if (!(e instanceof Jko)) {
          return false;
        }
        if (!this.childCredentials._equals(e.childCredentials)) {
          return false;
        }
        if (this.interceptors.length !== e.interceptors.length) {
          return false;
        }
        for (let t = 0; t < this.interceptors.length; t++) {
          if (this.interceptors[t] !== e.interceptors[t]) {
            return false;
          }
        }
        return true;
      }
      _getInterceptors() {
        return this.interceptors;
      }
      _addWatcher(e) {
        this.childCredentials._addWatcher(e);
      }
      _removeWatcher(e) {
        this.childCredentials._removeWatcher(e);
      }
      _getConstructorOptions() {
        return this.childCredentials._getConstructorOptions();
      }
      _getSecureContextOptions() {
        return this.childCredentials._getSecureContextOptions();
      }
    }
    function Urm(e, t) {
      return new Jko(e, t);
    }
  });
  var PVt = __commonJS(ive => {
    Object.defineProperty(ive, "__esModule", {
      value: true
    });
    ive.durationMessageToDuration = Brm;
    ive.msToDuration = $rm;
    ive.durationToMs = Hrm;
    ive.isDuration = jrm;
    ive.isDurationMessage = qrm;
    ive.parseDuration = Grm;
    ive.durationToString = Vrm;
    function Brm(e) {
      return {
        seconds: Number.parseInt(e.seconds),
        nanos: e.nanos
      };
    }
    function $rm(e) {
      return {
        seconds: e / 1000 | 0,
        nanos: e % 1000 * 1e6 | 0
      };
    }
    function Hrm(e) {
      return e.seconds * 1000 + e.nanos / 1e6 | 0;
    }
    function jrm(e) {
      return typeof e.seconds === "number" && typeof e.nanos === "number";
    }
    function qrm(e) {
      return typeof e.seconds === "string" && typeof e.nanos === "number";
    }
    function Grm(e) {
      let t = e.match(/^(\d+)(?:\.(\d+))?s$/);
      if (!t) {
        return null;
      }
      return {
        seconds: Number.parseInt(t[1], 10),
        nanos: t[2] ? Number.parseInt(t[2].padEnd(9, "0"), 10) : 0
      };
    }
    function Vrm(e) {
      if (e.nanos === 0) {
        return `${e.seconds}s`;
      }
      let t;
      if (e.nanos % 1e6 === 0) {
        t = 1e6;
      } else if (e.nanos % 1000 === 0) {
        t = 1000;
      } else {
        t = 1;
      }
      return `${e.seconds}.${e.nanos / t}s`;
    }
  });
  var Fzn = __commonJS(wz => {
    var __dirname = "/home/runner/work/claude-cli-internal/claude-cli-internal/node_modules/@grpc/grpc-js/build/src";
    Object.defineProperty(wz, "__esModule", {
      value: true
    });
    wz.OrcaOobMetricsSubchannelWrapper = wz.GRPC_METRICS_HEADER = wz.ServerMetricRecorder = wz.PerRequestMetricRecorder = undefined;
    wz.createOrcaClient = Jtl;
    wz.createMetricsReader = Zrm;
    var zrm = DVn();
    var Xko = PVt();
    var Krm = Syt();
    var Yrm = AVt();
    var Gtl = th();
    var Jrm = Tyt();
    var Xrm = T3();
    function Lzn() {
      if (null) {
        return null;
      }
      let e = pko().loadSync;
      let t = e("xds/service/orca/v3/orca.proto", {
        keepCase: true,
        longs: String,
        enums: String,
        defaults: true,
        oneofs: true,
        includeDirs: [`${__dirname}/../../proto/xds`, `${__dirname}/../../proto/protoc-gen-validate`]
      });
      return (0, zrm.loadPackageDefinition)(t);
    }
    class Ktl {
      constructor() {
        this.message = {};
      }
      recordRequestCostMetric(e, t) {
        if (!this.message.request_cost) {
          this.message.request_cost = {};
        }
        this.message.request_cost[e] = t;
      }
      recordUtilizationMetric(e, t) {
        if (!this.message.utilization) {
          this.message.utilization = {};
        }
        this.message.utilization[e] = t;
      }
      recordNamedMetric(e, t) {
        if (!this.message.named_metrics) {
          this.message.named_metrics = {};
        }
        this.message.named_metrics[e] = t;
      }
      recordCPUUtilizationMetric(e) {
        this.message.cpu_utilization = e;
      }
      recordMemoryUtilizationMetric(e) {
        this.message.mem_utilization = e;
      }
      recordApplicationUtilizationMetric(e) {
        this.message.application_utilization = e;
      }
      recordQpsMetric(e) {
        this.message.rps_fractional = e;
      }
      recordEpsMetric(e) {
        this.message.eps = e;
      }
      serialize() {
        return Lzn().xds.data.orca.v3.OrcaLoadReport.serialize(this.message);
      }
    }
    wz.PerRequestMetricRecorder = Ktl;
    class Ytl {
      constructor() {
        this.message = {};
        this.serviceImplementation = {
          StreamCoreMetrics: e => {
            let t = e.request.report_interval ? (0, Xko.durationToMs)((0, Xko.durationMessageToDuration)(e.request.report_interval)) : 30000;
            let n = setInterval(() => {
              e.write(this.message);
            }, t);
            e.on("cancelled", () => {
              clearInterval(n);
            });
          }
        };
      }
      putUtilizationMetric(e, t) {
        if (!this.message.utilization) {
          this.message.utilization = {};
        }
        this.message.utilization[e] = t;
      }
      setAllUtilizationMetrics(e) {
        this.message.utilization = Object.assign({}, e);
      }
      deleteUtilizationMetric(e) {
        var t;
        (t = this.message.utilization) === null || t === undefined || delete t[e];
      }
      setCpuUtilizationMetric(e) {
        this.message.cpu_utilization = e;
      }
      deleteCpuUtilizationMetric() {
        delete this.message.cpu_utilization;
      }
      setApplicationUtilizationMetric(e) {
        this.message.application_utilization = e;
      }
      deleteApplicationUtilizationMetric() {
        delete this.message.application_utilization;
      }
      setQpsMetric(e) {
        this.message.rps_fractional = e;
      }
      deleteQpsMetric() {
        delete this.message.rps_fractional;
      }
      setEpsMetric(e) {
        this.message.eps = e;
      }
      deleteEpsMetric() {
        delete this.message.eps;
      }
      addToServer(e) {
        let t = Lzn().xds.service.orca.v3.OpenRcaService.service;
        e.addService(t, this.serviceImplementation);
      }
    }
    wz.ServerMetricRecorder = Ytl;
    function Jtl(e) {
      return new (Lzn().xds.service.orca.v3.OpenRcaService)("unused", Krm.ChannelCredentials.createInsecure(), {
        channelOverride: e
      });
    }
    wz.GRPC_METRICS_HEADER = "endpoint-load-metrics-bin";
    function Zrm(e, t) {
      return (n, r, o) => {
        let s = o.getOpaque("grpc_orca_load_report");
        if (s) {
          e(s);
        } else {
          let i = o.get(wz.GRPC_METRICS_HEADER);
          if (i.length > 0) {
            s = Lzn().xds.data.orca.v3.OrcaLoadReport.deserialize(i[0]);
            e(s);
            o.setOpaque("grpc_orca_load_report", s);
          }
        }
        if (t) {
          t(n, r, o);
        }
      };
    }
    class Qtl {
      constructor(e, t) {
        this.metricsListener = e;
        this.intervalMs = t;
        this.dataProducer = null;
      }
      setSubchannel(e) {
        let t = e.getOrCreateDataProducer("orca_oob_metrics", eom);
        this.dataProducer = t;
        t.addDataWatcher(this);
      }
      destroy() {
        var e;
        (e = this.dataProducer) === null || e === undefined || e.removeDataWatcher(this);
      }
      getInterval() {
        return this.intervalMs;
      }
      onMetricsUpdate(e) {
        this.metricsListener(e);
      }
    }
    class Ztl {
      constructor(e) {
        this.subchannel = e;
        this.dataWatchers = new Set();
        this.orcaSupported = true;
        this.metricsCall = null;
        this.currentInterval = 1 / 0;
        this.backoffTimer = new Jrm.BackoffTimeout(() => this.updateMetricsSubscription());
        this.subchannelStateListener = () => this.updateMetricsSubscription();
        let t = e.getChannel();
        this.client = Jtl(t);
        e.addConnectivityStateListener(this.subchannelStateListener);
      }
      addDataWatcher(e) {
        this.dataWatchers.add(e);
        this.updateMetricsSubscription();
      }
      removeDataWatcher(e) {
        var t;
        if (this.dataWatchers.delete(e), this.dataWatchers.size === 0) {
          this.subchannel.removeDataProducer("orca_oob_metrics");
          (t = this.metricsCall) === null || t === undefined || t.cancel();
          this.metricsCall = null;
          this.client.close();
          this.subchannel.removeConnectivityStateListener(this.subchannelStateListener);
        } else {
          this.updateMetricsSubscription();
        }
      }
      updateMetricsSubscription() {
        var e;
        if (this.dataWatchers.size === 0 || !this.orcaSupported || this.subchannel.getConnectivityState() !== Xrm.ConnectivityState.READY) {
          return;
        }
        let t = Math.min(...Array.from(this.dataWatchers).map(n => n.getInterval()));
        if (!this.metricsCall || t !== this.currentInterval) {
          (e = this.metricsCall) === null || e === undefined || e.cancel();
          this.currentInterval = t;
          let n = this.client.streamCoreMetrics({
            report_interval: (0, Xko.msToDuration)(t)
          });
          this.metricsCall = n;
          n.on("data", r => {
            this.dataWatchers.forEach(o => {
              o.onMetricsUpdate(r);
            });
          });
          n.on("error", r => {
            if (this.metricsCall = null, r.code === Gtl.Status.UNIMPLEMENTED) {
              this.orcaSupported = false;
              return;
            }
            if (r.code === Gtl.Status.CANCELLED) {
              return;
            }
            this.backoffTimer.runOnce();
          });
        }
      }
    }
    class enl extends Yrm.BaseSubchannelWrapper {
      constructor(e, t, n) {
        super(e);
        this.addDataWatcher(new Qtl(t, n));
      }
      getWrappedSubchannel() {
        return this.child;
      }
    }
    wz.OrcaOobMetricsSubchannelWrapper = enl;
    function eom(e) {
      return new Ztl(e);
    }
  });
  var tAo = __commonJS(BQ => {
    Object.defineProperty(BQ, "__esModule", {
      value: true
    });
    BQ.BaseServerInterceptingCall = BQ.ServerInterceptingCall = BQ.ResponderBuilder = BQ.ServerListenerBuilder = undefined;
    BQ.isInterceptingServerListener = rom;
    BQ.getServerInterceptingCall = lom;
    var $zn = K1();
    var E3 = th();
    var Gyt = require("http2");
    var tnl = lVn();
    var nnl = require("zlib");
    var tom = Dko();
    var anl = Av();
    var nom = require("tls");
    var rnl = Fzn();
    function RVe(e) {
      anl.trace(E3.LogVerbosity.DEBUG, "server_call", e);
    }
    class cnl {
      constructor() {
        this.metadata = undefined;
        this.message = undefined;
        this.halfClose = undefined;
        this.cancel = undefined;
      }
      withOnReceiveMetadata(e) {
        this.metadata = e;
        return this;
      }
      withOnReceiveMessage(e) {
        this.message = e;
        return this;
      }
      withOnReceiveHalfClose(e) {
        this.halfClose = e;
        return this;
      }
      withOnCancel(e) {
        this.cancel = e;
        return this;
      }
      build() {
        return {
          onReceiveMetadata: this.metadata,
          onReceiveMessage: this.message,
          onReceiveHalfClose: this.halfClose,
          onCancel: this.cancel
        };
      }
    }
    BQ.ServerListenerBuilder = cnl;
    function rom(e) {
      return e.onReceiveMetadata !== undefined && e.onReceiveMetadata.length === 1;
    }
    class unl {
      constructor(e, t) {
        this.listener = e;
        this.nextListener = t;
        this.cancelled = false;
        this.processingMetadata = false;
        this.hasPendingMessage = false;
        this.pendingMessage = null;
        this.processingMessage = false;
        this.hasPendingHalfClose = false;
      }
      processPendingMessage() {
        if (this.hasPendingMessage) {
          this.nextListener.onReceiveMessage(this.pendingMessage);
          this.pendingMessage = null;
          this.hasPendingMessage = false;
        }
      }
      processPendingHalfClose() {
        if (this.hasPendingHalfClose) {
          this.nextListener.onReceiveHalfClose();
          this.hasPendingHalfClose = false;
        }
      }
      onReceiveMetadata(e) {
        if (this.cancelled) {
          return;
        }
        this.processingMetadata = true;
        this.listener.onReceiveMetadata(e, t => {
          if (this.processingMetadata = false, this.cancelled) {
            return;
          }
          this.nextListener.onReceiveMetadata(t);
          this.processPendingMessage();
          this.processPendingHalfClose();
        });
      }
      onReceiveMessage(e) {
        if (this.cancelled) {
          return;
        }
        this.processingMessage = true;
        this.listener.onReceiveMessage(e, t => {
          if (this.processingMessage = false, this.cancelled) {
            return;
          }
          if (this.processingMetadata) {
            this.pendingMessage = t;
            this.hasPendingMessage = true;
          } else {
            this.nextListener.onReceiveMessage(t);
            this.processPendingHalfClose();
          }
        });
      }
      onReceiveHalfClose() {
        if (this.cancelled) {
          return;
        }
        this.listener.onReceiveHalfClose(() => {
          if (this.cancelled) {
            return;
          }
          if (this.processingMetadata || this.processingMessage) {
            this.hasPendingHalfClose = true;
          } else {
            this.nextListener.onReceiveHalfClose();
          }
        });
      }
      onCancel() {
        this.cancelled = true;
        this.listener.onCancel();
        this.nextListener.onCancel();
      }
    }
    class dnl {
      constructor() {
        this.start = undefined;
        this.metadata = undefined;
        this.message = undefined;
        this.status = undefined;
      }
      withStart(e) {
        this.start = e;
        return this;
      }
      withSendMetadata(e) {
        this.metadata = e;
        return this;
      }
      withSendMessage(e) {
        this.message = e;
        return this;
      }
      withSendStatus(e) {
        this.status = e;
        return this;
      }
      build() {
        return {
          start: this.start,
          sendMetadata: this.metadata,
          sendMessage: this.message,
          sendStatus: this.status
        };
      }
    }
    BQ.ResponderBuilder = dnl;
    var Uzn = {
      onReceiveMetadata: (e, t) => {
        t(e);
      },
      onReceiveMessage: (e, t) => {
        t(e);
      },
      onReceiveHalfClose: e => {
        e();
      },
      onCancel: () => {}
    };
    var Bzn = {
      start: e => {
        e();
      },
      sendMetadata: (e, t) => {
        t(e);
      },
      sendMessage: (e, t) => {
        t(e);
      },
      sendStatus: (e, t) => {
        t(e);
      }
    };
    class pnl {
      constructor(e, t) {
        var n;
        var r;
        var o;
        var s;
        this.nextCall = e;
        this.processingMetadata = false;
        this.sentMetadata = false;
        this.processingMessage = false;
        this.pendingMessage = null;
        this.pendingMessageCallback = null;
        this.pendingStatus = null;
        this.responder = {
          start: (n = t === null || t === undefined ? undefined : t.start) !== null && n !== undefined ? n : Bzn.start,
          sendMetadata: (r = t === null || t === undefined ? undefined : t.sendMetadata) !== null && r !== undefined ? r : Bzn.sendMetadata,
          sendMessage: (o = t === null || t === undefined ? undefined : t.sendMessage) !== null && o !== undefined ? o : Bzn.sendMessage,
          sendStatus: (s = t === null || t === undefined ? undefined : t.sendStatus) !== null && s !== undefined ? s : Bzn.sendStatus
        };
      }
      processPendingMessage() {
        if (this.pendingMessageCallback) {
          this.nextCall.sendMessage(this.pendingMessage, this.pendingMessageCallback);
          this.pendingMessage = null;
          this.pendingMessageCallback = null;
        }
      }
      processPendingStatus() {
        if (this.pendingStatus) {
          this.nextCall.sendStatus(this.pendingStatus);
          this.pendingStatus = null;
        }
      }
      start(e) {
        this.responder.start(t => {
          var n;
          var r;
          var o;
          var s;
          let i = {
            onReceiveMetadata: (n = t === null || t === undefined ? undefined : t.onReceiveMetadata) !== null && n !== undefined ? n : Uzn.onReceiveMetadata,
            onReceiveMessage: (r = t === null || t === undefined ? undefined : t.onReceiveMessage) !== null && r !== undefined ? r : Uzn.onReceiveMessage,
            onReceiveHalfClose: (o = t === null || t === undefined ? undefined : t.onReceiveHalfClose) !== null && o !== undefined ? o : Uzn.onReceiveHalfClose,
            onCancel: (s = t === null || t === undefined ? undefined : t.onCancel) !== null && s !== undefined ? s : Uzn.onCancel
          };
          let a = new unl(i, e);
          this.nextCall.start(a);
        });
      }
      sendMetadata(e) {
        this.processingMetadata = true;
        this.sentMetadata = true;
        this.responder.sendMetadata(e, t => {
          this.processingMetadata = false;
          this.nextCall.sendMetadata(t);
          this.processPendingMessage();
          this.processPendingStatus();
        });
      }
      sendMessage(e, t) {
        if (this.processingMessage = true, !this.sentMetadata) {
          this.sendMetadata(new $zn.Metadata());
        }
        this.responder.sendMessage(e, n => {
          if (this.processingMessage = false, this.processingMetadata) {
            this.pendingMessage = n;
            this.pendingMessageCallback = t;
          } else {
            this.nextCall.sendMessage(n, t);
          }
        });
      }
      sendStatus(e) {
        this.responder.sendStatus(e, t => {
          if (this.processingMetadata || this.processingMessage) {
            this.pendingStatus = t;
          } else {
            this.nextCall.sendStatus(t);
          }
        });
      }
      startRead() {
        this.nextCall.startRead();
      }
      getPeer() {
        return this.nextCall.getPeer();
      }
      getDeadline() {
        return this.nextCall.getDeadline();
      }
      getHost() {
        return this.nextCall.getHost();
      }
      getAuthContext() {
        return this.nextCall.getAuthContext();
      }
      getConnectionInfo() {
        return this.nextCall.getConnectionInfo();
      }
      getMetricsRecorder() {
        return this.nextCall.getMetricsRecorder();
      }
    }
    BQ.ServerInterceptingCall = pnl;
    var som = {
      H: 3600000,
      M: 60000,
      S: 1000,
      m: 1,
      u: 0.001,
      n: 0.000001
    };
    var iom = {
      ["grpc-accept-encoding"]: "identity,deflate,gzip",
      ["grpc-encoding"]: "identity"
    };
    var inl = {
      [Gyt.constants.HTTP2_HEADER_STATUS]: Gyt.constants.HTTP_STATUS_OK,
      [Gyt.constants.HTTP2_HEADER_CONTENT_TYPE]: "application/grpc+proto"
    };
    var aom = {
      waitForTrailers: true
    };
    class eAo {
      constructor(e, t, n, r, o) {
        var s;
        var i;
        if (this.stream = e, this.callEventTracker = n, this.handler = r, this.listener = null, this.deadlineTimer = null, this.deadline = 1 / 0, this.maxSendMessageSize = E3.DEFAULT_MAX_SEND_MESSAGE_LENGTH, this.maxReceiveMessageSize = E3.DEFAULT_MAX_RECEIVE_MESSAGE_LENGTH, this.cancelled = false, this.metadataSent = false, this.wantTrailers = false, this.cancelNotified = false, this.incomingEncoding = "identity", this.readQueue = [], this.isReadPending = false, this.receivedHalfClose = false, this.streamEnded = false, this.metricsRecorder = new rnl.PerRequestMetricRecorder(), this.stream.once("close", () => {
          var d;
          if (RVe("Request to method " + ((d = this.handler) === null || d === undefined ? undefined : d.path) + " stream closed with rstCode " + this.stream.rstCode), this.callEventTracker && !this.streamEnded) {
            this.streamEnded = true;
            this.callEventTracker.onStreamEnd(false);
            this.callEventTracker.onCallEnd({
              code: E3.Status.CANCELLED,
              details: "Stream closed before sending status",
              metadata: null
            });
          }
          this.notifyOnCancel();
        }), this.stream.on("data", d => {
          this.handleDataFrame(d);
        }), this.stream.pause(), this.stream.on("end", () => {
          this.handleEndEvent();
        }), "grpc.max_send_message_length" in o) {
          this.maxSendMessageSize = o["grpc.max_send_message_length"];
        }
        if ("grpc.max_receive_message_length" in o) {
          this.maxReceiveMessageSize = o["grpc.max_receive_message_length"];
        }
        this.host = (s = t[":authority"]) !== null && s !== undefined ? s : t.host;
        this.decoder = new tom.StreamDecoder(this.maxReceiveMessageSize);
        let a = $zn.Metadata.fromHttp2Headers(t);
        if (anl.isTracerEnabled("server_call")) {
          RVe("Request to " + this.handler.path + " received headers " + JSON.stringify(a.toJSON()));
        }
        let l = a.get("grpc-timeout");
        if (l.length > 0) {
          this.handleTimeoutHeader(l[0]);
        }
        let c = a.get("grpc-encoding");
        if (c.length > 0) {
          this.incomingEncoding = c[0];
        }
        a.remove("grpc-timeout");
        a.remove("grpc-encoding");
        a.remove("grpc-accept-encoding");
        a.remove(Gyt.constants.HTTP2_HEADER_ACCEPT_ENCODING);
        a.remove(Gyt.constants.HTTP2_HEADER_TE);
        a.remove(Gyt.constants.HTTP2_HEADER_CONTENT_TYPE);
        this.metadata = a;
        let u = (i = e.session) === null || i === undefined ? undefined : i.socket;
        this.connectionInfo = {
          localAddress: u === null || u === undefined ? undefined : u.localAddress,
          localPort: u === null || u === undefined ? undefined : u.localPort,
          remoteAddress: u === null || u === undefined ? undefined : u.remoteAddress,
          remotePort: u === null || u === undefined ? undefined : u.remotePort
        };
        this.shouldSendMetrics = !!o["grpc.server_call_metric_recording"];
      }
      handleTimeoutHeader(e) {
        let t = e.toString().match(/(\d{1,8})\s*([HMSmun])/);
        if (t === null) {
          let o = {
            code: E3.Status.INTERNAL,
            details: `Invalid ${"grpc-timeout"} value "${e}"`,
            metadata: null
          };
          process.nextTick(() => {
            this.sendStatus(o);
          });
          return;
        }
        let n = +t[1] * som[t[2]] | 0;
        let r = new Date();
        this.deadline = r.setMilliseconds(r.getMilliseconds() + n);
        this.deadlineTimer = setTimeout(() => {
          let o = {
            code: E3.Status.DEADLINE_EXCEEDED,
            details: "Deadline exceeded",
            metadata: null
          };
          this.sendStatus(o);
        }, n);
      }
      checkCancelled() {
        if (!this.cancelled && (this.stream.destroyed || this.stream.closed)) {
          this.notifyOnCancel();
          this.cancelled = true;
        }
        return this.cancelled;
      }
      notifyOnCancel() {
        if (this.cancelNotified) {
          return;
        }
        if (this.cancelNotified = true, this.cancelled = true, process.nextTick(() => {
          var e;
          (e = this.listener) === null || e === undefined || e.onCancel();
        }), this.deadlineTimer) {
          clearTimeout(this.deadlineTimer);
        }
        this.stream.resume();
      }
      maybeSendMetadata() {
        if (!this.metadataSent) {
          this.sendMetadata(new $zn.Metadata());
        }
      }
      serializeMessage(e) {
        let t = this.handler.serialize(e);
        let n = t.byteLength;
        let r = Buffer.allocUnsafe(n + 5);
        r.writeUInt8(0, 0);
        r.writeUInt32BE(n, 1);
        t.copy(r, 5);
        return r;
      }
      decompressMessage(e, t) {
        let n = e.subarray(5);
        if (t === "identity") {
          return n;
        } else if (t === "deflate" || t === "gzip") {
          let r;
          if (t === "deflate") {
            r = nnl.createInflate();
          } else {
            r = nnl.createGunzip();
          }
          return new Promise((o, s) => {
            let i = 0;
            let a = [];
            r.on("error", l => {
              s({
                code: E3.Status.INTERNAL,
                details: "Failed to decompress message"
              });
            });
            r.on("data", l => {
              if (a.push(l), i += l.byteLength, this.maxReceiveMessageSize !== -1 && i > this.maxReceiveMessageSize) {
                r.destroy();
                s({
                  code: E3.Status.RESOURCE_EXHAUSTED,
                  details: `Received message that decompresses to a size larger than ${this.maxReceiveMessageSize}`
                });
              }
            });
            r.on("end", () => {
              o(Buffer.concat(a));
            });
            r.write(n);
            r.end();
          });
        } else {
          return Promise.reject({
            code: E3.Status.UNIMPLEMENTED,
            details: `Received message compressed with unsupported encoding "${t}"`
          });
        }
      }
      async decompressAndMaybePush(e) {
        if (e.type !== "COMPRESSED") {
          throw Error(`Invalid queue entry type: ${e.type}`);
        }
        let n = e.compressedMessage.readUInt8(0) === 1 ? this.incomingEncoding : "identity";
        let r;
        try {
          r = await this.decompressMessage(e.compressedMessage, n);
        } catch (o) {
          this.sendStatus(o);
          return;
        }
        try {
          e.parsedMessage = this.handler.deserialize(r);
        } catch (o) {
          this.sendStatus({
            code: E3.Status.INTERNAL,
            details: `Error deserializing request: ${o.message}`
          });
          return;
        }
        e.type = "READABLE";
        this.maybePushNextMessage();
      }
      maybePushNextMessage() {
        if (this.listener && this.isReadPending && this.readQueue.length > 0 && this.readQueue[0].type !== "COMPRESSED") {
          this.isReadPending = false;
          let e = this.readQueue.shift();
          if (e.type === "READABLE") {
            this.listener.onReceiveMessage(e.parsedMessage);
          } else {
            this.listener.onReceiveHalfClose();
          }
        }
      }
      handleDataFrame(e) {
        var t;
        if (this.checkCancelled()) {
          return;
        }
        RVe("Request to " + this.handler.path + " received data frame of size " + e.length);
        let n;
        try {
          n = this.decoder.write(e);
        } catch (r) {
          this.sendStatus({
            code: E3.Status.RESOURCE_EXHAUSTED,
            details: r.message
          });
          return;
        }
        for (let r of n) {
          this.stream.pause();
          let o = {
            type: "COMPRESSED",
            compressedMessage: r,
            parsedMessage: null
          };
          this.readQueue.push(o);
          this.decompressAndMaybePush(o);
          (t = this.callEventTracker) === null || t === undefined || t.addMessageReceived();
        }
      }
      handleEndEvent() {
        this.readQueue.push({
          type: "HALF_CLOSE",
          compressedMessage: null,
          parsedMessage: null
        });
        this.receivedHalfClose = true;
        this.maybePushNextMessage();
      }
      start(e) {
        if (RVe("Request to " + this.handler.path + " start called"), this.checkCancelled()) {
          return;
        }
        this.listener = e;
        e.onReceiveMetadata(this.metadata);
      }
      sendMetadata(e) {
        if (this.checkCancelled()) {
          return;
        }
        if (this.metadataSent) {
          return;
        }
        this.metadataSent = true;
        let t = e ? e.toHttp2Headers() : null;
        let n = Object.assign(Object.assign(Object.assign({}, inl), iom), t);
        this.stream.respond(n, aom);
      }
      sendMessage(e, t) {
        if (this.checkCancelled()) {
          return;
        }
        let n;
        try {
          n = this.serializeMessage(e);
        } catch (r) {
          this.sendStatus({
            code: E3.Status.INTERNAL,
            details: `Error serializing response: ${(0, tnl.getErrorMessage)(r)}`,
            metadata: null
          });
          return;
        }
        if (this.maxSendMessageSize !== -1 && n.length - 5 > this.maxSendMessageSize) {
          this.sendStatus({
            code: E3.Status.RESOURCE_EXHAUSTED,
            details: `Sent message larger than max (${n.length} vs. ${this.maxSendMessageSize})`,
            metadata: null
          });
          return;
        }
        this.maybeSendMetadata();
        RVe("Request to " + this.handler.path + " sent data frame of size " + n.length);
        this.stream.write(n, r => {
          var o;
          if (r) {
            this.sendStatus({
              code: E3.Status.INTERNAL,
              details: `Error writing message: ${(0, tnl.getErrorMessage)(r)}`,
              metadata: null
            });
            return;
          }
          (o = this.callEventTracker) === null || o === undefined || o.addMessageSent();
          t();
        });
      }
      sendStatus(e) {
        var t;
        var n;
        var r;
        if (this.checkCancelled()) {
          return;
        }
        RVe("Request to method " + ((t = this.handler) === null || t === undefined ? undefined : t.path) + " ended with status code: " + E3.Status[e.code] + " details: " + e.details);
        let o = (r = (n = e.metadata) === null || n === undefined ? undefined : n.clone()) !== null && r !== undefined ? r : new $zn.Metadata();
        if (this.shouldSendMetrics) {
          o.set(rnl.GRPC_METRICS_HEADER, this.metricsRecorder.serialize());
        }
        if (this.metadataSent) {
          if (!this.wantTrailers) {
            this.wantTrailers = true;
            this.stream.once("wantTrailers", () => {
              if (this.callEventTracker && !this.streamEnded) {
                this.streamEnded = true;
                this.callEventTracker.onStreamEnd(true);
                this.callEventTracker.onCallEnd(e);
              }
              let s = Object.assign({
                ["grpc-status"]: e.code,
                ["grpc-message"]: encodeURI(e.details)
              }, o.toHttp2Headers());
              this.stream.sendTrailers(s);
              this.notifyOnCancel();
            });
            this.stream.end();
          } else {
            this.notifyOnCancel();
          }
        } else {
          if (this.callEventTracker && !this.streamEnded) {
            this.streamEnded = true;
            this.callEventTracker.onStreamEnd(true);
            this.callEventTracker.onCallEnd(e);
          }
          let s = Object.assign(Object.assign({
            ["grpc-status"]: e.code,
            ["grpc-message"]: encodeURI(e.details)
          }, inl), o.toHttp2Headers());
          this.stream.respond(s, {
            endStream: true
          });
          this.notifyOnCancel();
        }
      }
      startRead() {
        if (RVe("Request to " + this.handler.path + " startRead called"), this.checkCancelled()) {
          return;
        }
        if (this.isReadPending = true, this.readQueue.length === 0) {
          if (!this.receivedHalfClose) {
            this.stream.resume();
          }
        } else {
          this.maybePushNextMessage();
        }
      }
      getPeer() {
        var e;
        let t = (e = this.stream.session) === null || e === undefined ? undefined : e.socket;
        if (t === null || t === undefined ? undefined : t.remoteAddress) {
          if (t.remotePort) {
            return `${t.remoteAddress}:${t.remotePort}`;
          } else {
            return t.remoteAddress;
          }
        } else {
          return "unknown";
        }
      }
      getDeadline() {
        return this.deadline;
      }
      getHost() {
        return this.host;
      }
      getAuthContext() {
        var e;
        if (((e = this.stream.session) === null || e === undefined ? undefined : e.socket) instanceof nom.TLSSocket) {
          let t = this.stream.session.socket.getPeerCertificate();
          return {
            transportSecurityType: "ssl",
            sslPeerCertificate: t.raw ? t : undefined
          };
        } else {
          return {};
        }
      }
      getConnectionInfo() {
        return this.connectionInfo;
      }
      getMetricsRecorder() {
        return this.metricsRecorder;
      }
    }
    BQ.BaseServerInterceptingCall = eAo;
    function lom(e, t, n, r, o, s) {
      let i = {
        path: o.path,
        requestStream: o.type === "clientStream" || o.type === "bidi",
        responseStream: o.type === "serverStream" || o.type === "bidi",
        requestDeserialize: o.deserialize,
        responseSerialize: o.serialize
      };
      let a = new eAo(t, n, r, o, s);
      return e.reduce((l, c) => c(i, l), a);
    }
  });
  var Snl = __commonJS(T1e => {
    var com = T1e && T1e.__runInitializers || function (e, t, n) {
      var r = arguments.length > 2;
      for (var o = 0; o < t.length; o++) {
        n = r ? t[o].call(e, n) : t[o].call(e);
      }
      return r ? n : undefined;
    };
    var uom = T1e && T1e.__esDecorate || function (e, t, n, r, o, s) {
      function i(y) {
        if (y !== undefined && typeof y !== "function") {
          throw TypeError("Function expected");
        }
        return y;
      }
      var a = r.kind;
      var l = a === "getter" ? "get" : a === "setter" ? "set" : "value";
      var c = !t && e ? r.static ? e : e.prototype : null;
      var u = t || (c ? Object.getOwnPropertyDescriptor(c, r.name) : {});
      var d;
      var p = false;
      for (var m = n.length - 1; m >= 0; m--) {
        var f = {};
        for (var h in r) {
          f[h] = h === "access" ? {} : r[h];
        }
        for (var h in r.access) {
          f.access[h] = r.access[h];
        }
        f.addInitializer = function (y) {
          if (p) {
            throw TypeError("Cannot add initializers after decoration has completed");
          }
          s.push(i(y || null));
        };
        var g = (0, n[m])(a === "accessor" ? {
          get: u.get,
          set: u.set
        } : u[l], f);
        if (a === "accessor") {
          if (g === undefined) {
            continue;
          }
          if (g === null || typeof g !== "object") {
            throw TypeError("Object expected");
          }
          if (d = i(g.get)) {
            u.get = d;
          }
          if (d = i(g.set)) {
            u.set = d;
          }
          if (d = i(g.init)) {
            o.unshift(d);
          }
        } else if (d = i(g)) {
          if (a === "field") {
            o.unshift(d);
          } else {
            u[l] = d;
          }
        }
      }
      if (c) {
        Object.defineProperty(c, r.name, u);
      }
      p = true;
    };
    Object.defineProperty(T1e, "__esModule", {
      value: true
    });
    T1e.Server = undefined;
    var U9 = require("http2");
    var dom = require("util");
    var QI = th();
    var Kyt = Wtl();
    var nAo = Nzn();
    var fnl = tse();
    var zyt = Av();
    var S1e = L9();
    var pse = S3();
    var MM = h1e();
    var hnl = tAo();
    var {
      HTTP2_HEADER_PATH: ynl
    } = U9.constants;
    var _nl = Buffer.from("max_age");
    function bnl(e) {
      zyt.trace(QI.LogVerbosity.DEBUG, "server_call", e);
    }
    function fom() {}
    function hom(e) {
      return function (t, n) {
        return dom.deprecate(t, e);
      };
    }
    function oAo(e) {
      return {
        code: QI.Status.UNIMPLEMENTED,
        details: `The server does not implement the method ${e}`
      };
    }
    function gom(e, t) {
      let n = oAo(t);
      switch (e) {
        case "unary":
          return (r, o) => {
            o(n, null);
          };
        case "clientStream":
          return (r, o) => {
            o(n, null);
          };
        case "serverStream":
          return r => {
            r.emit("error", n);
          };
        case "bidi":
          return r => {
            r.emit("error", n);
          };
        default:
          throw Error(`Invalid handlerType ${e}`);
      }
    }
    var yom = (() => {
      var e;
      let t = [];
      let n;
      e = class {
        constructor(o) {
          var s;
          var i;
          var a;
          var l;
          var c;
          var u;
          if (this.boundPorts = (com(this, t), new Map()), this.http2Servers = new Map(), this.sessionIdleTimeouts = new Map(), this.handlers = new Map(), this.sessions = new Map(), this.started = false, this.shutdown = false, this.serverAddressString = "null", this.channelzEnabled = true, this.options = o !== null && o !== undefined ? o : {}, this.options["grpc.enable_channelz"] === 0) {
            this.channelzEnabled = false;
            this.channelzTrace = new MM.ChannelzTraceStub();
            this.callTracker = new MM.ChannelzCallTrackerStub();
            this.listenerChildrenTracker = new MM.ChannelzChildrenTrackerStub();
            this.sessionChildrenTracker = new MM.ChannelzChildrenTrackerStub();
          } else {
            this.channelzTrace = new MM.ChannelzTrace();
            this.callTracker = new MM.ChannelzCallTracker();
            this.listenerChildrenTracker = new MM.ChannelzChildrenTracker();
            this.sessionChildrenTracker = new MM.ChannelzChildrenTracker();
          }
          if (this.channelzRef = (0, MM.registerChannelzServer)("server", () => this.getChannelzInfo(), this.channelzEnabled), this.channelzTrace.addTrace("CT_INFO", "Server created"), this.maxConnectionAgeMs = (s = this.options["grpc.max_connection_age_ms"]) !== null && s !== undefined ? s : 2147483647, this.maxConnectionAgeGraceMs = (i = this.options["grpc.max_connection_age_grace_ms"]) !== null && i !== undefined ? i : 2147483647, this.keepaliveTimeMs = (a = this.options["grpc.keepalive_time_ms"]) !== null && a !== undefined ? a : 2147483647, this.keepaliveTimeoutMs = (l = this.options["grpc.keepalive_timeout_ms"]) !== null && l !== undefined ? l : 20000, this.sessionIdleTimeout = (c = this.options["grpc.max_connection_idle_ms"]) !== null && c !== undefined ? c : 2147483647, this.commonServerOptions = {
            maxSendHeaderBlockLength: Number.MAX_SAFE_INTEGER
          }, "grpc-node.max_session_memory" in this.options) {
            this.commonServerOptions.maxSessionMemory = this.options["grpc-node.max_session_memory"];
          } else {
            this.commonServerOptions.maxSessionMemory = Number.MAX_SAFE_INTEGER;
          }
          if ("grpc.max_concurrent_streams" in this.options) {
            this.commonServerOptions.settings = {
              maxConcurrentStreams: this.options["grpc.max_concurrent_streams"]
            };
          }
          this.interceptors = (u = this.options.interceptors) !== null && u !== undefined ? u : [];
          this.trace("Server constructed");
        }
        getChannelzInfo() {
          return {
            trace: this.channelzTrace,
            callTracker: this.callTracker,
            listenerChildren: this.listenerChildrenTracker.getChildLists(),
            sessionChildren: this.sessionChildrenTracker.getChildLists()
          };
        }
        getChannelzSessionInfo(o) {
          var s;
          var i;
          var a;
          let l = this.sessions.get(o);
          let c = o.socket;
          let u = c.remoteAddress ? (0, S1e.stringToSubchannelAddress)(c.remoteAddress, c.remotePort) : null;
          let d = c.localAddress ? (0, S1e.stringToSubchannelAddress)(c.localAddress, c.localPort) : null;
          let p;
          if (o.encrypted) {
            let f = c;
            let h = f.getCipher();
            let g = f.getCertificate();
            let y = f.getPeerCertificate();
            p = {
              cipherSuiteStandardName: (s = h.standardName) !== null && s !== undefined ? s : null,
              cipherSuiteOtherName: h.standardName ? null : h.name,
              localCertificate: g && "raw" in g ? g.raw : null,
              remoteCertificate: y && "raw" in y ? y.raw : null
            };
          } else {
            p = null;
          }
          return {
            remoteAddress: u,
            localAddress: d,
            security: p,
            remoteName: null,
            streamsStarted: l.streamTracker.callsStarted,
            streamsSucceeded: l.streamTracker.callsSucceeded,
            streamsFailed: l.streamTracker.callsFailed,
            messagesSent: l.messagesSent,
            messagesReceived: l.messagesReceived,
            keepAlivesSent: l.keepAlivesSent,
            lastLocalStreamCreatedTimestamp: null,
            lastRemoteStreamCreatedTimestamp: l.streamTracker.lastCallStartedTimestamp,
            lastMessageSentTimestamp: l.lastMessageSentTimestamp,
            lastMessageReceivedTimestamp: l.lastMessageReceivedTimestamp,
            localFlowControlWindow: (i = o.state.localWindowSize) !== null && i !== undefined ? i : null,
            remoteFlowControlWindow: (a = o.state.remoteWindowSize) !== null && a !== undefined ? a : null
          };
        }
        trace(o) {
          zyt.trace(QI.LogVerbosity.DEBUG, "server", "(" + this.channelzRef.id + ") " + o);
        }
        keepaliveTrace(o) {
          zyt.trace(QI.LogVerbosity.DEBUG, "keepalive", "(" + this.channelzRef.id + ") " + o);
        }
        addProtoService() {
          throw Error("Not implemented. Use addService() instead");
        }
        addService(o, s) {
          if (o === null || typeof o !== "object" || s === null || typeof s !== "object") {
            throw Error("addService() requires two objects as arguments");
          }
          let i = Object.keys(o);
          if (i.length === 0) {
            throw Error("Cannot add an empty service to a server");
          }
          i.forEach(a => {
            let l = o[a];
            let c;
            if (l.requestStream) {
              if (l.responseStream) {
                c = "bidi";
              } else {
                c = "clientStream";
              }
            } else if (l.responseStream) {
              c = "serverStream";
            } else {
              c = "unary";
            }
            let u = s[a];
            let d;
            if (u === undefined && typeof l.originalName === "string") {
              u = s[l.originalName];
            }
            if (u !== undefined) {
              d = u.bind(s);
            } else {
              d = gom(c, a);
            }
            if (this.register(l.path, d, l.responseSerialize, l.requestDeserialize, c) === false) {
              throw Error(`Method handler for ${l.path} already provided.`);
            }
          });
        }
        removeService(o) {
          if (o === null || typeof o !== "object") {
            throw Error("removeService() requires object as argument");
          }
          Object.keys(o).forEach(i => {
            let a = o[i];
            this.unregister(a.path);
          });
        }
        bind(o, s) {
          throw Error("Not implemented. Use bindAsync() instead");
        }
        experimentalRegisterListenerToChannelz(o) {
          return (0, MM.registerChannelzSocket)((0, S1e.subchannelAddressToString)(o), () => ({
            localAddress: o,
            remoteAddress: null,
            security: null,
            remoteName: null,
            streamsStarted: 0,
            streamsSucceeded: 0,
            streamsFailed: 0,
            messagesSent: 0,
            messagesReceived: 0,
            keepAlivesSent: 0,
            lastLocalStreamCreatedTimestamp: null,
            lastRemoteStreamCreatedTimestamp: null,
            lastMessageSentTimestamp: null,
            lastMessageReceivedTimestamp: null,
            localFlowControlWindow: null,
            remoteFlowControlWindow: null
          }), this.channelzEnabled);
        }
        experimentalUnregisterListenerFromChannelz(o) {
          (0, MM.unregisterChannelzRef)(o);
        }
        createHttp2Server(o) {
          let s;
          if (o._isSecure()) {
            let i = o._getConstructorOptions();
            let a = o._getSecureContextOptions();
            let l = Object.assign(Object.assign(Object.assign(Object.assign({}, this.commonServerOptions), i), a), {
              enableTrace: this.options["grpc-node.tls_enable_trace"] === 1
            });
            let c = a !== null;
            this.trace("Initial credentials valid: " + c);
            s = U9.createSecureServer(l);
            s.prependListener("connection", d => {
              if (!c) {
                this.trace("Dropped connection from " + JSON.stringify(d.address()) + " due to unloaded credentials");
                d.destroy();
              }
            });
            s.on("secureConnection", d => {
              d.on("error", p => {
                this.trace("An incoming TLS connection closed with error: " + p.message);
              });
            });
            let u = d => {
              if (d) {
                let p = s;
                try {
                  p.setSecureContext(d);
                } catch (m) {
                  zyt.log(QI.LogVerbosity.ERROR, "Failed to set secure context with error " + m.message);
                  d = null;
                }
              }
              c = d !== null;
              this.trace("Post-update credentials valid: " + c);
            };
            o._addWatcher(u);
            s.on("close", () => {
              o._removeWatcher(u);
            });
          } else {
            s = U9.createServer(this.commonServerOptions);
          }
          s.setTimeout(0, fom);
          this._setupHandlers(s, o._getInterceptors());
          return s;
        }
        bindOneAddress(o, s) {
          this.trace("Attempting to bind " + (0, S1e.subchannelAddressToString)(o));
          let i = this.createHttp2Server(s.credentials);
          return new Promise((a, l) => {
            let c = u => {
              this.trace("Failed to bind " + (0, S1e.subchannelAddressToString)(o) + " with error " + u.message);
              a({
                port: "port" in o ? o.port : 1,
                error: u.message
              });
            };
            i.once("error", c);
            i.listen(o, () => {
              let u = i.address();
              let d;
              if (typeof u === "string") {
                d = {
                  path: u
                };
              } else {
                d = {
                  host: u.address,
                  port: u.port
                };
              }
              let p = this.experimentalRegisterListenerToChannelz(d);
              this.listenerChildrenTracker.refChild(p);
              this.http2Servers.set(i, {
                channelzRef: p,
                sessions: new Set(),
                ownsChannelzRef: true
              });
              s.listeningServers.add(i);
              this.trace("Successfully bound " + (0, S1e.subchannelAddressToString)(d));
              a({
                port: "port" in d ? d.port : 1
              });
              i.removeListener("error", c);
            });
          });
        }
        async bindManyPorts(o, s) {
          if (o.length === 0) {
            return {
              count: 0,
              port: 0,
              errors: []
            };
          }
          if ((0, S1e.isTcpSubchannelAddress)(o[0]) && o[0].port === 0) {
            let i = await this.bindOneAddress(o[0], s);
            if (i.error) {
              let a = await this.bindManyPorts(o.slice(1), s);
              return Object.assign(Object.assign({}, a), {
                errors: [i.error, ...a.errors]
              });
            } else {
              let a = o.slice(1).map(u => (0, S1e.isTcpSubchannelAddress)(u) ? {
                host: u.host,
                port: i.port
              } : u);
              let l = await Promise.all(a.map(u => this.bindOneAddress(u, s)));
              let c = [i, ...l];
              return {
                count: c.filter(u => u.error === undefined).length,
                port: i.port,
                errors: c.filter(u => u.error).map(u => u.error)
              };
            }
          } else {
            let i = await Promise.all(o.map(a => this.bindOneAddress(a, s)));
            return {
              count: i.filter(a => a.error === undefined).length,
              port: i[0].port,
              errors: i.filter(a => a.error).map(a => a.error)
            };
          }
        }
        async bindAddressList(o, s) {
          let i = await this.bindManyPorts(o, s);
          if (i.count > 0) {
            if (i.count < o.length) {
              zyt.log(QI.LogVerbosity.INFO, `WARNING Only ${i.count} addresses added out of total ${o.length} resolved`);
            }
            return i.port;
          } else {
            let a = `No address added out of total ${o.length} resolved`;
            throw zyt.log(QI.LogVerbosity.ERROR, a), Error(`${a} errors: [${i.errors.join(",")}]`);
          }
        }
        resolvePort(o) {
          return new Promise((s, i) => {
            let a = false;
            let l = (u, d, p, m) => {
              if (a) {
                return true;
              }
              if (a = true, !u.ok) {
                i(Error(u.error.details));
                return true;
              }
              let f = [].concat(...u.value.map(h => h.addresses));
              if (f.length === 0) {
                i(Error(`No addresses resolved for port ${o}`));
                return true;
              }
              s(f);
              return true;
            };
            (0, fnl.createResolver)(o, l, this.options).updateResolution();
          });
        }
        async bindPort(o, s) {
          let i = await this.resolvePort(o);
          if (s.cancelled) {
            throw this.completeUnbind(s), Error("bindAsync operation cancelled by unbind call");
          }
          let a = await this.bindAddressList(i, s);
          if (s.cancelled) {
            throw this.completeUnbind(s), Error("bindAsync operation cancelled by unbind call");
          }
          return a;
        }
        normalizePort(o) {
          let s = (0, pse.parseUri)(o);
          if (s === null) {
            throw Error(`Could not parse port "${o}"`);
          }
          let i = (0, fnl.mapUriDefaultScheme)(s);
          if (i === null) {
            throw Error(`Could not get a default scheme for port "${o}"`);
          }
          return i;
        }
        bindAsync(o, s, i) {
          if (this.shutdown) {
            throw Error("bindAsync called after shutdown");
          }
          if (typeof o !== "string") {
            throw TypeError("port must be a string");
          }
          if (s === null || !(s instanceof nAo.ServerCredentials)) {
            throw TypeError("creds must be a ServerCredentials object");
          }
          if (typeof i !== "function") {
            throw TypeError("callback must be a function");
          }
          this.trace("bindAsync port=" + o);
          let a = this.normalizePort(o);
          let l = (p, m) => {
            process.nextTick(() => i(p, m));
          };
          let c = this.boundPorts.get((0, pse.uriToString)(a));
          if (c) {
            if (!s._equals(c.credentials)) {
              l(Error(`${o} already bound with incompatible credentials`), 0);
              return;
            }
            if (c.cancelled = false, c.completionPromise) {
              c.completionPromise.then(p => i(null, p), p => i(p, 0));
            } else {
              l(null, c.portNumber);
            }
            return;
          }
          c = {
            mapKey: (0, pse.uriToString)(a),
            originalUri: a,
            completionPromise: null,
            cancelled: false,
            portNumber: 0,
            credentials: s,
            listeningServers: new Set()
          };
          let u = (0, pse.splitHostPort)(a.path);
          let d = this.bindPort(a, c);
          if (c.completionPromise = d, (u === null || u === undefined ? undefined : u.port) === 0) {
            d.then(p => {
              let m = {
                scheme: a.scheme,
                authority: a.authority,
                path: (0, pse.combineHostPort)({
                  host: u.host,
                  port: p
                })
              };
              c.mapKey = (0, pse.uriToString)(m);
              c.completionPromise = null;
              c.portNumber = p;
              this.boundPorts.set(c.mapKey, c);
              i(null, p);
            }, p => {
              i(p, 0);
            });
          } else {
            this.boundPorts.set(c.mapKey, c);
            d.then(p => {
              c.completionPromise = null;
              c.portNumber = p;
              i(null, p);
            }, p => {
              i(p, 0);
            });
          }
        }
        registerInjectorToChannelz() {
          return (0, MM.registerChannelzSocket)("injector", () => ({
            localAddress: null,
            remoteAddress: null,
            security: null,
            remoteName: null,
            streamsStarted: 0,
            streamsSucceeded: 0,
            streamsFailed: 0,
            messagesSent: 0,
            messagesReceived: 0,
            keepAlivesSent: 0,
            lastLocalStreamCreatedTimestamp: null,
            lastRemoteStreamCreatedTimestamp: null,
            lastMessageSentTimestamp: null,
            lastMessageReceivedTimestamp: null,
            localFlowControlWindow: null,
            remoteFlowControlWindow: null
          }), this.channelzEnabled);
        }
        experimentalCreateConnectionInjectorWithChannelzRef(o, s, i = false) {
          if (o === null || !(o instanceof nAo.ServerCredentials)) {
            throw TypeError("creds must be a ServerCredentials object");
          }
          if (this.channelzEnabled) {
            this.listenerChildrenTracker.refChild(s);
          }
          let a = this.createHttp2Server(o);
          let l = new Set();
          this.http2Servers.set(a, {
            channelzRef: s,
            sessions: l,
            ownsChannelzRef: i
          });
          return {
            injectConnection: c => {
              a.emit("connection", c);
            },
            drain: c => {
              var u;
              var d;
              for (let p of l) {
                this.closeSession(p);
              }
              (d = (u = setTimeout(() => {
                for (let p of l) {
                  p.destroy(U9.constants.NGHTTP2_CANCEL);
                }
              }, c)).unref) === null || d === undefined || d.call(u);
            },
            destroy: () => {
              this.closeServer(a);
              for (let c of l) {
                this.closeSession(c);
              }
            }
          };
        }
        createConnectionInjector(o) {
          if (o === null || !(o instanceof nAo.ServerCredentials)) {
            throw TypeError("creds must be a ServerCredentials object");
          }
          let s = this.registerInjectorToChannelz();
          return this.experimentalCreateConnectionInjectorWithChannelzRef(o, s, true);
        }
        closeServer(o, s) {
          this.trace("Closing server with address " + JSON.stringify(o.address()));
          let i = this.http2Servers.get(o);
          o.close(() => {
            if (i && i.ownsChannelzRef) {
              this.listenerChildrenTracker.unrefChild(i.channelzRef);
              (0, MM.unregisterChannelzRef)(i.channelzRef);
            }
            this.http2Servers.delete(o);
            s === null || s === undefined || s();
          });
        }
        closeSession(o, s) {
          var i;
          this.trace("Closing session initiated by " + ((i = o.socket) === null || i === undefined ? undefined : i.remoteAddress));
          let a = this.sessions.get(o);
          let l = () => {
            if (a) {
              this.sessionChildrenTracker.unrefChild(a.ref);
              (0, MM.unregisterChannelzRef)(a.ref);
            }
            s === null || s === undefined || s();
          };
          if (o.closed) {
            queueMicrotask(l);
          } else {
            o.close(l);
          }
        }
        completeUnbind(o) {
          for (let s of o.listeningServers) {
            let i = this.http2Servers.get(s);
            if (this.closeServer(s, () => {
              o.listeningServers.delete(s);
            }), i) {
              for (let a of i.sessions) {
                this.closeSession(a);
              }
            }
          }
          this.boundPorts.delete(o.mapKey);
        }
        unbind(o) {
          this.trace("unbind port=" + o);
          let s = this.normalizePort(o);
          let i = (0, pse.splitHostPort)(s.path);
          if ((i === null || i === undefined ? undefined : i.port) === 0) {
            throw Error("Cannot unbind port 0");
          }
          let a = this.boundPorts.get((0, pse.uriToString)(s));
          if (a) {
            if (this.trace("unbinding " + a.mapKey + " originally bound as " + (0, pse.uriToString)(a.originalUri)), a.completionPromise) {
              a.cancelled = true;
            } else {
              this.completeUnbind(a);
            }
          }
        }
        drain(o, s) {
          var i;
          var a;
          this.trace("drain port=" + o + " graceTimeMs=" + s);
          let l = this.normalizePort(o);
          let c = (0, pse.splitHostPort)(l.path);
          if ((c === null || c === undefined ? undefined : c.port) === 0) {
            throw Error("Cannot drain port 0");
          }
          let u = this.boundPorts.get((0, pse.uriToString)(l));
          if (!u) {
            return;
          }
          let d = new Set();
          for (let p of u.listeningServers) {
            let m = this.http2Servers.get(p);
            if (m) {
              for (let f of m.sessions) {
                d.add(f);
                this.closeSession(f, () => {
                  d.delete(f);
                });
              }
            }
          }
          (a = (i = setTimeout(() => {
            for (let p of d) {
              p.destroy(U9.constants.NGHTTP2_CANCEL);
            }
          }, s)).unref) === null || a === undefined || a.call(i);
        }
        forceShutdown() {
          for (let o of this.boundPorts.values()) {
            o.cancelled = true;
          }
          this.boundPorts.clear();
          for (let o of this.http2Servers.keys()) {
            this.closeServer(o);
          }
          this.sessions.forEach((o, s) => {
            this.closeSession(s);
            s.destroy(U9.constants.NGHTTP2_CANCEL);
          });
          this.sessions.clear();
          (0, MM.unregisterChannelzRef)(this.channelzRef);
          this.shutdown = true;
        }
        register(o, s, i, a, l) {
          if (this.handlers.vZc(o)) {
            return false;
          }
          this.handlers.set(o, {
            func: s,
            serialize: i,
            deserialize: a,
            type: l,
            path: o
          });
          return true;
        }
        unregister(o) {
          return this.handlers.delete(o);
        }
        start() {
          if (this.http2Servers.size === 0 || [...this.http2Servers.keys()].every(o => !o.listening)) {
            throw Error("server must be bound in order to start");
          }
          if (this.started === true) {
            throw Error("server is already started");
          }
          this.started = true;
        }
        tryShutdown(o) {
          var s;
          let i = c => {
            (0, MM.unregisterChannelzRef)(this.channelzRef);
            o(c);
          };
          let a = 0;
          function l() {
            if (a--, a === 0) {
              i();
            }
          }
          this.shutdown = true;
          for (let [c, u] of this.http2Servers.entries()) {
            a++;
            let d = u.channelzRef.name;
            this.trace("Waiting for server " + d + " to close");
            this.closeServer(c, () => {
              this.trace("Server " + d + " finished closing");
              l();
            });
            for (let p of u.sessions.keys()) {
              a++;
              let m = (s = p.socket) === null || s === undefined ? undefined : s.remoteAddress;
              this.trace("Waiting for session " + m + " to close");
              this.closeSession(p, () => {
                this.trace("Session " + m + " finished closing");
                l();
              });
            }
          }
          if (a === 0) {
            i();
          }
        }
        addHttp2Port() {
          throw Error("Not yet implemented");
        }
        getChannelzRef() {
          return this.channelzRef;
        }
        _verifyContentType(o, s) {
          let i = s[U9.constants.HTTP2_HEADER_CONTENT_TYPE];
          if (typeof i !== "string" || !i.startsWith("application/grpc")) {
            o.respond({
              [U9.constants.HTTP2_HEADER_STATUS]: U9.constants.HTTP_STATUS_UNSUPPORTED_MEDIA_TYPE
            }, {
              endStream: true
            });
            return false;
          }
          return true;
        }
        _retrieveHandler(o) {
          bnl("Received call to method " + o + " at address " + this.serverAddressString);
          let s = this.handlers.get(o);
          if (s === undefined) {
            bnl("No handler registered for method " + o + ". Sending UNIMPLEMENTED status.");
            return null;
          }
          return s;
        }
        _respondWithError(o, s, i = null) {
          var a;
          var l;
          let c = Object.assign({
            "grpc-status": (a = o.code) !== null && a !== undefined ? a : QI.Status.INTERNAL,
            "grpc-message": o.details,
            [U9.constants.HTTP2_HEADER_STATUS]: U9.constants.HTTP_STATUS_OK,
            [U9.constants.HTTP2_HEADER_CONTENT_TYPE]: "application/grpc+proto"
          }, (l = o.metadata) === null || l === undefined ? undefined : l.toHttp2Headers());
          s.respond(c, {
            endStream: true
          });
          this.callTracker.addCallFailed();
          i === null || i === undefined || i.streamTracker.addCallFailed();
        }
        _channelzHandler(o, s, i) {
          s.once("error", p => {});
          this.onStreamOpened(s);
          let a = this.sessions.get(s.session);
          if (this.callTracker.addCallStarted(), a === null || a === undefined || a.streamTracker.addCallStarted(), !this._verifyContentType(s, i)) {
            this.callTracker.addCallFailed();
            a === null || a === undefined || a.streamTracker.addCallFailed();
            return;
          }
          let l = i[ynl];
          let c = this._retrieveHandler(l);
          if (!c) {
            this._respondWithError(oAo(l), s, a);
            return;
          }
          let u = {
            addMessageSent: () => {
              if (a) {
                a.messagesSent += 1;
                a.lastMessageSentTimestamp = new Date();
              }
            },
            addMessageReceived: () => {
              if (a) {
                a.messagesReceived += 1;
                a.lastMessageReceivedTimestamp = new Date();
              }
            },
            onCallEnd: p => {
              if (p.code === QI.Status.OK) {
                this.callTracker.addCallSucceeded();
              } else {
                this.callTracker.addCallFailed();
              }
            },
            onStreamEnd: p => {
              if (a) {
                if (p) {
                  a.streamTracker.addCallSucceeded();
                } else {
                  a.streamTracker.addCallFailed();
                }
              }
            }
          };
          let d = (0, hnl.getServerInterceptingCall)([...o, ...this.interceptors], s, i, u, c, this.options);
          if (!this._runHandlerForCall(d, c)) {
            this.callTracker.addCallFailed();
            a === null || a === undefined || a.streamTracker.addCallFailed();
            d.sendStatus({
              code: QI.Status.INTERNAL,
              details: `Unknown handler type: ${c.type}`
            });
          }
        }
        _streamHandler(o, s, i) {
          if (s.once("error", u => {}), this.onStreamOpened(s), this._verifyContentType(s, i) !== true) {
            return;
          }
          let a = i[ynl];
          let l = this._retrieveHandler(a);
          if (!l) {
            this._respondWithError(oAo(a), s, null);
            return;
          }
          let c = (0, hnl.getServerInterceptingCall)([...o, ...this.interceptors], s, i, null, l, this.options);
          if (!this._runHandlerForCall(c, l)) {
            c.sendStatus({
              code: QI.Status.INTERNAL,
              details: `Unknown handler type: ${l.type}`
            });
          }
        }
        _runHandlerForCall(o, s) {
          let {
            type: i
          } = s;
          if (i === "unary") {
            _om(o, s);
          } else if (i === "clientStream") {
            bom(o, s);
          } else if (i === "serverStream") {
            Som(o, s);
          } else if (i === "bidi") {
            Tom(o, s);
          } else {
            return false;
          }
          return true;
        }
        _setupHandlers(o, s) {
          if (o === null) {
            return;
          }
          let i = o.address();
          let a = "null";
          if (i) {
            if (typeof i === "string") {
              a = i;
            } else {
              a = i.address + ":" + i.port;
            }
          }
          this.serverAddressString = a;
          let l = this.channelzEnabled ? this._channelzHandler : this._streamHandler;
          let c = this.channelzEnabled ? this._channelzSessionHandler(o) : this._sessionHandler(o);
          o.on("stream", l.bind(this, s));
          o.on("session", c);
        }
        _sessionHandler(o) {
          return s => {
            var i;
            var a;
            (i = this.http2Servers.get(o)) === null || i === undefined || i.sessions.add(s);
            let l = null;
            let c = null;
            let u = null;
            let d = false;
            let p = this.enableIdleTimeout(s);
            if (this.maxConnectionAgeMs !== 2147483647) {
              let y = this.maxConnectionAgeMs / 10;
              let _ = Math.random() * y * 2 - y;
              l = setTimeout(() => {
                var b;
                var S;
                d = true;
                this.trace("Connection dropped by max connection age: " + ((b = s.socket) === null || b === undefined ? undefined : b.remoteAddress));
                try {
                  s.goaway(U9.constants.NGHTTP2_NO_ERROR, 2147483647, _nl);
                } catch (E) {
                  s.destroy();
                  return;
                }
                if (s.close(), this.maxConnectionAgeGraceMs !== 2147483647) {
                  c = setTimeout(() => {
                    s.destroy();
                  }, this.maxConnectionAgeGraceMs);
                  (S = c.unref) === null || S === undefined || S.call(c);
                }
              }, this.maxConnectionAgeMs + _);
              (a = l.unref) === null || a === undefined || a.call(l);
            }
            let m = () => {
              if (u) {
                clearTimeout(u);
                u = null;
              }
            };
            let f = () => !s.destroyed && this.keepaliveTimeMs < 2147483647 && this.keepaliveTimeMs > 0;
            let h;
            let g = () => {
              var y;
              if (!f()) {
                return;
              }
              this.keepaliveTrace("Starting keepalive timer for " + this.keepaliveTimeMs + "ms");
              u = setTimeout(() => {
                m();
                h();
              }, this.keepaliveTimeMs);
              (y = u.unref) === null || y === undefined || y.call(u);
            };
            h = () => {
              var y;
              if (!f()) {
                return;
              }
              this.keepaliveTrace("Sending ping with timeout " + this.keepaliveTimeoutMs + "ms");
              let _ = "";
              try {
                if (!s.ping((S, E, C) => {
                  if (m(), S) {
                    this.keepaliveTrace("Ping failed with error: " + S.message);
                    d = true;
                    s.destroy();
                  } else {
                    this.keepaliveTrace("Received ping response");
                    g();
                  }
                })) {
                  _ = "Ping returned false";
                }
              } catch (b) {
                _ = (b instanceof Error ? b.message : "") || "Unknown error";
              }
              if (_) {
                this.keepaliveTrace("Ping send failed: " + _);
                this.trace("Connection dropped due to ping send error: " + _);
                d = true;
                s.destroy();
                return;
              }
              u = setTimeout(() => {
                m();
                this.keepaliveTrace("Ping timeout passed without response");
                this.trace("Connection dropped by keepalive timeout");
                d = true;
                s.destroy();
              }, this.keepaliveTimeoutMs);
              (y = u.unref) === null || y === undefined || y.call(u);
            };
            g();
            s.on("close", () => {
              var y;
              var _;
              if (!d) {
                this.trace(`Connection dropped by client ${(y = s.socket) === null || y === undefined ? undefined : y.remoteAddress}`);
              }
              if (l) {
                clearTimeout(l);
              }
              if (c) {
                clearTimeout(c);
              }
              if (m(), p !== null) {
                clearTimeout(p.timeout);
                this.sessionIdleTimeouts.delete(s);
              }
              (_ = this.http2Servers.get(o)) === null || _ === undefined || _.sessions.delete(s);
            });
          };
        }
        _channelzSessionHandler(o) {
          return s => {
            var i;
            var a;
            var l;
            var c;
            let u = (0, MM.registerChannelzSocket)((a = (i = s.socket) === null || i === undefined ? undefined : i.remoteAddress) !== null && a !== undefined ? a : "unknown", this.getChannelzSessionInfo.bind(this, s), this.channelzEnabled);
            let d = {
              ref: u,
              streamTracker: new MM.ChannelzCallTracker(),
              messagesSent: 0,
              messagesReceived: 0,
              keepAlivesSent: 0,
              lastMessageSentTimestamp: null,
              lastMessageReceivedTimestamp: null
            };
            (l = this.http2Servers.get(o)) === null || l === undefined || l.sessions.add(s);
            this.sessions.set(s, d);
            let p = `${s.socket.remoteAddress}:${s.socket.remotePort}`;
            this.channelzTrace.addTrace("CT_INFO", "Connection established by client " + p);
            this.trace("Connection established by client " + p);
            this.sessionChildrenTracker.refChild(u);
            let m = null;
            let f = null;
            let h = null;
            let g = false;
            let y = this.enableIdleTimeout(s);
            if (this.maxConnectionAgeMs !== 2147483647) {
              let C = this.maxConnectionAgeMs / 10;
              let x = Math.random() * C * 2 - C;
              m = setTimeout(() => {
                var A;
                g = true;
                this.channelzTrace.addTrace("CT_INFO", "Connection dropped by max connection age from " + p);
                try {
                  s.goaway(U9.constants.NGHTTP2_NO_ERROR, 2147483647, _nl);
                } catch (k) {
                  s.destroy();
                  return;
                }
                if (s.close(), this.maxConnectionAgeGraceMs !== 2147483647) {
                  f = setTimeout(() => {
                    s.destroy();
                  }, this.maxConnectionAgeGraceMs);
                  (A = f.unref) === null || A === undefined || A.call(f);
                }
              }, this.maxConnectionAgeMs + x);
              (c = m.unref) === null || c === undefined || c.call(m);
            }
            let _ = () => {
              if (h) {
                clearTimeout(h);
                h = null;
              }
            };
            let b = () => !s.destroyed && this.keepaliveTimeMs < 2147483647 && this.keepaliveTimeMs > 0;
            let S;
            let E = () => {
              var C;
              if (!b()) {
                return;
              }
              this.keepaliveTrace("Starting keepalive timer for " + this.keepaliveTimeMs + "ms");
              h = setTimeout(() => {
                _();
                S();
              }, this.keepaliveTimeMs);
              (C = h.unref) === null || C === undefined || C.call(h);
            };
            S = () => {
              var C;
              if (!b()) {
                return;
              }
              this.keepaliveTrace("Sending ping with timeout " + this.keepaliveTimeoutMs + "ms");
              let x = "";
              try {
                if (!s.ping((k, I, O) => {
                  if (_(), k) {
                    this.keepaliveTrace("Ping failed with error: " + k.message);
                    this.channelzTrace.addTrace("CT_INFO", "Connection dropped due to error of a ping frame " + k.message + " return in " + I);
                    g = true;
                    s.destroy();
                  } else {
                    this.keepaliveTrace("Received ping response");
                    E();
                  }
                })) {
                  x = "Ping returned false";
                }
              } catch (A) {
                x = (A instanceof Error ? A.message : "") || "Unknown error";
              }
              if (x) {
                this.keepaliveTrace("Ping send failed: " + x);
                this.channelzTrace.addTrace("CT_INFO", "Connection dropped due to ping send error: " + x);
                g = true;
                s.destroy();
                return;
              }
              d.keepAlivesSent += 1;
              h = setTimeout(() => {
                _();
                this.keepaliveTrace("Ping timeout passed without response");
                this.channelzTrace.addTrace("CT_INFO", "Connection dropped by keepalive timeout from " + p);
                g = true;
                s.destroy();
              }, this.keepaliveTimeoutMs);
              (C = h.unref) === null || C === undefined || C.call(h);
            };
            E();
            s.on("close", () => {
              var C;
              if (!g) {
                this.channelzTrace.addTrace("CT_INFO", "Connection dropped by client " + p);
              }
              if (this.sessionChildrenTracker.unrefChild(u), (0, MM.unregisterChannelzRef)(u), m) {
                clearTimeout(m);
              }
              if (f) {
                clearTimeout(f);
              }
              if (_(), y !== null) {
                clearTimeout(y.timeout);
                this.sessionIdleTimeouts.delete(s);
              }
              (C = this.http2Servers.get(o)) === null || C === undefined || C.sessions.delete(s);
              this.sessions.delete(s);
            });
          };
        }
        enableIdleTimeout(o) {
          var s;
          var i;
          if (this.sessionIdleTimeout >= 2147483647) {
            return null;
          }
          let a = {
            activeStreams: 0,
            lastIdle: Date.now(),
            onClose: this.onStreamClose.bind(this, o),
            timeout: setTimeout(this.onIdleTimeout, this.sessionIdleTimeout, this, o)
          };
          (i = (s = a.timeout).unref) === null || i === undefined || i.call(s);
          this.sessionIdleTimeouts.set(o, a);
          let {
            socket: l
          } = o;
          this.trace("Enable idle timeout for " + l.remoteAddress + ":" + l.remotePort);
          return a;
        }
        onIdleTimeout(o, s) {
          let {
            socket: i
          } = s;
          let a = o.sessionIdleTimeouts.get(s);
          if (a !== undefined && a.activeStreams === 0) {
            if (Date.now() - a.lastIdle >= o.sessionIdleTimeout) {
              o.trace("Session idle timeout triggered for " + (i === null || i === undefined ? undefined : i.remoteAddress) + ":" + (i === null || i === undefined ? undefined : i.remotePort) + " last idle at " + a.lastIdle);
              o.closeSession(s);
            } else {
              a.timeout.refresh();
            }
          }
        }
        onStreamOpened(o) {
          let s = o.session;
          let i = this.sessionIdleTimeouts.get(s);
          if (i) {
            i.activeStreams += 1;
            o.once("close", i.onClose);
          }
        }
        onStreamClose(o) {
          var s;
          var i;
          let a = this.sessionIdleTimeouts.get(o);
          if (a) {
            if (a.activeStreams -= 1, a.activeStreams === 0) {
              a.lastIdle = Date.now();
              a.timeout.refresh();
              this.trace("Session onStreamClose" + ((s = o.socket) === null || s === undefined ? undefined : s.remoteAddress) + ":" + ((i = o.socket) === null || i === undefined ? undefined : i.remotePort) + " at " + a.lastIdle);
            }
          }
        }
      };
      (() => {
        let r = typeof Symbol === "function" && Symbol.metadata ? Object.create(null) : undefined;
        if (n = [hom("Calling start() is no longer necessary. It can be safely omitted.")], uom(e, null, n, {
          kind: "method",
          name: "start",
          static: false,
          private: false,
          access: {
            vZc: o => "start" in o,
            get: o => o.start
          },
          metadata: r
        }, null, t), r) {
          Object.defineProperty(e, Symbol.metadata, {
            enumerable: true,
            configurable: true,
            writable: true,
            value: r
          });
        }
      })();
      return e;
    })();
    T1e.Server = yom;
    async function _om(e, t) {
      let n;
      function r(i, a, l, c) {
        if (i) {
          e.sendStatus((0, Kyt.serverErrorToStatus)(i, l));
          return;
        }
        e.sendMessage(a, () => {
          e.sendStatus({
            code: QI.Status.OK,
            details: "OK",
            metadata: l !== null && l !== undefined ? l : null
          });
        });
      }
      let o;
      let s = null;
      e.start({
        onReceiveMetadata(i) {
          o = i;
          e.startRead();
        },
        onReceiveMessage(i) {
          if (s) {
            e.sendStatus({
              code: QI.Status.UNIMPLEMENTED,
              details: `Received a second request message for server streaming method ${t.path}`,
              metadata: null
            });
            return;
          }
          s = i;
          e.startRead();
        },
        onReceiveHalfClose() {
          if (!s) {
            e.sendStatus({
              code: QI.Status.UNIMPLEMENTED,
              details: `Received no request message for server streaming method ${t.path}`,
              metadata: null
            });
            return;
          }
          n = new Kyt.ServerWritableStreamImpl(t.path, e, o, s);
          try {
            t.func(n, r);
          } catch (i) {
            e.sendStatus({
              code: QI.Status.UNKNOWN,
              details: `Server method handler threw error ${i.message}`,
              metadata: null
            });
          }
        },
        onCancel() {
          if (n) {
            n.cancelled = true;
            n.emit("cancelled", "cancelled");
          }
        }
      });
    }
    function bom(e, t) {
      let n;
      function r(o, s, i, a) {
        if (o) {
          e.sendStatus((0, Kyt.serverErrorToStatus)(o, i));
          return;
        }
        e.sendMessage(s, () => {
          e.sendStatus({
            code: QI.Status.OK,
            details: "OK",
            metadata: i !== null && i !== undefined ? i : null
          });
        });
      }
      e.start({
        onReceiveMetadata(o) {
          n = new Kyt.ServerDuplexStreamImpl(t.path, e, o);
          try {
            t.func(n, r);
          } catch (s) {
            e.sendStatus({
              code: QI.Status.UNKNOWN,
              details: `Server method handler threw error ${s.message}`,
              metadata: null
            });
          }
        },
        onReceiveMessage(o) {
          n.push(o);
        },
        onReceiveHalfClose() {
          n.push(null);
        },
        onCancel() {
          if (n) {
            n.cancelled = true;
            n.emit("cancelled", "cancelled");
            n.destroy();
          }
        }
      });
    }
    function Som(e, t) {
      let n;
      let r;
      let o = null;
      e.start({
        onReceiveMetadata(s) {
          r = s;
          e.startRead();
        },
        onReceiveMessage(s) {
          if (o) {
            e.sendStatus({
              code: QI.Status.UNIMPLEMENTED,
              details: `Received a second request message for server streaming method ${t.path}`,
              metadata: null
            });
            return;
          }
          o = s;
          e.startRead();
        },
        onReceiveHalfClose() {
          if (!o) {
            e.sendStatus({
              code: QI.Status.UNIMPLEMENTED,
              details: `Received no request message for server streaming method ${t.path}`,
              metadata: null
            });
            return;
          }
          n = new Kyt.ServerWritableStreamImpl(t.path, e, r, o);
          try {
            t.func(n);
          } catch (s) {
            e.sendStatus({
              code: QI.Status.UNKNOWN,
              details: `Server method handler threw error ${s.message}`,
              metadata: null
            });
          }
        },
        onCancel() {
          if (n) {
            n.cancelled = true;
            n.emit("cancelled", "cancelled");
            n.destroy();
          }
        }
      });
    }
    function Tom(e, t) {
      let n;
      e.start({
        onReceiveMetadata(r) {
          n = new Kyt.ServerDuplexStreamImpl(t.path, e, r);
          try {
            t.func(n);
          } catch (o) {
            e.sendStatus({
              code: QI.Status.UNKNOWN,
              details: `Server method handler threw error ${o.message}`,
              metadata: null
            });
          }
        },
        onReceiveMessage(r) {
          n.push(r);
        },
        onReceiveHalfClose() {
          n.push(null);
        },
        onCancel() {
          if (n) {
            n.cancelled = true;
            n.emit("cancelled", "cancelled");
            n.destroy();
          }
        }
      });
    }
  });
  var Enl = __commonJS(Hzn => {
    Object.defineProperty(Hzn, "__esModule", {
      value: true
    });
    Hzn.StatusBuilder = undefined;
    class Tnl {
      constructor() {
        this.code = null;
        this.details = null;
        this.metadata = null;
      }
      withCode(e) {
        this.code = e;
        return this;
      }
      withDetails(e) {
        this.details = e;
        return this;
      }
      withMetadata(e) {
        this.metadata = e;
        return this;
      }
      build() {
        let e = {};
        if (this.code !== null) {
          e.code = this.code;
        }
        if (this.details !== null) {
          e.details = this.details;
        }
        if (this.metadata !== null) {
          e.metadata = this.metadata;
        }
        return e;
      }
    }
    Hzn.StatusBuilder = Tnl;
  });
  var MVt = __commonJS(ume => {
    Object.defineProperty(ume, "__esModule", {
      value: true
    });
    ume.LeafLoadBalancer = ume.PickFirstLoadBalancer = ume.PickFirstLoadBalancingConfig = undefined;
    ume.shuffled = xnl;
    ume.setup = Aom;
    var sAo = a1e();
    var ZI = T3();
    var E1e = YEe();
    var vnl = L9();
    var Eom = Av();
    var vom = th();
    var wnl = L9();
    var Cnl = require("net");
    var wom = mVe();
    function OVt(e) {
      Eom.trace(vom.LogVerbosity.DEBUG, "pick_first", e);
    }
    class Yyt {
      constructor(e) {
        this.shuffleAddressList = e;
      }
      getLoadBalancerName() {
        return "pick_first";
      }
      toJsonObject() {
        return {
          ["pick_first"]: {
            shuffleAddressList: this.shuffleAddressList
          }
        };
      }
      getShuffleAddressList() {
        return this.shuffleAddressList;
      }
      static createFromJson(e) {
        if ("shuffleAddressList" in e && typeof e.shuffleAddressList !== "boolean") {
          throw Error("pick_first config field shuffleAddressList must be a boolean if provided");
        }
        return new Yyt(e.shuffleAddressList === true);
      }
    }
    ume.PickFirstLoadBalancingConfig = Yyt;
    class Rnl {
      constructor(e) {
        this.subchannel = e;
      }
      pick(e) {
        return {
          pickResultType: E1e.PickResultType.COMPLETE,
          subchannel: this.subchannel,
          status: null,
          onCallStarted: null,
          onCallEnded: null
        };
      }
    }
    function xnl(e) {
      let t = e.slice();
      for (let n = t.length - 1; n > 1; n--) {
        let r = Math.floor(Math.random() * (n + 1));
        let o = t[n];
        t[n] = t[r];
        t[r] = o;
      }
      return t;
    }
    function xom(e) {
      if (e.length === 0) {
        return [];
      }
      let t = [];
      let n = [];
      let r = [];
      let o = (0, wnl.isTcpSubchannelAddress)(e[0]) && (0, Cnl.isIPv6)(e[0].host);
      for (let a of e) {
        if ((0, wnl.isTcpSubchannelAddress)(a) && (0, Cnl.isIPv6)(a.host)) {
          n.push(a);
        } else {
          r.push(a);
        }
      }
      let s = o ? n : r;
      let i = o ? r : n;
      for (let a = 0; a < Math.max(s.length, i.length); a++) {
        if (a < s.length) {
          t.push(s[a]);
        }
        if (a < i.length) {
          t.push(i[a]);
        }
      }
      return t;
    }
    class jzn {
      constructor(e) {
        this.channelControlHelper = e;
        this.children = [];
        this.currentState = ZI.ConnectivityState.IDLE;
        this.currentSubchannelIndex = 0;
        this.currentPick = null;
        this.subchannelStateListener = (t, n, r, o, s) => {
          this.onSubchannelStateUpdate(t, n, r, s);
        };
        this.pickedSubchannelHealthListener = () => this.calculateAndReportNewState();
        this.stickyTransientFailureMode = false;
        this.reportHealthStatus = false;
        this.lastError = null;
        this.latestAddressList = null;
        this.latestOptions = {};
        this.latestResolutionNote = "";
        this.connectionDelayTimeout = setTimeout(() => {}, 0);
        clearTimeout(this.connectionDelayTimeout);
      }
      allChildrenHaveReportedTF() {
        return this.children.every(e => e.hasReportedTransientFailure);
      }
      resetChildrenReportedTF() {
        this.children.every(e => e.hasReportedTransientFailure = false);
      }
      calculateAndReportNewState() {
        var e;
        if (this.currentPick) {
          if (this.reportHealthStatus && !this.currentPick.isHealthy()) {
            let t = `Picked subchannel ${this.currentPick.getAddress()} is unhealthy`;
            this.updateState(ZI.ConnectivityState.TRANSIENT_FAILURE, new E1e.UnavailablePicker({
              details: t
            }), t);
          } else {
            this.updateState(ZI.ConnectivityState.READY, new Rnl(this.currentPick), null);
          }
        } else if (((e = this.latestAddressList) === null || e === undefined ? undefined : e.length) === 0) {
          let t = `No connection established. Last error: ${this.lastError}. Resolution note: ${this.latestResolutionNote}`;
          this.updateState(ZI.ConnectivityState.TRANSIENT_FAILURE, new E1e.UnavailablePicker({
            details: t
          }), t);
        } else if (this.children.length === 0) {
          this.updateState(ZI.ConnectivityState.IDLE, new E1e.QueuePicker(this), null);
        } else if (this.stickyTransientFailureMode) {
          let t = `No connection established. Last error: ${this.lastError}. Resolution note: ${this.latestResolutionNote}`;
          this.updateState(ZI.ConnectivityState.TRANSIENT_FAILURE, new E1e.UnavailablePicker({
            details: t
          }), t);
        } else {
          this.updateState(ZI.ConnectivityState.CONNECTING, new E1e.QueuePicker(this), null);
        }
      }
      requestReresolution() {
        this.channelControlHelper.requestReresolution();
      }
      maybeEnterStickyTransientFailureMode() {
        if (!this.allChildrenHaveReportedTF()) {
          return;
        }
        if (this.requestReresolution(), this.resetChildrenReportedTF(), this.stickyTransientFailureMode) {
          this.calculateAndReportNewState();
          return;
        }
        this.stickyTransientFailureMode = true;
        for (let {
          subchannel: e
        } of this.children) {
          e.startConnecting();
        }
        this.calculateAndReportNewState();
      }
      removeCurrentPick() {
        if (this.currentPick !== null) {
          this.currentPick.removeConnectivityStateListener(this.subchannelStateListener);
          this.channelControlHelper.removeChannelzChild(this.currentPick.getChannelzRef());
          this.currentPick.removeHealthStateWatcher(this.pickedSubchannelHealthListener);
          this.currentPick.unref();
          this.currentPick = null;
        }
      }
      onSubchannelStateUpdate(e, t, n, r) {
        var o;
        if ((o = this.currentPick) === null || o === undefined ? undefined : o.realSubchannelEquals(e)) {
          if (n !== ZI.ConnectivityState.READY) {
            this.removeCurrentPick();
            this.calculateAndReportNewState();
          }
          return;
        }
        for (let [s, i] of this.children.entries()) {
          if (e.realSubchannelEquals(i.subchannel)) {
            if (n === ZI.ConnectivityState.READY) {
              this.pickSubchannel(i.subchannel);
            }
            if (n === ZI.ConnectivityState.TRANSIENT_FAILURE) {
              if (i.hasReportedTransientFailure = true, r) {
                this.lastError = r;
              }
              if (this.maybeEnterStickyTransientFailureMode(), s === this.currentSubchannelIndex) {
                this.startNextSubchannelConnecting(s + 1);
              }
            }
            i.subchannel.startConnecting();
            return;
          }
        }
      }
      startNextSubchannelConnecting(e) {
        clearTimeout(this.connectionDelayTimeout);
        for (let [t, n] of this.children.entries()) {
          if (t >= e) {
            let r = n.subchannel.getConnectivityState();
            if (r === ZI.ConnectivityState.IDLE || r === ZI.ConnectivityState.CONNECTING) {
              this.startConnecting(t);
              return;
            }
          }
        }
        this.maybeEnterStickyTransientFailureMode();
      }
      startConnecting(e) {
        var t;
        var n;
        if (clearTimeout(this.connectionDelayTimeout), this.currentSubchannelIndex = e, this.children[e].subchannel.getConnectivityState() === ZI.ConnectivityState.IDLE) {
          OVt("Start connecting to subchannel with address " + this.children[e].subchannel.getAddress());
          process.nextTick(() => {
            var r;
            (r = this.children[e]) === null || r === undefined || r.subchannel.startConnecting();
          });
        }
        this.connectionDelayTimeout = setTimeout(() => {
          this.startNextSubchannelConnecting(e + 1);
        }, 250);
        (n = (t = this.connectionDelayTimeout).unref) === null || n === undefined || n.call(t);
      }
      pickSubchannel(e) {
        OVt("Pick subchannel with address " + e.getAddress());
        this.stickyTransientFailureMode = false;
        e.ref();
        this.channelControlHelper.addChannelzChild(e.getChannelzRef());
        this.removeCurrentPick();
        this.resetSubchannelList();
        e.addConnectivityStateListener(this.subchannelStateListener);
        e.addHealthStateWatcher(this.pickedSubchannelHealthListener);
        this.currentPick = e;
        clearTimeout(this.connectionDelayTimeout);
        this.calculateAndReportNewState();
      }
      updateState(e, t, n) {
        OVt(ZI.ConnectivityState[this.currentState] + " -> " + ZI.ConnectivityState[e]);
        this.currentState = e;
        this.channelControlHelper.updateState(e, t, n);
      }
      resetSubchannelList() {
        for (let e of this.children) {
          e.subchannel.removeConnectivityStateListener(this.subchannelStateListener);
          e.subchannel.unref();
          this.channelControlHelper.removeChannelzChild(e.subchannel.getChannelzRef());
        }
        this.currentSubchannelIndex = 0;
        this.children = [];
      }
      connectToAddressList(e, t) {
        OVt("connectToAddressList([" + e.map(r => (0, vnl.subchannelAddressToString)(r)) + "])");
        let n = e.map(r => ({
          subchannel: this.channelControlHelper.createSubchannel(r, t),
          hasReportedTransientFailure: false
        }));
        for (let {
          subchannel: r
        } of n) {
          if (r.getConnectivityState() === ZI.ConnectivityState.READY) {
            this.pickSubchannel(r);
            return;
          }
        }
        for (let {
          subchannel: r
        } of n) {
          r.ref();
          this.channelControlHelper.addChannelzChild(r.getChannelzRef());
        }
        this.resetSubchannelList();
        this.children = n;
        for (let {
          subchannel: r
        } of this.children) {
          r.addConnectivityStateListener(this.subchannelStateListener);
        }
        for (let r of this.children) {
          if (r.subchannel.getConnectivityState() === ZI.ConnectivityState.TRANSIENT_FAILURE) {
            r.hasReportedTransientFailure = true;
          }
        }
        this.startNextSubchannelConnecting(0);
        this.calculateAndReportNewState();
      }
      updateAddressList(e, t, n, r) {
        if (!(t instanceof Yyt)) {
          return false;
        }
        if (!e.ok) {
          if (this.children.length === 0 && this.currentPick === null) {
            this.channelControlHelper.updateState(ZI.ConnectivityState.TRANSIENT_FAILURE, new E1e.UnavailablePicker(e.error), e.error.details);
          }
          return true;
        }
        let o = e.value;
        if (this.reportHealthStatus = n["grpc-node.internal.pick-first.report_health_status"], t.getShuffleAddressList()) {
          o = xnl(o);
        }
        let s = [].concat(...o.map(a => a.addresses));
        OVt("updateAddressList([" + s.map(a => (0, vnl.subchannelAddressToString)(a)) + "])");
        let i = xom(s);
        if (this.latestAddressList = i, this.latestOptions = n, this.connectToAddressList(i, n), this.latestResolutionNote = r, s.length > 0) {
          return true;
        } else {
          this.lastError = "No addresses resolved";
          return false;
        }
      }
      exitIdle() {
        if (this.currentState === ZI.ConnectivityState.IDLE && this.latestAddressList) {
          this.connectToAddressList(this.latestAddressList, this.latestOptions);
        }
      }
      resetBackoff() {}
      destroy() {
        this.resetSubchannelList();
        this.removeCurrentPick();
      }
      getTypeName() {
        return "pick_first";
      }
    }
    ume.PickFirstLoadBalancer = jzn;
    var kom = new Yyt(false);
    class Anl {
      constructor(e, t, n, r) {
        this.endpoint = e;
        this.options = n;
        this.resolutionNote = r;
        this.latestState = ZI.ConnectivityState.IDLE;
        let o = (0, sAo.createChildChannelControlHelper)(t, {
          updateState: (s, i, a) => {
            this.latestState = s;
            this.latestPicker = i;
            t.updateState(s, i, a);
          }
        });
        this.pickFirstBalancer = new jzn(o);
        this.latestPicker = new E1e.QueuePicker(this.pickFirstBalancer);
      }
      startConnecting() {
        this.pickFirstBalancer.updateAddressList((0, wom.statusOrFromValue)([this.endpoint]), kom, Object.assign(Object.assign({}, this.options), {
          ["grpc-node.internal.pick-first.report_health_status"]: true
        }), this.resolutionNote);
      }
      updateEndpoint(e, t) {
        if (this.options = t, this.endpoint = e, this.latestState !== ZI.ConnectivityState.IDLE) {
          this.startConnecting();
        }
      }
      getConnectivityState() {
        return this.latestState;
      }
      getPicker() {
        return this.latestPicker;
      }
      getEndpoint() {
        return this.endpoint;
      }
      exitIdle() {
        this.pickFirstBalancer.exitIdle();
      }
      destroy() {
        this.pickFirstBalancer.destroy();
      }
    }
    ume.LeafLoadBalancer = Anl;
    function Aom() {
      (0, sAo.registerLoadBalancerType)("pick_first", jzn, Yyt);
      (0, sAo.registerDefaultLoadBalancerType)("pick_first");
    }
  });
  var Pnl = __commonJS(Wzn => {
    Object.defineProperty(Wzn, "__esModule", {
      value: true
    });
    Wzn.FileWatcherCertificateProvider = undefined;
    var Iom = require("fs");
    var Pom = Av();
    var Oom = th();
    var Dom = require("util");
    function qzn(e) {
      Pom.trace(Oom.LogVerbosity.DEBUG, "certificate_provider", e);
    }
    var iAo = (0, Dom.promisify)(Iom.readFile);
    class Inl {
      constructor(e) {
        if (this.config = e, this.refreshTimer = null, this.fileResultPromise = null, this.latestCaUpdate = undefined, this.caListeners = new Set(), this.latestIdentityUpdate = undefined, this.identityListeners = new Set(), this.lastUpdateTime = null, e.certificateFile === undefined !== (e.privateKeyFile === undefined)) {
          throw Error("certificateFile and privateKeyFile must be set or unset together");
        }
        if (e.certificateFile === undefined && e.caCertificateFile === undefined) {
          throw Error("At least one of certificateFile and caCertificateFile must be set");
        }
        qzn("File watcher constructed with config " + JSON.stringify(e));
      }
      updateCertificates() {
        if (this.fileResultPromise) {
          return;
        }
        this.fileResultPromise = Promise.allSettled([this.config.certificateFile ? iAo(this.config.certificateFile) : Promise.reject(), this.config.privateKeyFile ? iAo(this.config.privateKeyFile) : Promise.reject(), this.config.caCertificateFile ? iAo(this.config.caCertificateFile) : Promise.reject()]);
        this.fileResultPromise.then(([e, t, n]) => {
          if (!this.refreshTimer) {
            return;
          }
          if (qzn("File watcher read certificates certificate " + e.status + ", privateKey " + t.status + ", CA certificate " + n.status), this.lastUpdateTime = new Date(), this.fileResultPromise = null, e.status === "fulfilled" && t.status === "fulfilled") {
            this.latestIdentityUpdate = {
              certificate: e.value,
              privateKey: t.value
            };
          } else {
            this.latestIdentityUpdate = null;
          }
          if (n.status === "fulfilled") {
            this.latestCaUpdate = {
              caCertificate: n.value
            };
          } else {
            this.latestCaUpdate = null;
          }
          for (let r of this.identityListeners) {
            r(this.latestIdentityUpdate);
          }
          for (let r of this.caListeners) {
            r(this.latestCaUpdate);
          }
        });
        qzn("File watcher initiated certificate update");
      }
      maybeStartWatchingFiles() {
        if (!this.refreshTimer) {
          let e = this.lastUpdateTime ? new Date().getTime() - this.lastUpdateTime.getTime() : 1 / 0;
          if (e > this.config.refreshIntervalMs) {
            this.updateCertificates();
          }
          if (e > this.config.refreshIntervalMs * 2) {
            this.latestCaUpdate = undefined;
            this.latestIdentityUpdate = undefined;
          }
          this.refreshTimer = setInterval(() => this.updateCertificates(), this.config.refreshIntervalMs);
          qzn("File watcher started watching");
        }
      }
      maybeStopWatchingFiles() {
        if (this.caListeners.size === 0 && this.identityListeners.size === 0) {
          if (this.fileResultPromise = null, this.refreshTimer) {
            clearInterval(this.refreshTimer);
            this.refreshTimer = null;
          }
        }
      }
      addCaCertificateListener(e) {
        if (this.caListeners.add(e), this.maybeStartWatchingFiles(), this.latestCaUpdate !== undefined) {
          process.nextTick(e, this.latestCaUpdate);
        }
      }
      removeCaCertificateListener(e) {
        this.caListeners.delete(e);
        this.maybeStopWatchingFiles();
      }
      addIdentityCertificateListener(e) {
        if (this.identityListeners.add(e), this.maybeStartWatchingFiles(), this.latestIdentityUpdate !== undefined) {
          process.nextTick(e, this.latestIdentityUpdate);
        }
      }
      removeIdentityCertificateListener(e) {
        this.identityListeners.delete(e);
        this.maybeStopWatchingFiles();
      }
    }
    Wzn.FileWatcherCertificateProvider = Inl;
  });
  var cAo = __commonJS(pl => {
    Object.defineProperty(pl, "__esModule", {
      value: true
    });
    pl.SUBCHANNEL_ARGS_EXCLUDE_KEY_PREFIX = pl.createCertificateProviderChannelCredentials = pl.FileWatcherCertificateProvider = pl.createCertificateProviderServerCredentials = pl.createServerCredentialsWithInterceptors = pl.BaseSubchannelWrapper = pl.registerAdminService = pl.FilterStackFactory = pl.BaseFilter = pl.statusOrFromError = pl.statusOrFromValue = pl.PickResultType = pl.QueuePicker = pl.UnavailablePicker = pl.ChildLoadBalancerHandler = pl.EndpointMap = pl.endpointHasAddress = pl.endpointToString = pl.subchannelAddressToString = pl.LeafLoadBalancer = pl.isLoadBalancerNameRegistered = pl.parseLoadBalancingConfig = pl.selectLbConfigFromList = pl.registerLoadBalancerType = pl.createChildChannelControlHelper = pl.BackoffTimeout = pl.parseDuration = pl.durationToMs = pl.splitHostPort = pl.uriToString = pl.CHANNEL_ARGS_CONFIG_SELECTOR_KEY = pl.createResolver = pl.registerResolver = pl.log = pl.trace = undefined;
    var Onl = Av();
    Object.defineProperty(pl, "trace", {
      enumerable: true,
      get: function () {
        return Onl.trace;
      }
    });
    Object.defineProperty(pl, "log", {
      enumerable: true,
      get: function () {
        return Onl.log;
      }
    });
    var aAo = tse();
    Object.defineProperty(pl, "registerResolver", {
      enumerable: true,
      get: function () {
        return aAo.registerResolver;
      }
    });
    Object.defineProperty(pl, "createResolver", {
      enumerable: true,
      get: function () {
        return aAo.createResolver;
      }
    });
    Object.defineProperty(pl, "CHANNEL_ARGS_CONFIG_SELECTOR_KEY", {
      enumerable: true,
      get: function () {
        return aAo.CHANNEL_ARGS_CONFIG_SELECTOR_KEY;
      }
    });
    var Dnl = S3();
    Object.defineProperty(pl, "uriToString", {
      enumerable: true,
      get: function () {
        return Dnl.uriToString;
      }
    });
    Object.defineProperty(pl, "splitHostPort", {
      enumerable: true,
      get: function () {
        return Dnl.splitHostPort;
      }
    });
    var Mnl = PVt();
    Object.defineProperty(pl, "durationToMs", {
      enumerable: true,
      get: function () {
        return Mnl.durationToMs;
      }
    });
    Object.defineProperty(pl, "parseDuration", {
      enumerable: true,
      get: function () {
        return Mnl.parseDuration;
      }
    });
    var Nom = Tyt();
    Object.defineProperty(pl, "BackoffTimeout", {
      enumerable: true,
      get: function () {
        return Nom.BackoffTimeout;
      }
    });
    var NVt = a1e();
    Object.defineProperty(pl, "createChildChannelControlHelper", {
      enumerable: true,
      get: function () {
        return NVt.createChildChannelControlHelper;
      }
    });
    Object.defineProperty(pl, "registerLoadBalancerType", {
      enumerable: true,
      get: function () {
        return NVt.registerLoadBalancerType;
      }
    });
    Object.defineProperty(pl, "selectLbConfigFromList", {
      enumerable: true,
      get: function () {
        return NVt.selectLbConfigFromList;
      }
    });
    Object.defineProperty(pl, "parseLoadBalancingConfig", {
      enumerable: true,
      get: function () {
        return NVt.parseLoadBalancingConfig;
      }
    });
    Object.defineProperty(pl, "isLoadBalancerNameRegistered", {
      enumerable: true,
      get: function () {
        return NVt.isLoadBalancerNameRegistered;
      }
    });
    var Lom = MVt();
    Object.defineProperty(pl, "LeafLoadBalancer", {
      enumerable: true,
      get: function () {
        return Lom.LeafLoadBalancer;
      }
    });
    var Gzn = L9();
    Object.defineProperty(pl, "subchannelAddressToString", {
      enumerable: true,
      get: function () {
        return Gzn.subchannelAddressToString;
      }
    });
    Object.defineProperty(pl, "endpointToString", {
      enumerable: true,
      get: function () {
        return Gzn.endpointToString;
      }
    });
    Object.defineProperty(pl, "endpointHasAddress", {
      enumerable: true,
      get: function () {
        return Gzn.endpointHasAddress;
      }
    });
    Object.defineProperty(pl, "EndpointMap", {
      enumerable: true,
      get: function () {
        return Gzn.EndpointMap;
      }
    });
    var Fom = CVn();
    Object.defineProperty(pl, "ChildLoadBalancerHandler", {
      enumerable: true,
      get: function () {
        return Fom.ChildLoadBalancerHandler;
      }
    });
    var lAo = YEe();
    Object.defineProperty(pl, "UnavailablePicker", {
      enumerable: true,
      get: function () {
        return lAo.UnavailablePicker;
      }
    });
    Object.defineProperty(pl, "QueuePicker", {
      enumerable: true,
      get: function () {
        return lAo.QueuePicker;
      }
    });
    Object.defineProperty(pl, "PickResultType", {
      enumerable: true,
      get: function () {
        return lAo.PickResultType;
      }
    });
    var Nnl = mVe();
    Object.defineProperty(pl, "statusOrFromValue", {
      enumerable: true,
      get: function () {
        return Nnl.statusOrFromValue;
      }
    });
    Object.defineProperty(pl, "statusOrFromError", {
      enumerable: true,
      get: function () {
        return Nnl.statusOrFromError;
      }
    });
    var Uom = Sko();
    Object.defineProperty(pl, "BaseFilter", {
      enumerable: true,
      get: function () {
        return Uom.BaseFilter;
      }
    });
    var Bom = mzn();
    Object.defineProperty(pl, "FilterStackFactory", {
      enumerable: true,
      get: function () {
        return Bom.FilterStackFactory;
      }
    });
    var $om = AVn();
    Object.defineProperty(pl, "registerAdminService", {
      enumerable: true,
      get: function () {
        return $om.registerAdminService;
      }
    });
    var Hom = AVt();
    Object.defineProperty(pl, "BaseSubchannelWrapper", {
      enumerable: true,
      get: function () {
        return Hom.BaseSubchannelWrapper;
      }
    });
    var Lnl = Nzn();
    Object.defineProperty(pl, "createServerCredentialsWithInterceptors", {
      enumerable: true,
      get: function () {
        return Lnl.createServerCredentialsWithInterceptors;
      }
    });
    Object.defineProperty(pl, "createCertificateProviderServerCredentials", {
      enumerable: true,
      get: function () {
        return Lnl.createCertificateProviderServerCredentials;
      }
    });
    var jom = Pnl();
    Object.defineProperty(pl, "FileWatcherCertificateProvider", {
      enumerable: true,
      get: function () {
        return jom.FileWatcherCertificateProvider;
      }
    });
    var qom = Syt();
    Object.defineProperty(pl, "createCertificateProviderChannelCredentials", {
      enumerable: true,
      get: function () {
        return qom.createCertificateProviderChannelCredentials;
      }
    });
    var Wom = jko();
    Object.defineProperty(pl, "SUBCHANNEL_ARGS_EXCLUDE_KEY_PREFIX", {
      enumerable: true,
      get: function () {
        return Wom.SUBCHANNEL_ARGS_EXCLUDE_KEY_PREFIX;
      }
    });
  });
  var Unl = __commonJS(uAo => {
    Object.defineProperty(uAo, "__esModule", {
      value: true
    });
    uAo.setup = zom;
    var Gom = tse();
    var Vom = mVe();
    class Fnl {
      constructor(e, t, n) {
        this.listener = t;
        this.hasReturnedResult = false;
        this.endpoints = [];
        let r;
        if (e.authority === "") {
          r = "/" + e.path;
        } else {
          r = e.path;
        }
        this.endpoints = [{
          addresses: [{
            path: r
          }]
        }];
      }
      updateResolution() {
        if (!this.hasReturnedResult) {
          this.hasReturnedResult = true;
          process.nextTick(this.listener, (0, Vom.statusOrFromValue)(this.endpoints), {}, null, "");
        }
      }
      destroy() {
        this.hasReturnedResult = false;
      }
      static getDefaultAuthority(e) {
        return "localhost";
      }
    }
    function zom() {
      (0, Gom.registerResolver)("unix", Fnl);
    }
  });
  var Wnl = __commonJS(hAo => {
    Object.defineProperty(hAo, "__esModule", {
      value: true
    });
    hAo.setup = Qom;
    var Bnl = require("net");
    var $nl = mVe();
    var Vzn = th();
    var dAo = K1();
    var Hnl = tse();
    var Kom = L9();
    var jnl = S3();
    var Yom = Av();
    function qnl(e) {
      Yom.trace(Vzn.LogVerbosity.DEBUG, "ip_resolver", e);
    }
    class fAo {
      constructor(e, t, n) {
        var r;
        this.listener = t;
        this.endpoints = [];
        this.error = null;
        this.hasReturnedResult = false;
        qnl("Resolver constructed for target " + (0, jnl.uriToString)(e));
        let o = [];
        if (!(e.scheme === "ipv4" || e.scheme === "ipv6")) {
          this.error = {
            code: Vzn.Status.UNAVAILABLE,
            details: `Unrecognized scheme ${e.scheme} in IP resolver`,
            metadata: new dAo.Metadata()
          };
          return;
        }
        let s = e.path.split(",");
        for (let i of s) {
          let a = (0, jnl.splitHostPort)(i);
          if (a === null) {
            this.error = {
              code: Vzn.Status.UNAVAILABLE,
              details: `Failed to parse ${e.scheme} address ${i}`,
              metadata: new dAo.Metadata()
            };
            return;
          }
          if (e.scheme === "ipv4" && !(0, Bnl.isIPv4)(a.host) || e.scheme === "ipv6" && !(0, Bnl.isIPv6)(a.host)) {
            this.error = {
              code: Vzn.Status.UNAVAILABLE,
              details: `Failed to parse ${e.scheme} address ${i}`,
              metadata: new dAo.Metadata()
            };
            return;
          }
          o.push({
            host: a.host,
            port: (r = a.port) !== null && r !== undefined ? r : 443
          });
        }
        this.endpoints = o.map(i => ({
          addresses: [i]
        }));
        qnl("Parsed " + e.scheme + " address list " + o.map(Kom.subchannelAddressToString));
      }
      updateResolution() {
        if (!this.hasReturnedResult) {
          this.hasReturnedResult = true;
          process.nextTick(() => {
            if (this.error) {
              this.listener((0, $nl.statusOrFromError)(this.error), {}, null, "");
            } else {
              this.listener((0, $nl.statusOrFromValue)(this.endpoints), {}, null, "");
            }
          });
        }
      }
      destroy() {
        this.hasReturnedResult = false;
      }
      static getDefaultAuthority(e) {
        return e.path.split(",")[0];
      }
    }
    function Qom() {
      (0, Hnl.registerResolver)("ipv4", fAo);
      (0, Hnl.registerResolver)("ipv6", fAo);
    }
  });
  var Ynl = __commonJS(FVt => {
    Object.defineProperty(FVt, "__esModule", {
      value: true
    });
    FVt.RoundRobinLoadBalancer = undefined;
    FVt.setup = osm;
    var znl = a1e();
    var NU = T3();
    var LVt = YEe();
    var Zom = Av();
    var esm = th();
    var Gnl = L9();
    var tsm = MVt();
    function Vnl(e) {
      Zom.trace(esm.LogVerbosity.DEBUG, "round_robin", e);
    }
    class Kzn {
      getLoadBalancerName() {
        return "round_robin";
      }
      constructor() {}
      toJsonObject() {
        return {
          ["round_robin"]: {}
        };
      }
      static createFromJson(e) {
        return new Kzn();
      }
    }
    class Knl {
      constructor(e, t = 0) {
        this.children = e;
        this.nextIndex = t;
      }
      pick(e) {
        let t = this.children[this.nextIndex].picker;
        this.nextIndex = (this.nextIndex + 1) % this.children.length;
        return t.pick(e);
      }
      peekNextEndpoint() {
        return this.children[this.nextIndex].endpoint;
      }
    }
    function rsm(e, t) {
      return [...e.slice(t), ...e.slice(0, t)];
    }
    class gAo {
      constructor(e) {
        this.channelControlHelper = e;
        this.children = [];
        this.currentState = NU.ConnectivityState.IDLE;
        this.currentReadyPicker = null;
        this.updatesPaused = false;
        this.lastError = null;
        this.childChannelControlHelper = (0, znl.createChildChannelControlHelper)(e, {
          updateState: (t, n, r) => {
            if (this.currentState === NU.ConnectivityState.READY && t !== NU.ConnectivityState.READY) {
              this.channelControlHelper.requestReresolution();
            }
            if (r) {
              this.lastError = r;
            }
            this.calculateAndUpdateState();
          }
        });
      }
      countChildrenWithState(e) {
        return this.children.filter(t => t.getConnectivityState() === e).length;
      }
      calculateAndUpdateState() {
        if (this.updatesPaused) {
          return;
        }
        if (this.countChildrenWithState(NU.ConnectivityState.READY) > 0) {
          let e = this.children.filter(n => n.getConnectivityState() === NU.ConnectivityState.READY);
          let t = 0;
          if (this.currentReadyPicker !== null) {
            let n = this.currentReadyPicker.peekNextEndpoint();
            if (t = e.findIndex(r => (0, Gnl.endpointEqual)(r.getEndpoint(), n)), t < 0) {
              t = 0;
            }
          }
          this.updateState(NU.ConnectivityState.READY, new Knl(e.map(n => ({
            endpoint: n.getEndpoint(),
            picker: n.getPicker()
          })), t), null);
        } else if (this.countChildrenWithState(NU.ConnectivityState.CONNECTING) > 0) {
          this.updateState(NU.ConnectivityState.CONNECTING, new LVt.QueuePicker(this), null);
        } else if (this.countChildrenWithState(NU.ConnectivityState.TRANSIENT_FAILURE) > 0) {
          let e = `round_robin: No connection established. Last error: ${this.lastError}`;
          this.updateState(NU.ConnectivityState.TRANSIENT_FAILURE, new LVt.UnavailablePicker({
            details: e
          }), e);
        } else {
          this.updateState(NU.ConnectivityState.IDLE, new LVt.QueuePicker(this), null);
        }
        for (let e of this.children) {
          if (e.getConnectivityState() === NU.ConnectivityState.IDLE) {
            e.exitIdle();
          }
        }
      }
      updateState(e, t, n) {
        if (Vnl(NU.ConnectivityState[this.currentState] + " -> " + NU.ConnectivityState[e]), e === NU.ConnectivityState.READY) {
          this.currentReadyPicker = t;
        } else {
          this.currentReadyPicker = null;
        }
        this.currentState = e;
        this.channelControlHelper.updateState(e, t, n);
      }
      resetSubchannelList() {
        for (let e of this.children) {
          e.destroy();
        }
        this.children = [];
      }
      updateAddressList(e, t, n, r) {
        if (!(t instanceof Kzn)) {
          return false;
        }
        if (!e.ok) {
          if (this.children.length === 0) {
            this.updateState(NU.ConnectivityState.TRANSIENT_FAILURE, new LVt.UnavailablePicker(e.error), e.error.details);
          }
          return true;
        }
        let o = Math.random() * e.value.length | 0;
        let s = rsm(e.value, o);
        if (this.resetSubchannelList(), s.length === 0) {
          let i = `No addresses resolved. Resolution note: ${r}`;
          this.updateState(NU.ConnectivityState.TRANSIENT_FAILURE, new LVt.UnavailablePicker({
            details: i
          }), i);
        }
        Vnl("Connect to endpoint list " + s.map(Gnl.endpointToString));
        this.updatesPaused = true;
        this.children = s.map(i => new tsm.LeafLoadBalancer(i, this.childChannelControlHelper, n, r));
        for (let i of this.children) {
          i.startConnecting();
        }
        this.updatesPaused = false;
        this.calculateAndUpdateState();
        return true;
      }
      exitIdle() {}
      resetBackoff() {}
      destroy() {
        this.resetSubchannelList();
      }
      getTypeName() {
        return "round_robin";
      }
    }
    FVt.RoundRobinLoadBalancer = gAo;
    function osm() {
      (0, znl.registerLoadBalancerType)("round_robin", gAo, Kzn);
    }
  });
  var trl = __commonJS(kVe => {
    var yAo;
    Object.defineProperty(kVe, "__esModule", {
      value: true
    });
    kVe.OutlierDetectionLoadBalancer = kVe.OutlierDetectionLoadBalancingConfig = undefined;
    kVe.setup = hsm;
    var ssm = T3();
    var Jnl = th();
    var xVe = PVt();
    var Xnl = cAo();
    var ism = a1e();
    var asm = CVn();
    var lsm = YEe();
    var _Ao = L9();
    var csm = AVt();
    var usm = Av();
    function X1(e) {
      usm.trace(Jnl.LogVerbosity.DEBUG, "outlier_detection", e);
    }
    var psm = ((yAo = process.env.GRPC_EXPERIMENTAL_ENABLE_OUTLIER_DETECTION) !== null && yAo !== undefined ? yAo : "true") === "true";
    var msm = {
      stdev_factor: 1900,
      enforcement_percentage: 100,
      minimum_hosts: 5,
      request_volume: 100
    };
    var fsm = {
      threshold: 85,
      enforcement_percentage: 100,
      minimum_hosts: 5,
      request_volume: 50
    };
    function Jyt(e, t, n, r) {
      if (t in e && e[t] !== undefined && typeof e[t] !== n) {
        let o = r ? `${r}.${t}` : t;
        throw Error(`outlier detection config ${o} parse error: expected ${n}, got ${typeof e[t]}`);
      }
    }
    function bAo(e, t, n) {
      let r = n ? `${n}.${t}` : t;
      if (t in e && e[t] !== undefined) {
        if (!(0, xVe.isDuration)(e[t])) {
          throw Error(`outlier detection config ${r} parse error: expected Duration, got ${typeof e[t]}`);
        }
        if (!(e[t].seconds >= 0 && e[t].seconds <= 315576000000 && e[t].nanos >= 0 && e[t].nanos <= 999999999)) {
          throw Error(`outlier detection config ${r} parse error: values out of range for non-negative Duaration`);
        }
      }
    }
    function Yzn(e, t, n) {
      let r = n ? `${n}.${t}` : t;
      if (Jyt(e, t, "number", n), t in e && e[t] !== undefined && !(e[t] >= 0 && e[t] <= 100)) {
        throw Error(`outlier detection config ${r} parse error: value out of range for percentage (0-100)`);
      }
    }
    class UVt {
      constructor(e, t, n, r, o, s, i) {
        if (this.childPolicy = i, i.getLoadBalancerName() === "pick_first") {
          throw Error("outlier_detection LB policy cannot have a pick_first child policy");
        }
        this.intervalMs = e !== null && e !== undefined ? e : 1e4;
        this.baseEjectionTimeMs = t !== null && t !== undefined ? t : 30000;
        this.maxEjectionTimeMs = n !== null && n !== undefined ? n : 300000;
        this.maxEjectionPercent = r !== null && r !== undefined ? r : 10;
        this.successRateEjection = o ? Object.assign(Object.assign({}, msm), o) : null;
        this.failurePercentageEjection = s ? Object.assign(Object.assign({}, fsm), s) : null;
      }
      getLoadBalancerName() {
        return "outlier_detection";
      }
      toJsonObject() {
        var e;
        var t;
        return {
          outlier_detection: {
            interval: (0, xVe.msToDuration)(this.intervalMs),
            base_ejection_time: (0, xVe.msToDuration)(this.baseEjectionTimeMs),
            max_ejection_time: (0, xVe.msToDuration)(this.maxEjectionTimeMs),
            max_ejection_percent: this.maxEjectionPercent,
            success_rate_ejection: (e = this.successRateEjection) !== null && e !== undefined ? e : undefined,
            failure_percentage_ejection: (t = this.failurePercentageEjection) !== null && t !== undefined ? t : undefined,
            child_policy: [this.childPolicy.toJsonObject()]
          }
        };
      }
      getIntervalMs() {
        return this.intervalMs;
      }
      getBaseEjectionTimeMs() {
        return this.baseEjectionTimeMs;
      }
      getMaxEjectionTimeMs() {
        return this.maxEjectionTimeMs;
      }
      getMaxEjectionPercent() {
        return this.maxEjectionPercent;
      }
      getSuccessRateEjectionConfig() {
        return this.successRateEjection;
      }
      getFailurePercentageEjectionConfig() {
        return this.failurePercentageEjection;
      }
      getChildPolicy() {
        return this.childPolicy;
      }
      static createFromJson(e) {
        var t;
        if (bAo(e, "interval"), bAo(e, "base_ejection_time"), bAo(e, "max_ejection_time"), Yzn(e, "max_ejection_percent"), "success_rate_ejection" in e && e.success_rate_ejection !== undefined) {
          if (typeof e.success_rate_ejection !== "object") {
            throw Error("outlier detection config success_rate_ejection must be an object");
          }
          Jyt(e.success_rate_ejection, "stdev_factor", "number", "success_rate_ejection");
          Yzn(e.success_rate_ejection, "enforcement_percentage", "success_rate_ejection");
          Jyt(e.success_rate_ejection, "minimum_hosts", "number", "success_rate_ejection");
          Jyt(e.success_rate_ejection, "request_volume", "number", "success_rate_ejection");
        }
        if ("failure_percentage_ejection" in e && e.failure_percentage_ejection !== undefined) {
          if (typeof e.failure_percentage_ejection !== "object") {
            throw Error("outlier detection config failure_percentage_ejection must be an object");
          }
          Yzn(e.failure_percentage_ejection, "threshold", "failure_percentage_ejection");
          Yzn(e.failure_percentage_ejection, "enforcement_percentage", "failure_percentage_ejection");
          Jyt(e.failure_percentage_ejection, "minimum_hosts", "number", "failure_percentage_ejection");
          Jyt(e.failure_percentage_ejection, "request_volume", "number", "failure_percentage_ejection");
        }
        if (!("child_policy" in e) || !Array.isArray(e.child_policy)) {
          throw Error("outlier detection config child_policy must be an array");
        }
        let n = (0, ism.selectLbConfigFromList)(e.child_policy);
        if (!n) {
          throw Error("outlier detection config child_policy: no valid recognized policy found");
        }
        return new UVt(e.interval ? (0, xVe.durationToMs)(e.interval) : null, e.base_ejection_time ? (0, xVe.durationToMs)(e.base_ejection_time) : null, e.max_ejection_time ? (0, xVe.durationToMs)(e.max_ejection_time) : null, (t = e.max_ejection_percent) !== null && t !== undefined ? t : null, e.success_rate_ejection, e.failure_percentage_ejection, n);
      }
    }
    kVe.OutlierDetectionLoadBalancingConfig = UVt;
    class Qnl extends csm.BaseSubchannelWrapper {
      constructor(e, t) {
        super(e);
        this.mapEntry = t;
        this.refCount = 0;
      }
      ref() {
        this.child.ref();
        this.refCount += 1;
      }
      unref() {
        if (this.child.unref(), this.refCount -= 1, this.refCount <= 0) {
          if (this.mapEntry) {
            let e = this.mapEntry.subchannelWrappers.indexOf(this);
            if (e >= 0) {
              this.mapEntry.subchannelWrappers.splice(e, 1);
            }
          }
        }
      }
      eject() {
        this.setHealthy(false);
      }
      uneject() {
        this.setHealthy(true);
      }
      getMapEntry() {
        return this.mapEntry;
      }
      getWrappedSubchannel() {
        return this.child;
      }
    }
    function SAo() {
      return {
        success: 0,
        failure: 0
      };
    }
    class Znl {
      constructor() {
        this.activeBucket = SAo();
        this.inactiveBucket = SAo();
      }
      addSuccess() {
        this.activeBucket.success += 1;
      }
      addFailure() {
        this.activeBucket.failure += 1;
      }
      switchBuckets() {
        this.inactiveBucket = this.activeBucket;
        this.activeBucket = SAo();
      }
      getLastSuccesses() {
        return this.inactiveBucket.success;
      }
      getLastFailures() {
        return this.inactiveBucket.failure;
      }
    }
    class erl {
      constructor(e, t) {
        this.wrappedPicker = e;
        this.countCalls = t;
      }
      pick(e) {
        let t = this.wrappedPicker.pick(e);
        if (t.pickResultType === lsm.PickResultType.COMPLETE) {
          let n = t.subchannel;
          let r = n.getMapEntry();
          if (r) {
            let o = t.onCallEnded;
            if (this.countCalls) {
              o = (s, i, a) => {
                var l;
                if (s === Jnl.Status.OK) {
                  r.counter.addSuccess();
                } else {
                  r.counter.addFailure();
                }
                (l = t.onCallEnded) === null || l === undefined || l.call(t, s, i, a);
              };
            }
            return Object.assign(Object.assign({}, t), {
              subchannel: n.getWrappedSubchannel(),
              onCallEnded: o
            });
          } else {
            return Object.assign(Object.assign({}, t), {
              subchannel: n.getWrappedSubchannel()
            });
          }
        } else {
          return t;
        }
      }
    }
    class EAo {
      constructor(e) {
        this.entryMap = new _Ao.EndpointMap();
        this.latestConfig = null;
        this.timerStartTime = null;
        this.childBalancer = new asm.ChildLoadBalancerHandler((0, Xnl.createChildChannelControlHelper)(e, {
          createSubchannel: (t, n) => {
            let r = e.createSubchannel(t, n);
            let o = this.entryMap.getForSubchannelAddress(t);
            let s = new Qnl(r, o);
            if ((o === null || o === undefined ? undefined : o.currentEjectionTimestamp) !== null) {
              s.eject();
            }
            o === null || o === undefined || o.subchannelWrappers.push(s);
            return s;
          },
          updateState: (t, n, r) => {
            if (t === ssm.ConnectivityState.READY) {
              e.updateState(t, new erl(n, this.isCountingEnabled()), r);
            } else {
              e.updateState(t, n, r);
            }
          }
        }));
        this.ejectionTimer = setInterval(() => {}, 0);
        clearInterval(this.ejectionTimer);
      }
      isCountingEnabled() {
        return this.latestConfig !== null && (this.latestConfig.getSuccessRateEjectionConfig() !== null || this.latestConfig.getFailurePercentageEjectionConfig() !== null);
      }
      getCurrentEjectionPercent() {
        let e = 0;
        for (let t of this.entryMap.values()) {
          if (t.currentEjectionTimestamp !== null) {
            e += 1;
          }
        }
        return e * 100 / this.entryMap.size;
      }
      runSuccessRateCheck(e) {
        if (!this.latestConfig) {
          return;
        }
        let t = this.latestConfig.getSuccessRateEjectionConfig();
        if (!t) {
          return;
        }
        X1("Running success rate check");
        let n = t.request_volume;
        let r = 0;
        let o = [];
        for (let [u, d] of this.entryMap.entries()) {
          let p = d.counter.getLastSuccesses();
          let m = d.counter.getLastFailures();
          if (X1("Stats for " + (0, _Ao.endpointToString)(u) + ": successes=" + p + " failures=" + m + " targetRequestVolume=" + n), p + m >= n) {
            r += 1;
            o.push(p / (p + m));
          }
        }
        if (X1("Found " + r + " success rate candidates; currentEjectionPercent=" + this.getCurrentEjectionPercent() + " successRates=[" + o + "]"), r < t.minimum_hosts) {
          return;
        }
        let s = o.reduce((u, d) => u + d) / o.length;
        let i = 0;
        for (let u of o) {
          let d = u - s;
          i += d * d;
        }
        let a = i / o.length;
        let l = Math.sqrt(a);
        let c = s - l * (t.stdev_factor / 1000);
        X1("stdev=" + l + " ejectionThreshold=" + c);
        for (let [u, d] of this.entryMap.entries()) {
          if (this.getCurrentEjectionPercent() >= this.latestConfig.getMaxEjectionPercent()) {
            break;
          }
          let p = d.counter.getLastSuccesses();
          let m = d.counter.getLastFailures();
          if (p + m < n) {
            continue;
          }
          let f = p / (p + m);
          if (X1("Checking candidate " + u + " successRate=" + f), f < c) {
            let h = Math.random() * 100;
            if (X1("Candidate " + u + " randomNumber=" + h + " enforcement_percentage=" + t.enforcement_percentage), h < t.enforcement_percentage) {
              X1("Ejecting candidate " + u);
              this.eject(d, e);
            }
          }
        }
      }
      runFailurePercentageCheck(e) {
        if (!this.latestConfig) {
          return;
        }
        let t = this.latestConfig.getFailurePercentageEjectionConfig();
        if (!t) {
          return;
        }
        X1("Running failure percentage check. threshold=" + t.threshold + " request volume threshold=" + t.request_volume);
        let n = 0;
        for (let r of this.entryMap.values()) {
          let o = r.counter.getLastSuccesses();
          let s = r.counter.getLastFailures();
          if (o + s >= t.request_volume) {
            n += 1;
          }
        }
        if (n < t.minimum_hosts) {
          return;
        }
        for (let [r, o] of this.entryMap.entries()) {
          if (this.getCurrentEjectionPercent() >= this.latestConfig.getMaxEjectionPercent()) {
            break;
          }
          let s = o.counter.getLastSuccesses();
          let i = o.counter.getLastFailures();
          if (X1("Candidate successes=" + s + " failures=" + i), s + i < t.request_volume) {
            continue;
          }
          if (i * 100 / (i + s) > t.threshold) {
            let l = Math.random() * 100;
            if (X1("Candidate " + r + " randomNumber=" + l + " enforcement_percentage=" + t.enforcement_percentage), l < t.enforcement_percentage) {
              X1("Ejecting candidate " + r);
              this.eject(o, e);
            }
          }
        }
      }
      eject(e, t) {
        e.currentEjectionTimestamp = new Date();
        e.ejectionTimeMultiplier += 1;
        for (let n of e.subchannelWrappers) {
          n.eject();
        }
      }
      uneject(e) {
        e.currentEjectionTimestamp = null;
        for (let t of e.subchannelWrappers) {
          t.uneject();
        }
      }
      switchAllBuckets() {
        for (let e of this.entryMap.values()) {
          e.counter.switchBuckets();
        }
      }
      startTimer(e) {
        var t;
        var n;
        this.ejectionTimer = setTimeout(() => this.runChecks(), e);
        (n = (t = this.ejectionTimer).unref) === null || n === undefined || n.call(t);
      }
      runChecks() {
        let e = new Date();
        if (X1("Ejection timer running"), this.switchAllBuckets(), !this.latestConfig) {
          return;
        }
        this.timerStartTime = e;
        this.startTimer(this.latestConfig.getIntervalMs());
        this.runSuccessRateCheck(e);
        this.runFailurePercentageCheck(e);
        for (let [t, n] of this.entryMap.entries()) {
          if (n.currentEjectionTimestamp === null) {
            if (n.ejectionTimeMultiplier > 0) {
              n.ejectionTimeMultiplier -= 1;
            }
          } else {
            let r = this.latestConfig.getBaseEjectionTimeMs();
            let o = this.latestConfig.getMaxEjectionTimeMs();
            let s = new Date(n.currentEjectionTimestamp.getTime());
            if (s.setMilliseconds(s.getMilliseconds() + Math.min(r * n.ejectionTimeMultiplier, Math.max(r, o))), s < new Date()) {
              X1("Unejecting " + t);
              this.uneject(n);
            }
          }
        }
      }
      updateAddressList(e, t, n, r) {
        if (!(t instanceof UVt)) {
          return false;
        }
        if (X1("Received update with config: " + JSON.stringify(t.toJsonObject(), undefined, 2)), e.ok) {
          for (let s of e.value) {
            if (!this.entryMap.vZc(s)) {
              X1("Adding map entry for " + (0, _Ao.endpointToString)(s));
              this.entryMap.set(s, {
                counter: new Znl(),
                currentEjectionTimestamp: null,
                ejectionTimeMultiplier: 0,
                subchannelWrappers: []
              });
            }
          }
          this.entryMap.deleteMissing(e.value);
        }
        let o = t.getChildPolicy();
        if (this.childBalancer.updateAddressList(e, o, n, r), t.getSuccessRateEjectionConfig() || t.getFailurePercentageEjectionConfig()) {
          if (this.timerStartTime) {
            X1("Previous timer existed. Replacing timer");
            clearTimeout(this.ejectionTimer);
            let s = t.getIntervalMs() - (new Date().getTime() - this.timerStartTime.getTime());
            this.startTimer(s);
          } else {
            X1("Starting new timer");
            this.timerStartTime = new Date();
            this.startTimer(t.getIntervalMs());
            this.switchAllBuckets();
          }
        } else {
          X1("Counting disabled. Cancelling timer.");
          this.timerStartTime = null;
          clearTimeout(this.ejectionTimer);
          for (let s of this.entryMap.values()) {
            this.uneject(s);
            s.ejectionTimeMultiplier = 0;
          }
        }
        this.latestConfig = t;
        return true;
      }
      exitIdle() {
        this.childBalancer.exitIdle();
      }
      resetBackoff() {
        this.childBalancer.resetBackoff();
      }
      destroy() {
        clearTimeout(this.ejectionTimer);
        this.childBalancer.destroy();
      }
      getTypeName() {
        return "outlier_detection";
      }
    }
    kVe.OutlierDetectionLoadBalancer = EAo;
    function hsm() {
      if (psm) {
        (0, Xnl.registerLoadBalancerType)("outlier_detection", EAo, UVt);
      }
    }
  });
  var rrl = __commonJS(Xzn => {
    Object.defineProperty(Xzn, "__esModule", {
      value: true
    });
    Xzn.PriorityQueue = undefined;
    var vAo = e => Math.floor(e / 2);
    var Jzn = e => e * 2 + 1;
    var BVt = e => e * 2 + 2;
    class nrl {
      constructor(e = (t, n) => t > n) {
        this.comparator = e;
        this.heap = [];
      }
      size() {
        return this.heap.length;
      }
      isEmpty() {
        return this.size() == 0;
      }
      peek() {
        return this.heap[0];
      }
      push(...e) {
        e.forEach(t => {
          this.heap.push(t);
          this.siftUp();
        });
        return this.size();
      }
      pop() {
        let e = this.peek();
        let t = this.size() - 1;
        if (t > 0) {
          this.swap(0, t);
        }
        this.heap.pop();
        this.siftDown();
        return e;
      }
      replace(e) {
        let t = this.peek();
        this.heap[0] = e;
        this.siftDown();
        return t;
      }
      greater(e, t) {
        return this.comparator(this.heap[e], this.heap[t]);
      }
      swap(e, t) {
        [this.heap[e], this.heap[t]] = [this.heap[t], this.heap[e]];
      }
      siftUp() {
        let e = this.size() - 1;
        while (e > 0 && this.greater(e, vAo(e))) {
          this.swap(e, vAo(e));
          e = vAo(e);
        }
      }
      siftDown() {
        let e = 0;
        while (Jzn(e) < this.size() && this.greater(Jzn(e), e) || BVt(e) < this.size() && this.greater(BVt(e), e)) {
          let t = BVt(e) < this.size() && this.greater(BVt(e), Jzn(e)) ? BVt(e) : Jzn(e);
          this.swap(e, t);
          e = t;
        }
      }
    }
    Xzn.PriorityQueue = nrl;
  });
  var url = __commonJS(HVt => {
    Object.defineProperty(HVt, "__esModule", {
      value: true
    });
    HVt.WeightedRoundRobinLoadBalancingConfig = undefined;
    HVt.setup = Rsm;
    var Q1 = T3();
    var gsm = th();
    var Cz = PVt();
    var irl = a1e();
    var ysm = MVt();
    var _sm = Av();
    var arl = Fzn();
    var Qyt = YEe();
    var bsm = rrl();
    var orl = L9();
    function wAo(e) {
      _sm.trace(gsm.LogVerbosity.DEBUG, "weighted_round_robin", e);
    }
    function srl(e, t, n) {
      if (t in e && e[t] !== undefined && typeof e[t] !== n) {
        throw Error(`weighted round robin config ${t} parse error: expected ${n}, got ${typeof e[t]}`);
      }
    }
    function Qzn(e, t) {
      if (t in e && e[t] !== undefined && e[t] !== null) {
        let n;
        if ((0, Cz.isDuration)(e[t])) {
          n = e[t];
        } else if ((0, Cz.isDurationMessage)(e[t])) {
          n = (0, Cz.durationMessageToDuration)(e[t]);
        } else if (typeof e[t] === "string") {
          let r = (0, Cz.parseDuration)(e[t]);
          if (!r) {
            throw Error(`weighted round robin config ${t}: failed to parse duration string ${e[t]}`);
          }
          n = r;
        } else {
          throw Error(`weighted round robin config ${t}: expected duration, got ${typeof e[t]}`);
        }
        return (0, Cz.durationToMs)(n);
      }
      return null;
    }
    class $Vt {
      constructor(e, t, n, r, o, s) {
        this.enableOobLoadReport = e !== null && e !== undefined ? e : false;
        this.oobLoadReportingPeriodMs = t !== null && t !== undefined ? t : 1e4;
        this.blackoutPeriodMs = n !== null && n !== undefined ? n : 1e4;
        this.weightExpirationPeriodMs = r !== null && r !== undefined ? r : 180000;
        this.weightUpdatePeriodMs = Math.max(o !== null && o !== undefined ? o : 1000, 100);
        this.errorUtilizationPenalty = s !== null && s !== undefined ? s : 1;
      }
      getLoadBalancerName() {
        return "weighted_round_robin";
      }
      toJsonObject() {
        return {
          enable_oob_load_report: this.enableOobLoadReport,
          oob_load_reporting_period: (0, Cz.durationToString)((0, Cz.msToDuration)(this.oobLoadReportingPeriodMs)),
          blackout_period: (0, Cz.durationToString)((0, Cz.msToDuration)(this.blackoutPeriodMs)),
          weight_expiration_period: (0, Cz.durationToString)((0, Cz.msToDuration)(this.weightExpirationPeriodMs)),
          weight_update_period: (0, Cz.durationToString)((0, Cz.msToDuration)(this.weightUpdatePeriodMs)),
          error_utilization_penalty: this.errorUtilizationPenalty
        };
      }
      static createFromJson(e) {
        if (srl(e, "enable_oob_load_report", "boolean"), srl(e, "error_utilization_penalty", "number"), e.error_utilization_penalty < 0) {
          throw Error("weighted round robin config error_utilization_penalty < 0");
        }
        return new $Vt(e.enable_oob_load_report, Qzn(e, "oob_load_reporting_period"), Qzn(e, "blackout_period"), Qzn(e, "weight_expiration_period"), Qzn(e, "weight_update_period"), e.error_utilization_penalty);
      }
      getEnableOobLoadReport() {
        return this.enableOobLoadReport;
      }
      getOobLoadReportingPeriodMs() {
        return this.oobLoadReportingPeriodMs;
      }
      getBlackoutPeriodMs() {
        return this.blackoutPeriodMs;
      }
      getWeightExpirationPeriodMs() {
        return this.weightExpirationPeriodMs;
      }
      getWeightUpdatePeriodMs() {
        return this.weightUpdatePeriodMs;
      }
      getErrorUtilizationPenalty() {
        return this.errorUtilizationPenalty;
      }
    }
    HVt.WeightedRoundRobinLoadBalancingConfig = $Vt;
    class lrl {
      constructor(e, t) {
        this.metricsHandler = t;
        this.queue = new bsm.PriorityQueue((o, s) => o.deadline < s.deadline);
        let n = e.filter(o => o.weight > 0);
        let r;
        if (n.length < 2) {
          r = 1;
        } else {
          let o = 0;
          for (let {
            weight: s
          } of n) {
            o += s;
          }
          r = o / n.length;
        }
        for (let o of e) {
          let s = o.weight > 0 ? 1 / o.weight : r;
          this.queue.push({
            endpointName: o.endpointName,
            picker: o.picker,
            period: s,
            deadline: Math.random() * s
          });
        }
      }
      pick(e) {
        let t = this.queue.pop();
        this.queue.push(Object.assign(Object.assign({}, t), {
          deadline: t.deadline + t.period
        }));
        let n = t.picker.pick(e);
        if (n.pickResultType === Qyt.PickResultType.COMPLETE) {
          if (this.metricsHandler) {
            return Object.assign(Object.assign({}, n), {
              onCallEnded: (0, arl.createMetricsReader)(r => this.metricsHandler(r, t.endpointName), n.onCallEnded)
            });
          } else {
            let r = n.subchannel;
            return Object.assign(Object.assign({}, n), {
              subchannel: r.getWrappedSubchannel()
            });
          }
        } else {
          return n;
        }
      }
    }
    class crl {
      constructor(e) {
        this.channelControlHelper = e;
        this.latestConfig = null;
        this.children = new Map();
        this.currentState = Q1.ConnectivityState.IDLE;
        this.updatesPaused = false;
        this.lastError = null;
        this.weightUpdateTimer = null;
      }
      countChildrenWithState(e) {
        let t = 0;
        for (let n of this.children.values()) {
          if (n.child.getConnectivityState() === e) {
            t += 1;
          }
        }
        return t;
      }
      updateWeight(e, t) {
        var n;
        var r;
        let {
          rps_fractional: o,
          application_utilization: s
        } = t;
        if (s > 0 && o > 0) {
          s += t.eps / o * ((r = (n = this.latestConfig) === null || n === undefined ? undefined : n.getErrorUtilizationPenalty()) !== null && r !== undefined ? r : 0);
        }
        let i = s === 0 ? 0 : o / s;
        if (i === 0) {
          return;
        }
        let a = new Date();
        if (e.nonEmptySince === null) {
          e.nonEmptySince = a;
        }
        e.lastUpdated = a;
        e.weight = i;
      }
      getWeight(e) {
        if (!this.latestConfig) {
          return 0;
        }
        let t = new Date().getTime();
        if (t - e.lastUpdated.getTime() >= this.latestConfig.getWeightExpirationPeriodMs()) {
          e.nonEmptySince = null;
          return 0;
        }
        let n = this.latestConfig.getBlackoutPeriodMs();
        if (n > 0 && (e.nonEmptySince === null || t - e.nonEmptySince.getTime() < n)) {
          return 0;
        }
        return e.weight;
      }
      calculateAndUpdateState() {
        if (this.updatesPaused || !this.latestConfig) {
          return;
        }
        if (this.countChildrenWithState(Q1.ConnectivityState.READY) > 0) {
          let e = [];
          for (let [n, r] of this.children) {
            if (r.child.getConnectivityState() !== Q1.ConnectivityState.READY) {
              continue;
            }
            e.push({
              endpointName: n,
              picker: r.child.getPicker(),
              weight: this.getWeight(r)
            });
          }
          wAo("Created picker with weights: " + e.map(n => n.endpointName + ":" + n.weight).join(","));
          let t;
          if (!this.latestConfig.getEnableOobLoadReport()) {
            t = (n, r) => {
              let o = this.children.get(r);
              if (o) {
                this.updateWeight(o, n);
              }
            };
          } else {
            t = null;
          }
          this.updateState(Q1.ConnectivityState.READY, new lrl(e, t), null);
        } else if (this.countChildrenWithState(Q1.ConnectivityState.CONNECTING) > 0) {
          this.updateState(Q1.ConnectivityState.CONNECTING, new Qyt.QueuePicker(this), null);
        } else if (this.countChildrenWithState(Q1.ConnectivityState.TRANSIENT_FAILURE) > 0) {
          let e = `weighted_round_robin: No connection established. Last error: ${this.lastError}`;
          this.updateState(Q1.ConnectivityState.TRANSIENT_FAILURE, new Qyt.UnavailablePicker({
            details: e
          }), e);
        } else {
          this.updateState(Q1.ConnectivityState.IDLE, new Qyt.QueuePicker(this), null);
        }
        for (let {
          child: e
        } of this.children.values()) {
          if (e.getConnectivityState() === Q1.ConnectivityState.IDLE) {
            e.exitIdle();
          }
        }
      }
      updateState(e, t, n) {
        wAo(Q1.ConnectivityState[this.currentState] + " -> " + Q1.ConnectivityState[e]);
        this.currentState = e;
        this.channelControlHelper.updateState(e, t, n);
      }
      updateAddressList(e, t, n, r) {
        var o;
        var s;
        if (!(t instanceof $Vt)) {
          return false;
        }
        if (!e.ok) {
          if (this.children.size === 0) {
            this.updateState(Q1.ConnectivityState.TRANSIENT_FAILURE, new Qyt.UnavailablePicker(e.error), e.error.details);
          }
          return true;
        }
        if (e.value.length === 0) {
          let l = `No addresses resolved. Resolution note: ${r}`;
          this.updateState(Q1.ConnectivityState.TRANSIENT_FAILURE, new Qyt.UnavailablePicker({
            details: l
          }), l);
          return false;
        }
        wAo("Connect to endpoint list " + e.value.map(orl.endpointToString));
        let i = new Date();
        let a = new Set();
        this.updatesPaused = true;
        this.latestConfig = t;
        for (let l of e.value) {
          let c = (0, orl.endpointToString)(l);
          a.add(c);
          let u = this.children.get(c);
          if (!u) {
            u = {
              child: new ysm.LeafLoadBalancer(l, (0, irl.createChildChannelControlHelper)(this.channelControlHelper, {
                updateState: (d, p, m) => {
                  if (this.currentState === Q1.ConnectivityState.READY && d !== Q1.ConnectivityState.READY) {
                    this.channelControlHelper.requestReresolution();
                  }
                  if (d === Q1.ConnectivityState.READY) {
                    u.nonEmptySince = null;
                  }
                  if (m) {
                    this.lastError = m;
                  }
                  this.calculateAndUpdateState();
                },
                createSubchannel: (d, p) => {
                  let m = this.channelControlHelper.createSubchannel(d, p);
                  if (u === null || u === undefined ? undefined : u.oobMetricsListener) {
                    return new arl.OrcaOobMetricsSubchannelWrapper(m, u.oobMetricsListener, this.latestConfig.getOobLoadReportingPeriodMs());
                  } else {
                    return m;
                  }
                }
              }), n, r),
              lastUpdated: i,
              nonEmptySince: null,
              weight: 0,
              oobMetricsListener: null
            };
            this.children.set(c, u);
          }
          if (t.getEnableOobLoadReport()) {
            u.oobMetricsListener = d => {
              this.updateWeight(u, d);
            };
          } else {
            u.oobMetricsListener = null;
          }
        }
        for (let [l, c] of this.children) {
          if (a.vZc(l)) {
            c.child.startConnecting();
          } else {
            c.child.destroy();
            this.children.delete(l);
          }
        }
        if (this.updatesPaused = false, this.calculateAndUpdateState(), this.weightUpdateTimer) {
          clearInterval(this.weightUpdateTimer);
        }
        this.weightUpdateTimer = (s = (o = setInterval(() => {
          if (this.currentState === Q1.ConnectivityState.READY) {
            this.calculateAndUpdateState();
          }
        }, t.getWeightUpdatePeriodMs())).unref) === null || s === undefined ? undefined : s.call(o);
        return true;
      }
      exitIdle() {}
      resetBackoff() {}
      destroy() {
        for (let e of this.children.values()) {
          e.child.destroy();
        }
        if (this.children.clear(), this.weightUpdateTimer) {
          clearInterval(this.weightUpdateTimer);
        }
      }
      getTypeName() {
        return "weighted_round_robin";
      }
    }
    function Rsm() {
      (0, irl.registerLoadBalancerType)("weighted_round_robin", crl, $Vt);
    }
  });
  var jVt = __commonJS(rl => {
    Object.defineProperty(rl, "__esModule", {
      value: true
    });
    rl.experimental = rl.ServerMetricRecorder = rl.ServerInterceptingCall = rl.ResponderBuilder = rl.ServerListenerBuilder = rl.addAdminServicesToServer = rl.getChannelzHandlers = rl.getChannelzServiceDefinition = rl.InterceptorConfigurationError = rl.InterceptingCall = rl.RequesterBuilder = rl.ListenerBuilder = rl.StatusBuilder = rl.getClientChannel = rl.ServerCredentials = rl.Server = rl.setLogVerbosity = rl.setLogger = rl.load = rl.loadObject = rl.CallCredentials = rl.ChannelCredentials = rl.waitForClientReady = rl.closeClient = rl.Channel = rl.makeGenericClientConstructor = rl.makeClientConstructor = rl.loadPackageDefinition = rl.Client = rl.compressionAlgorithms = rl.propagate = rl.connectivityState = rl.status = rl.logVerbosity = rl.Metadata = rl.credentials = undefined;
    var Zzn = fVn();
    Object.defineProperty(rl, "CallCredentials", {
      enumerable: true,
      get: function () {
        return Zzn.CallCredentials;
      }
    });
    var xsm = Sxo();
    Object.defineProperty(rl, "Channel", {
      enumerable: true,
      get: function () {
        return xsm.ChannelImplementation;
      }
    });
    var ksm = bko();
    Object.defineProperty(rl, "compressionAlgorithms", {
      enumerable: true,
      get: function () {
        return ksm.CompressionAlgorithms;
      }
    });
    var Asm = T3();
    Object.defineProperty(rl, "connectivityState", {
      enumerable: true,
      get: function () {
        return Asm.ConnectivityState;
      }
    });
    var eKn = Syt();
    Object.defineProperty(rl, "ChannelCredentials", {
      enumerable: true,
      get: function () {
        return eKn.ChannelCredentials;
      }
    });
    var drl = bxo();
    Object.defineProperty(rl, "Client", {
      enumerable: true,
      get: function () {
        return drl.Client;
      }
    });
    var RAo = th();
    Object.defineProperty(rl, "logVerbosity", {
      enumerable: true,
      get: function () {
        return RAo.LogVerbosity;
      }
    });
    Object.defineProperty(rl, "status", {
      enumerable: true,
      get: function () {
        return RAo.Status;
      }
    });
    Object.defineProperty(rl, "propagate", {
      enumerable: true,
      get: function () {
        return RAo.Propagate;
      }
    });
    var prl = Av();
    var xAo = DVn();
    Object.defineProperty(rl, "loadPackageDefinition", {
      enumerable: true,
      get: function () {
        return xAo.loadPackageDefinition;
      }
    });
    Object.defineProperty(rl, "makeClientConstructor", {
      enumerable: true,
      get: function () {
        return xAo.makeClientConstructor;
      }
    });
    Object.defineProperty(rl, "makeGenericClientConstructor", {
      enumerable: true,
      get: function () {
        return xAo.makeClientConstructor;
      }
    });
    var Ism = K1();
    Object.defineProperty(rl, "Metadata", {
      enumerable: true,
      get: function () {
        return Ism.Metadata;
      }
    });
    var Psm = Snl();
    Object.defineProperty(rl, "Server", {
      enumerable: true,
      get: function () {
        return Psm.Server;
      }
    });
    var Osm = Nzn();
    Object.defineProperty(rl, "ServerCredentials", {
      enumerable: true,
      get: function () {
        return Osm.ServerCredentials;
      }
    });
    var Dsm = Enl();
    Object.defineProperty(rl, "StatusBuilder", {
      enumerable: true,
      get: function () {
        return Dsm.StatusBuilder;
      }
    });
    rl.credentials = {
      combineChannelCredentials: (e, ...t) => t.reduce((n, r) => n.compose(r), e),
      combineCallCredentials: (e, ...t) => t.reduce((n, r) => n.compose(r), e),
      createInsecure: eKn.ChannelCredentials.createInsecure,
      createSsl: eKn.ChannelCredentials.createSsl,
      createFromSecureContext: eKn.ChannelCredentials.createFromSecureContext,
      createFromMetadataGenerator: Zzn.CallCredentials.createFromMetadataGenerator,
      createFromGoogleCredential: Zzn.CallCredentials.createFromGoogleCredential,
      createEmpty: Zzn.CallCredentials.createEmpty
    };
    var Msm = e => e.close();
    rl.closeClient = Msm;
    var Nsm = (e, t, n) => e.waitForReady(t, n);
    rl.waitForClientReady = Nsm;
    var Lsm = (e, t) => {
      throw Error("Not available in this library. Use @grpc/proto-loader and loadPackageDefinition instead");
    };
    rl.loadObject = Lsm;
    var Fsm = (e, t, n) => {
      throw Error("Not available in this library. Use @grpc/proto-loader and loadPackageDefinition instead");
    };
    rl.load = Fsm;
    var Usm = e => {
      prl.setLogger(e);
    };
    rl.setLogger = Usm;
    var Bsm = e => {
      prl.setLoggerVerbosity(e);
    };
    rl.setLogVerbosity = Bsm;
    var $sm = e => drl.Client.prototype.getChannel.call(e);
    rl.getClientChannel = $sm;
    var tKn = yxo();
    Object.defineProperty(rl, "ListenerBuilder", {
      enumerable: true,
      get: function () {
        return tKn.ListenerBuilder;
      }
    });
    Object.defineProperty(rl, "RequesterBuilder", {
      enumerable: true,
      get: function () {
        return tKn.RequesterBuilder;
      }
    });
    Object.defineProperty(rl, "InterceptingCall", {
      enumerable: true,
      get: function () {
        return tKn.InterceptingCall;
      }
    });
    Object.defineProperty(rl, "InterceptorConfigurationError", {
      enumerable: true,
      get: function () {
        return tKn.InterceptorConfigurationError;
      }
    });
    var mrl = h1e();
    Object.defineProperty(rl, "getChannelzServiceDefinition", {
      enumerable: true,
      get: function () {
        return mrl.getChannelzServiceDefinition;
      }
    });
    Object.defineProperty(rl, "getChannelzHandlers", {
      enumerable: true,
      get: function () {
        return mrl.getChannelzHandlers;
      }
    });
    var Hsm = AVn();
    Object.defineProperty(rl, "addAdminServicesToServer", {
      enumerable: true,
      get: function () {
        return Hsm.addAdminServicesToServer;
      }
    });
    var kAo = tAo();
    Object.defineProperty(rl, "ServerListenerBuilder", {
      enumerable: true,
      get: function () {
        return kAo.ServerListenerBuilder;
      }
    });
    Object.defineProperty(rl, "ResponderBuilder", {
      enumerable: true,
      get: function () {
        return kAo.ResponderBuilder;
      }
    });
    Object.defineProperty(rl, "ServerInterceptingCall", {
      enumerable: true,
      get: function () {
        return kAo.ServerInterceptingCall;
      }
    });
    var jsm = Fzn();
    Object.defineProperty(rl, "ServerMetricRecorder", {
      enumerable: true,
      get: function () {
        return jsm.ServerMetricRecorder;
      }
    });
    var qsm = cAo();
    rl.experimental = qsm;
    var Wsm = Pko();
    var Gsm = Unl();
    var Vsm = Wnl();
    var zsm = MVt();
    var Ksm = Ynl();
    var Ysm = trl();
    var Jsm = url();
    var Xsm = h1e();
    (() => {
      Wsm.setup();
      Gsm.setup();
      Vsm.setup();
      zsm.setup();
      Ksm.setup();
      Ysm.setup();
      Jsm.setup();
      Xsm.setup();
    })();
  });
  var frl = __commonJS(nKn => {
    Object.defineProperty(nKn, "__esModule", {
      value: true
    });
    nKn.createServiceClientConstructor = undefined;
    var Qsm = jVt();
    function Zsm(e, t) {
      let n = {
        export: {
          path: e,
          requestStream: false,
          responseStream: false,
          requestSerialize: r => r,
          requestDeserialize: r => r,
          responseSerialize: r => r,
          responseDeserialize: r => r
        }
      };
      return Qsm.makeGenericClientConstructor(n, t);
    }
    nKn.createServiceClientConstructor = Zsm;
  });
  var qVt = __commonJS($Q => {
    Object.defineProperty($Q, "__esModule", {
      value: true
    });
    $Q.createOtlpGrpcExporterTransport = $Q.GrpcExporterTransport = $Q.createEmptyMetadata = $Q.createSslCredentials = $Q.createInsecureCredentials = undefined;
    var eim = NXa();
    var hrl = `OTel-OTLP-Exporter-JavaScript/${eim.VERSION}`;
    function tim(e) {
      if (e) {
        return `${e} ${hrl}`;
      }
      return hrl;
    }
    function oim(e) {
      return e === "gzip" ? 2 : 0;
    }
    function sim() {
      let {
        credentials: e
      } = jVt();
      return e.createInsecure();
    }
    $Q.createInsecureCredentials = sim;
    function iim(e, t, n) {
      let {
        credentials: r
      } = jVt();
      return r.createSsl(e, t, n);
    }
    $Q.createSslCredentials = iim;
    function aim() {
      let {
        Metadata: e
      } = jVt();
      return new e();
    }
    $Q.createEmptyMetadata = aim;
    class AAo {
      _parameters;
      _client;
      _metadata;
      constructor(e) {
        this._parameters = e;
      }
      shutdown() {
        this._client?.close();
      }
      send(e, t) {
        let n = Buffer.from(e);
        if (this._client == null) {
          let {
            createServiceClientConstructor: r
          } = frl();
          try {
            this._metadata = this._parameters.metadata();
          } catch (s) {
            return Promise.resolve({
              status: "failure",
              error: s
            });
          }
          let o = r(this._parameters.grpcPath, this._parameters.grpcName);
          try {
            this._client = new o(this._parameters.address, this._parameters.credentials(), {
              "grpc.default_compression_algorithm": oim(this._parameters.compression),
              "grpc.primary_user_agent": tim(this._parameters.userAgent)
            });
          } catch (s) {
            return Promise.resolve({
              status: "failure",
              error: s
            });
          }
        }
        return new Promise(r => {
          let o = Date.now() + t;
          if (this._metadata == null) {
            return r({
              error: Error("metadata was null"),
              status: "failure"
            });
          }
          this._client.export(n, this._metadata, {
            deadline: o
          }, (s, i) => {
            if (s) {
              r({
                status: "failure",
                error: s
              });
            } else {
              r({
                data: i,
                status: "success"
              });
            }
          });
        });
      }
    }
    $Q.GrpcExporterTransport = AAo;
    function lim(e) {
      return new AAo(e);
    }
    $Q.createOtlpGrpcExporterTransport = lim;
  });
  var Srl = __commonJS(v1e => {
    Object.defineProperty(v1e, "__esModule", {
      value: true
    });
    v1e.getOtlpGrpcDefaultConfiguration = v1e.mergeOtlpGrpcConfigurationWithDefaults = v1e.validateAndNormalizeUrl = undefined;
    var _rl = qpe();
    var WVt = qVt();
    var cim = require("url");
    var grl = Ji();
    function brl(e) {
      if (e = e.trim(), !e.match(/^([\w]{1,8}):\/\//)) {
        e = `https://${e}`;
      }
      let n = new cim.URL(e);
      if (n.protocol === "unix:") {
        return e;
      }
      if (n.pathname && n.pathname !== "/") {
        grl.diag.warn("URL path should not be set when using grpc, the path part of the URL will be ignored.");
      }
      if (n.protocol !== "" && !n.protocol?.match(/^(http)s?:$/)) {
        grl.diag.warn("URL protocol should be http(s)://. Using http://.");
      }
      return n.host;
    }
    v1e.validateAndNormalizeUrl = brl;
    function yrl(e, t) {
      for (let [n, r] of Object.entries(t.getMap())) {
        if (e.get(n).length < 1) {
          e.set(n, r);
        }
      }
    }
    function uim(e, t, n) {
      let r = e.url ?? t.url ?? n.url;
      return {
        ...(0, _rl.mergeOtlpSharedConfigurationWithDefaults)(e, t, n),
        metadata: () => {
          let o = n.metadata();
          yrl(o, e.metadata?.().clone() ?? (0, WVt.createEmptyMetadata)());
          yrl(o, t.metadata?.() ?? (0, WVt.createEmptyMetadata)());
          return o;
        },
        url: brl(r),
        credentials: e.credentials ?? t.credentials?.(r) ?? n.credentials(r),
        userAgent: e.userAgent
      };
    }
    v1e.mergeOtlpGrpcConfigurationWithDefaults = uim;
    function dim() {
      return {
        ...(0, _rl.getSharedConfigurationDefaults)(),
        metadata: () => (0, WVt.createEmptyMetadata)(),
        url: "http://localhost:4317",
        credentials: e => {
          if (e.startsWith("http://")) {
            return () => (0, WVt.createInsecureCredentials)();
          } else {
            return () => (0, WVt.createSslCredentials)();
          }
        }
      };
    }
    v1e.getOtlpGrpcDefaultConfiguration = dim;
  });
  var Crl = __commonJS(rKn => {
    Object.defineProperty(rKn, "__esModule", {
      value: true
    });