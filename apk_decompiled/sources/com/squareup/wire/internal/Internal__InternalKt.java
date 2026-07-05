package com.squareup.wire.internal;

import com.anthropic.claude.api.experience.ExperienceToggle;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoReader32;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.bsg;
import defpackage.bz7;
import defpackage.grc;
import defpackage.ij0;
import defpackage.iv1;
import defpackage.jce;
import defpackage.lm6;
import defpackage.lz5;
import defpackage.m08;
import defpackage.mdj;
import defpackage.mr9;
import defpackage.nm6;
import defpackage.pl9;
import defpackage.sq6;
import defpackage.tta;
import defpackage.unk;
import defpackage.w44;
import defpackage.x44;
import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000Î\u0001\n\u0000\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0016\n\u0002\b\u0006\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0010\u0013\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0019\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a%\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006\"\u0004\b\u0000\u0010\u0004\"\u0004\b\u0001\u0010\u0005¢\u0006\u0004\b\u0007\u0010\b\u001a3\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\n\u001a\u00020\t2\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000bH\u0007¢\u0006\u0004\b\r\u0010\u000e\u001a'\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b¢\u0006\u0004\b\r\u0010\u000f\u001aE\u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006\"\u0004\b\u0000\u0010\u0004\"\u0004\b\u0001\u0010\u00052\u0006\u0010\n\u001a\u00020\t2\u0014\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0010H\u0007¢\u0006\u0004\b\r\u0010\u0012\u001a9\u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006\"\u0004\b\u0000\u0010\u0004\"\u0004\b\u0001\u0010\u00052\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0010¢\u0006\u0004\b\r\u0010\u0013\u001a/\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\"\u0004\b\u0000\u0010\u00002\u0006\u0010\n\u001a\u00020\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b¢\u0006\u0004\b\u0014\u0010\u000e\u001aA\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0010\"\u0004\b\u0000\u0010\u0004\"\u0004\b\u0001\u0010\u00052\u0006\u0010\n\u001a\u00020\t2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0010¢\u0006\u0004\b\u0014\u0010\u0012\u001aA\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0010\"\u0004\b\u0000\u0010\u0004\"\u0004\b\u0001\u0010\u00052\u0006\u0010\n\u001a\u00020\t2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0010¢\u0006\u0004\b\u0015\u0010\u0012\u001a#\u0010\u0017\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00028\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a3\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u000b2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u0019H\u0007¢\u0006\u0004\b\u001b\u0010\u001c\u001aE\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0010\"\u0004\b\u0000\u0010\u0004\"\u0004\b\u0001\u0010\u0005*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00102\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00010\u0019H\u0007¢\u0006\u0004\b\u001b\u0010\u001e\u001a!\u0010#\u001a\u00020\"2\b\u0010 \u001a\u0004\u0018\u00010\u001f2\b\u0010!\u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b#\u0010$\u001a)\u0010)\u001a\u00060'j\u0002`(2\u0016\u0010&\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u001f0%\"\u0004\u0018\u00010\u001f¢\u0006\u0004\b)\u0010*\u001a\u0019\u0010,\u001a\u00020+2\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u000b¢\u0006\u0004\b,\u0010-\u001a\u001d\u0010,\u001a\u00020+2\u000e\u0010\u0011\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0010¢\u0006\u0004\b,\u0010.\u001a!\u00100\u001a\u00020/2\b\u0010 \u001a\u0004\u0018\u00010\u001f2\b\u0010!\u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b0\u00101\u001a+\u00100\u001a\u00020/2\b\u0010 \u001a\u0004\u0018\u00010\u001f2\b\u0010!\u001a\u0004\u0018\u00010\u001f2\b\u00102\u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b0\u00103\u001aM\u00100\u001a\u00020/2\b\u0010 \u001a\u0004\u0018\u00010\u001f2\b\u0010!\u001a\u0004\u0018\u00010\u001f2\b\u00102\u001a\u0004\u0018\u00010\u001f2\b\u00104\u001a\u0004\u0018\u00010\u001f2\u0016\u00105\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u001f0%\"\u0004\u0018\u00010\u001f¢\u0006\u0004\b0\u00106\u001a\u0015\u00107\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\t¢\u0006\u0004\b7\u00108\u001a\u001b\u00107\u001a\u00020\t2\f\u00109\u001a\b\u0012\u0004\u0012\u00020\t0\u000b¢\u0006\u0004\b7\u0010:\u001a\u0015\u0010<\u001a\u00020\t2\u0006\u0010;\u001a\u00020\t¢\u0006\u0004\b<\u00108\u001a\u001d\u0010>\u001a\u00020\t2\u0006\u0010;\u001a\u00020\t2\u0006\u0010=\u001a\u00020\t¢\u0006\u0004\b>\u0010?\u001a\u0015\u0010@\u001a\u00020\t2\u0006\u0010;\u001a\u00020\t¢\u0006\u0004\b@\u00108\u001a%\u0010F\u001a\u00020+2\u0006\u0010B\u001a\u00020A2\u0006\u0010D\u001a\u00020C2\u0006\u0010E\u001a\u00020/¢\u0006\u0004\bF\u0010G\u001a%\u0010H\u001a\u00020+2\u0006\u0010B\u001a\u00020A2\u0006\u0010D\u001a\u00020C2\u0006\u0010E\u001a\u00020/¢\u0006\u0004\bH\u0010G\u001a%\u0010I\u001a\u00020+2\u0006\u0010B\u001a\u00020A2\u0006\u0010D\u001a\u00020C2\u0006\u0010E\u001a\u00020/¢\u0006\u0004\bI\u0010G\u001a%\u0010J\u001a\u00020+2\u0006\u0010B\u001a\u00020A2\u0006\u0010D\u001a\u00020C2\u0006\u0010E\u001a\u00020/¢\u0006\u0004\bJ\u0010G\u001a%\u0010K\u001a\u00020+2\u0006\u0010B\u001a\u00020A2\u0006\u0010D\u001a\u00020C2\u0006\u0010E\u001a\u00020/¢\u0006\u0004\bK\u0010G\u001a%\u0010M\u001a\u00020+2\u0006\u0010B\u001a\u00020L2\u0006\u0010D\u001a\u00020C2\u0006\u0010E\u001a\u00020/¢\u0006\u0004\bM\u0010N\u001a%\u0010O\u001a\u00020+2\u0006\u0010B\u001a\u00020L2\u0006\u0010D\u001a\u00020C2\u0006\u0010E\u001a\u00020/¢\u0006\u0004\bO\u0010N\u001a%\u0010P\u001a\u00020+2\u0006\u0010B\u001a\u00020L2\u0006\u0010D\u001a\u00020C2\u0006\u0010E\u001a\u00020/¢\u0006\u0004\bP\u0010N\u001a%\u0010Q\u001a\u00020+2\u0006\u0010B\u001a\u00020L2\u0006\u0010D\u001a\u00020C2\u0006\u0010E\u001a\u00020/¢\u0006\u0004\bQ\u0010N\u001a%\u0010R\u001a\u00020+2\u0006\u0010B\u001a\u00020L2\u0006\u0010D\u001a\u00020C2\u0006\u0010E\u001a\u00020/¢\u0006\u0004\bR\u0010N\u001a%\u0010T\u001a\u00020+2\u0006\u0010B\u001a\u00020S2\u0006\u0010D\u001a\u00020C2\u0006\u0010E\u001a\u00020/¢\u0006\u0004\bT\u0010U\u001a%\u0010W\u001a\u00020+2\u0006\u0010B\u001a\u00020V2\u0006\u0010D\u001a\u00020C2\u0006\u0010E\u001a\u00020/¢\u0006\u0004\bW\u0010X\u001a\u0015\u0010\\\u001a\u00020[2\u0006\u0010Z\u001a\u00020Y¢\u0006\u0004\b\\\u0010]\u001a\u0015\u0010\\\u001a\u00020[2\u0006\u0010Z\u001a\u00020^¢\u0006\u0004\b\\\u0010_\u001a\u0015\u0010`\u001a\u00020/2\u0006\u0010Z\u001a\u00020Y¢\u0006\u0004\b`\u0010a\u001a\u0015\u0010`\u001a\u00020/2\u0006\u0010Z\u001a\u00020^¢\u0006\u0004\b`\u0010b\u001a\u0015\u0010d\u001a\u00020c2\u0006\u0010Z\u001a\u00020Y¢\u0006\u0004\bd\u0010e\u001a\u0015\u0010d\u001a\u00020c2\u0006\u0010Z\u001a\u00020^¢\u0006\u0004\bd\u0010f\u001a\u0015\u0010h\u001a\u00020g2\u0006\u0010Z\u001a\u00020Y¢\u0006\u0004\bh\u0010i\u001a\u0015\u0010h\u001a\u00020g2\u0006\u0010Z\u001a\u00020^¢\u0006\u0004\bh\u0010j\u001a\u0015\u0010k\u001a\u00020/2\u0006\u0010Z\u001a\u00020Y¢\u0006\u0004\bk\u0010a\u001a\u0015\u0010k\u001a\u00020/2\u0006\u0010Z\u001a\u00020^¢\u0006\u0004\bk\u0010b\u001a\u0015\u0010l\u001a\u00020c2\u0006\u0010Z\u001a\u00020Y¢\u0006\u0004\bl\u0010e\u001a\u0015\u0010l\u001a\u00020c2\u0006\u0010Z\u001a\u00020^¢\u0006\u0004\bl\u0010f\u001a\u0015\u0010m\u001a\u00020/2\u0006\u0010Z\u001a\u00020Y¢\u0006\u0004\bm\u0010a\u001a\u0015\u0010m\u001a\u00020/2\u0006\u0010Z\u001a\u00020^¢\u0006\u0004\bm\u0010b\u001a\u0015\u0010n\u001a\u00020c2\u0006\u0010Z\u001a\u00020Y¢\u0006\u0004\bn\u0010e\u001a\u0015\u0010n\u001a\u00020c2\u0006\u0010Z\u001a\u00020^¢\u0006\u0004\bn\u0010f\u001a\u0015\u0010o\u001a\u00020/2\u0006\u0010Z\u001a\u00020Y¢\u0006\u0004\bo\u0010a\u001a\u0015\u0010o\u001a\u00020/2\u0006\u0010Z\u001a\u00020^¢\u0006\u0004\bo\u0010b\u001a\u0015\u0010p\u001a\u00020c2\u0006\u0010Z\u001a\u00020Y¢\u0006\u0004\bp\u0010e\u001a\u0015\u0010p\u001a\u00020c2\u0006\u0010Z\u001a\u00020^¢\u0006\u0004\bp\u0010f\u001a\u0015\u0010q\u001a\u00020/2\u0006\u0010Z\u001a\u00020Y¢\u0006\u0004\bq\u0010a\u001a\u0015\u0010q\u001a\u00020/2\u0006\u0010Z\u001a\u00020^¢\u0006\u0004\bq\u0010b\u001a\u0015\u0010r\u001a\u00020c2\u0006\u0010Z\u001a\u00020Y¢\u0006\u0004\br\u0010e\u001a\u0015\u0010r\u001a\u00020c2\u0006\u0010Z\u001a\u00020^¢\u0006\u0004\br\u0010f\u001a!\u0010v\u001a\u00020\"*\u00060sj\u0002`t2\b\u0010u\u001a\u0004\u0018\u00010\u001fH\u0000¢\u0006\u0004\bv\u0010w\u001a\u0017\u0010x\u001a\u00020/*\u00060sj\u0002`tH\u0000¢\u0006\u0004\bx\u0010y\u001a!\u0010v\u001a\u00020\"*\u00060zj\u0002`{2\b\u0010u\u001a\u0004\u0018\u00010\u001fH\u0000¢\u0006\u0004\bv\u0010|\u001a\u0017\u0010x\u001a\u00020/*\u00060zj\u0002`{H\u0000¢\u0006\u0004\bx\u0010}\"\u0014\u0010~\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b~\u0010\u007f\"$\u0010\u0083\u0001\u001a\u000b\u0012\u0006\b\u0001\u0012\u00020\u001f0\u0080\u0001*\u00020\u001f8BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001¨\u0006\u0084\u0001"}, d2 = {"T", "", "newMutableList", "()Ljava/util/List;", "K", "V", "", "newMutableMap", "()Ljava/util/Map;", "", "name", "", "list", "copyOf", "(Ljava/lang/String;Ljava/util/List;)Ljava/util/List;", "(Ljava/util/List;)Ljava/util/List;", "", "map", "(Ljava/lang/String;Ljava/util/Map;)Ljava/util/Map;", "(Ljava/util/Map;)Ljava/util/Map;", "immutableCopyOf", "immutableCopyOfMapWithStructValues", ExperienceToggle.DEFAULT_PARAM_KEY, "immutableCopyOfStruct", "(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;", "Lcom/squareup/wire/ProtoAdapter;", "adapter", "-redactElements", "(Ljava/util/List;Lcom/squareup/wire/ProtoAdapter;)Ljava/util/List;", "redactElements", "(Ljava/util/Map;Lcom/squareup/wire/ProtoAdapter;)Ljava/util/Map;", "", "a", "b", "", "equals", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "", "args", "Ljava/lang/IllegalStateException;", "Lkotlin/IllegalStateException;", "missingRequiredFields", "([Ljava/lang/Object;)Ljava/lang/IllegalStateException;", "Liei;", "checkElementsNotNull", "(Ljava/util/List;)V", "(Ljava/util/Map;)V", "", "countNonNull", "(Ljava/lang/Object;Ljava/lang/Object;)I", "c", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)I", "d", "rest", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;[Ljava/lang/Object;)I", "sanitize", "(Ljava/lang/String;)Ljava/lang/String;", "values", "(Ljava/util/List;)Ljava/lang/String;", "oneOfName", "boxedOneOfClassName", "fieldName", "boxedOneOfKeyFieldName", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "boxedOneOfKeysFieldName", "", "array", "Lcom/squareup/wire/ReverseProtoWriter;", "writer", "tag", "encodeArray_int32", "([ILcom/squareup/wire/ReverseProtoWriter;I)V", "encodeArray_uint32", "encodeArray_sint32", "encodeArray_fixed32", "encodeArray_sfixed32", "", "encodeArray_int64", "([JLcom/squareup/wire/ReverseProtoWriter;I)V", "encodeArray_uint64", "encodeArray_sint64", "encodeArray_fixed64", "encodeArray_sfixed64", "", "encodeArray_float", "([FLcom/squareup/wire/ReverseProtoWriter;I)V", "", "encodeArray_double", "([DLcom/squareup/wire/ReverseProtoWriter;I)V", "Lcom/squareup/wire/ProtoReader32;", "reader", "", "decodePrimitive_double", "(Lcom/squareup/wire/ProtoReader32;)D", "Lcom/squareup/wire/ProtoReader;", "(Lcom/squareup/wire/ProtoReader;)D", "decodePrimitive_fixed32", "(Lcom/squareup/wire/ProtoReader32;)I", "(Lcom/squareup/wire/ProtoReader;)I", "", "decodePrimitive_fixed64", "(Lcom/squareup/wire/ProtoReader32;)J", "(Lcom/squareup/wire/ProtoReader;)J", "", "decodePrimitive_float", "(Lcom/squareup/wire/ProtoReader32;)F", "(Lcom/squareup/wire/ProtoReader;)F", "decodePrimitive_int32", "decodePrimitive_int64", "decodePrimitive_sfixed32", "decodePrimitive_sfixed64", "decodePrimitive_sint32", "decodePrimitive_sint64", "decodePrimitive_uint32", "decodePrimitive_uint64", "Ljava/time/Instant;", "Lcom/squareup/wire/Instant;", "other", "commonEquals", "(Ljava/time/Instant;Ljava/lang/Object;)Z", "commonHashCode", "(Ljava/time/Instant;)I", "Ljava/time/Duration;", "Lcom/squareup/wire/Duration;", "(Ljava/time/Duration;Ljava/lang/Object;)Z", "(Ljava/time/Duration;)I", "ESCAPED_CHARS", "Ljava/lang/String;", "Lpl9;", "getTypeName$Internal__InternalKt", "(Ljava/lang/Object;)Lpl9;", "typeName", "wire-runtime"}, k = 5, mv = {2, 0, 0}, xi = mdj.f, xs = "com/squareup/wire/internal/Internal")
final /* synthetic */ class Internal__InternalKt {
    private static final String ESCAPED_CHARS = ",[]{}\\";

    /* JADX INFO: renamed from: com.squareup.wire.internal.Internal__InternalKt$sanitize$2, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = mdj.f)
    public /* synthetic */ class AnonymousClass2 extends m08 implements bz7 {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        public AnonymousClass2() {
            super(1, Internal__InternalKt.class, "sanitize", "sanitize(Ljava/lang/String;)Ljava/lang/String;", 1);
        }

        @Override // defpackage.bz7
        public final String invoke(String str) {
            str.getClass();
            return Internal.sanitize(str);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: -redactElements, reason: not valid java name */
    public static final <K, V> Map<K, V> m1177redactElements(Map<K, ? extends V> map, ProtoAdapter<V> protoAdapter) {
        map.getClass();
        protoAdapter.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap(tta.d0(map.size()));
        Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), protoAdapter.redact(entry.getValue()));
        }
        return linkedHashMap;
    }

    public static final String boxedOneOfClassName(String str) {
        str.getClass();
        if (str.length() <= 0) {
            return str;
        }
        return ((Object) unk.j(str.charAt(0))) + str.substring(1);
    }

    public static final String boxedOneOfKeyFieldName(String str, String str2) {
        str.getClass();
        str2.getClass();
        String upperCase = (str + '_' + str2).toUpperCase(Locale.ROOT);
        upperCase.getClass();
        return upperCase;
    }

    public static final String boxedOneOfKeysFieldName(String str) {
        str.getClass();
        String upperCase = str.concat("_keys").toUpperCase(Locale.ROOT);
        upperCase.getClass();
        return upperCase;
    }

    public static final void checkElementsNotNull(Map<?, ?> map) {
        map.getClass();
        for (Map.Entry<?, ?> entry : map.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (key == null) {
                mr9.h("map.containsKey(null)");
                return;
            } else if (value == null) {
                mr9.h(grc.t(key, "Value for key ", " is null"));
                return;
            }
        }
    }

    public static final boolean commonEquals(Instant instant, Object obj) {
        instant.getClass();
        if (instant == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof Instant)) {
            return false;
        }
        Instant instant2 = (Instant) obj;
        return instant.getEpochSecond() == instant2.getEpochSecond() && instant.getNano() == instant2.getNano();
    }

    public static final int commonHashCode(Instant instant) {
        instant.getClass();
        return Integer.hashCode(instant.getNano()) + (Long.hashCode(instant.getEpochSecond()) * 31);
    }

    public static final <T> List<T> copyOf(List<? extends T> list) {
        list.getClass();
        return (list == lm6.E || (list instanceof ImmutableList)) ? new MutableOnWriteList(list) : new ArrayList(list);
    }

    public static final int countNonNull(Object obj, Object obj2, Object obj3, Object obj4, Object... objArr) {
        objArr.getClass();
        int i = obj != null ? 1 : 0;
        if (obj2 != null) {
            i++;
        }
        if (obj3 != null) {
            i++;
        }
        if (obj4 != null) {
            i++;
        }
        for (Object obj5 : objArr) {
            if (obj5 != null) {
                i++;
            }
        }
        return i;
    }

    public static final double decodePrimitive_double(ProtoReader32 protoReader32) {
        protoReader32.getClass();
        return Double.longBitsToDouble(protoReader32.readFixed64());
    }

    public static final int decodePrimitive_fixed32(ProtoReader32 protoReader32) {
        protoReader32.getClass();
        return protoReader32.readFixed32();
    }

    public static final long decodePrimitive_fixed64(ProtoReader32 protoReader32) {
        protoReader32.getClass();
        return protoReader32.readFixed64();
    }

    public static final float decodePrimitive_float(ProtoReader32 protoReader32) {
        protoReader32.getClass();
        return Float.intBitsToFloat(protoReader32.readFixed32());
    }

    public static final int decodePrimitive_int32(ProtoReader32 protoReader32) {
        protoReader32.getClass();
        return protoReader32.readVarint32();
    }

    public static final long decodePrimitive_int64(ProtoReader32 protoReader32) {
        protoReader32.getClass();
        return protoReader32.readVarint64();
    }

    public static final int decodePrimitive_sfixed32(ProtoReader32 protoReader32) {
        protoReader32.getClass();
        return protoReader32.readFixed32();
    }

    public static final long decodePrimitive_sfixed64(ProtoReader32 protoReader32) {
        protoReader32.getClass();
        return protoReader32.readFixed64();
    }

    public static final int decodePrimitive_sint32(ProtoReader32 protoReader32) {
        protoReader32.getClass();
        return ProtoWriter.INSTANCE.decodeZigZag32$wire_runtime(protoReader32.readVarint32());
    }

    public static final long decodePrimitive_sint64(ProtoReader32 protoReader32) {
        protoReader32.getClass();
        return ProtoWriter.INSTANCE.decodeZigZag64$wire_runtime(protoReader32.readVarint64());
    }

    public static final int decodePrimitive_uint32(ProtoReader32 protoReader32) {
        protoReader32.getClass();
        return protoReader32.readVarint32();
    }

    public static final long decodePrimitive_uint64(ProtoReader32 protoReader32) {
        protoReader32.getClass();
        return protoReader32.readVarint64();
    }

    public static final void encodeArray_double(double[] dArr, ReverseProtoWriter reverseProtoWriter, int i) {
        dArr.getClass();
        reverseProtoWriter.getClass();
        if (dArr.length == 0) {
            return;
        }
        int byteCount = reverseProtoWriter.getByteCount();
        for (int length = dArr.length - 1; -1 < length; length--) {
            reverseProtoWriter.writeFixed64(Double.doubleToLongBits(dArr[length]));
        }
        reverseProtoWriter.writeVarint32(reverseProtoWriter.getByteCount() - byteCount);
        reverseProtoWriter.writeTag(i, FieldEncoding.LENGTH_DELIMITED);
    }

    public static final void encodeArray_fixed32(int[] iArr, ReverseProtoWriter reverseProtoWriter, int i) {
        iArr.getClass();
        reverseProtoWriter.getClass();
        if (iArr.length == 0) {
            return;
        }
        int byteCount = reverseProtoWriter.getByteCount();
        for (int length = iArr.length - 1; -1 < length; length--) {
            reverseProtoWriter.writeFixed32(iArr[length]);
        }
        reverseProtoWriter.writeVarint32(reverseProtoWriter.getByteCount() - byteCount);
        reverseProtoWriter.writeTag(i, FieldEncoding.LENGTH_DELIMITED);
    }

    public static final void encodeArray_fixed64(long[] jArr, ReverseProtoWriter reverseProtoWriter, int i) {
        jArr.getClass();
        reverseProtoWriter.getClass();
        if (jArr.length == 0) {
            return;
        }
        int byteCount = reverseProtoWriter.getByteCount();
        for (int length = jArr.length - 1; -1 < length; length--) {
            reverseProtoWriter.writeFixed64(jArr[length]);
        }
        reverseProtoWriter.writeVarint32(reverseProtoWriter.getByteCount() - byteCount);
        reverseProtoWriter.writeTag(i, FieldEncoding.LENGTH_DELIMITED);
    }

    public static final void encodeArray_float(float[] fArr, ReverseProtoWriter reverseProtoWriter, int i) {
        fArr.getClass();
        reverseProtoWriter.getClass();
        if (fArr.length == 0) {
            return;
        }
        int byteCount = reverseProtoWriter.getByteCount();
        for (int length = fArr.length - 1; -1 < length; length--) {
            reverseProtoWriter.writeFixed32(Float.floatToIntBits(fArr[length]));
        }
        reverseProtoWriter.writeVarint32(reverseProtoWriter.getByteCount() - byteCount);
        reverseProtoWriter.writeTag(i, FieldEncoding.LENGTH_DELIMITED);
    }

    public static final void encodeArray_int32(int[] iArr, ReverseProtoWriter reverseProtoWriter, int i) {
        iArr.getClass();
        reverseProtoWriter.getClass();
        if (iArr.length == 0) {
            return;
        }
        int byteCount = reverseProtoWriter.getByteCount();
        for (int length = iArr.length - 1; -1 < length; length--) {
            reverseProtoWriter.writeSignedVarint32$wire_runtime(iArr[length]);
        }
        reverseProtoWriter.writeVarint32(reverseProtoWriter.getByteCount() - byteCount);
        reverseProtoWriter.writeTag(i, FieldEncoding.LENGTH_DELIMITED);
    }

    public static final void encodeArray_int64(long[] jArr, ReverseProtoWriter reverseProtoWriter, int i) {
        jArr.getClass();
        reverseProtoWriter.getClass();
        if (jArr.length == 0) {
            return;
        }
        int byteCount = reverseProtoWriter.getByteCount();
        for (int length = jArr.length - 1; -1 < length; length--) {
            reverseProtoWriter.writeVarint64(jArr[length]);
        }
        reverseProtoWriter.writeVarint32(reverseProtoWriter.getByteCount() - byteCount);
        reverseProtoWriter.writeTag(i, FieldEncoding.LENGTH_DELIMITED);
    }

    public static final void encodeArray_sfixed32(int[] iArr, ReverseProtoWriter reverseProtoWriter, int i) {
        iArr.getClass();
        reverseProtoWriter.getClass();
        Internal.encodeArray_fixed32(iArr, reverseProtoWriter, i);
    }

    public static final void encodeArray_sfixed64(long[] jArr, ReverseProtoWriter reverseProtoWriter, int i) {
        jArr.getClass();
        reverseProtoWriter.getClass();
        Internal.encodeArray_fixed64(jArr, reverseProtoWriter, i);
    }

    public static final void encodeArray_sint32(int[] iArr, ReverseProtoWriter reverseProtoWriter, int i) {
        iArr.getClass();
        reverseProtoWriter.getClass();
        if (iArr.length == 0) {
            return;
        }
        int byteCount = reverseProtoWriter.getByteCount();
        for (int length = iArr.length - 1; -1 < length; length--) {
            reverseProtoWriter.writeVarint32(ProtoWriter.INSTANCE.encodeZigZag32$wire_runtime(iArr[length]));
        }
        reverseProtoWriter.writeVarint32(reverseProtoWriter.getByteCount() - byteCount);
        reverseProtoWriter.writeTag(i, FieldEncoding.LENGTH_DELIMITED);
    }

    public static final void encodeArray_sint64(long[] jArr, ReverseProtoWriter reverseProtoWriter, int i) {
        jArr.getClass();
        reverseProtoWriter.getClass();
        if (jArr.length == 0) {
            return;
        }
        int byteCount = reverseProtoWriter.getByteCount();
        for (int length = jArr.length - 1; -1 < length; length--) {
            reverseProtoWriter.writeVarint64(ProtoWriter.INSTANCE.encodeZigZag64$wire_runtime(jArr[length]));
        }
        reverseProtoWriter.writeVarint32(reverseProtoWriter.getByteCount() - byteCount);
        reverseProtoWriter.writeTag(i, FieldEncoding.LENGTH_DELIMITED);
    }

    public static final void encodeArray_uint32(int[] iArr, ReverseProtoWriter reverseProtoWriter, int i) {
        iArr.getClass();
        reverseProtoWriter.getClass();
        if (iArr.length == 0) {
            return;
        }
        int byteCount = reverseProtoWriter.getByteCount();
        for (int length = iArr.length - 1; -1 < length; length--) {
            reverseProtoWriter.writeVarint32(iArr[length]);
        }
        reverseProtoWriter.writeVarint32(reverseProtoWriter.getByteCount() - byteCount);
        reverseProtoWriter.writeTag(i, FieldEncoding.LENGTH_DELIMITED);
    }

    public static final void encodeArray_uint64(long[] jArr, ReverseProtoWriter reverseProtoWriter, int i) {
        jArr.getClass();
        reverseProtoWriter.getClass();
        Internal.encodeArray_int64(jArr, reverseProtoWriter, i);
    }

    public static final boolean equals(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    private static final pl9 getTypeName$Internal__InternalKt(Object obj) {
        return jce.a.b(obj.getClass());
    }

    public static final <K, V> Map<K, V> immutableCopyOf(String str, Map<K, ? extends V> map) {
        str.getClass();
        map.getClass();
        if (map.isEmpty()) {
            return nm6.E;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        Set<K> setKeySet = linkedHashMap.keySet();
        setKeySet.getClass();
        if (setKeySet.contains(null)) {
            mr9.q(str.concat(".containsKey(null)"));
            return null;
        }
        Collection<V> collectionValues = linkedHashMap.values();
        collectionValues.getClass();
        if (collectionValues.contains(null)) {
            mr9.q(str.concat(".containsValue(null)"));
            return null;
        }
        Map<K, V> mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        mapUnmodifiableMap.getClass();
        return mapUnmodifiableMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V> Map<K, V> immutableCopyOfMapWithStructValues(String str, Map<K, ? extends V> map) {
        str.getClass();
        map.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<K, ? extends V> entry : map.entrySet()) {
            K key = entry.getKey();
            V value = entry.getValue();
            if (key == null) {
                mr9.q(str.concat(".containsKey(null)"));
                return null;
            }
            linkedHashMap.put(key, Internal.immutableCopyOfStruct(str, value));
        }
        Map<K, V> mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        mapUnmodifiableMap.getClass();
        return mapUnmodifiableMap;
    }

    public static final <T> T immutableCopyOfStruct(String str, T t) {
        str.getClass();
        if (t == null || (t instanceof Boolean) || (t instanceof Double) || (t instanceof String)) {
            return t;
        }
        if (t instanceof List) {
            ArrayList arrayList = new ArrayList();
            Iterator it = ((List) t).iterator();
            while (it.hasNext()) {
                arrayList.add(Internal.immutableCopyOfStruct(str, it.next()));
            }
            T t2 = (T) Collections.unmodifiableList(arrayList);
            t2.getClass();
            return t2;
        }
        if (!(t instanceof Map)) {
            StringBuilder sbX = sq6.x("struct value ", str, " must be a JSON type (null, Boolean, Double, String, List, or Map) but was ");
            sbX.append(getTypeName$Internal__InternalKt(t));
            sbX.append(": ");
            sbX.append(t);
            throw new IllegalArgumentException(sbX.toString());
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : ((Map) t).entrySet()) {
            linkedHashMap.put(Internal.immutableCopyOfStruct(str, entry.getKey()), Internal.immutableCopyOfStruct(str, entry.getValue()));
        }
        T t3 = (T) Collections.unmodifiableMap(linkedHashMap);
        t3.getClass();
        return t3;
    }

    public static final IllegalStateException missingRequiredFields(Object... objArr) {
        objArr.getClass();
        StringBuilder sb = new StringBuilder();
        int i = 0;
        int iX = iv1.x(0, objArr.length - 1, 2);
        String str = "";
        if (iX >= 0) {
            while (true) {
                if (objArr[i] == null) {
                    if (sb.length() > 0) {
                        str = "s";
                    }
                    sb.append("\n  ");
                    sb.append(objArr[i + 1]);
                }
                if (i == iX) {
                    break;
                }
                i += 2;
            }
        }
        throw new IllegalStateException(ij0.k("Required field", str, " not set:", sb.toString()));
    }

    public static final <T> List<T> newMutableList() {
        return new MutableOnWriteList(lm6.E);
    }

    public static final <K, V> Map<K, V> newMutableMap() {
        return new LinkedHashMap();
    }

    public static final String sanitize(String str) {
        str.getClass();
        StringBuilder sb = new StringBuilder(str.length());
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (bsg.v0(ESCAPED_CHARS, cCharAt)) {
                sb.append('\\');
            }
            sb.append(cCharAt);
        }
        return sb.toString();
    }

    public static final int decodePrimitive_fixed32(ProtoReader protoReader) {
        protoReader.getClass();
        return protoReader.readFixed32();
    }

    public static final long decodePrimitive_fixed64(ProtoReader protoReader) {
        protoReader.getClass();
        return protoReader.readFixed64();
    }

    public static final int decodePrimitive_int32(ProtoReader protoReader) {
        protoReader.getClass();
        return protoReader.readVarint32();
    }

    public static final long decodePrimitive_int64(ProtoReader protoReader) {
        protoReader.getClass();
        return protoReader.readVarint64();
    }

    public static final int decodePrimitive_sfixed32(ProtoReader protoReader) {
        protoReader.getClass();
        return protoReader.readFixed32();
    }

    public static final long decodePrimitive_sfixed64(ProtoReader protoReader) {
        protoReader.getClass();
        return protoReader.readFixed64();
    }

    public static final int decodePrimitive_uint32(ProtoReader protoReader) {
        protoReader.getClass();
        return protoReader.readVarint32();
    }

    public static final long decodePrimitive_uint64(ProtoReader protoReader) {
        protoReader.getClass();
        return protoReader.readVarint64();
    }

    public static final double decodePrimitive_double(ProtoReader protoReader) {
        protoReader.getClass();
        return Double.longBitsToDouble(protoReader.readFixed64());
    }

    public static final float decodePrimitive_float(ProtoReader protoReader) {
        protoReader.getClass();
        return Float.intBitsToFloat(protoReader.readFixed32());
    }

    public static final int decodePrimitive_sint32(ProtoReader protoReader) {
        protoReader.getClass();
        return ProtoWriter.INSTANCE.decodeZigZag32$wire_runtime(protoReader.readVarint32());
    }

    public static final long decodePrimitive_sint64(ProtoReader protoReader) {
        protoReader.getClass();
        return ProtoWriter.INSTANCE.decodeZigZag64$wire_runtime(protoReader.readVarint64());
    }

    public static final int commonHashCode(Duration duration) {
        duration.getClass();
        return Integer.hashCode(duration.getNano()) + (Long.hashCode(duration.getSeconds()) * 31);
    }

    @lz5
    public static final <T> List<T> copyOf(String str, List<? extends T> list) {
        str.getClass();
        list.getClass();
        return Internal.copyOf(list);
    }

    @lz5
    public static final <K, V> Map<K, V> copyOf(String str, Map<K, ? extends V> map) {
        str.getClass();
        map.getClass();
        return Internal.copyOf(map);
    }

    public static final <K, V> Map<K, V> copyOf(Map<K, ? extends V> map) {
        map.getClass();
        return new LinkedHashMap(map);
    }

    public static final int countNonNull(Object obj, Object obj2, Object obj3) {
        return (obj != null ? 1 : 0) + (obj2 != null ? 1 : 0) + (obj3 != null ? 1 : 0);
    }

    public static final int countNonNull(Object obj, Object obj2) {
        return (obj != null ? 1 : 0) + (obj2 != null ? 1 : 0);
    }

    public static final boolean commonEquals(Duration duration, Object obj) {
        duration.getClass();
        if (duration == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof Duration)) {
            return false;
        }
        Duration duration2 = (Duration) obj;
        return duration.getSeconds() == duration2.getSeconds() && duration.getNano() == duration2.getNano();
    }

    public static final String sanitize(List<String> list) {
        list.getClass();
        return w44.S0(list, null, "[", "]", AnonymousClass2.INSTANCE, 25);
    }

    public static final void checkElementsNotNull(List<?> list) {
        list.getClass();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (list.get(i) == null) {
                mr9.h(grc.u("Element at index ", i, " is null"));
                return;
            }
        }
    }

    /* JADX INFO: renamed from: -redactElements, reason: not valid java name */
    public static final <T> List<T> m1176redactElements(List<? extends T> list, ProtoAdapter<T> protoAdapter) {
        list.getClass();
        protoAdapter.getClass();
        List<? extends T> list2 = list;
        ArrayList arrayList = new ArrayList(x44.y(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(protoAdapter.redact(it.next()));
        }
        return arrayList;
    }

    public static final <T> List<T> immutableCopyOf(String str, List<? extends T> list) {
        str.getClass();
        list.getClass();
        if (list instanceof MutableOnWriteList) {
            list = (List<T>) ((MutableOnWriteList) list).getMutableList$wire_runtime();
        }
        if (list != lm6.E && !(list instanceof ImmutableList)) {
            ImmutableList immutableList = new ImmutableList(list);
            list = (List<T>) null;
            if (!immutableList.contains(null)) {
                return immutableList;
            }
            mr9.q(str.concat(".contains(null)"));
        }
        return (List<T>) list;
    }
}
