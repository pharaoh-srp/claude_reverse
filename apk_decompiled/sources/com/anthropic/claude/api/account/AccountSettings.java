package com.anthropic.claude.api.account;

import com.anthropic.claude.types.strings.McpToolKey;
import com.anthropic.claude.types.strings.ThinkingMode;
import com.anthropic.claude.types.strings.ToolSearchMode;
import com.pvporbit.freetype.FreeTypeConstants;
import defpackage.bc9;
import defpackage.ebh;
import defpackage.emh;
import defpackage.f7a;
import defpackage.j7;
import defpackage.kw9;
import defpackage.m4b;
import defpackage.m8;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.na6;
import defpackage.onf;
import defpackage.qzh;
import defpackage.srg;
import defpackage.uo0;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w1a;
import defpackage.yb5;
import defpackage.zc1;
import defpackage.znf;
import defpackage.zt1;
import defpackage.zyi;
import java.util.Date;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b1\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b*\b\u0087\b\u0018\u0000 \u008e\u00012\u00020\u0001:\u0004\u008f\u0001\u0090\u0001B\u0093\u0003\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0002\u0012\u001f\b\u0002\u0010#\u001a\u0019\u0018\u00010\u001ej\u0004\u0018\u0001`\u001f¢\u0006\f\b \u0012\b\b!\u0012\u0004\b\t0\"\u0012\u001f\b\u0002\u0010$\u001a\u0019\u0018\u00010\u001ej\u0004\u0018\u0001`\u001f¢\u0006\f\b \u0012\b\b!\u0012\u0004\b\t0\"\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010'\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010)\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010'\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b-\u0010.BÅ\u0002\b\u0010\u0012\u0006\u00100\u001a\u00020/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010#\u001a\u0004\u0018\u00010\u001e\u0012\b\u0010$\u001a\u0004\u0018\u00010\u001e\u0012\b\u0010&\u001a\u0004\u0018\u00010%\u0012\b\u0010(\u001a\u0004\u0018\u00010'\u0012\b\u0010*\u001a\u0004\u0018\u00010)\u0012\b\u0010+\u001a\u0004\u0018\u00010'\u0012\b\u0010,\u001a\u0004\u0018\u00010\u0002\u0012\b\u00102\u001a\u0004\u0018\u000101¢\u0006\u0004\b-\u00103J\u0012\u00104\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b4\u00105J\u0012\u00106\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b6\u00105J\u0012\u00107\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b7\u00105J\u0012\u00108\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b8\u00105J\u0018\u00109\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b9\u0010:J\u0012\u0010;\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b;\u00105J\u001e\u0010<\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b<\u0010=J\u0012\u0010>\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b>\u00105J\u0012\u0010?\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b?\u00105J\u0012\u0010@\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b@\u00105J\u0012\u0010A\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bA\u00105J\u0012\u0010B\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bB\u00105J\u0012\u0010C\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bC\u00105J\u0012\u0010D\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bD\u00105J\u0012\u0010E\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bE\u00105J\u0012\u0010F\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bF\u00105J\u0012\u0010I\u001a\u0004\u0018\u00010\u0017HÆ\u0003¢\u0006\u0004\bG\u0010HJ\u0012\u0010J\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bJ\u00105J\u0012\u0010K\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bK\u00105J\u0012\u0010M\u001a\u0004\u0018\u00010\u001bHÆ\u0003¢\u0006\u0004\bL\u0010HJ\u0012\u0010N\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bN\u00105J'\u0010O\u001a\u0019\u0018\u00010\u001ej\u0004\u0018\u0001`\u001f¢\u0006\f\b \u0012\b\b!\u0012\u0004\b\t0\"HÆ\u0003¢\u0006\u0004\bO\u0010PJ'\u0010Q\u001a\u0019\u0018\u00010\u001ej\u0004\u0018\u0001`\u001f¢\u0006\f\b \u0012\b\b!\u0012\u0004\b\t0\"HÆ\u0003¢\u0006\u0004\bQ\u0010PJ\u0012\u0010R\u001a\u0004\u0018\u00010%HÆ\u0003¢\u0006\u0004\bR\u0010SJ\u0012\u0010T\u001a\u0004\u0018\u00010'HÆ\u0003¢\u0006\u0004\bT\u0010HJ\u0012\u0010U\u001a\u0004\u0018\u00010)HÆ\u0003¢\u0006\u0004\bU\u0010VJ\u0012\u0010W\u001a\u0004\u0018\u00010'HÆ\u0003¢\u0006\u0004\bW\u0010HJ\u0012\u0010X\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bX\u00105J\u009c\u0003\u0010[\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00022\u001f\b\u0002\u0010#\u001a\u0019\u0018\u00010\u001ej\u0004\u0018\u0001`\u001f¢\u0006\f\b \u0012\b\b!\u0012\u0004\b\t0\"2\u001f\b\u0002\u0010$\u001a\u0019\u0018\u00010\u001ej\u0004\u0018\u0001`\u001f¢\u0006\f\b \u0012\b\b!\u0012\u0004\b\t0\"2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010'2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010)2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010'2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\bY\u0010ZJ\u0010\u0010\\\u001a\u00020'HÖ\u0001¢\u0006\u0004\b\\\u0010HJ\u0010\u0010]\u001a\u00020/HÖ\u0001¢\u0006\u0004\b]\u0010^J\u001a\u0010`\u001a\u00020\u00022\b\u0010_\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b`\u0010aJ'\u0010j\u001a\u00020g2\u0006\u0010b\u001a\u00020\u00002\u0006\u0010d\u001a\u00020c2\u0006\u0010f\u001a\u00020eH\u0001¢\u0006\u0004\bh\u0010iR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010k\u001a\u0004\bl\u00105R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010k\u001a\u0004\bm\u00105R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010k\u001a\u0004\bn\u00105R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010k\u001a\u0004\bo\u00105R\u001f\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010p\u001a\u0004\bq\u0010:R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010k\u001a\u0004\br\u00105R%\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\r\u0010s\u001a\u0004\bt\u0010=R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010k\u001a\u0004\bu\u00105R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010k\u001a\u0004\bv\u00105R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010k\u001a\u0004\bw\u00105R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010k\u001a\u0004\bx\u00105R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010k\u001a\u0004\by\u00105R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010k\u001a\u0004\bz\u00105R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010k\u001a\u0004\b{\u00105R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010k\u001a\u0004\b|\u00105R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010k\u001a\u0004\b}\u00105R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010~\u001a\u0004\b\u007f\u0010HR\u001a\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\r\n\u0004\b\u0019\u0010k\u001a\u0005\b\u0080\u0001\u00105R\u001a\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\r\n\u0004\b\u001a\u0010k\u001a\u0005\b\u0081\u0001\u00105R\u001a\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0006¢\u0006\r\n\u0004\b\u001c\u0010~\u001a\u0005\b\u0082\u0001\u0010HR\u001a\u0010\u001d\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\r\n\u0004\b\u001d\u0010k\u001a\u0005\b\u0083\u0001\u00105R0\u0010#\u001a\u0019\u0018\u00010\u001ej\u0004\u0018\u0001`\u001f¢\u0006\f\b \u0012\b\b!\u0012\u0004\b\t0\"8\u0006¢\u0006\u000e\n\u0005\b#\u0010\u0084\u0001\u001a\u0005\b\u0085\u0001\u0010PR0\u0010$\u001a\u0019\u0018\u00010\u001ej\u0004\u0018\u0001`\u001f¢\u0006\f\b \u0012\b\b!\u0012\u0004\b\t0\"8\u0006¢\u0006\u000e\n\u0005\b$\u0010\u0084\u0001\u001a\u0005\b\u0086\u0001\u0010PR\u001b\u0010&\u001a\u0004\u0018\u00010%8\u0006¢\u0006\u000e\n\u0005\b&\u0010\u0087\u0001\u001a\u0005\b\u0088\u0001\u0010SR\u001a\u0010(\u001a\u0004\u0018\u00010'8\u0006¢\u0006\r\n\u0004\b(\u0010~\u001a\u0005\b\u0089\u0001\u0010HR\u001b\u0010*\u001a\u0004\u0018\u00010)8\u0006¢\u0006\u000e\n\u0005\b*\u0010\u008a\u0001\u001a\u0005\b\u008b\u0001\u0010VR\u001a\u0010+\u001a\u0004\u0018\u00010'8\u0006¢\u0006\r\n\u0004\b+\u0010~\u001a\u0005\b\u008c\u0001\u0010HR\u001a\u0010,\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\r\n\u0004\b,\u0010k\u001a\u0005\b\u008d\u0001\u00105¨\u0006\u0091\u0001"}, d2 = {"Lcom/anthropic/claude/api/account/AccountSettings;", "", "", "has_seen_mm_examples", "has_seen_starter_prompts", "has_started_claudeai_onboarding", "has_finished_claudeai_onboarding", "", "Lcom/anthropic/claude/api/account/BannerDismissal;", "dismissed_claudeai_banners", "dismissed_artifacts_announcement", "", "Lcom/anthropic/claude/types/strings/McpToolKey;", "enabled_mcp_tools", "enabled_connector_suggestions", "enabled_saffron", "enabled_melange", "enabled_saffron_search", "enabled_web_search", "preview_feature_uses_artifacts", "preview_feature_uses_latex", "preview_feature_uses_citations", "enabled_mm_pdfs", "Lcom/anthropic/claude/types/strings/ThinkingMode;", "paprika_mode", "enabled_turmeric", "enabled_monkeys_in_a_barrel", "Lcom/anthropic/claude/types/strings/ToolSearchMode;", "tool_search_mode", "grove_enabled", "Ljava/util/Date;", "Lcom/anthropic/claude/api/Iso8601Date;", "Lonf;", "with", "Lbc9;", "grove_updated_at", "grove_notice_viewed_at", "Lcom/anthropic/claude/api/account/VillageWeaverConsentState;", "village_weaver_consent_state", "", "voice_preference", "", "voice_speed", "voice_language_code", "enabled_model_auto_fallback", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/Boolean;Ljava/util/Map;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/Date;Ljava/util/Date;Lcom/anthropic/claude/api/account/VillageWeaverConsentState;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Boolean;Lmq5;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/Boolean;Ljava/util/Map;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/Date;Ljava/util/Date;Lcom/anthropic/claude/api/account/VillageWeaverConsentState;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Boolean;Lvnf;Lmq5;)V", "component1", "()Ljava/lang/Boolean;", "component2", "component3", "component4", "component5", "()Ljava/util/List;", "component6", "component7", "()Ljava/util/Map;", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17-KLP3kNA", "()Ljava/lang/String;", "component17", "component18", "component19", "component20-OP4DWQA", "component20", "component21", "component22", "()Ljava/util/Date;", "component23", "component24", "()Lcom/anthropic/claude/api/account/VillageWeaverConsentState;", "component25", "component26", "()Ljava/lang/Double;", "component27", "component28", "copy-NcesMF4", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/Boolean;Ljava/util/Map;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/Date;Ljava/util/Date;Lcom/anthropic/claude/api/account/VillageWeaverConsentState;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/anthropic/claude/api/account/AccountSettings;", "copy", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/account/AccountSettings;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/lang/Boolean;", "getHas_seen_mm_examples", "getHas_seen_starter_prompts", "getHas_started_claudeai_onboarding", "getHas_finished_claudeai_onboarding", "Ljava/util/List;", "getDismissed_claudeai_banners", "getDismissed_artifacts_announcement", "Ljava/util/Map;", "getEnabled_mcp_tools", "getEnabled_connector_suggestions", "getEnabled_saffron", "getEnabled_melange", "getEnabled_saffron_search", "getEnabled_web_search", "getPreview_feature_uses_artifacts", "getPreview_feature_uses_latex", "getPreview_feature_uses_citations", "getEnabled_mm_pdfs", "Ljava/lang/String;", "getPaprika_mode-KLP3kNA", "getEnabled_turmeric", "getEnabled_monkeys_in_a_barrel", "getTool_search_mode-OP4DWQA", "getGrove_enabled", "Ljava/util/Date;", "getGrove_updated_at", "getGrove_notice_viewed_at", "Lcom/anthropic/claude/api/account/VillageWeaverConsentState;", "getVillage_weaver_consent_state", "getVoice_preference", "Ljava/lang/Double;", "getVoice_speed", "getVoice_language_code", "getEnabled_model_auto_fallback", "Companion", "m8", "l8", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class AccountSettings {
    private static final kw9[] $childSerializers;
    public static final int $stable = 0;
    public static final m8 Companion = new m8();
    private static final AccountSettings DEFAULT;
    private final Boolean dismissed_artifacts_announcement;
    private final List<BannerDismissal> dismissed_claudeai_banners;
    private final Boolean enabled_connector_suggestions;
    private final Map<McpToolKey, Boolean> enabled_mcp_tools;
    private final Boolean enabled_melange;
    private final Boolean enabled_mm_pdfs;
    private final Boolean enabled_model_auto_fallback;
    private final Boolean enabled_monkeys_in_a_barrel;
    private final Boolean enabled_saffron;
    private final Boolean enabled_saffron_search;
    private final Boolean enabled_turmeric;
    private final Boolean enabled_web_search;
    private final Boolean grove_enabled;
    private final Date grove_notice_viewed_at;
    private final Date grove_updated_at;
    private final Boolean has_finished_claudeai_onboarding;
    private final Boolean has_seen_mm_examples;
    private final Boolean has_seen_starter_prompts;
    private final Boolean has_started_claudeai_onboarding;
    private final String paprika_mode;
    private final Boolean preview_feature_uses_artifacts;
    private final Boolean preview_feature_uses_citations;
    private final Boolean preview_feature_uses_latex;
    private final String tool_search_mode;
    private final VillageWeaverConsentState village_weaver_consent_state;
    private final String voice_language_code;
    private final String voice_preference;
    private final Double voice_speed;

    static {
        j7 j7Var = new j7(1);
        w1a w1aVar = w1a.F;
        $childSerializers = new kw9[]{null, null, null, null, yb5.w(w1aVar, j7Var), null, yb5.w(w1aVar, new j7(2)), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null};
        DEFAULT = new AccountSettings((Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (List) null, (Boolean) null, (Map) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (String) null, (Boolean) null, (Boolean) null, (String) null, (Boolean) null, (Date) null, (Date) null, (VillageWeaverConsentState) null, (String) null, (Double) null, (String) null, (Boolean) null, 268435455, (mq5) null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ AccountSettings(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, List list, Boolean bool5, Map map, Boolean bool6, Boolean bool7, Boolean bool8, Boolean bool9, Boolean bool10, Boolean bool11, Boolean bool12, Boolean bool13, Boolean bool14, String str, Boolean bool15, Boolean bool16, String str2, Boolean bool17, Date date, Date date2, VillageWeaverConsentState villageWeaverConsentState, String str3, Double d, String str4, Boolean bool18, int i, mq5 mq5Var) {
        Boolean bool19 = (i & 1) != 0 ? null : bool;
        Boolean bool20 = (i & 2) != 0 ? null : bool2;
        Boolean bool21 = (i & 4) != 0 ? null : bool3;
        Boolean bool22 = (i & 8) != 0 ? null : bool4;
        List list2 = (i & 16) != 0 ? null : list;
        Boolean bool23 = (i & 32) != 0 ? null : bool5;
        Map map2 = (i & 64) != 0 ? null : map;
        Boolean bool24 = (i & FreeTypeConstants.FT_LOAD_PEDANTIC) != 0 ? null : bool6;
        Boolean bool25 = (i & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) != 0 ? null : bool7;
        Boolean bool26 = (i & 512) != 0 ? null : bool8;
        Boolean bool27 = (i & FreeTypeConstants.FT_LOAD_NO_RECURSE) != 0 ? null : bool9;
        Boolean bool28 = (i & FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM) != 0 ? null : bool10;
        Boolean bool29 = (i & FreeTypeConstants.FT_LOAD_MONOCHROME) != 0 ? null : bool11;
        Boolean bool30 = (i & FreeTypeConstants.FT_LOAD_LINEAR_DESIGN) != 0 ? null : bool12;
        Boolean bool31 = (i & 16384) != 0 ? null : bool13;
        Boolean bool32 = (i & FreeTypeConstants.FT_LOAD_NO_AUTOHINT) != 0 ? null : bool14;
        String str5 = (i & 65536) != 0 ? null : str;
        Boolean bool33 = (i & 131072) != 0 ? null : bool15;
        Boolean bool34 = (i & 262144) != 0 ? null : bool16;
        String str6 = (i & 524288) != 0 ? null : str2;
        Boolean bool35 = (i & FreeTypeConstants.FT_LOAD_COLOR) != 0 ? null : bool17;
        Date date3 = (i & FreeTypeConstants.FT_LOAD_COMPUTE_METRICS) != 0 ? null : date;
        Date date4 = (i & 4194304) != 0 ? null : date2;
        VillageWeaverConsentState villageWeaverConsentState2 = (i & 8388608) != 0 ? null : villageWeaverConsentState;
        String str7 = (i & 16777216) != 0 ? null : str3;
        Double d2 = (i & 33554432) != 0 ? null : d;
        String str8 = (i & 67108864) != 0 ? null : str4;
        Boolean bool36 = bool20;
        Boolean bool37 = bool21;
        Boolean bool38 = bool22;
        List list3 = list2;
        Boolean bool39 = bool23;
        Map map3 = map2;
        Boolean bool40 = bool24;
        Boolean bool41 = bool25;
        Boolean bool42 = bool26;
        Boolean bool43 = bool27;
        Boolean bool44 = bool28;
        Boolean bool45 = bool29;
        Boolean bool46 = bool30;
        this(bool19, bool36, bool37, bool38, list3, bool39, map3, bool40, bool41, bool42, bool43, bool44, bool45, bool46, bool31, bool32, str5, bool33, bool34, str6, bool35, date3, date4, villageWeaverConsentState2, str7, d2, str8, (i & 134217728) != 0 ? null : bool18, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new uo0(zc1.a, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return new f7a(m4b.a, zt1.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: copy-NcesMF4$default, reason: not valid java name */
    public static /* synthetic */ AccountSettings m107copyNcesMF4$default(AccountSettings accountSettings, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, List list, Boolean bool5, Map map, Boolean bool6, Boolean bool7, Boolean bool8, Boolean bool9, Boolean bool10, Boolean bool11, Boolean bool12, Boolean bool13, Boolean bool14, String str, Boolean bool15, Boolean bool16, String str2, Boolean bool17, Date date, Date date2, VillageWeaverConsentState villageWeaverConsentState, String str3, Double d, String str4, Boolean bool18, int i, Object obj) {
        Boolean bool19;
        String str5;
        Boolean bool20 = (i & 1) != 0 ? accountSettings.has_seen_mm_examples : bool;
        Boolean bool21 = (i & 2) != 0 ? accountSettings.has_seen_starter_prompts : bool2;
        Boolean bool22 = (i & 4) != 0 ? accountSettings.has_started_claudeai_onboarding : bool3;
        Boolean bool23 = (i & 8) != 0 ? accountSettings.has_finished_claudeai_onboarding : bool4;
        List list2 = (i & 16) != 0 ? accountSettings.dismissed_claudeai_banners : list;
        Boolean bool24 = (i & 32) != 0 ? accountSettings.dismissed_artifacts_announcement : bool5;
        Map map2 = (i & 64) != 0 ? accountSettings.enabled_mcp_tools : map;
        Boolean bool25 = (i & FreeTypeConstants.FT_LOAD_PEDANTIC) != 0 ? accountSettings.enabled_connector_suggestions : bool6;
        Boolean bool26 = (i & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) != 0 ? accountSettings.enabled_saffron : bool7;
        Boolean bool27 = (i & 512) != 0 ? accountSettings.enabled_melange : bool8;
        Boolean bool28 = (i & FreeTypeConstants.FT_LOAD_NO_RECURSE) != 0 ? accountSettings.enabled_saffron_search : bool9;
        Boolean bool29 = (i & FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM) != 0 ? accountSettings.enabled_web_search : bool10;
        Boolean bool30 = (i & FreeTypeConstants.FT_LOAD_MONOCHROME) != 0 ? accountSettings.preview_feature_uses_artifacts : bool11;
        Boolean bool31 = (i & FreeTypeConstants.FT_LOAD_LINEAR_DESIGN) != 0 ? accountSettings.preview_feature_uses_latex : bool12;
        Boolean bool32 = bool20;
        Boolean bool33 = (i & 16384) != 0 ? accountSettings.preview_feature_uses_citations : bool13;
        Boolean bool34 = (i & FreeTypeConstants.FT_LOAD_NO_AUTOHINT) != 0 ? accountSettings.enabled_mm_pdfs : bool14;
        String str6 = (i & 65536) != 0 ? accountSettings.paprika_mode : str;
        Boolean bool35 = (i & 131072) != 0 ? accountSettings.enabled_turmeric : bool15;
        Boolean bool36 = (i & 262144) != 0 ? accountSettings.enabled_monkeys_in_a_barrel : bool16;
        String str7 = (i & 524288) != 0 ? accountSettings.tool_search_mode : str2;
        Boolean bool37 = (i & FreeTypeConstants.FT_LOAD_COLOR) != 0 ? accountSettings.grove_enabled : bool17;
        Date date3 = (i & FreeTypeConstants.FT_LOAD_COMPUTE_METRICS) != 0 ? accountSettings.grove_updated_at : date;
        Date date4 = (i & 4194304) != 0 ? accountSettings.grove_notice_viewed_at : date2;
        VillageWeaverConsentState villageWeaverConsentState2 = (i & 8388608) != 0 ? accountSettings.village_weaver_consent_state : villageWeaverConsentState;
        String str8 = (i & 16777216) != 0 ? accountSettings.voice_preference : str3;
        Double d2 = (i & 33554432) != 0 ? accountSettings.voice_speed : d;
        String str9 = (i & 67108864) != 0 ? accountSettings.voice_language_code : str4;
        if ((i & 134217728) != 0) {
            str5 = str9;
            bool19 = accountSettings.enabled_model_auto_fallback;
        } else {
            bool19 = bool18;
            str5 = str9;
        }
        return accountSettings.m110copyNcesMF4(bool32, bool21, bool22, bool23, list2, bool24, map2, bool25, bool26, bool27, bool28, bool29, bool30, bool31, bool33, bool34, str6, bool35, bool36, str7, bool37, date3, date4, villageWeaverConsentState2, str8, d2, str5, bool19);
    }

    public static final /* synthetic */ void write$Self$api(AccountSettings self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        if (output.E(serialDesc) || self.has_seen_mm_examples != null) {
            output.B(serialDesc, 0, zt1.a, self.has_seen_mm_examples);
        }
        if (output.E(serialDesc) || self.has_seen_starter_prompts != null) {
            output.B(serialDesc, 1, zt1.a, self.has_seen_starter_prompts);
        }
        if (output.E(serialDesc) || self.has_started_claudeai_onboarding != null) {
            output.B(serialDesc, 2, zt1.a, self.has_started_claudeai_onboarding);
        }
        if (output.E(serialDesc) || self.has_finished_claudeai_onboarding != null) {
            output.B(serialDesc, 3, zt1.a, self.has_finished_claudeai_onboarding);
        }
        if (output.E(serialDesc) || self.dismissed_claudeai_banners != null) {
            output.B(serialDesc, 4, (znf) kw9VarArr[4].getValue(), self.dismissed_claudeai_banners);
        }
        if (output.E(serialDesc) || self.dismissed_artifacts_announcement != null) {
            output.B(serialDesc, 5, zt1.a, self.dismissed_artifacts_announcement);
        }
        if (output.E(serialDesc) || self.enabled_mcp_tools != null) {
            output.B(serialDesc, 6, (znf) kw9VarArr[6].getValue(), self.enabled_mcp_tools);
        }
        if (output.E(serialDesc) || self.enabled_connector_suggestions != null) {
            output.B(serialDesc, 7, zt1.a, self.enabled_connector_suggestions);
        }
        if (output.E(serialDesc) || self.enabled_saffron != null) {
            output.B(serialDesc, 8, zt1.a, self.enabled_saffron);
        }
        if (output.E(serialDesc) || self.enabled_melange != null) {
            output.B(serialDesc, 9, zt1.a, self.enabled_melange);
        }
        if (output.E(serialDesc) || self.enabled_saffron_search != null) {
            output.B(serialDesc, 10, zt1.a, self.enabled_saffron_search);
        }
        if (output.E(serialDesc) || self.enabled_web_search != null) {
            output.B(serialDesc, 11, zt1.a, self.enabled_web_search);
        }
        if (output.E(serialDesc) || self.preview_feature_uses_artifacts != null) {
            output.B(serialDesc, 12, zt1.a, self.preview_feature_uses_artifacts);
        }
        if (output.E(serialDesc) || self.preview_feature_uses_latex != null) {
            output.B(serialDesc, 13, zt1.a, self.preview_feature_uses_latex);
        }
        if (output.E(serialDesc) || self.preview_feature_uses_citations != null) {
            output.B(serialDesc, 14, zt1.a, self.preview_feature_uses_citations);
        }
        if (output.E(serialDesc) || self.enabled_mm_pdfs != null) {
            output.B(serialDesc, 15, zt1.a, self.enabled_mm_pdfs);
        }
        if (output.E(serialDesc) || self.paprika_mode != null) {
            emh emhVar = emh.a;
            String str = self.paprika_mode;
            output.B(serialDesc, 16, emhVar, str != null ? ThinkingMode.m1142boximpl(str) : null);
        }
        if (output.E(serialDesc) || self.enabled_turmeric != null) {
            output.B(serialDesc, 17, zt1.a, self.enabled_turmeric);
        }
        if (output.E(serialDesc) || self.enabled_monkeys_in_a_barrel != null) {
            output.B(serialDesc, 18, zt1.a, self.enabled_monkeys_in_a_barrel);
        }
        if (output.E(serialDesc) || self.tool_search_mode != null) {
            qzh qzhVar = qzh.a;
            String str2 = self.tool_search_mode;
            output.B(serialDesc, 19, qzhVar, str2 != null ? ToolSearchMode.m1150boximpl(str2) : null);
        }
        if (output.E(serialDesc) || self.grove_enabled != null) {
            output.B(serialDesc, 20, zt1.a, self.grove_enabled);
        }
        if (output.E(serialDesc) || self.grove_updated_at != null) {
            output.B(serialDesc, 21, bc9.a, self.grove_updated_at);
        }
        if (output.E(serialDesc) || self.grove_notice_viewed_at != null) {
            output.B(serialDesc, 22, bc9.a, self.grove_notice_viewed_at);
        }
        if (output.E(serialDesc) || self.village_weaver_consent_state != null) {
            output.B(serialDesc, 23, zyi.d, self.village_weaver_consent_state);
        }
        if (output.E(serialDesc) || self.voice_preference != null) {
            output.B(serialDesc, 24, srg.a, self.voice_preference);
        }
        if (output.E(serialDesc) || self.voice_speed != null) {
            output.B(serialDesc, 25, na6.a, self.voice_speed);
        }
        if (output.E(serialDesc) || self.voice_language_code != null) {
            output.B(serialDesc, 26, srg.a, self.voice_language_code);
        }
        if (!output.E(serialDesc) && self.enabled_model_auto_fallback == null) {
            return;
        }
        output.B(serialDesc, 27, zt1.a, self.enabled_model_auto_fallback);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Boolean getHas_seen_mm_examples() {
        return this.has_seen_mm_examples;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Boolean getEnabled_melange() {
        return this.enabled_melange;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final Boolean getEnabled_saffron_search() {
        return this.enabled_saffron_search;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final Boolean getEnabled_web_search() {
        return this.enabled_web_search;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final Boolean getPreview_feature_uses_artifacts() {
        return this.preview_feature_uses_artifacts;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final Boolean getPreview_feature_uses_latex() {
        return this.preview_feature_uses_latex;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final Boolean getPreview_feature_uses_citations() {
        return this.preview_feature_uses_citations;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final Boolean getEnabled_mm_pdfs() {
        return this.enabled_mm_pdfs;
    }

    /* JADX INFO: renamed from: component17-KLP3kNA, reason: not valid java name and from getter */
    public final String getPaprika_mode() {
        return this.paprika_mode;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final Boolean getEnabled_turmeric() {
        return this.enabled_turmeric;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final Boolean getEnabled_monkeys_in_a_barrel() {
        return this.enabled_monkeys_in_a_barrel;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Boolean getHas_seen_starter_prompts() {
        return this.has_seen_starter_prompts;
    }

    /* JADX INFO: renamed from: component20-OP4DWQA, reason: not valid java name and from getter */
    public final String getTool_search_mode() {
        return this.tool_search_mode;
    }

    /* JADX INFO: renamed from: component21, reason: from getter */
    public final Boolean getGrove_enabled() {
        return this.grove_enabled;
    }

    /* JADX INFO: renamed from: component22, reason: from getter */
    public final Date getGrove_updated_at() {
        return this.grove_updated_at;
    }

    /* JADX INFO: renamed from: component23, reason: from getter */
    public final Date getGrove_notice_viewed_at() {
        return this.grove_notice_viewed_at;
    }

    /* JADX INFO: renamed from: component24, reason: from getter */
    public final VillageWeaverConsentState getVillage_weaver_consent_state() {
        return this.village_weaver_consent_state;
    }

    /* JADX INFO: renamed from: component25, reason: from getter */
    public final String getVoice_preference() {
        return this.voice_preference;
    }

    /* JADX INFO: renamed from: component26, reason: from getter */
    public final Double getVoice_speed() {
        return this.voice_speed;
    }

    /* JADX INFO: renamed from: component27, reason: from getter */
    public final String getVoice_language_code() {
        return this.voice_language_code;
    }

    /* JADX INFO: renamed from: component28, reason: from getter */
    public final Boolean getEnabled_model_auto_fallback() {
        return this.enabled_model_auto_fallback;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Boolean getHas_started_claudeai_onboarding() {
        return this.has_started_claudeai_onboarding;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Boolean getHas_finished_claudeai_onboarding() {
        return this.has_finished_claudeai_onboarding;
    }

    public final List<BannerDismissal> component5() {
        return this.dismissed_claudeai_banners;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Boolean getDismissed_artifacts_announcement() {
        return this.dismissed_artifacts_announcement;
    }

    public final Map<McpToolKey, Boolean> component7() {
        return this.enabled_mcp_tools;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Boolean getEnabled_connector_suggestions() {
        return this.enabled_connector_suggestions;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Boolean getEnabled_saffron() {
        return this.enabled_saffron;
    }

    /* JADX INFO: renamed from: copy-NcesMF4, reason: not valid java name */
    public final AccountSettings m110copyNcesMF4(Boolean has_seen_mm_examples, Boolean has_seen_starter_prompts, Boolean has_started_claudeai_onboarding, Boolean has_finished_claudeai_onboarding, List<BannerDismissal> dismissed_claudeai_banners, Boolean dismissed_artifacts_announcement, Map<McpToolKey, Boolean> enabled_mcp_tools, Boolean enabled_connector_suggestions, Boolean enabled_saffron, Boolean enabled_melange, Boolean enabled_saffron_search, Boolean enabled_web_search, Boolean preview_feature_uses_artifacts, Boolean preview_feature_uses_latex, Boolean preview_feature_uses_citations, Boolean enabled_mm_pdfs, String paprika_mode, Boolean enabled_turmeric, Boolean enabled_monkeys_in_a_barrel, String tool_search_mode, Boolean grove_enabled, Date grove_updated_at, Date grove_notice_viewed_at, VillageWeaverConsentState village_weaver_consent_state, String voice_preference, Double voice_speed, String voice_language_code, Boolean enabled_model_auto_fallback) {
        return new AccountSettings(has_seen_mm_examples, has_seen_starter_prompts, has_started_claudeai_onboarding, has_finished_claudeai_onboarding, dismissed_claudeai_banners, dismissed_artifacts_announcement, enabled_mcp_tools, enabled_connector_suggestions, enabled_saffron, enabled_melange, enabled_saffron_search, enabled_web_search, preview_feature_uses_artifacts, preview_feature_uses_latex, preview_feature_uses_citations, enabled_mm_pdfs, paprika_mode, enabled_turmeric, enabled_monkeys_in_a_barrel, tool_search_mode, grove_enabled, grove_updated_at, grove_notice_viewed_at, village_weaver_consent_state, voice_preference, voice_speed, voice_language_code, enabled_model_auto_fallback, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00f2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(java.lang.Object r5) {
        /*
            Method dump skipped, instruction units count: 339
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anthropic.claude.api.account.AccountSettings.equals(java.lang.Object):boolean");
    }

    public final Boolean getDismissed_artifacts_announcement() {
        return this.dismissed_artifacts_announcement;
    }

    public final List<BannerDismissal> getDismissed_claudeai_banners() {
        return this.dismissed_claudeai_banners;
    }

    public final Boolean getEnabled_connector_suggestions() {
        return this.enabled_connector_suggestions;
    }

    public final Map<McpToolKey, Boolean> getEnabled_mcp_tools() {
        return this.enabled_mcp_tools;
    }

    public final Boolean getEnabled_melange() {
        return this.enabled_melange;
    }

    public final Boolean getEnabled_mm_pdfs() {
        return this.enabled_mm_pdfs;
    }

    public final Boolean getEnabled_model_auto_fallback() {
        return this.enabled_model_auto_fallback;
    }

    public final Boolean getEnabled_monkeys_in_a_barrel() {
        return this.enabled_monkeys_in_a_barrel;
    }

    public final Boolean getEnabled_saffron() {
        return this.enabled_saffron;
    }

    public final Boolean getEnabled_saffron_search() {
        return this.enabled_saffron_search;
    }

    public final Boolean getEnabled_turmeric() {
        return this.enabled_turmeric;
    }

    public final Boolean getEnabled_web_search() {
        return this.enabled_web_search;
    }

    public final Boolean getGrove_enabled() {
        return this.grove_enabled;
    }

    public final Date getGrove_notice_viewed_at() {
        return this.grove_notice_viewed_at;
    }

    public final Date getGrove_updated_at() {
        return this.grove_updated_at;
    }

    public final Boolean getHas_finished_claudeai_onboarding() {
        return this.has_finished_claudeai_onboarding;
    }

    public final Boolean getHas_seen_mm_examples() {
        return this.has_seen_mm_examples;
    }

    public final Boolean getHas_seen_starter_prompts() {
        return this.has_seen_starter_prompts;
    }

    public final Boolean getHas_started_claudeai_onboarding() {
        return this.has_started_claudeai_onboarding;
    }

    /* JADX INFO: renamed from: getPaprika_mode-KLP3kNA, reason: not valid java name */
    public final String m111getPaprika_modeKLP3kNA() {
        return this.paprika_mode;
    }

    public final Boolean getPreview_feature_uses_artifacts() {
        return this.preview_feature_uses_artifacts;
    }

    public final Boolean getPreview_feature_uses_citations() {
        return this.preview_feature_uses_citations;
    }

    public final Boolean getPreview_feature_uses_latex() {
        return this.preview_feature_uses_latex;
    }

    /* JADX INFO: renamed from: getTool_search_mode-OP4DWQA, reason: not valid java name */
    public final String m112getTool_search_modeOP4DWQA() {
        return this.tool_search_mode;
    }

    public final VillageWeaverConsentState getVillage_weaver_consent_state() {
        return this.village_weaver_consent_state;
    }

    public final String getVoice_language_code() {
        return this.voice_language_code;
    }

    public final String getVoice_preference() {
        return this.voice_preference;
    }

    public final Double getVoice_speed() {
        return this.voice_speed;
    }

    public int hashCode() {
        Boolean bool = this.has_seen_mm_examples;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.has_seen_starter_prompts;
        int iHashCode2 = (iHashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.has_started_claudeai_onboarding;
        int iHashCode3 = (iHashCode2 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.has_finished_claudeai_onboarding;
        int iHashCode4 = (iHashCode3 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        List<BannerDismissal> list = this.dismissed_claudeai_banners;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool5 = this.dismissed_artifacts_announcement;
        int iHashCode6 = (iHashCode5 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Map<McpToolKey, Boolean> map = this.enabled_mcp_tools;
        int iHashCode7 = (iHashCode6 + (map == null ? 0 : map.hashCode())) * 31;
        Boolean bool6 = this.enabled_connector_suggestions;
        int iHashCode8 = (iHashCode7 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        Boolean bool7 = this.enabled_saffron;
        int iHashCode9 = (iHashCode8 + (bool7 == null ? 0 : bool7.hashCode())) * 31;
        Boolean bool8 = this.enabled_melange;
        int iHashCode10 = (iHashCode9 + (bool8 == null ? 0 : bool8.hashCode())) * 31;
        Boolean bool9 = this.enabled_saffron_search;
        int iHashCode11 = (iHashCode10 + (bool9 == null ? 0 : bool9.hashCode())) * 31;
        Boolean bool10 = this.enabled_web_search;
        int iHashCode12 = (iHashCode11 + (bool10 == null ? 0 : bool10.hashCode())) * 31;
        Boolean bool11 = this.preview_feature_uses_artifacts;
        int iHashCode13 = (iHashCode12 + (bool11 == null ? 0 : bool11.hashCode())) * 31;
        Boolean bool12 = this.preview_feature_uses_latex;
        int iHashCode14 = (iHashCode13 + (bool12 == null ? 0 : bool12.hashCode())) * 31;
        Boolean bool13 = this.preview_feature_uses_citations;
        int iHashCode15 = (iHashCode14 + (bool13 == null ? 0 : bool13.hashCode())) * 31;
        Boolean bool14 = this.enabled_mm_pdfs;
        int iHashCode16 = (iHashCode15 + (bool14 == null ? 0 : bool14.hashCode())) * 31;
        String str = this.paprika_mode;
        int iM1146hashCodeimpl = (iHashCode16 + (str == null ? 0 : ThinkingMode.m1146hashCodeimpl(str))) * 31;
        Boolean bool15 = this.enabled_turmeric;
        int iHashCode17 = (iM1146hashCodeimpl + (bool15 == null ? 0 : bool15.hashCode())) * 31;
        Boolean bool16 = this.enabled_monkeys_in_a_barrel;
        int iHashCode18 = (iHashCode17 + (bool16 == null ? 0 : bool16.hashCode())) * 31;
        String str2 = this.tool_search_mode;
        int iM1154hashCodeimpl = (iHashCode18 + (str2 == null ? 0 : ToolSearchMode.m1154hashCodeimpl(str2))) * 31;
        Boolean bool17 = this.grove_enabled;
        int iHashCode19 = (iM1154hashCodeimpl + (bool17 == null ? 0 : bool17.hashCode())) * 31;
        Date date = this.grove_updated_at;
        int iHashCode20 = (iHashCode19 + (date == null ? 0 : date.hashCode())) * 31;
        Date date2 = this.grove_notice_viewed_at;
        int iHashCode21 = (iHashCode20 + (date2 == null ? 0 : date2.hashCode())) * 31;
        VillageWeaverConsentState villageWeaverConsentState = this.village_weaver_consent_state;
        int iHashCode22 = (iHashCode21 + (villageWeaverConsentState == null ? 0 : villageWeaverConsentState.hashCode())) * 31;
        String str3 = this.voice_preference;
        int iHashCode23 = (iHashCode22 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Double d = this.voice_speed;
        int iHashCode24 = (iHashCode23 + (d == null ? 0 : d.hashCode())) * 31;
        String str4 = this.voice_language_code;
        int iHashCode25 = (iHashCode24 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool18 = this.enabled_model_auto_fallback;
        return iHashCode25 + (bool18 != null ? bool18.hashCode() : 0);
    }

    public String toString() {
        Boolean bool = this.has_seen_mm_examples;
        Boolean bool2 = this.has_seen_starter_prompts;
        Boolean bool3 = this.has_started_claudeai_onboarding;
        Boolean bool4 = this.has_finished_claudeai_onboarding;
        List<BannerDismissal> list = this.dismissed_claudeai_banners;
        Boolean bool5 = this.dismissed_artifacts_announcement;
        Map<McpToolKey, Boolean> map = this.enabled_mcp_tools;
        Boolean bool6 = this.enabled_connector_suggestions;
        Boolean bool7 = this.enabled_saffron;
        Boolean bool8 = this.enabled_melange;
        Boolean bool9 = this.enabled_saffron_search;
        Boolean bool10 = this.enabled_web_search;
        Boolean bool11 = this.preview_feature_uses_artifacts;
        Boolean bool12 = this.preview_feature_uses_latex;
        Boolean bool13 = this.preview_feature_uses_citations;
        Boolean bool14 = this.enabled_mm_pdfs;
        String str = this.paprika_mode;
        String strM1148toStringimpl = str == null ? "null" : ThinkingMode.m1148toStringimpl(str);
        Boolean bool15 = this.enabled_turmeric;
        Boolean bool16 = this.enabled_monkeys_in_a_barrel;
        String str2 = this.tool_search_mode;
        String strM1155toStringimpl = str2 != null ? ToolSearchMode.m1155toStringimpl(str2) : "null";
        Boolean bool17 = this.grove_enabled;
        Date date = this.grove_updated_at;
        Date date2 = this.grove_notice_viewed_at;
        VillageWeaverConsentState villageWeaverConsentState = this.village_weaver_consent_state;
        String str3 = this.voice_preference;
        Double d = this.voice_speed;
        String str4 = this.voice_language_code;
        Boolean bool18 = this.enabled_model_auto_fallback;
        StringBuilder sb = new StringBuilder("AccountSettings(has_seen_mm_examples=");
        sb.append(bool);
        sb.append(", has_seen_starter_prompts=");
        sb.append(bool2);
        sb.append(", has_started_claudeai_onboarding=");
        ebh.C(sb, bool3, ", has_finished_claudeai_onboarding=", bool4, ", dismissed_claudeai_banners=");
        sb.append(list);
        sb.append(", dismissed_artifacts_announcement=");
        sb.append(bool5);
        sb.append(", enabled_mcp_tools=");
        sb.append(map);
        sb.append(", enabled_connector_suggestions=");
        sb.append(bool6);
        sb.append(", enabled_saffron=");
        ebh.C(sb, bool7, ", enabled_melange=", bool8, ", enabled_saffron_search=");
        ebh.C(sb, bool9, ", enabled_web_search=", bool10, ", preview_feature_uses_artifacts=");
        ebh.C(sb, bool11, ", preview_feature_uses_latex=", bool12, ", preview_feature_uses_citations=");
        ebh.C(sb, bool13, ", enabled_mm_pdfs=", bool14, ", paprika_mode=");
        sb.append(strM1148toStringimpl);
        sb.append(", enabled_turmeric=");
        sb.append(bool15);
        sb.append(", enabled_monkeys_in_a_barrel=");
        sb.append(bool16);
        sb.append(", tool_search_mode=");
        sb.append(strM1155toStringimpl);
        sb.append(", grove_enabled=");
        sb.append(bool17);
        sb.append(", grove_updated_at=");
        sb.append(date);
        sb.append(", grove_notice_viewed_at=");
        sb.append(date2);
        sb.append(", village_weaver_consent_state=");
        sb.append(villageWeaverConsentState);
        sb.append(", voice_preference=");
        sb.append(str3);
        sb.append(", voice_speed=");
        sb.append(d);
        sb.append(", voice_language_code=");
        sb.append(str4);
        sb.append(", enabled_model_auto_fallback=");
        sb.append(bool18);
        sb.append(")");
        return sb.toString();
    }

    public /* synthetic */ AccountSettings(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, List list, Boolean bool5, Map map, Boolean bool6, Boolean bool7, Boolean bool8, Boolean bool9, Boolean bool10, Boolean bool11, Boolean bool12, Boolean bool13, Boolean bool14, String str, Boolean bool15, Boolean bool16, String str2, Boolean bool17, Date date, Date date2, VillageWeaverConsentState villageWeaverConsentState, String str3, Double d, String str4, Boolean bool18, mq5 mq5Var) {
        this(bool, bool2, bool3, bool4, list, bool5, map, bool6, bool7, bool8, bool9, bool10, bool11, bool12, bool13, bool14, str, bool15, bool16, str2, bool17, date, date2, villageWeaverConsentState, str3, d, str4, bool18);
    }

    private /* synthetic */ AccountSettings(int i, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, List list, Boolean bool5, Map map, Boolean bool6, Boolean bool7, Boolean bool8, Boolean bool9, Boolean bool10, Boolean bool11, Boolean bool12, Boolean bool13, Boolean bool14, String str, Boolean bool15, Boolean bool16, String str2, Boolean bool17, Date date, Date date2, VillageWeaverConsentState villageWeaverConsentState, String str3, Double d, String str4, Boolean bool18, vnf vnfVar) {
        if ((i & 1) == 0) {
            this.has_seen_mm_examples = null;
        } else {
            this.has_seen_mm_examples = bool;
        }
        if ((i & 2) == 0) {
            this.has_seen_starter_prompts = null;
        } else {
            this.has_seen_starter_prompts = bool2;
        }
        if ((i & 4) == 0) {
            this.has_started_claudeai_onboarding = null;
        } else {
            this.has_started_claudeai_onboarding = bool3;
        }
        if ((i & 8) == 0) {
            this.has_finished_claudeai_onboarding = null;
        } else {
            this.has_finished_claudeai_onboarding = bool4;
        }
        if ((i & 16) == 0) {
            this.dismissed_claudeai_banners = null;
        } else {
            this.dismissed_claudeai_banners = list;
        }
        if ((i & 32) == 0) {
            this.dismissed_artifacts_announcement = null;
        } else {
            this.dismissed_artifacts_announcement = bool5;
        }
        if ((i & 64) == 0) {
            this.enabled_mcp_tools = null;
        } else {
            this.enabled_mcp_tools = map;
        }
        if ((i & FreeTypeConstants.FT_LOAD_PEDANTIC) == 0) {
            this.enabled_connector_suggestions = null;
        } else {
            this.enabled_connector_suggestions = bool6;
        }
        if ((i & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) == 0) {
            this.enabled_saffron = null;
        } else {
            this.enabled_saffron = bool7;
        }
        if ((i & 512) == 0) {
            this.enabled_melange = null;
        } else {
            this.enabled_melange = bool8;
        }
        if ((i & FreeTypeConstants.FT_LOAD_NO_RECURSE) == 0) {
            this.enabled_saffron_search = null;
        } else {
            this.enabled_saffron_search = bool9;
        }
        if ((i & FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM) == 0) {
            this.enabled_web_search = null;
        } else {
            this.enabled_web_search = bool10;
        }
        if ((i & FreeTypeConstants.FT_LOAD_MONOCHROME) == 0) {
            this.preview_feature_uses_artifacts = null;
        } else {
            this.preview_feature_uses_artifacts = bool11;
        }
        if ((i & FreeTypeConstants.FT_LOAD_LINEAR_DESIGN) == 0) {
            this.preview_feature_uses_latex = null;
        } else {
            this.preview_feature_uses_latex = bool12;
        }
        if ((i & 16384) == 0) {
            this.preview_feature_uses_citations = null;
        } else {
            this.preview_feature_uses_citations = bool13;
        }
        if ((32768 & i) == 0) {
            this.enabled_mm_pdfs = null;
        } else {
            this.enabled_mm_pdfs = bool14;
        }
        if ((65536 & i) == 0) {
            this.paprika_mode = null;
        } else {
            this.paprika_mode = str;
        }
        if ((131072 & i) == 0) {
            this.enabled_turmeric = null;
        } else {
            this.enabled_turmeric = bool15;
        }
        if ((262144 & i) == 0) {
            this.enabled_monkeys_in_a_barrel = null;
        } else {
            this.enabled_monkeys_in_a_barrel = bool16;
        }
        if ((524288 & i) == 0) {
            this.tool_search_mode = null;
        } else {
            this.tool_search_mode = str2;
        }
        if ((1048576 & i) == 0) {
            this.grove_enabled = null;
        } else {
            this.grove_enabled = bool17;
        }
        if ((2097152 & i) == 0) {
            this.grove_updated_at = null;
        } else {
            this.grove_updated_at = date;
        }
        if ((4194304 & i) == 0) {
            this.grove_notice_viewed_at = null;
        } else {
            this.grove_notice_viewed_at = date2;
        }
        if ((8388608 & i) == 0) {
            this.village_weaver_consent_state = null;
        } else {
            this.village_weaver_consent_state = villageWeaverConsentState;
        }
        if ((16777216 & i) == 0) {
            this.voice_preference = null;
        } else {
            this.voice_preference = str3;
        }
        if ((33554432 & i) == 0) {
            this.voice_speed = null;
        } else {
            this.voice_speed = d;
        }
        if ((67108864 & i) == 0) {
            this.voice_language_code = null;
        } else {
            this.voice_language_code = str4;
        }
        if ((i & 134217728) == 0) {
            this.enabled_model_auto_fallback = null;
        } else {
            this.enabled_model_auto_fallback = bool18;
        }
    }

    private AccountSettings(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, List<BannerDismissal> list, Boolean bool5, Map<McpToolKey, Boolean> map, Boolean bool6, Boolean bool7, Boolean bool8, Boolean bool9, Boolean bool10, Boolean bool11, Boolean bool12, Boolean bool13, Boolean bool14, String str, Boolean bool15, Boolean bool16, String str2, Boolean bool17, Date date, Date date2, VillageWeaverConsentState villageWeaverConsentState, String str3, Double d, String str4, Boolean bool18) {
        this.has_seen_mm_examples = bool;
        this.has_seen_starter_prompts = bool2;
        this.has_started_claudeai_onboarding = bool3;
        this.has_finished_claudeai_onboarding = bool4;
        this.dismissed_claudeai_banners = list;
        this.dismissed_artifacts_announcement = bool5;
        this.enabled_mcp_tools = map;
        this.enabled_connector_suggestions = bool6;
        this.enabled_saffron = bool7;
        this.enabled_melange = bool8;
        this.enabled_saffron_search = bool9;
        this.enabled_web_search = bool10;
        this.preview_feature_uses_artifacts = bool11;
        this.preview_feature_uses_latex = bool12;
        this.preview_feature_uses_citations = bool13;
        this.enabled_mm_pdfs = bool14;
        this.paprika_mode = str;
        this.enabled_turmeric = bool15;
        this.enabled_monkeys_in_a_barrel = bool16;
        this.tool_search_mode = str2;
        this.grove_enabled = bool17;
        this.grove_updated_at = date;
        this.grove_notice_viewed_at = date2;
        this.village_weaver_consent_state = villageWeaverConsentState;
        this.voice_preference = str3;
        this.voice_speed = d;
        this.voice_language_code = str4;
        this.enabled_model_auto_fallback = bool18;
    }

    public /* synthetic */ AccountSettings(int i, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, List list, Boolean bool5, Map map, Boolean bool6, Boolean bool7, Boolean bool8, Boolean bool9, Boolean bool10, Boolean bool11, Boolean bool12, Boolean bool13, Boolean bool14, String str, Boolean bool15, Boolean bool16, String str2, Boolean bool17, Date date, Date date2, VillageWeaverConsentState villageWeaverConsentState, String str3, Double d, String str4, Boolean bool18, vnf vnfVar, mq5 mq5Var) {
        this(i, bool, bool2, bool3, bool4, list, bool5, map, bool6, bool7, bool8, bool9, bool10, bool11, bool12, bool13, bool14, str, bool15, bool16, str2, bool17, date, date2, villageWeaverConsentState, str3, d, str4, bool18, vnfVar);
    }
}
