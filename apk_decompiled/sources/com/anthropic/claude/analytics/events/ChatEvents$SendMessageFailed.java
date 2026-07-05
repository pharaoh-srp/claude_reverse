package com.anthropic.claude.analytics.events;

import com.pvporbit.freetype.FreeTypeConstants;
import defpackage.ao2;
import defpackage.e79;
import defpackage.fsh;
import defpackage.ij0;
import defpackage.kgh;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.qy1;
import defpackage.srg;
import defpackage.vb7;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w1a;
import defpackage.x44;
import defpackage.xka;
import defpackage.xq2;
import defpackage.yb5;
import defpackage.yq2;
import defpackage.znf;
import defpackage.zq2;
import defpackage.zt1;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.MissingFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b+\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b.\b\u0087\b\u0018\u0000 \u0092\u00012\u00020\u0001:\u0004\u0093\u0001\u0094\u0001Bã\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u001f\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u001f\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b)\u0010*BÙ\u0002\b\u0010\u0012\u0006\u0010+\u001a\u00020\u0005\u0012\u0006\u0010,\u001a\u00020\u0005\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010 \u001a\u0004\u0018\u00010\u001f\u0012\b\u0010!\u001a\u0004\u0018\u00010\u001f\u0012\b\u0010\"\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010#\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010$\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010%\u001a\u0004\u0018\u00010\u001f\u0012\b\u0010&\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010'\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010(\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010.\u001a\u0004\u0018\u00010-¢\u0006\u0004\b)\u0010/J\u0010\u00100\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b0\u00101J\u0010\u00102\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b2\u00101J\u0010\u00103\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b3\u00104J\u0010\u00105\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b5\u00104J\u0010\u00106\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b6\u00104J\u0010\u00107\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b7\u00108J\u0010\u00109\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b9\u0010:J\u0010\u0010;\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b;\u0010:J\u0010\u0010<\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b<\u00101J\u0012\u0010=\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b=\u00101J\u0012\u0010>\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b>\u00101J\u0012\u0010?\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b?\u00101J\u0012\u0010@\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b@\u0010AJ\u0012\u0010B\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bB\u00101J\u0012\u0010C\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bC\u00101J\u0012\u0010D\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\bD\u0010EJ\u0012\u0010F\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bF\u00101J\u0012\u0010G\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\bG\u0010AJ\u0012\u0010H\u001a\u0004\u0018\u00010\u0018HÆ\u0003¢\u0006\u0004\bH\u0010IJ\u0012\u0010J\u001a\u0004\u0018\u00010\u001aHÆ\u0003¢\u0006\u0004\bJ\u0010KJ\u0012\u0010L\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bL\u00101J\u0012\u0010M\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\bM\u0010EJ\u0012\u0010N\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\bN\u0010EJ\u0012\u0010O\u001a\u0004\u0018\u00010\u001fHÆ\u0003¢\u0006\u0004\bO\u0010PJ\u0012\u0010Q\u001a\u0004\u0018\u00010\u001fHÆ\u0003¢\u0006\u0004\bQ\u0010PJ\u0012\u0010R\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\bR\u0010EJ\u0012\u0010S\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\bS\u0010EJ\u0012\u0010T\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\bT\u0010AJ\u0012\u0010U\u001a\u0004\u0018\u00010\u001fHÆ\u0003¢\u0006\u0004\bU\u0010PJ\u0012\u0010V\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\bV\u0010AJ\u0012\u0010W\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bW\u00101J\u0012\u0010X\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bX\u00101Jþ\u0002\u0010Z\u001a\u00020Y2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u001f2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u001f2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\bZ\u0010[J\u0010\u0010\\\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\\\u00101J\u0010\u0010]\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b]\u00104J\u001a\u0010`\u001a\u00020\u000b2\b\u0010_\u001a\u0004\u0018\u00010^HÖ\u0003¢\u0006\u0004\b`\u0010aJ'\u0010j\u001a\u00020g2\u0006\u0010b\u001a\u00020Y2\u0006\u0010d\u001a\u00020c2\u0006\u0010f\u001a\u00020eH\u0001¢\u0006\u0004\bh\u0010iR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010k\u001a\u0004\bl\u00101R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010k\u001a\u0004\bm\u00101R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010n\u001a\u0004\bo\u00104R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010n\u001a\u0004\bp\u00104R\u0017\u0010\b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\b\u0010n\u001a\u0004\bq\u00104R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010r\u001a\u0004\bs\u00108R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010t\u001a\u0004\b\f\u0010:R\u0017\u0010\r\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\r\u0010t\u001a\u0004\b\r\u0010:R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010k\u001a\u0004\bu\u00101R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010k\u001a\u0004\bv\u00101R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010k\u001a\u0004\bw\u00101R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010k\u001a\u0004\bx\u00101R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\u0012\u0010y\u001a\u0004\bz\u0010AR\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010k\u001a\u0004\b{\u00101R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010k\u001a\u0004\b|\u00101R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0015\u0010}\u001a\u0004\b~\u0010ER\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010k\u001a\u0004\b\u007f\u00101R\u001a\u0010\u0017\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\r\n\u0004\b\u0017\u0010y\u001a\u0005\b\u0080\u0001\u0010AR\u001b\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006¢\u0006\u000e\n\u0005\b\u0019\u0010\u0081\u0001\u001a\u0005\b\u0082\u0001\u0010IR\u001b\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0006¢\u0006\u000e\n\u0005\b\u001b\u0010\u0083\u0001\u001a\u0005\b\u0084\u0001\u0010KR\u001a\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\r\n\u0004\b\u001c\u0010k\u001a\u0005\b\u0085\u0001\u00101R\u001a\u0010\u001d\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\r\n\u0004\b\u001d\u0010}\u001a\u0005\b\u0086\u0001\u0010ER\u001a\u0010\u001e\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\r\n\u0004\b\u001e\u0010}\u001a\u0005\b\u0087\u0001\u0010ER\u001b\u0010 \u001a\u0004\u0018\u00010\u001f8\u0006¢\u0006\u000e\n\u0005\b \u0010\u0088\u0001\u001a\u0005\b\u0089\u0001\u0010PR\u001b\u0010!\u001a\u0004\u0018\u00010\u001f8\u0006¢\u0006\u000e\n\u0005\b!\u0010\u0088\u0001\u001a\u0005\b\u008a\u0001\u0010PR\u001a\u0010\"\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\r\n\u0004\b\"\u0010}\u001a\u0005\b\u008b\u0001\u0010ER\u001a\u0010#\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\r\n\u0004\b#\u0010}\u001a\u0005\b\u008c\u0001\u0010ER\u0019\u0010$\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b$\u0010y\u001a\u0004\b$\u0010AR\u001b\u0010%\u001a\u0004\u0018\u00010\u001f8\u0006¢\u0006\u000e\n\u0005\b%\u0010\u0088\u0001\u001a\u0005\b\u008d\u0001\u0010PR\u0019\u0010&\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b&\u0010y\u001a\u0004\b&\u0010AR\u001a\u0010'\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\r\n\u0004\b'\u0010k\u001a\u0005\b\u008e\u0001\u00101R\u001a\u0010(\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\r\n\u0004\b(\u0010k\u001a\u0005\b\u008f\u0001\u00101R\u0016\u0010\u0091\u0001\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0090\u0001\u00101¨\u0006\u0095\u0001"}, d2 = {"com/anthropic/claude/analytics/events/ChatEvents$SendMessageFailed", "Lcom/anthropic/claude/analytics/events/AnalyticsEvent;", "", "organization_uuid", "conversation_uuid", "", "document_attachment_count", "image_attachment_count", "mm_document_count", "Lcom/anthropic/claude/analytics/events/ChatEvents$SendMessageFailureReason;", "reason", "", "is_retry_message", "is_partial_response", "cause", "model", "edit_message_id", "project_id", "auto_recovered", "error_message", "error_type", "error_http_code", "stop_reason", "was_in_background", "Lcom/anthropic/claude/analytics/events/ChatEvents$StreamingErrorSource;", "error_source", "Lcom/anthropic/claude/analytics/events/ChatEvents$StreamingEndpointType;", "endpoint_type", "message_uuid", "content_block_count", "total_content_length", "", "time_to_first_token_ms", "total_time_ms", "total_conversation_messages", "total_conversation_content_length_estimate", "is_free_tier", "time_in_background_ms", "is_temporary_chat", "error_code", "error_request_id", "<init>", "(Ljava/lang/String;Ljava/lang/String;IIILcom/anthropic/claude/analytics/events/ChatEvents$SendMessageFailureReason;ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Lcom/anthropic/claude/analytics/events/ChatEvents$StreamingErrorSource;Lcom/anthropic/claude/analytics/events/ChatEvents$StreamingEndpointType;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)V", "seen0", "seen1", "Lvnf;", "serializationConstructorMarker", "(IILjava/lang/String;Ljava/lang/String;IIILcom/anthropic/claude/analytics/events/ChatEvents$SendMessageFailureReason;ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Lcom/anthropic/claude/analytics/events/ChatEvents$StreamingErrorSource;Lcom/anthropic/claude/analytics/events/ChatEvents$StreamingEndpointType;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lvnf;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()I", "component4", "component5", "component6", "()Lcom/anthropic/claude/analytics/events/ChatEvents$SendMessageFailureReason;", "component7", "()Z", "component8", "component9", "component10", "component11", "component12", "component13", "()Ljava/lang/Boolean;", "component14", "component15", "component16", "()Ljava/lang/Integer;", "component17", "component18", "component19", "()Lcom/anthropic/claude/analytics/events/ChatEvents$StreamingErrorSource;", "component20", "()Lcom/anthropic/claude/analytics/events/ChatEvents$StreamingEndpointType;", "component21", "component22", "component23", "component24", "()Ljava/lang/Long;", "component25", "component26", "component27", "component28", "component29", "component30", "component31", "component32", "Lcom/anthropic/claude/analytics/events/ChatEvents$SendMessageFailed;", "copy", "(Ljava/lang/String;Ljava/lang/String;IIILcom/anthropic/claude/analytics/events/ChatEvents$SendMessageFailureReason;ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Lcom/anthropic/claude/analytics/events/ChatEvents$StreamingErrorSource;Lcom/anthropic/claude/analytics/events/ChatEvents$StreamingEndpointType;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)Lcom/anthropic/claude/analytics/events/ChatEvents$SendMessageFailed;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$analytics", "(Lcom/anthropic/claude/analytics/events/ChatEvents$SendMessageFailed;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/lang/String;", "getOrganization_uuid", "getConversation_uuid", "I", "getDocument_attachment_count", "getImage_attachment_count", "getMm_document_count", "Lcom/anthropic/claude/analytics/events/ChatEvents$SendMessageFailureReason;", "getReason", "Z", "getCause", "getModel", "getEdit_message_id", "getProject_id", "Ljava/lang/Boolean;", "getAuto_recovered", "getError_message", "getError_type", "Ljava/lang/Integer;", "getError_http_code", "getStop_reason", "getWas_in_background", "Lcom/anthropic/claude/analytics/events/ChatEvents$StreamingErrorSource;", "getError_source", "Lcom/anthropic/claude/analytics/events/ChatEvents$StreamingEndpointType;", "getEndpoint_type", "getMessage_uuid", "getContent_block_count", "getTotal_content_length", "Ljava/lang/Long;", "getTime_to_first_token_ms", "getTotal_time_ms", "getTotal_conversation_messages", "getTotal_conversation_content_length_estimate", "getTime_in_background_ms", "getError_code", "getError_request_id", "getEventName", "eventName", "Companion", "yq2", "zq2", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class ChatEvents$SendMessageFailed implements AnalyticsEvent {
    private static final kw9[] $childSerializers;
    public static final int $stable = 0;
    public static final zq2 Companion = new zq2();
    private final Boolean auto_recovered;
    private final String cause;
    private final Integer content_block_count;
    private final String conversation_uuid;
    private final int document_attachment_count;
    private final String edit_message_id;
    private final ChatEvents$StreamingEndpointType endpoint_type;
    private final String error_code;
    private final Integer error_http_code;
    private final String error_message;
    private final String error_request_id;
    private final ChatEvents$StreamingErrorSource error_source;
    private final String error_type;
    private final int image_attachment_count;
    private final Boolean is_free_tier;
    private final boolean is_partial_response;
    private final boolean is_retry_message;
    private final Boolean is_temporary_chat;
    private final String message_uuid;
    private final int mm_document_count;
    private final String model;
    private final String organization_uuid;
    private final String project_id;
    private final ChatEvents$SendMessageFailureReason reason;
    private final String stop_reason;
    private final Long time_in_background_ms;
    private final Long time_to_first_token_ms;
    private final Integer total_content_length;
    private final Integer total_conversation_content_length_estimate;
    private final Integer total_conversation_messages;
    private final Long total_time_ms;
    private final Boolean was_in_background;

    static {
        ao2 ao2Var = new ao2(29);
        w1a w1aVar = w1a.F;
        $childSerializers = new kw9[]{null, null, null, null, null, yb5.w(w1aVar, ao2Var), null, null, null, null, null, null, null, null, null, null, null, null, yb5.w(w1aVar, new xq2(0)), yb5.w(w1aVar, new xq2(1)), null, null, null, null, null, null, null, null, null, null, null, null};
    }

    public ChatEvents$SendMessageFailed(int i, int i2, String str, String str2, int i3, int i4, int i5, ChatEvents$SendMessageFailureReason chatEvents$SendMessageFailureReason, boolean z, boolean z2, String str3, String str4, String str5, String str6, Boolean bool, String str7, String str8, Integer num, String str9, Boolean bool2, ChatEvents$StreamingErrorSource chatEvents$StreamingErrorSource, ChatEvents$StreamingEndpointType chatEvents$StreamingEndpointType, String str10, Integer num2, Integer num3, Long l, Long l2, Integer num4, Integer num5, Boolean bool3, Long l3, Boolean bool4, String str11, String str12, vnf vnfVar) {
        if (511 != (i & 511)) {
            int[] iArr = {i, i2};
            int[] iArr2 = {511, 0};
            SerialDescriptor descriptor = yq2.a.getDescriptor();
            descriptor.getClass();
            ArrayList arrayList = new ArrayList();
            for (int i6 = 0; i6 < 2; i6++) {
                int i7 = iArr2[i6] & (~iArr[i6]);
                if (i7 != 0) {
                    for (int i8 = 0; i8 < 32; i8++) {
                        if ((i7 & 1) != 0) {
                            arrayList.add(descriptor.f((i6 * 32) + i8));
                        }
                        i7 >>>= 1;
                    }
                }
            }
            throw new MissingFieldException(descriptor.a(), arrayList);
        }
        this.organization_uuid = str;
        this.conversation_uuid = str2;
        this.document_attachment_count = i3;
        this.image_attachment_count = i4;
        this.mm_document_count = i5;
        this.reason = chatEvents$SendMessageFailureReason;
        this.is_retry_message = z;
        this.is_partial_response = z2;
        this.cause = str3;
        if ((i & 512) == 0) {
            this.model = null;
        } else {
            this.model = str4;
        }
        if ((i & FreeTypeConstants.FT_LOAD_NO_RECURSE) == 0) {
            this.edit_message_id = null;
        } else {
            this.edit_message_id = str5;
        }
        if ((i & FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM) == 0) {
            this.project_id = null;
        } else {
            this.project_id = str6;
        }
        if ((i & FreeTypeConstants.FT_LOAD_MONOCHROME) == 0) {
            this.auto_recovered = null;
        } else {
            this.auto_recovered = bool;
        }
        if ((i & FreeTypeConstants.FT_LOAD_LINEAR_DESIGN) == 0) {
            this.error_message = null;
        } else {
            this.error_message = str7;
        }
        if ((i & 16384) == 0) {
            this.error_type = null;
        } else {
            this.error_type = str8;
        }
        if ((32768 & i) == 0) {
            this.error_http_code = null;
        } else {
            this.error_http_code = num;
        }
        if ((65536 & i) == 0) {
            this.stop_reason = null;
        } else {
            this.stop_reason = str9;
        }
        if ((131072 & i) == 0) {
            this.was_in_background = null;
        } else {
            this.was_in_background = bool2;
        }
        if ((262144 & i) == 0) {
            this.error_source = null;
        } else {
            this.error_source = chatEvents$StreamingErrorSource;
        }
        if ((524288 & i) == 0) {
            this.endpoint_type = null;
        } else {
            this.endpoint_type = chatEvents$StreamingEndpointType;
        }
        if ((1048576 & i) == 0) {
            this.message_uuid = null;
        } else {
            this.message_uuid = str10;
        }
        if ((2097152 & i) == 0) {
            this.content_block_count = null;
        } else {
            this.content_block_count = num2;
        }
        if ((4194304 & i) == 0) {
            this.total_content_length = null;
        } else {
            this.total_content_length = num3;
        }
        if ((8388608 & i) == 0) {
            this.time_to_first_token_ms = null;
        } else {
            this.time_to_first_token_ms = l;
        }
        if ((16777216 & i) == 0) {
            this.total_time_ms = null;
        } else {
            this.total_time_ms = l2;
        }
        if ((33554432 & i) == 0) {
            this.total_conversation_messages = null;
        } else {
            this.total_conversation_messages = num4;
        }
        if ((67108864 & i) == 0) {
            this.total_conversation_content_length_estimate = null;
        } else {
            this.total_conversation_content_length_estimate = num5;
        }
        if ((134217728 & i) == 0) {
            this.is_free_tier = null;
        } else {
            this.is_free_tier = bool3;
        }
        if ((268435456 & i) == 0) {
            this.time_in_background_ms = null;
        } else {
            this.time_in_background_ms = l3;
        }
        if ((536870912 & i) == 0) {
            this.is_temporary_chat = null;
        } else {
            this.is_temporary_chat = bool4;
        }
        if ((1073741824 & i) == 0) {
            this.error_code = null;
        } else {
            this.error_code = str11;
        }
        if ((i & Integer.MIN_VALUE) == 0) {
            this.error_request_id = null;
        } else {
            this.error_request_id = str12;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return ChatEvents$SendMessageFailureReason.Companion.serializer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return ChatEvents$StreamingErrorSource.Companion.serializer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$1() {
        return ChatEvents$StreamingEndpointType.Companion.serializer();
    }

    public static /* synthetic */ ChatEvents$SendMessageFailed copy$default(ChatEvents$SendMessageFailed chatEvents$SendMessageFailed, String str, String str2, int i, int i2, int i3, ChatEvents$SendMessageFailureReason chatEvents$SendMessageFailureReason, boolean z, boolean z2, String str3, String str4, String str5, String str6, Boolean bool, String str7, String str8, Integer num, String str9, Boolean bool2, ChatEvents$StreamingErrorSource chatEvents$StreamingErrorSource, ChatEvents$StreamingEndpointType chatEvents$StreamingEndpointType, String str10, Integer num2, Integer num3, Long l, Long l2, Integer num4, Integer num5, Boolean bool3, Long l3, Boolean bool4, String str11, String str12, int i4, Object obj) {
        String str13;
        String str14;
        Integer num6;
        String str15;
        Boolean bool5;
        ChatEvents$StreamingErrorSource chatEvents$StreamingErrorSource2;
        ChatEvents$StreamingEndpointType chatEvents$StreamingEndpointType2;
        String str16;
        Integer num7;
        Integer num8;
        Long l4;
        Long l5;
        Integer num9;
        Integer num10;
        Boolean bool6;
        Long l6;
        Boolean bool7;
        String str17;
        String str18;
        int i5;
        int i6;
        int i7;
        ChatEvents$SendMessageFailureReason chatEvents$SendMessageFailureReason2;
        boolean z3;
        boolean z4;
        String str19;
        String str20;
        String str21;
        String str22;
        Boolean bool8;
        String str23;
        String str24 = (i4 & 1) != 0 ? chatEvents$SendMessageFailed.organization_uuid : str;
        String str25 = (i4 & 2) != 0 ? chatEvents$SendMessageFailed.conversation_uuid : str2;
        int i8 = (i4 & 4) != 0 ? chatEvents$SendMessageFailed.document_attachment_count : i;
        int i9 = (i4 & 8) != 0 ? chatEvents$SendMessageFailed.image_attachment_count : i2;
        int i10 = (i4 & 16) != 0 ? chatEvents$SendMessageFailed.mm_document_count : i3;
        ChatEvents$SendMessageFailureReason chatEvents$SendMessageFailureReason3 = (i4 & 32) != 0 ? chatEvents$SendMessageFailed.reason : chatEvents$SendMessageFailureReason;
        boolean z5 = (i4 & 64) != 0 ? chatEvents$SendMessageFailed.is_retry_message : z;
        boolean z6 = (i4 & FreeTypeConstants.FT_LOAD_PEDANTIC) != 0 ? chatEvents$SendMessageFailed.is_partial_response : z2;
        String str26 = (i4 & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) != 0 ? chatEvents$SendMessageFailed.cause : str3;
        String str27 = (i4 & 512) != 0 ? chatEvents$SendMessageFailed.model : str4;
        String str28 = (i4 & FreeTypeConstants.FT_LOAD_NO_RECURSE) != 0 ? chatEvents$SendMessageFailed.edit_message_id : str5;
        String str29 = (i4 & FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM) != 0 ? chatEvents$SendMessageFailed.project_id : str6;
        Boolean bool9 = (i4 & FreeTypeConstants.FT_LOAD_MONOCHROME) != 0 ? chatEvents$SendMessageFailed.auto_recovered : bool;
        String str30 = (i4 & FreeTypeConstants.FT_LOAD_LINEAR_DESIGN) != 0 ? chatEvents$SendMessageFailed.error_message : str7;
        String str31 = str24;
        String str32 = (i4 & 16384) != 0 ? chatEvents$SendMessageFailed.error_type : str8;
        Integer num11 = (i4 & FreeTypeConstants.FT_LOAD_NO_AUTOHINT) != 0 ? chatEvents$SendMessageFailed.error_http_code : num;
        String str33 = (i4 & 65536) != 0 ? chatEvents$SendMessageFailed.stop_reason : str9;
        Boolean bool10 = (i4 & 131072) != 0 ? chatEvents$SendMessageFailed.was_in_background : bool2;
        ChatEvents$StreamingErrorSource chatEvents$StreamingErrorSource3 = (i4 & 262144) != 0 ? chatEvents$SendMessageFailed.error_source : chatEvents$StreamingErrorSource;
        ChatEvents$StreamingEndpointType chatEvents$StreamingEndpointType3 = (i4 & 524288) != 0 ? chatEvents$SendMessageFailed.endpoint_type : chatEvents$StreamingEndpointType;
        String str34 = (i4 & FreeTypeConstants.FT_LOAD_COLOR) != 0 ? chatEvents$SendMessageFailed.message_uuid : str10;
        Integer num12 = (i4 & FreeTypeConstants.FT_LOAD_COMPUTE_METRICS) != 0 ? chatEvents$SendMessageFailed.content_block_count : num2;
        Integer num13 = (i4 & 4194304) != 0 ? chatEvents$SendMessageFailed.total_content_length : num3;
        Long l7 = (i4 & 8388608) != 0 ? chatEvents$SendMessageFailed.time_to_first_token_ms : l;
        Long l8 = (i4 & 16777216) != 0 ? chatEvents$SendMessageFailed.total_time_ms : l2;
        Integer num14 = (i4 & 33554432) != 0 ? chatEvents$SendMessageFailed.total_conversation_messages : num4;
        Integer num15 = (i4 & 67108864) != 0 ? chatEvents$SendMessageFailed.total_conversation_content_length_estimate : num5;
        Boolean bool11 = (i4 & 134217728) != 0 ? chatEvents$SendMessageFailed.is_free_tier : bool3;
        Long l9 = (i4 & 268435456) != 0 ? chatEvents$SendMessageFailed.time_in_background_ms : l3;
        Boolean bool12 = (i4 & 536870912) != 0 ? chatEvents$SendMessageFailed.is_temporary_chat : bool4;
        String str35 = (i4 & 1073741824) != 0 ? chatEvents$SendMessageFailed.error_code : str11;
        if ((i4 & Integer.MIN_VALUE) != 0) {
            str14 = str35;
            str13 = chatEvents$SendMessageFailed.error_request_id;
            str15 = str33;
            bool5 = bool10;
            chatEvents$StreamingErrorSource2 = chatEvents$StreamingErrorSource3;
            chatEvents$StreamingEndpointType2 = chatEvents$StreamingEndpointType3;
            str16 = str34;
            num7 = num12;
            num8 = num13;
            l4 = l7;
            l5 = l8;
            num9 = num14;
            num10 = num15;
            bool6 = bool11;
            l6 = l9;
            bool7 = bool12;
            str17 = str32;
            str18 = str25;
            i5 = i8;
            i6 = i9;
            i7 = i10;
            chatEvents$SendMessageFailureReason2 = chatEvents$SendMessageFailureReason3;
            z3 = z5;
            z4 = z6;
            str19 = str26;
            str20 = str27;
            str21 = str28;
            str22 = str29;
            bool8 = bool9;
            str23 = str30;
            num6 = num11;
        } else {
            str13 = str12;
            str14 = str35;
            num6 = num11;
            str15 = str33;
            bool5 = bool10;
            chatEvents$StreamingErrorSource2 = chatEvents$StreamingErrorSource3;
            chatEvents$StreamingEndpointType2 = chatEvents$StreamingEndpointType3;
            str16 = str34;
            num7 = num12;
            num8 = num13;
            l4 = l7;
            l5 = l8;
            num9 = num14;
            num10 = num15;
            bool6 = bool11;
            l6 = l9;
            bool7 = bool12;
            str17 = str32;
            str18 = str25;
            i5 = i8;
            i6 = i9;
            i7 = i10;
            chatEvents$SendMessageFailureReason2 = chatEvents$SendMessageFailureReason3;
            z3 = z5;
            z4 = z6;
            str19 = str26;
            str20 = str27;
            str21 = str28;
            str22 = str29;
            bool8 = bool9;
            str23 = str30;
        }
        return chatEvents$SendMessageFailed.copy(str31, str18, i5, i6, i7, chatEvents$SendMessageFailureReason2, z3, z4, str19, str20, str21, str22, bool8, str23, str17, num6, str15, bool5, chatEvents$StreamingErrorSource2, chatEvents$StreamingEndpointType2, str16, num7, num8, l4, l5, num9, num10, bool6, l6, bool7, str14, str13);
    }

    public static final /* synthetic */ void write$Self$analytics(ChatEvents$SendMessageFailed self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        output.q(serialDesc, 0, self.organization_uuid);
        output.q(serialDesc, 1, self.conversation_uuid);
        output.l(2, self.document_attachment_count, serialDesc);
        output.l(3, self.image_attachment_count, serialDesc);
        output.l(4, self.mm_document_count, serialDesc);
        output.r(serialDesc, 5, (znf) kw9VarArr[5].getValue(), self.reason);
        output.p(serialDesc, 6, self.is_retry_message);
        output.p(serialDesc, 7, self.is_partial_response);
        output.q(serialDesc, 8, self.cause);
        if (output.E(serialDesc) || self.model != null) {
            output.B(serialDesc, 9, srg.a, self.model);
        }
        if (output.E(serialDesc) || self.edit_message_id != null) {
            output.B(serialDesc, 10, srg.a, self.edit_message_id);
        }
        if (output.E(serialDesc) || self.project_id != null) {
            output.B(serialDesc, 11, srg.a, self.project_id);
        }
        if (output.E(serialDesc) || self.auto_recovered != null) {
            output.B(serialDesc, 12, zt1.a, self.auto_recovered);
        }
        if (output.E(serialDesc) || self.error_message != null) {
            output.B(serialDesc, 13, srg.a, self.error_message);
        }
        if (output.E(serialDesc) || self.error_type != null) {
            output.B(serialDesc, 14, srg.a, self.error_type);
        }
        if (output.E(serialDesc) || self.error_http_code != null) {
            output.B(serialDesc, 15, e79.a, self.error_http_code);
        }
        if (output.E(serialDesc) || self.stop_reason != null) {
            output.B(serialDesc, 16, srg.a, self.stop_reason);
        }
        if (output.E(serialDesc) || self.was_in_background != null) {
            output.B(serialDesc, 17, zt1.a, self.was_in_background);
        }
        if (output.E(serialDesc) || self.error_source != null) {
            output.B(serialDesc, 18, (znf) kw9VarArr[18].getValue(), self.error_source);
        }
        if (output.E(serialDesc) || self.endpoint_type != null) {
            output.B(serialDesc, 19, (znf) kw9VarArr[19].getValue(), self.endpoint_type);
        }
        if (output.E(serialDesc) || self.message_uuid != null) {
            output.B(serialDesc, 20, srg.a, self.message_uuid);
        }
        if (output.E(serialDesc) || self.content_block_count != null) {
            output.B(serialDesc, 21, e79.a, self.content_block_count);
        }
        if (output.E(serialDesc) || self.total_content_length != null) {
            output.B(serialDesc, 22, e79.a, self.total_content_length);
        }
        if (output.E(serialDesc) || self.time_to_first_token_ms != null) {
            output.B(serialDesc, 23, xka.a, self.time_to_first_token_ms);
        }
        if (output.E(serialDesc) || self.total_time_ms != null) {
            output.B(serialDesc, 24, xka.a, self.total_time_ms);
        }
        if (output.E(serialDesc) || self.total_conversation_messages != null) {
            output.B(serialDesc, 25, e79.a, self.total_conversation_messages);
        }
        if (output.E(serialDesc) || self.total_conversation_content_length_estimate != null) {
            output.B(serialDesc, 26, e79.a, self.total_conversation_content_length_estimate);
        }
        if (output.E(serialDesc) || self.is_free_tier != null) {
            output.B(serialDesc, 27, zt1.a, self.is_free_tier);
        }
        if (output.E(serialDesc) || self.time_in_background_ms != null) {
            output.B(serialDesc, 28, xka.a, self.time_in_background_ms);
        }
        if (output.E(serialDesc) || self.is_temporary_chat != null) {
            output.B(serialDesc, 29, zt1.a, self.is_temporary_chat);
        }
        if (output.E(serialDesc) || self.error_code != null) {
            output.B(serialDesc, 30, srg.a, self.error_code);
        }
        if (!output.E(serialDesc) && self.error_request_id == null) {
            return;
        }
        output.B(serialDesc, 31, srg.a, self.error_request_id);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getOrganization_uuid() {
        return this.organization_uuid;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getModel() {
        return this.model;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getEdit_message_id() {
        return this.edit_message_id;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getProject_id() {
        return this.project_id;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final Boolean getAuto_recovered() {
        return this.auto_recovered;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getError_message() {
        return this.error_message;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getError_type() {
        return this.error_type;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final Integer getError_http_code() {
        return this.error_http_code;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final String getStop_reason() {
        return this.stop_reason;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final Boolean getWas_in_background() {
        return this.was_in_background;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final ChatEvents$StreamingErrorSource getError_source() {
        return this.error_source;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getConversation_uuid() {
        return this.conversation_uuid;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final ChatEvents$StreamingEndpointType getEndpoint_type() {
        return this.endpoint_type;
    }

    /* JADX INFO: renamed from: component21, reason: from getter */
    public final String getMessage_uuid() {
        return this.message_uuid;
    }

    /* JADX INFO: renamed from: component22, reason: from getter */
    public final Integer getContent_block_count() {
        return this.content_block_count;
    }

    /* JADX INFO: renamed from: component23, reason: from getter */
    public final Integer getTotal_content_length() {
        return this.total_content_length;
    }

    /* JADX INFO: renamed from: component24, reason: from getter */
    public final Long getTime_to_first_token_ms() {
        return this.time_to_first_token_ms;
    }

    /* JADX INFO: renamed from: component25, reason: from getter */
    public final Long getTotal_time_ms() {
        return this.total_time_ms;
    }

    /* JADX INFO: renamed from: component26, reason: from getter */
    public final Integer getTotal_conversation_messages() {
        return this.total_conversation_messages;
    }

    /* JADX INFO: renamed from: component27, reason: from getter */
    public final Integer getTotal_conversation_content_length_estimate() {
        return this.total_conversation_content_length_estimate;
    }

    /* JADX INFO: renamed from: component28, reason: from getter */
    public final Boolean getIs_free_tier() {
        return this.is_free_tier;
    }

    /* JADX INFO: renamed from: component29, reason: from getter */
    public final Long getTime_in_background_ms() {
        return this.time_in_background_ms;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getDocument_attachment_count() {
        return this.document_attachment_count;
    }

    /* JADX INFO: renamed from: component30, reason: from getter */
    public final Boolean getIs_temporary_chat() {
        return this.is_temporary_chat;
    }

    /* JADX INFO: renamed from: component31, reason: from getter */
    public final String getError_code() {
        return this.error_code;
    }

    /* JADX INFO: renamed from: component32, reason: from getter */
    public final String getError_request_id() {
        return this.error_request_id;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getImage_attachment_count() {
        return this.image_attachment_count;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getMm_document_count() {
        return this.mm_document_count;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final ChatEvents$SendMessageFailureReason getReason() {
        return this.reason;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getIs_retry_message() {
        return this.is_retry_message;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final boolean getIs_partial_response() {
        return this.is_partial_response;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getCause() {
        return this.cause;
    }

    public final ChatEvents$SendMessageFailed copy(String organization_uuid, String conversation_uuid, int document_attachment_count, int image_attachment_count, int mm_document_count, ChatEvents$SendMessageFailureReason reason, boolean is_retry_message, boolean is_partial_response, String cause, String model, String edit_message_id, String project_id, Boolean auto_recovered, String error_message, String error_type, Integer error_http_code, String stop_reason, Boolean was_in_background, ChatEvents$StreamingErrorSource error_source, ChatEvents$StreamingEndpointType endpoint_type, String message_uuid, Integer content_block_count, Integer total_content_length, Long time_to_first_token_ms, Long total_time_ms, Integer total_conversation_messages, Integer total_conversation_content_length_estimate, Boolean is_free_tier, Long time_in_background_ms, Boolean is_temporary_chat, String error_code, String error_request_id) {
        organization_uuid.getClass();
        conversation_uuid.getClass();
        reason.getClass();
        cause.getClass();
        return new ChatEvents$SendMessageFailed(organization_uuid, conversation_uuid, document_attachment_count, image_attachment_count, mm_document_count, reason, is_retry_message, is_partial_response, cause, model, edit_message_id, project_id, auto_recovered, error_message, error_type, error_http_code, stop_reason, was_in_background, error_source, endpoint_type, message_uuid, content_block_count, total_content_length, time_to_first_token_ms, total_time_ms, total_conversation_messages, total_conversation_content_length_estimate, is_free_tier, time_in_background_ms, is_temporary_chat, error_code, error_request_id);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChatEvents$SendMessageFailed)) {
            return false;
        }
        ChatEvents$SendMessageFailed chatEvents$SendMessageFailed = (ChatEvents$SendMessageFailed) other;
        return x44.r(this.organization_uuid, chatEvents$SendMessageFailed.organization_uuid) && x44.r(this.conversation_uuid, chatEvents$SendMessageFailed.conversation_uuid) && this.document_attachment_count == chatEvents$SendMessageFailed.document_attachment_count && this.image_attachment_count == chatEvents$SendMessageFailed.image_attachment_count && this.mm_document_count == chatEvents$SendMessageFailed.mm_document_count && this.reason == chatEvents$SendMessageFailed.reason && this.is_retry_message == chatEvents$SendMessageFailed.is_retry_message && this.is_partial_response == chatEvents$SendMessageFailed.is_partial_response && x44.r(this.cause, chatEvents$SendMessageFailed.cause) && x44.r(this.model, chatEvents$SendMessageFailed.model) && x44.r(this.edit_message_id, chatEvents$SendMessageFailed.edit_message_id) && x44.r(this.project_id, chatEvents$SendMessageFailed.project_id) && x44.r(this.auto_recovered, chatEvents$SendMessageFailed.auto_recovered) && x44.r(this.error_message, chatEvents$SendMessageFailed.error_message) && x44.r(this.error_type, chatEvents$SendMessageFailed.error_type) && x44.r(this.error_http_code, chatEvents$SendMessageFailed.error_http_code) && x44.r(this.stop_reason, chatEvents$SendMessageFailed.stop_reason) && x44.r(this.was_in_background, chatEvents$SendMessageFailed.was_in_background) && this.error_source == chatEvents$SendMessageFailed.error_source && this.endpoint_type == chatEvents$SendMessageFailed.endpoint_type && x44.r(this.message_uuid, chatEvents$SendMessageFailed.message_uuid) && x44.r(this.content_block_count, chatEvents$SendMessageFailed.content_block_count) && x44.r(this.total_content_length, chatEvents$SendMessageFailed.total_content_length) && x44.r(this.time_to_first_token_ms, chatEvents$SendMessageFailed.time_to_first_token_ms) && x44.r(this.total_time_ms, chatEvents$SendMessageFailed.total_time_ms) && x44.r(this.total_conversation_messages, chatEvents$SendMessageFailed.total_conversation_messages) && x44.r(this.total_conversation_content_length_estimate, chatEvents$SendMessageFailed.total_conversation_content_length_estimate) && x44.r(this.is_free_tier, chatEvents$SendMessageFailed.is_free_tier) && x44.r(this.time_in_background_ms, chatEvents$SendMessageFailed.time_in_background_ms) && x44.r(this.is_temporary_chat, chatEvents$SendMessageFailed.is_temporary_chat) && x44.r(this.error_code, chatEvents$SendMessageFailed.error_code) && x44.r(this.error_request_id, chatEvents$SendMessageFailed.error_request_id);
    }

    public final Boolean getAuto_recovered() {
        return this.auto_recovered;
    }

    public final String getCause() {
        return this.cause;
    }

    public final Integer getContent_block_count() {
        return this.content_block_count;
    }

    public final String getConversation_uuid() {
        return this.conversation_uuid;
    }

    public final int getDocument_attachment_count() {
        return this.document_attachment_count;
    }

    public final String getEdit_message_id() {
        return this.edit_message_id;
    }

    public final ChatEvents$StreamingEndpointType getEndpoint_type() {
        return this.endpoint_type;
    }

    public final String getError_code() {
        return this.error_code;
    }

    public final Integer getError_http_code() {
        return this.error_http_code;
    }

    public final String getError_message() {
        return this.error_message;
    }

    public final String getError_request_id() {
        return this.error_request_id;
    }

    public final ChatEvents$StreamingErrorSource getError_source() {
        return this.error_source;
    }

    public final String getError_type() {
        return this.error_type;
    }

    @Override // com.anthropic.claude.analytics.events.AnalyticsEvent
    public String getEventName() {
        return "mobile_send_message_failed";
    }

    public final int getImage_attachment_count() {
        return this.image_attachment_count;
    }

    public final String getMessage_uuid() {
        return this.message_uuid;
    }

    public final int getMm_document_count() {
        return this.mm_document_count;
    }

    public final String getModel() {
        return this.model;
    }

    public final String getOrganization_uuid() {
        return this.organization_uuid;
    }

    public final String getProject_id() {
        return this.project_id;
    }

    public final ChatEvents$SendMessageFailureReason getReason() {
        return this.reason;
    }

    public final String getStop_reason() {
        return this.stop_reason;
    }

    public final Long getTime_in_background_ms() {
        return this.time_in_background_ms;
    }

    public final Long getTime_to_first_token_ms() {
        return this.time_to_first_token_ms;
    }

    public final Integer getTotal_content_length() {
        return this.total_content_length;
    }

    public final Integer getTotal_conversation_content_length_estimate() {
        return this.total_conversation_content_length_estimate;
    }

    public final Integer getTotal_conversation_messages() {
        return this.total_conversation_messages;
    }

    public final Long getTotal_time_ms() {
        return this.total_time_ms;
    }

    public final Boolean getWas_in_background() {
        return this.was_in_background;
    }

    public int hashCode() {
        int iL = kgh.l(fsh.p(fsh.p((this.reason.hashCode() + vb7.c(this.mm_document_count, vb7.c(this.image_attachment_count, vb7.c(this.document_attachment_count, kgh.l(this.organization_uuid.hashCode() * 31, 31, this.conversation_uuid), 31), 31), 31)) * 31, 31, this.is_retry_message), 31, this.is_partial_response), 31, this.cause);
        String str = this.model;
        int iHashCode = (iL + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.edit_message_id;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.project_id;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.auto_recovered;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str4 = this.error_message;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.error_type;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num = this.error_http_code;
        int iHashCode7 = (iHashCode6 + (num == null ? 0 : num.hashCode())) * 31;
        String str6 = this.stop_reason;
        int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Boolean bool2 = this.was_in_background;
        int iHashCode9 = (iHashCode8 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        ChatEvents$StreamingErrorSource chatEvents$StreamingErrorSource = this.error_source;
        int iHashCode10 = (iHashCode9 + (chatEvents$StreamingErrorSource == null ? 0 : chatEvents$StreamingErrorSource.hashCode())) * 31;
        ChatEvents$StreamingEndpointType chatEvents$StreamingEndpointType = this.endpoint_type;
        int iHashCode11 = (iHashCode10 + (chatEvents$StreamingEndpointType == null ? 0 : chatEvents$StreamingEndpointType.hashCode())) * 31;
        String str7 = this.message_uuid;
        int iHashCode12 = (iHashCode11 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Integer num2 = this.content_block_count;
        int iHashCode13 = (iHashCode12 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.total_content_length;
        int iHashCode14 = (iHashCode13 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Long l = this.time_to_first_token_ms;
        int iHashCode15 = (iHashCode14 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.total_time_ms;
        int iHashCode16 = (iHashCode15 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Integer num4 = this.total_conversation_messages;
        int iHashCode17 = (iHashCode16 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.total_conversation_content_length_estimate;
        int iHashCode18 = (iHashCode17 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Boolean bool3 = this.is_free_tier;
        int iHashCode19 = (iHashCode18 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Long l3 = this.time_in_background_ms;
        int iHashCode20 = (iHashCode19 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Boolean bool4 = this.is_temporary_chat;
        int iHashCode21 = (iHashCode20 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        String str8 = this.error_code;
        int iHashCode22 = (iHashCode21 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.error_request_id;
        return iHashCode22 + (str9 != null ? str9.hashCode() : 0);
    }

    public final Boolean is_free_tier() {
        return this.is_free_tier;
    }

    public final boolean is_partial_response() {
        return this.is_partial_response;
    }

    public final boolean is_retry_message() {
        return this.is_retry_message;
    }

    public final Boolean is_temporary_chat() {
        return this.is_temporary_chat;
    }

    public String toString() {
        String str = this.organization_uuid;
        String str2 = this.conversation_uuid;
        int i = this.document_attachment_count;
        int i2 = this.image_attachment_count;
        int i3 = this.mm_document_count;
        ChatEvents$SendMessageFailureReason chatEvents$SendMessageFailureReason = this.reason;
        boolean z = this.is_retry_message;
        boolean z2 = this.is_partial_response;
        String str3 = this.cause;
        String str4 = this.model;
        String str5 = this.edit_message_id;
        String str6 = this.project_id;
        Boolean bool = this.auto_recovered;
        String str7 = this.error_message;
        String str8 = this.error_type;
        Integer num = this.error_http_code;
        String str9 = this.stop_reason;
        Boolean bool2 = this.was_in_background;
        ChatEvents$StreamingErrorSource chatEvents$StreamingErrorSource = this.error_source;
        ChatEvents$StreamingEndpointType chatEvents$StreamingEndpointType = this.endpoint_type;
        String str10 = this.message_uuid;
        Integer num2 = this.content_block_count;
        Integer num3 = this.total_content_length;
        Long l = this.time_to_first_token_ms;
        Long l2 = this.total_time_ms;
        Integer num4 = this.total_conversation_messages;
        Integer num5 = this.total_conversation_content_length_estimate;
        Boolean bool3 = this.is_free_tier;
        Long l3 = this.time_in_background_ms;
        Boolean bool4 = this.is_temporary_chat;
        String str11 = this.error_code;
        String str12 = this.error_request_id;
        StringBuilder sbR = kgh.r("SendMessageFailed(organization_uuid=", str, ", conversation_uuid=", str2, ", document_attachment_count=");
        qy1.k(i, i2, ", image_attachment_count=", ", mm_document_count=", sbR);
        sbR.append(i3);
        sbR.append(", reason=");
        sbR.append(chatEvents$SendMessageFailureReason);
        sbR.append(", is_retry_message=");
        ij0.A(sbR, z, ", is_partial_response=", z2, ", cause=");
        kgh.u(sbR, str3, ", model=", str4, ", edit_message_id=");
        kgh.u(sbR, str5, ", project_id=", str6, ", auto_recovered=");
        sbR.append(bool);
        sbR.append(", error_message=");
        sbR.append(str7);
        sbR.append(", error_type=");
        sbR.append(str8);
        sbR.append(", error_http_code=");
        sbR.append(num);
        sbR.append(", stop_reason=");
        sbR.append(str9);
        sbR.append(", was_in_background=");
        sbR.append(bool2);
        sbR.append(", error_source=");
        sbR.append(chatEvents$StreamingErrorSource);
        sbR.append(", endpoint_type=");
        sbR.append(chatEvents$StreamingEndpointType);
        sbR.append(", message_uuid=");
        sbR.append(str10);
        sbR.append(", content_block_count=");
        sbR.append(num2);
        sbR.append(", total_content_length=");
        sbR.append(num3);
        sbR.append(", time_to_first_token_ms=");
        sbR.append(l);
        sbR.append(", total_time_ms=");
        sbR.append(l2);
        sbR.append(", total_conversation_messages=");
        sbR.append(num4);
        sbR.append(", total_conversation_content_length_estimate=");
        sbR.append(num5);
        sbR.append(", is_free_tier=");
        sbR.append(bool3);
        sbR.append(", time_in_background_ms=");
        sbR.append(l3);
        sbR.append(", is_temporary_chat=");
        sbR.append(bool4);
        sbR.append(", error_code=");
        return vb7.t(sbR, str11, ", error_request_id=", str12, ")");
    }

    public ChatEvents$SendMessageFailed(String str, String str2, int i, int i2, int i3, ChatEvents$SendMessageFailureReason chatEvents$SendMessageFailureReason, boolean z, boolean z2, String str3, String str4, String str5, String str6, Boolean bool, String str7, String str8, Integer num, String str9, Boolean bool2, ChatEvents$StreamingErrorSource chatEvents$StreamingErrorSource, ChatEvents$StreamingEndpointType chatEvents$StreamingEndpointType, String str10, Integer num2, Integer num3, Long l, Long l2, Integer num4, Integer num5, Boolean bool3, Long l3, Boolean bool4, String str11, String str12) {
        str.getClass();
        str2.getClass();
        chatEvents$SendMessageFailureReason.getClass();
        str3.getClass();
        this.organization_uuid = str;
        this.conversation_uuid = str2;
        this.document_attachment_count = i;
        this.image_attachment_count = i2;
        this.mm_document_count = i3;
        this.reason = chatEvents$SendMessageFailureReason;
        this.is_retry_message = z;
        this.is_partial_response = z2;
        this.cause = str3;
        this.model = str4;
        this.edit_message_id = str5;
        this.project_id = str6;
        this.auto_recovered = bool;
        this.error_message = str7;
        this.error_type = str8;
        this.error_http_code = num;
        this.stop_reason = str9;
        this.was_in_background = bool2;
        this.error_source = chatEvents$StreamingErrorSource;
        this.endpoint_type = chatEvents$StreamingEndpointType;
        this.message_uuid = str10;
        this.content_block_count = num2;
        this.total_content_length = num3;
        this.time_to_first_token_ms = l;
        this.total_time_ms = l2;
        this.total_conversation_messages = num4;
        this.total_conversation_content_length_estimate = num5;
        this.is_free_tier = bool3;
        this.time_in_background_ms = l3;
        this.is_temporary_chat = bool4;
        this.error_code = str11;
        this.error_request_id = str12;
    }

    public /* synthetic */ ChatEvents$SendMessageFailed(String str, String str2, int i, int i2, int i3, ChatEvents$SendMessageFailureReason chatEvents$SendMessageFailureReason, boolean z, boolean z2, String str3, String str4, String str5, String str6, Boolean bool, String str7, String str8, Integer num, String str9, Boolean bool2, ChatEvents$StreamingErrorSource chatEvents$StreamingErrorSource, ChatEvents$StreamingEndpointType chatEvents$StreamingEndpointType, String str10, Integer num2, Integer num3, Long l, Long l2, Integer num4, Integer num5, Boolean bool3, Long l3, Boolean bool4, String str11, String str12, int i4, mq5 mq5Var) {
        this(str, str2, i, i2, i3, chatEvents$SendMessageFailureReason, z, z2, str3, (i4 & 512) != 0 ? null : str4, (i4 & FreeTypeConstants.FT_LOAD_NO_RECURSE) != 0 ? null : str5, (i4 & FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM) != 0 ? null : str6, (i4 & FreeTypeConstants.FT_LOAD_MONOCHROME) != 0 ? null : bool, (i4 & FreeTypeConstants.FT_LOAD_LINEAR_DESIGN) != 0 ? null : str7, (i4 & 16384) != 0 ? null : str8, (32768 & i4) != 0 ? null : num, (65536 & i4) != 0 ? null : str9, (131072 & i4) != 0 ? null : bool2, (262144 & i4) != 0 ? null : chatEvents$StreamingErrorSource, (524288 & i4) != 0 ? null : chatEvents$StreamingEndpointType, (1048576 & i4) != 0 ? null : str10, (2097152 & i4) != 0 ? null : num2, (4194304 & i4) != 0 ? null : num3, (8388608 & i4) != 0 ? null : l, (16777216 & i4) != 0 ? null : l2, (33554432 & i4) != 0 ? null : num4, (67108864 & i4) != 0 ? null : num5, (134217728 & i4) != 0 ? null : bool3, (268435456 & i4) != 0 ? null : l3, (536870912 & i4) != 0 ? null : bool4, (1073741824 & i4) != 0 ? null : str11, (i4 & Integer.MIN_VALUE) != 0 ? null : str12);
    }
}
