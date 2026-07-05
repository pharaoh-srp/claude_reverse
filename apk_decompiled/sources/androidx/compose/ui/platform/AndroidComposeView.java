package androidx.compose.ui.platform;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.StrictMode;
import android.os.Trace;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.view.FocusFinder;
import android.view.GestureDetector;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.ScrollCaptureTarget;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.AnimationUtils;
import android.view.autofill.AutofillManager;
import android.view.autofill.AutofillValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.compose.ui.node.Owner;
import androidx.lifecycle.DefaultLifecycleObserver;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.anthropic.claude.api.experience.ExperienceToggle;
import com.pvporbit.freetype.FreeTypeConstants;
import defpackage.a00;
import defpackage.a10;
import defpackage.a5;
import defpackage.abd;
import defpackage.an8;
import defpackage.aok;
import defpackage.aqa;
import defpackage.av9;
import defpackage.ayi;
import defpackage.b00;
import defpackage.b39;
import defpackage.b3d;
import defpackage.b8d;
import defpackage.beg;
import defpackage.bz;
import defpackage.bz7;
import defpackage.c00;
import defpackage.c45;
import defpackage.c4a;
import defpackage.cbf;
import defpackage.cd;
import defpackage.cjh;
import defpackage.cok;
import defpackage.cu9;
import defpackage.cv9;
import defpackage.cz5;
import defpackage.d00;
import defpackage.d3d;
import defpackage.d4c;
import defpackage.d5i;
import defpackage.dae;
import defpackage.dgj;
import defpackage.dm;
import defpackage.dn8;
import defpackage.dpf;
import defpackage.dyi;
import defpackage.e5;
import defpackage.e70;
import defpackage.epk;
import defpackage.eve;
import defpackage.ewb;
import defpackage.ex;
import defpackage.eyi;
import defpackage.ez1;
import defpackage.fd9;
import defpackage.fj0;
import defpackage.flk;
import defpackage.fnf;
import defpackage.ft7;
import defpackage.ftf;
import defpackage.fu9;
import defpackage.fve;
import defpackage.fwb;
import defpackage.fx5;
import defpackage.g5c;
import defpackage.g9e;
import defpackage.ga8;
import defpackage.gea;
import defpackage.gf8;
import defpackage.gl6;
import defpackage.gma;
import defpackage.gmf;
import defpackage.gve;
import defpackage.gz;
import defpackage.h91;
import defpackage.hd4;
import defpackage.hqb;
import defpackage.hve;
import defpackage.i49;
import defpackage.i59;
import defpackage.i5b;
import defpackage.i8d;
import defpackage.i95;
import defpackage.iei;
import defpackage.ij0;
import defpackage.iz;
import defpackage.j49;
import defpackage.j4h;
import defpackage.j5b;
import defpackage.j5c;
import defpackage.j91;
import defpackage.ja8;
import defpackage.jb2;
import defpackage.jce;
import defpackage.jjh;
import defpackage.jt7;
import defpackage.k00;
import defpackage.k40;
import defpackage.kkh;
import defpackage.ks0;
import defpackage.l00;
import defpackage.l19;
import defpackage.l49;
import defpackage.l71;
import defpackage.l9e;
import defpackage.lij;
import defpackage.ljh;
import defpackage.lqb;
import defpackage.lsc;
import defpackage.lvj;
import defpackage.lz5;
import defpackage.m;
import defpackage.m00;
import defpackage.m49;
import defpackage.m4a;
import defpackage.m5c;
import defpackage.m62;
import defpackage.m91;
import defpackage.ma8;
import defpackage.mdj;
import defpackage.mmc;
import defpackage.mpk;
import defpackage.mr9;
import defpackage.ms7;
import defpackage.mvi;
import defpackage.mwa;
import defpackage.mz;
import defpackage.n49;
import defpackage.n5d;
import defpackage.n62;
import defpackage.n78;
import defpackage.n91;
import defpackage.n9e;
import defpackage.nai;
import defpackage.nc1;
import defpackage.ndg;
import defpackage.ne0;
import defpackage.nvk;
import defpackage.nwa;
import defpackage.nwb;
import defpackage.nxi;
import defpackage.nz;
import defpackage.o6j;
import defpackage.odg;
import defpackage.ojf;
import defpackage.omc;
import defpackage.oq5;
import defpackage.ore;
import defpackage.os7;
import defpackage.ovi;
import defpackage.oz;
import defpackage.p9d;
import defpackage.pl9;
import defpackage.pz;
import defpackage.pz7;
import defpackage.q20;
import defpackage.qjf;
import defpackage.qo0;
import defpackage.qpk;
import defpackage.qs7;
import defpackage.quk;
import defpackage.qvb;
import defpackage.qw5;
import defpackage.qz;
import defpackage.r00;
import defpackage.r9c;
import defpackage.rcg;
import defpackage.rl4;
import defpackage.rs7;
import defpackage.rt7;
import defpackage.s00;
import defpackage.s4a;
import defpackage.s70;
import defpackage.s9c;
import defpackage.sb9;
import defpackage.sbj;
import defpackage.sf5;
import defpackage.sm6;
import defpackage.sq6;
import defpackage.sxi;
import defpackage.sz6;
import defpackage.t00;
import defpackage.t4a;
import defpackage.t60;
import defpackage.tbj;
import defpackage.te0;
import defpackage.tk5;
import defpackage.tpk;
import defpackage.ts7;
import defpackage.u00;
import defpackage.u19;
import defpackage.u4a;
import defpackage.urb;
import defpackage.uz;
import defpackage.v01;
import defpackage.v19;
import defpackage.v6f;
import defpackage.vrb;
import defpackage.vwb;
import defpackage.w19;
import defpackage.w8f;
import defpackage.wkc;
import defpackage.wkh;
import defpackage.wr7;
import defpackage.ws7;
import defpackage.wt7;
import defpackage.wwb;
import defpackage.wz;
import defpackage.wz5;
import defpackage.x10;
import defpackage.x44;
import defpackage.x69;
import defpackage.x7d;
import defpackage.xu9;
import defpackage.xub;
import defpackage.xy8;
import defpackage.xz;
import defpackage.y1a;
import defpackage.y50;
import defpackage.y7d;
import defpackage.yc4;
import defpackage.ycg;
import defpackage.yfd;
import defpackage.yub;
import defpackage.z39;
import defpackage.za2;
import defpackage.zjf;
import defpackage.zka;
import defpackage.zp3;
import defpackage.zy7;
import defpackage.zz;
import io.sentry.e0;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000º\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b2\u00020\t2\u00020\u0003:\u0006Ö\u0002Ý\u0001×\u0002J\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0011\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0017\u001a\u00020\u00122\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u001c\u001a\u00020\u00122\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00120\u0019¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u0004\u0018\u00010\u001f2\u0006\u0010\u001e\u001a\u00020\n¢\u0006\u0004\b \u0010!R+\u0010)\u001a\u00020\u001a2\u0006\u0010\"\u001a\u00020\u001a8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R*\u00103\u001a\u0004\u0018\u00010*8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b+\u0010,\u0012\u0004\b1\u00102\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u001a\u00109\u001a\u0002048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R$\u0010A\u001a\u0004\u0018\u00010:8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R$\u0010H\u001a\u00020B2\u0006\u0010C\u001a\u00020B8\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010GR+\u0010O\u001a\u00020I2\u0006\u0010\"\u001a\u00020I8V@RX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\bJ\u0010$\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR\u001a\u0010U\u001a\u00020P8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010TR\"\u0010]\u001a\u00020V8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bW\u0010X\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010\\R\u001a\u0010c\u001a\u00020^8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b_\u0010`\u001a\u0004\ba\u0010bR+\u0010f\u001a\u00020d2\u0006\u0010\"\u001a\u00020d8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\be\u0010$\u001a\u0004\bf\u0010g\"\u0004\bh\u0010iR\u001b\u0010m\u001a\u00020d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bj\u0010k\u001a\u0004\bl\u0010gR\u001a\u0010s\u001a\u00020n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bo\u0010p\u001a\u0004\bq\u0010rR\u0017\u0010y\u001a\u00020t8\u0006¢\u0006\f\n\u0004\bu\u0010v\u001a\u0004\bw\u0010xR!\u0010\u0080\u0001\u001a\u00020z8\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\b{\u0010|\u0012\u0004\b\u007f\u00102\u001a\u0004\b}\u0010~R&\u0010\u0086\u0001\u001a\t\u0012\u0004\u0012\u00020z0\u0081\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u0082\u0001\u0010\u0083\u0001\u001a\u0006\b\u0084\u0001\u0010\u0085\u0001R \u0010\u008c\u0001\u001a\u00030\u0087\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u0088\u0001\u0010\u0089\u0001\u001a\u0006\b\u008a\u0001\u0010\u008b\u0001R \u0010\u0092\u0001\u001a\u00030\u008d\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u008e\u0001\u0010\u008f\u0001\u001a\u0006\b\u0090\u0001\u0010\u0091\u0001R*\u0010\u009a\u0001\u001a\u00030\u0093\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u0094\u0001\u0010\u0095\u0001\u001a\u0006\b\u0096\u0001\u0010\u0097\u0001\"\u0006\b\u0098\u0001\u0010\u0099\u0001R \u0010 \u0001\u001a\u00030\u009b\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u009c\u0001\u0010\u009d\u0001\u001a\u0006\b\u009e\u0001\u0010\u009f\u0001R \u0010¦\u0001\u001a\u00030¡\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b¢\u0001\u0010£\u0001\u001a\u0006\b¤\u0001\u0010¥\u0001R \u0010¬\u0001\u001a\u00030§\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b¨\u0001\u0010©\u0001\u001a\u0006\bª\u0001\u0010«\u0001R3\u0010³\u0001\u001a\u00030\u00ad\u00012\u0007\u0010\"\u001a\u00030\u00ad\u00018F@FX\u0086\u008e\u0002¢\u0006\u0017\n\u0005\b®\u0001\u0010$\u001a\u0006\b¯\u0001\u0010°\u0001\"\u0006\b±\u0001\u0010²\u0001R \u0010¸\u0001\u001a\u00030´\u00018VX\u0096\u0084\u0002¢\u0006\u000f\n\u0005\bµ\u0001\u0010k\u001a\u0006\b¶\u0001\u0010·\u0001R\"\u0010¾\u0001\u001a\u0005\u0018\u00010¹\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\bº\u0001\u0010»\u0001\u001a\u0006\b¼\u0001\u0010½\u0001R \u0010Ä\u0001\u001a\u00030¿\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\bÀ\u0001\u0010Á\u0001\u001a\u0006\bÂ\u0001\u0010Ã\u0001R \u0010Ê\u0001\u001a\u00030Å\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\bÆ\u0001\u0010Ç\u0001\u001a\u0006\bÈ\u0001\u0010É\u0001R \u0010Ð\u0001\u001a\u00030Ë\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\bÌ\u0001\u0010Í\u0001\u001a\u0006\bÎ\u0001\u0010Ï\u0001R.\u0010Ö\u0001\u001a\u00020d8V@\u0016X\u0096\u000e¢\u0006\u001d\n\u0006\bÑ\u0001\u0010Ò\u0001\u0012\u0005\bÕ\u0001\u00102\u001a\u0005\bÓ\u0001\u0010g\"\u0005\bÔ\u0001\u0010iR.\u0010Ü\u0001\u001a\u00020\u00108\u0000@\u0000X\u0081\u000e¢\u0006\u001d\n\u0005\b×\u0001\u0010;\u0012\u0005\bÛ\u0001\u00102\u001a\u0006\bØ\u0001\u0010Ù\u0001\"\u0005\bÚ\u0001\u0010\u0014R7\u0010ã\u0001\u001a\u0005\u0018\u00010Ý\u00012\t\u0010\"\u001a\u0005\u0018\u00010Ý\u00018B@BX\u0082\u008e\u0002¢\u0006\u0017\n\u0005\bÞ\u0001\u0010$\u001a\u0006\bß\u0001\u0010à\u0001\"\u0006\bá\u0001\u0010â\u0001R\"\u0010æ\u0001\u001a\u0005\u0018\u00010Ý\u00018FX\u0086\u0084\u0002¢\u0006\u000f\n\u0005\bä\u0001\u0010k\u001a\u0006\bå\u0001\u0010à\u0001R'\u0010í\u0001\u001a\u00030ç\u00018\u0016X\u0097\u0004¢\u0006\u0017\n\u0006\bè\u0001\u0010é\u0001\u0012\u0005\bì\u0001\u00102\u001a\u0006\bê\u0001\u0010ë\u0001R3\u0010ô\u0001\u001a\u00030î\u00012\u0007\u0010\"\u001a\u00030î\u00018V@RX\u0096\u008e\u0002¢\u0006\u0017\n\u0005\bï\u0001\u0010$\u001a\u0006\bð\u0001\u0010ñ\u0001\"\u0006\bò\u0001\u0010ó\u0001R3\u0010û\u0001\u001a\u00030õ\u00012\u0007\u0010\"\u001a\u00030õ\u00018V@RX\u0096\u008e\u0002¢\u0006\u0017\n\u0005\bö\u0001\u0010$\u001a\u0006\b÷\u0001\u0010ø\u0001\"\u0006\bù\u0001\u0010ú\u0001R \u0010\u0081\u0002\u001a\u00030ü\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\bý\u0001\u0010þ\u0001\u001a\u0006\bÿ\u0001\u0010\u0080\u0002R \u0010\u0087\u0002\u001a\u00030\u0082\u00028\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u0083\u0002\u0010\u0084\u0002\u001a\u0006\b\u0085\u0002\u0010\u0086\u0002R \u0010\u008d\u0002\u001a\u00030\u0088\u00028\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u0089\u0002\u0010\u008a\u0002\u001a\u0006\b\u008b\u0002\u0010\u008c\u0002R'\u0010\u0091\u0002\u001a\u00020d8\u0000@\u0000X\u0080\u000e¢\u0006\u0016\n\u0006\b\u008e\u0002\u0010Ò\u0001\u001a\u0005\b\u008f\u0002\u0010g\"\u0005\b\u0090\u0002\u0010iR \u0010\u0097\u0002\u001a\u00030\u0092\u00028\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u0093\u0002\u0010\u0094\u0002\u001a\u0006\b\u0095\u0002\u0010\u0096\u0002R'\u0010\u009a\u0002\u001a\u00020\u001a2\u0006\u0010C\u001a\u00020\u001a8F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\b\u0098\u0002\u0010&\"\u0005\b\u0099\u0002\u0010(R\u0017\u0010\u009d\u0002\u001a\u00020\u001f8VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u009b\u0002\u0010\u009c\u0002R\u001f\u0010¢\u0002\u001a\u00030\u009e\u00028VX\u0096\u0004¢\u0006\u000f\u0012\u0005\b¡\u0002\u00102\u001a\u0006\b\u009f\u0002\u0010 \u0002R\u0018\u0010¦\u0002\u001a\u00030£\u00028VX\u0096\u0004¢\u0006\b\u001a\u0006\b¤\u0002\u0010¥\u0002R*\u0010§\u0002\u001a\u0004\u0018\u00010\u00158\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0006\b§\u0002\u0010¨\u0002\u001a\u0006\b©\u0002\u0010ª\u0002\"\u0005\b«\u0002\u0010\u0018R\u001a\u0010¯\u0002\u001a\u0005\u0018\u00010¬\u00028VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u00ad\u0002\u0010®\u0002R\u001a\u0010³\u0002\u001a\u0005\u0018\u00010°\u00028VX\u0096\u0004¢\u0006\b\u001a\u0006\b±\u0002\u0010²\u0002R\u0018\u0010·\u0002\u001a\u00030´\u00028@X\u0080\u0004¢\u0006\b\u001a\u0006\bµ\u0002\u0010¶\u0002R\u0017\u0010¹\u0002\u001a\u00020\u00108VX\u0096\u0004¢\u0006\b\u001a\u0006\b¸\u0002\u0010Ù\u0001R\u0016\u0010»\u0002\u001a\u00020d8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\bº\u0002\u0010gR\u001f\u0010À\u0002\u001a\u00030¼\u00028VX\u0097\u0004¢\u0006\u000f\u0012\u0005\b¿\u0002\u00102\u001a\u0006\b½\u0002\u0010¾\u0002R\u0018\u0010Ä\u0002\u001a\u00030Á\u00028VX\u0096\u0004¢\u0006\b\u001a\u0006\bÂ\u0002\u0010Ã\u0002R\u0018\u0010È\u0002\u001a\u00030Å\u00028VX\u0096\u0004¢\u0006\b\u001a\u0006\bÆ\u0002\u0010Ç\u0002R\u0018\u0010Ì\u0002\u001a\u00030É\u00028VX\u0096\u0004¢\u0006\b\u001a\u0006\bÊ\u0002\u0010Ë\u0002R\u0016\u0010Î\u0002\u001a\u00020d8@X\u0080\u0004¢\u0006\u0007\u001a\u0005\bÍ\u0002\u0010gR\u0019\u0010Ñ\u0002\u001a\u0004\u0018\u00010\u00008VX\u0096\u0004¢\u0006\b\u001a\u0006\bÏ\u0002\u0010Ð\u0002R\u0018\u0010Õ\u0002\u001a\u00030Ò\u00028BX\u0082\u0004¢\u0006\b\u001a\u0006\bÓ\u0002\u0010Ô\u0002¨\u0006Ø\u0002"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeView;", "Landroid/view/ViewGroup;", "Landroidx/compose/ui/node/Owner;", "", "Landroidx/lifecycle/DefaultLifecycleObserver;", "Lwkc;", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "Landroid/view/ViewTreeObserver$OnScrollChangedListener;", "Landroid/view/ViewTreeObserver$OnTouchModeChangeListener;", "Los7;", "", "getImportantForAutofill", "()I", "Ll9e;", "getEmbeddedViewFocusRect", "()Ll9e;", "", "intervalMillis", "Liei;", "setAccessibilityEventBatchIntervalMillis", "(J)V", "Lfve;", "handler", "setUncaughtExceptionHandler", "(Lfve;)V", "Lkotlin/Function1;", "Lhd4;", "callback", "setOnReadyForComposition", "(Lbz7;)V", "accessibilityId", "Landroid/view/View;", "findViewByAccessibilityIdTraversal", "(I)Landroid/view/View;", "<set-?>", "E", "Lnwb;", "get_composeViewContext", "()Lhd4;", "set_composeViewContext", "(Lhd4;)V", "_composeViewContext", "Ll19;", "H", "Ll19;", "getPrimaryDirectionalMotionAxisOverride-dqNNBbU$ui", "()Ll19;", "setPrimaryDirectionalMotionAxisOverride-r2epLt8$ui", "(Ll19;)V", "getPrimaryDirectionalMotionAxisOverride-dqNNBbU$ui$annotations", "()V", "primaryDirectionalMotionAxisOverride", "Lcv9;", "I", "Lcv9;", "getSharedDrawScope", "()Lcv9;", "sharedDrawScope", "Ls4a;", "J", "Ls4a;", "getFrameEndScheduler$ui", "()Ls4a;", "setFrameEndScheduler$ui", "(Ls4a;)V", "frameEndScheduler", "Lore;", ExperienceToggle.DEFAULT_PARAM_KEY, "L", "Lore;", "getRetainedValuesStore", "()Lore;", "retainedValuesStore", "Lcz5;", "O", "getDensity", "()Lcz5;", "setDensity", "(Lcz5;)V", "density", "Lrs7;", "Q", "Lrs7;", "getFocusOwner", "()Lrs7;", "focusOwner", "Lc45;", "R", "Lc45;", "getCoroutineContext", "()Lc45;", "setCoroutineContext", "(Lc45;)V", "coroutineContext", "Lx10;", "S", "Lx10;", "getDragAndDropManager", "()Lx10;", "dragAndDropManager", "", "U", "isAttached", "()Z", "setAttached", "(Z)V", "V", "Lwlg;", "getDerivedIsAttached", "derivedIsAttached", "Lovi;", "a0", "Lovi;", "getViewConfiguration", "()Lovi;", "viewConfiguration", "Li59;", "b0", "Li59;", "getInsetsListener", "()Li59;", "insetsListener", "Lav9;", "c0", "Lav9;", "getRoot", "()Lav9;", "getRoot$annotations", "root", "Lxub;", "d0", "Lxub;", "getLayoutNodes", "()Lxub;", "layoutNodes", "Ln9e;", "e0", "Ln9e;", "getRectManager", "()Ln9e;", "rectManager", "Lzjf;", "f0", "Lzjf;", "getSemanticsOwner", "()Lzjf;", "semanticsOwner", "La10;", "h0", "La10;", "getContentCaptureManager$ui", "()La10;", "setContentCaptureManager$ui", "(La10;)V", "contentCaptureManager", "Lbz;", "i0", "Lbz;", "getAccessibilityManager", "()Lbz;", "accessibilityManager", "Lga8;", "j0", "Lga8;", "getGraphicsContext", "()Lga8;", "graphicsContext", "Ln91;", "k0", "Ln91;", "getAutofillTree", "()Ln91;", "autofillTree", "Landroid/content/res/Configuration;", "r0", "getConfiguration", "()Landroid/content/res/Configuration;", "setConfiguration", "(Landroid/content/res/Configuration;)V", "configuration", "Lgea;", "s0", "getLocaleList", "()Lgea;", "localeList", "Lgz;", "u0", "Lgz;", "get_autofillManager$ui", "()Lgz;", "_autofillManager", "Lnz;", "w0", "Lnz;", "getClipboardManager", "()Lnz;", "clipboardManager", "Lmz;", "x0", "Lmz;", "getClipboard", "()Lmz;", "clipboard", "Lomc;", "y0", "Lomc;", "getSnapshotObserver", "()Lomc;", "snapshotObserver", "z0", "Z", "getShowLayoutBounds", "setShowLayoutBounds", "getShowLayoutBounds$annotations", "showLayoutBounds", "J0", "getLastMatrixRecalculationAnimationTime$ui", "()J", "setLastMatrixRecalculationAnimationTime$ui", "getLastMatrixRecalculationAnimationTime$ui$annotations", "lastMatrixRecalculationAnimationTime", "Luz;", "M0", "get_viewTreeOwners", "()Luz;", "set_viewTreeOwners", "(Luz;)V", "_viewTreeOwners", "N0", "getViewTreeOwners", "viewTreeOwners", "Lrt7;", "T0", "Lrt7;", "getFontLoader", "()Lrt7;", "getFontLoader$annotations", "fontLoader", "Lwt7;", "U0", "getFontFamilyResolver", "()Lwt7;", "setFontFamilyResolver", "(Lwt7;)V", "fontFamilyResolver", "Lfu9;", "V0", "getLayoutDirection", "()Lfu9;", "setLayoutDirection", "(Lfu9;)V", "layoutDirection", "Lgf8;", "W0", "Lgf8;", "getHapticFeedBack", "()Lgf8;", "hapticFeedBack", "Llqb;", "Y0", "Llqb;", "getModifierLocalManager", "()Llqb;", "modifierLocalManager", "Lwkh;", "Z0", "Lwkh;", "getTextToolbar", "()Lwkh;", "textToolbar", "n1", "getComposeViewContextIncrementedDuringInit$ui", "setComposeViewContextIncrementedDuringInit$ui", "composeViewContextIncrementedDuringInit", "Ly7d;", "q1", "Ly7d;", "getPointerIconService", "()Ly7d;", "pointerIconService", "getComposeViewContext", "setComposeViewContext", "composeViewContext", "getView", "()Landroid/view/View;", "view", "Lsbj;", "getWindowInfo", "()Lsbj;", "getWindowInfo$annotations", "windowInfo", "Lgve;", "getRootForTest", "()Lgve;", "rootForTest", "uncaughtExceptionHandler", "Lfve;", "getUncaughtExceptionHandler$ui", "()Lfve;", "setUncaughtExceptionHandler$ui", "Lh91;", "getAutofill", "()Lh91;", "autofill", "Lm91;", "getAutofillManager", "()Lm91;", "autofillManager", "Ls70;", "getAndroidViewsHandler$ui", "()Ls70;", "androidViewsHandler", "getMeasureIteration", "measureIteration", "getHasPendingMeasureOrLayout", "hasPendingMeasureOrLayout", "Ljjh;", "getTextInputService", "()Ljjh;", "getTextInputService$annotations", "textInputService", "Lbeg;", "getSoftwareKeyboardController", "()Lbeg;", "softwareKeyboardController", "Lb3d;", "getPlacementScope", "()Lb3d;", "placementScope", "Lm49;", "getInputModeManager", "()Lm49;", "inputModeManager", "getScrollCaptureInProgress$ui", "scrollCaptureInProgress", "getOutOfFrameExecutor", "()Landroidx/compose/ui/platform/AndroidComposeView;", "outOfFrameExecutor", "Lljh;", "getLegacyTextInputServiceAndroid", "()Lljh;", "legacyTextInputServiceAndroid", "oq5", "tz", "ui"}, k = 1, mv = {2, 1, 0}, xi = mdj.f)
public final class AndroidComposeView extends ViewGroup implements Owner, gve, DefaultLifecycleObserver, wkc, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, ViewTreeObserver.OnTouchModeChangeListener, os7 {
    public static Class r1;
    public static Method s1;
    public static Method t1;
    public static final qvb u1 = new qvb();
    public static qz v1;
    public static Method w1;
    public s70 A0;
    public rl4 B0;
    public boolean C0;
    public final j5b D0;
    public final lsc E;
    public long E0;
    public long F;
    public final int[] F0;
    public final boolean G;
    public final float[] G0;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public l19 primaryDirectionalMotionAxisOverride;
    public final float[] H0;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public final cv9 sharedDrawScope;
    public final float[] I0;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public s4a frameEndScheduler;

    /* JADX INFO: renamed from: J0, reason: from kotlin metadata */
    public long lastMatrixRecalculationAnimationTime;
    public t4a K;
    public boolean K0;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public ore retainedValuesStore;
    public long L0;
    public final qo0 M;
    public final lsc M0;
    public final oz N;
    public final wz5 N0;
    public final lsc O;
    public bz7 O0;
    public final View P;
    public ljh P0;
    public final ts7 Q;
    public jjh Q0;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    public c45 coroutineContext;
    public final AtomicReference R0;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    public final x10 dragAndDropManager;
    public fx5 S0;
    public final y1a T;

    /* JADX INFO: renamed from: T0, reason: from kotlin metadata */
    public final rt7 fontLoader;
    public final lsc U;

    /* JADX INFO: renamed from: U0, reason: from kotlin metadata */
    public final nwb fontFamilyResolver;
    public final wz5 V;
    public final lsc V0;
    public final jb2 W;

    /* JADX INFO: renamed from: W0, reason: from kotlin metadata */
    public final gf8 hapticFeedBack;
    public final n49 X0;

    /* JADX INFO: renamed from: Y0, reason: from kotlin metadata */
    public final lqb modifierLocalManager;
    public final t60 Z0;
    public final e70 a0;
    public MotionEvent a1;

    /* JADX INFO: renamed from: b0, reason: from kotlin metadata */
    public final i59 insetsListener;
    public long b1;

    /* JADX INFO: renamed from: c0, reason: from kotlin metadata */
    public final av9 root;
    public final cbf c1;

    /* JADX INFO: renamed from: d0, reason: from kotlin metadata */
    public final xub layoutNodes;
    public final qvb d1;

    /* JADX INFO: renamed from: e0, reason: from kotlin metadata */
    public final n9e rectManager;
    public float e1;

    /* JADX INFO: renamed from: f0, reason: from kotlin metadata */
    public final zjf semanticsOwner;
    public float f1;
    public final k00 g0;
    public final m g1;

    /* JADX INFO: renamed from: h0, reason: from kotlin metadata */
    public a10 contentCaptureManager;
    public final oz h1;

    /* JADX INFO: renamed from: i0, reason: from kotlin metadata */
    public final bz accessibilityManager;
    public boolean i1;
    public final q20 j0;
    public final w19 j1;

    /* JADX INFO: renamed from: k0, reason: from kotlin metadata */
    public final n91 autofillTree;
    public final wz k1;
    public final qvb l0;
    public final m62 l1;
    public qvb m0;
    public boolean m1;
    public boolean n0;

    /* JADX INFO: renamed from: n1, reason: from kotlin metadata */
    public boolean composeViewContextIncrementedDuringInit;
    public boolean o0;
    public final tk5 o1;
    public final urb p0;
    public View p1;
    public final y50 q0;
    public final b00 q1;
    public final lsc r0;
    public final wz5 s0;
    public final dpf t0;

    /* JADX INFO: renamed from: u0, reason: from kotlin metadata */
    public final gz _autofillManager;
    public boolean v0;

    /* JADX INFO: renamed from: w0, reason: from kotlin metadata */
    public final nz clipboardManager;

    /* JADX INFO: renamed from: x0, reason: from kotlin metadata */
    public final mz clipboard;

    /* JADX INFO: renamed from: y0, reason: from kotlin metadata */
    public final omc snapshotObserver;

    /* JADX INFO: renamed from: z0, reason: from kotlin metadata */
    public boolean showLayoutBounds;

    public AndroidComposeView(Context context, hd4 hd4Var) {
        super(context);
        this.E = mpk.P(hd4Var);
        this.F = 9205357640488583168L;
        int i = 1;
        this.G = true;
        this.sharedDrawScope = hd4Var.r;
        this.retainedValuesStore = a5.I;
        this.M = new qo0();
        int i2 = 0;
        this.N = new oz(this, i2);
        this.O = new lsc(d4c.s(context), zp3.X);
        this.Q = new ts7(this, this);
        this.coroutineContext = hd4Var.b.j();
        this.dragAndDropManager = new x10();
        this.T = new y1a();
        this.U = mpk.P(Boolean.FALSE);
        this.V = mpk.w(new wz(this, i2));
        this.W = hd4Var.t;
        this.a0 = hd4Var.q;
        this.insetsListener = new i59();
        int i3 = 3;
        av9 av9Var = new av9(3);
        av9Var.C0(hve.c);
        av9Var.z0(getDensity());
        av9Var.E0(getViewConfiguration());
        av9Var.D0(new d00(this).B(((ts7) getFocusOwner()).e).B(getDragAndDropManager().c));
        this.root = av9Var;
        xub xubVar = x69.a;
        this.layoutNodes = new xub();
        getLayoutNodes();
        this.rectManager = new n9e(this);
        this.semanticsOwner = new zjf(getRoot(), new sm6(), getLayoutNodes());
        k00 k00Var = new k00(this);
        this.g0 = k00Var;
        this.contentCaptureManager = new a10(this, new dm(0, this, u00.class, "getContentCaptureSessionCompat", "getContentCaptureSessionCompat(Landroid/view/View;)Landroidx/compose/ui/contentcapture/ContentCaptureSessionWrapper;", 1, 1));
        this.accessibilityManager = hd4Var.j;
        this.j0 = new q20(this);
        this.autofillTree = new n91();
        this.l0 = new qvb();
        this.p0 = new urb();
        av9 root = getRoot();
        y50 y50Var = new y50();
        y50Var.b = root;
        y50Var.c = new an8((z39) root.k0.H);
        y50Var.d = new gmf(22);
        y50Var.e = new dn8();
        this.q0 = y50Var;
        this.r0 = mpk.P(new Configuration(context.getResources().getConfiguration()));
        this.s0 = mpk.w(new wz(this, i));
        this.t0 = new dpf(this, getAutofillTree());
        AutofillManager autofillManager = (AutofillManager) context.getSystemService(AutofillManager.class);
        if (autofillManager == null) {
            throw sq6.z("Autofill service could not be located.");
        }
        this._autofillManager = new gz(new n78(19, autofillManager), getSemanticsOwner(), this, getRectManager(), context.getPackageName());
        this.clipboardManager = hd4Var.l;
        this.clipboard = hd4Var.m;
        this.snapshotObserver = new omc(new a00(this, i));
        this.D0 = new j5b(getRoot());
        this.E0 = 9223372034707292159L;
        this.F0 = new int[]{0, 0};
        float[] fArrA = nwa.a();
        this.G0 = fArrA;
        this.H0 = nwa.a();
        this.I0 = nwa.a();
        this.lastMatrixRecalculationAnimationTime = -1L;
        this.L0 = 9187343241974906880L;
        this.M0 = mpk.P(null);
        this.N0 = mpk.w(new wz(this, i3));
        this.R0 = new AtomicReference(null);
        this.fontLoader = hd4Var.n;
        this.fontFamilyResolver = hd4Var.o;
        int layoutDirection = context.getResources().getConfiguration().getLayoutDirection();
        int[] iArr = ms7.a;
        fu9 fu9Var = fu9.E;
        fu9 fu9Var2 = layoutDirection != 0 ? layoutDirection != 1 ? null : fu9.F : fu9Var;
        this.V0 = mpk.P(fu9Var2 != null ? fu9Var2 : fu9Var);
        this.hapticFeedBack = hd4Var.p;
        int i4 = 2;
        this.X0 = new n49(isInTouchMode() ? 1 : 2);
        lqb lqbVar = new lqb();
        new wwb(0, new nc1[16]);
        new wwb(0, new tk5[16]);
        new wwb(0, new av9[16]);
        new wwb(0, new tk5[16]);
        this.modifierLocalManager = lqbVar;
        this.Z0 = new t60(this);
        this.c1 = new cbf(18);
        this.d1 = new qvb();
        this.g1 = new m(i, this);
        this.h1 = new oz(this, i);
        a00 a00Var = new a00(this, i2);
        w19 w19Var = new w19();
        w19Var.c = a00Var;
        w19Var.b = 0;
        w19Var.d = new GestureDetector(context, new v19(w19Var));
        this.j1 = w19Var;
        this.k1 = new wz(this, i4);
        int i5 = Build.VERSION.SDK_INT;
        this.l1 = i5 < 29 ? new epk(fArrA) : new n62();
        addOnAttachStateChangeListener(this.contentCaptureManager);
        setWillNotDraw(false);
        setFocusable(true);
        t00.a.a(this, 1, false);
        setFocusableInTouchMode(true);
        setClipChildren(false);
        mvi.h(this, k00Var);
        setOnDragListener(getDragAndDropManager());
        getRoot().d(this);
        if (i5 >= 29) {
            m00.a.a(this);
        }
        if (o()) {
            View view = new View(context);
            view.setLayoutParams(new ViewGroup.LayoutParams(1, 1));
            view.setTag(R.id.hide_in_inspector_tag, Boolean.TRUE);
            this.P = view;
            addView(view, -1);
        }
        this.o1 = i5 >= 31 ? new tk5(24) : null;
        this.q1 = new b00(this);
    }

    public static final void b(AndroidComposeView androidComposeView, int i, AccessibilityNodeInfo accessibilityNodeInfo, String str) {
        int iD;
        k00 k00Var = androidComposeView.g0;
        if (x44.r(str, k00Var.h0)) {
            int iD2 = k00Var.f0.d(i);
            if (iD2 != -1) {
                accessibilityNodeInfo.getExtras().putInt(str, iD2);
                return;
            }
            return;
        }
        if (!x44.r(str, k00Var.i0) || (iD = k00Var.g0.d(i)) == -1) {
            return;
        }
        accessibilityNodeInfo.getExtras().putInt(str, iD);
    }

    public static void g(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof AndroidComposeView) {
                ((AndroidComposeView) childAt).x();
            } else if (childAt instanceof ViewGroup) {
                g((ViewGroup) childAt);
            }
        }
    }

    private final boolean getDerivedIsAttached() {
        return ((Boolean) this.V.getValue()).booleanValue();
    }

    @lz5
    public static /* synthetic */ void getFontLoader$annotations() {
    }

    public static /* synthetic */ void getLastMatrixRecalculationAnimationTime$ui$annotations() {
    }

    private final ljh getLegacyTextInputServiceAndroid() {
        ljh ljhVar = this.P0;
        if (ljhVar != null) {
            return ljhVar;
        }
        ljh ljhVar2 = new ljh(getView(), this);
        this.P0 = ljhVar2;
        return ljhVar2;
    }

    /* JADX INFO: renamed from: getPrimaryDirectionalMotionAxisOverride-dqNNBbU$ui$annotations, reason: not valid java name */
    public static /* synthetic */ void m2getPrimaryDirectionalMotionAxisOverridedqNNBbU$ui$annotations() {
    }

    public static /* synthetic */ void getRoot$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }

    @lz5
    public static /* synthetic */ void getTextInputService$annotations() {
    }

    public static /* synthetic */ void getWindowInfo$annotations() {
    }

    private final hd4 get_composeViewContext() {
        return (hd4) this.E.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final uz get_viewTreeOwners() {
        ij0.x(this.M0.getValue());
        return null;
    }

    public static long h(int i) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == Integer.MIN_VALUE) {
            return size;
        }
        if (mode == 0) {
            return 2147483647L;
        }
        if (mode == 1073741824) {
            long j = size;
            return j | (j << 32);
        }
        e0.b();
        return 0L;
    }

    public static View j(View view, int i) throws NoSuchMethodException {
        if (Build.VERSION.SDK_INT < 29) {
            Method declaredMethod = View.class.getDeclaredMethod("getAccessibilityViewId", null);
            declaredMethod.setAccessible(true);
            if (x44.r(declaredMethod.invoke(view, null), Integer.valueOf(i))) {
                return view;
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    View viewJ = j(viewGroup.getChildAt(i2), i);
                    if (viewJ != null) {
                        return viewJ;
                    }
                }
            }
        }
        return null;
    }

    public static void m(av9 av9Var) {
        av9Var.R();
        wwb wwbVarM = av9Var.M();
        Object[] objArr = wwbVarM.E;
        int i = wwbVarM.G;
        for (int i2 = 0; i2 < i; i2++) {
            m((av9) objArr[i2]);
        }
    }

    public static boolean o() {
        return Build.VERSION.SDK_INT >= 35;
    }

    public static boolean p(MotionEvent motionEvent) {
        boolean z = (Float.floatToRawIntBits(motionEvent.getX()) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getY()) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getRawX()) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getRawY()) & Integer.MAX_VALUE) >= 2139095040;
        if (!z) {
            int pointerCount = motionEvent.getPointerCount();
            for (int i = 1; i < pointerCount; i++) {
                z = (Float.floatToRawIntBits(motionEvent.getX(i)) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getY(i)) & Integer.MAX_VALUE) >= 2139095040 || (Build.VERSION.SDK_INT >= 29 && !vrb.a.a(motionEvent, i));
                if (z) {
                    break;
                }
            }
        }
        return z;
    }

    private final void setAttached(boolean z) {
        this.U.setValue(Boolean.valueOf(z));
    }

    private void setDensity(cz5 cz5Var) {
        this.O.setValue(cz5Var);
    }

    private void setFontFamilyResolver(wt7 wt7Var) {
        this.fontFamilyResolver.setValue(wt7Var);
    }

    private void setLayoutDirection(fu9 fu9Var) {
        this.V0.setValue(fu9Var);
    }

    private final void set_composeViewContext(hd4 hd4Var) {
        this.E.setValue(hd4Var);
    }

    private final void set_viewTreeOwners(uz uzVar) {
        this.M0.setValue(uzVar);
    }

    public final void A(av9 av9Var, boolean z, boolean z2) {
        sb9 sb9Var = sb9.H;
        j5b j5bVar = this.D0;
        if (!z) {
            j5bVar.getClass();
            int iOrdinal = av9Var.w().ordinal();
            if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3) {
                return;
            }
            if (iOrdinal != 4) {
                mr9.b();
                return;
            }
            av9 av9VarG = av9Var.G();
            boolean z3 = av9VarG == null || av9VarG.Y();
            if (!z2) {
                if (av9Var.B()) {
                    return;
                }
                if (av9Var.u() && av9Var.Y() == z3 && av9Var.Y() == av9Var.Z()) {
                    return;
                }
            }
            av9Var.e0();
            if (!av9Var.u0 && av9Var.Z() && z3) {
                if ((av9VarG == null || !av9VarG.u()) && (av9VarG == null || !av9VarG.B())) {
                    j5bVar.b.b(av9Var, sb9Var);
                }
                if (j5bVar.d) {
                    return;
                }
                F(null);
                return;
            }
            return;
        }
        fj0 fj0Var = j5bVar.b;
        int iOrdinal2 = av9Var.w().ordinal();
        if (iOrdinal2 != 0) {
            if (iOrdinal2 == 1) {
                return;
            }
            if (iOrdinal2 != 2) {
                if (iOrdinal2 == 3) {
                    return;
                }
                if (iOrdinal2 != 4) {
                    mr9.b();
                    return;
                }
            }
        }
        if ((av9Var.y() || av9Var.x()) && !z2) {
            return;
        }
        av9Var.f0();
        av9Var.e0();
        if (av9Var.u0) {
            return;
        }
        av9 av9VarG2 = av9Var.G();
        if (x44.r(av9Var.a0(), Boolean.TRUE) && ((av9VarG2 == null || !av9VarG2.y()) && (av9VarG2 == null || !av9VarG2.x()))) {
            fj0Var.b(av9Var, sb9.F);
        } else if (av9Var.Y() && ((av9VarG2 == null || !av9VarG2.u()) && (av9VarG2 == null || !av9VarG2.B()))) {
            fj0Var.b(av9Var, sb9Var);
        }
        if (j5bVar.d) {
            return;
        }
        F(null);
    }

    public final void B() {
        k00 k00Var = this.g0;
        k00Var.b0 = true;
        Handler handler = k00Var.H.getHandler();
        if (k00Var.q() && !k00Var.m0 && handler != null) {
            k00Var.m0 = true;
            handler.post(k00Var.o0);
        }
        a10 a10Var = this.contentCaptureManager;
        a10Var.K = true;
        Handler handler2 = a10Var.E.getHandler();
        if (!a10Var.e() || a10Var.Q || handler2 == null) {
            return;
        }
        a10Var.Q = true;
        handler2.post(a10Var.R);
    }

    public final void C() {
        if (this.K0) {
            return;
        }
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        if (jCurrentAnimationTimeMillis != this.lastMatrixRecalculationAnimationTime) {
            this.lastMatrixRecalculationAnimationTime = jCurrentAnimationTimeMillis;
            m62 m62Var = this.l1;
            float[] fArr = this.H0;
            m62Var.a(this, fArr);
            dgj.H(fArr, this.I0);
            ViewParent parent = getParent();
            View view = this;
            while (parent instanceof ViewGroup) {
                view = (View) parent;
                parent = ((ViewGroup) view).getParent();
            }
            int[] iArr = this.F0;
            view.getLocationOnScreen(iArr);
            float f = iArr[0];
            float f2 = iArr[1];
            view.getLocationInWindow(iArr);
            this.L0 = (((long) Float.floatToRawIntBits(f - iArr[0])) << 32) | (((long) Float.floatToRawIntBits(f2 - iArr[1])) & 4294967295L);
        }
    }

    public final void D(MotionEvent motionEvent) {
        this.lastMatrixRecalculationAnimationTime = AnimationUtils.currentAnimationTimeMillis();
        m62 m62Var = this.l1;
        float[] fArr = this.H0;
        m62Var.a(this, fArr);
        dgj.H(fArr, this.I0);
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        long jB = nwa.b((((long) Float.floatToRawIntBits(x)) << 32) | (((long) Float.floatToRawIntBits(y)) & 4294967295L), fArr);
        float rawX = motionEvent.getRawX() - Float.intBitsToFloat((int) (jB >> 32));
        float rawY = motionEvent.getRawY() - Float.intBitsToFloat((int) (jB & 4294967295L));
        this.L0 = (((long) Float.floatToRawIntBits(rawX)) << 32) | (((long) Float.floatToRawIntBits(rawY)) & 4294967295L);
    }

    public final boolean E() {
        if (isFocused()) {
            return true;
        }
        return super.requestFocus(130, null);
    }

    public final void F(av9 av9Var) {
        if (isLayoutRequested() || !isAttachedToWindow()) {
            return;
        }
        if (av9Var != null) {
            while (av9Var != null && av9Var.C() == xu9.E) {
                if (!this.C0) {
                    av9 av9VarG = av9Var.G();
                    if (av9VarG == null) {
                        break;
                    }
                    long j = ((z39) av9VarG.k0.H).H;
                    if (rl4.f(j) && rl4.e(j)) {
                        break;
                    }
                }
                av9Var = av9Var.G();
            }
            if (av9Var == getRoot()) {
                requestLayout();
                return;
            }
        }
        if (getWidth() == 0 || getHeight() == 0) {
            requestLayout();
        } else {
            invalidate();
        }
    }

    public final long G(long j) {
        C();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - Float.intBitsToFloat((int) (this.L0 >> 32));
        return nwa.b((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) - Float.intBitsToFloat((int) (this.L0 & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32), this.I0);
    }

    public final int H(MotionEvent motionEvent) {
        Object obj;
        if (this.m1) {
            this.m1 = false;
            y1a y1aVar = getComposeViewContext().s;
            int metaState = motionEvent.getMetaState();
            y1aVar.getClass();
            lsc lscVar = tbj.a;
            flk.j().setValue(new i8d(metaState));
        }
        urb urbVar = this.p0;
        i49 i49VarC = urbVar.c(motionEvent, this);
        int actionMasked = motionEvent.getActionMasked();
        y50 y50Var = this.q0;
        if (i49VarC == null) {
            if (!y50Var.a) {
                ((zka) ((gmf) y50Var.d).F).a();
                ((an8) y50Var.c).c();
            }
            return lvj.c(false, false, false);
        }
        List listL0 = i49VarC.L0();
        int size = listL0.size() - 1;
        if (size >= 0) {
            while (true) {
                int i = size - 1;
                obj = listL0.get(size);
                if (((b8d) obj).b() && (actionMasked == 0 || actionMasked == 5)) {
                    break;
                }
                if (i < 0) {
                    break;
                }
                size = i;
            }
            obj = null;
        } else {
            obj = null;
        }
        b8d b8dVar = (b8d) obj;
        if (b8dVar != null) {
            this.F = b8dVar.g();
        }
        int iB = y50Var.b(i49VarC, this, q(motionEvent));
        i49VarC.c1();
        if ((actionMasked != 0 && actionMasked != 5) || (iB & 1) != 0) {
            return iB;
        }
        int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
        urbVar.c.delete(pointerId);
        urbVar.b.delete(pointerId);
        return iB;
    }

    public final void I(MotionEvent motionEvent, int i, long j, boolean z) {
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = -1;
        if (actionMasked != 1) {
            if (actionMasked == 6) {
                actionIndex = motionEvent.getActionIndex();
            }
        } else if (i != 9 && i != 10) {
            actionIndex = 0;
        }
        int pointerCount = motionEvent.getPointerCount() - (actionIndex >= 0 ? 1 : 0);
        if (pointerCount == 0) {
            return;
        }
        MotionEvent.PointerProperties[] pointerPropertiesArr = new MotionEvent.PointerProperties[pointerCount];
        for (int i2 = 0; i2 < pointerCount; i2++) {
            pointerPropertiesArr[i2] = new MotionEvent.PointerProperties();
        }
        MotionEvent.PointerCoords[] pointerCoordsArr = new MotionEvent.PointerCoords[pointerCount];
        for (int i3 = 0; i3 < pointerCount; i3++) {
            pointerCoordsArr[i3] = new MotionEvent.PointerCoords();
        }
        int i4 = 0;
        while (i4 < pointerCount) {
            int i5 = ((actionIndex < 0 || i4 < actionIndex) ? 0 : 1) + i4;
            motionEvent.getPointerProperties(i5, pointerPropertiesArr[i4]);
            MotionEvent.PointerCoords pointerCoords = pointerCoordsArr[i4];
            motionEvent.getPointerCoords(i5, pointerCoords);
            float f = pointerCoords.x;
            long jT = t((((long) Float.floatToRawIntBits(pointerCoords.y)) & 4294967295L) | (((long) Float.floatToRawIntBits(f)) << 32));
            pointerCoords.x = Float.intBitsToFloat((int) (jT >> 32));
            pointerCoords.y = Float.intBitsToFloat((int) (jT & 4294967295L));
            i4++;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent.getDownTime() == motionEvent.getEventTime() ? j : motionEvent.getDownTime(), j, i, pointerCount, pointerPropertiesArr, pointerCoordsArr, motionEvent.getMetaState(), z ? 0 : motionEvent.getButtonState(), motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), motionEvent.getSource(), motionEvent.getFlags());
        i49 i49VarC = this.p0.c(motionEventObtain, this);
        i49VarC.getClass();
        this.q0.b(i49VarC, this, true);
        motionEventObtain.recycle();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void J(defpackage.pz7 r8, defpackage.vp4 r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.e00
            if (r0 == 0) goto L13
            r0 = r9
            e00 r0 = (defpackage.e00) r0
            int r1 = r0.G
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.G = r1
            goto L18
        L13:
            e00 r0 = new e00
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.E
            int r1 = r0.G
            r2 = 1
            if (r1 == 0) goto L2b
            if (r1 == r2) goto L27
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r7)
            return
        L27:
            defpackage.sf5.h0(r9)
            goto L4b
        L2b:
            defpackage.sf5.h0(r9)
            r9 = r2
            a00 r2 = new a00
            r1 = 2
            r2.<init>(r7, r1)
            r0.G = r9
            zw r1 = new zw
            r5 = 0
            r6 = 21
            java.util.concurrent.atomic.AtomicReference r3 = r7.R0
            r4 = r8
            r1.<init>(r2, r3, r4, r5, r6)
            java.lang.Object r7 = defpackage.fd9.N(r1, r0)
            m45 r8 = defpackage.m45.E
            if (r7 != r8) goto L4b
            return
        L4b:
            defpackage.sz6.r()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeView.J(pz7, vp4):void");
    }

    public final void K(Configuration configuration) {
        lsc lscVar;
        Configuration configuration2 = getConfiguration();
        if (x44.r(configuration2, configuration)) {
            return;
        }
        setConfiguration(new Configuration(configuration));
        if (configuration2.fontScale != configuration.fontScale || configuration2.densityDpi != configuration.densityDpi) {
            setDensity(d4c.s(getContext()));
        }
        if ((configuration2.diff(configuration) & (-1342235264)) == 0 || (lscVar = this.T.b) == null) {
            return;
        }
        lscVar.setValue(fd9.w(this));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void L() {
        /*
            Method dump skipped, instruction units count: 275
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeView.L():void");
    }

    public final void M(float f) {
        if (o()) {
            if (f > MTTypesetterKt.kLineSkipLimitMultiplier) {
                if (Float.isNaN(this.e1) || f > this.e1) {
                    this.e1 = f;
                    return;
                }
                return;
            }
            if (f < MTTypesetterKt.kLineSkipLimitMultiplier) {
                if (Float.isNaN(this.f1) || f < this.f1) {
                    this.f1 = f;
                }
            }
        }
    }

    @Override // defpackage.os7
    public final void a(jt7 jt7Var, jt7 jt7Var2) {
        g5c g5cVar;
        boolean z;
        g5c g5cVar2;
        boolean z2;
        if (jt7Var != null) {
            jt7 jt7Var3 = jt7Var;
            if (!jt7Var3.E.R) {
                b39.c("visitAncestors called on an unattached node");
            }
            hqb hqbVar = jt7Var3.E;
            av9 av9VarW = yfd.W(jt7Var);
            fwb fwbVar = null;
            ArrayList arrayList = null;
            while (av9VarW != null) {
                if ((((hqb) av9VarW.k0.K).H & FreeTypeConstants.FT_LOAD_COMPUTE_METRICS) != 0) {
                    while (hqbVar != null) {
                        if ((hqbVar.G & FreeTypeConstants.FT_LOAD_COMPUTE_METRICS) != 0) {
                            hqb hqbVarJ = hqbVar;
                            wwb wwbVar = null;
                            while (hqbVarJ != null) {
                                if (hqbVarJ instanceof u19) {
                                    if (arrayList == null) {
                                        arrayList = new ArrayList();
                                    }
                                    arrayList.add(hqbVarJ);
                                    z2 = false;
                                } else {
                                    z2 = true;
                                }
                                if (z2 && (hqbVarJ.G & FreeTypeConstants.FT_LOAD_COMPUTE_METRICS) != 0 && (hqbVarJ instanceof qw5)) {
                                    int i = 0;
                                    for (hqb hqbVar2 = ((qw5) hqbVarJ).T; hqbVar2 != null; hqbVar2 = hqbVar2.J) {
                                        if ((hqbVar2.G & FreeTypeConstants.FT_LOAD_COMPUTE_METRICS) != 0) {
                                            i++;
                                            if (i == 1) {
                                                hqbVarJ = hqbVar2;
                                            } else {
                                                if (wwbVar == null) {
                                                    wwbVar = new wwb(0, new hqb[16]);
                                                }
                                                if (hqbVarJ != null) {
                                                    wwbVar.b(hqbVarJ);
                                                    hqbVarJ = null;
                                                }
                                                wwbVar.b(hqbVar2);
                                            }
                                        }
                                    }
                                    if (i == 1) {
                                    }
                                }
                                hqbVarJ = yfd.j(wwbVar);
                            }
                        }
                        hqbVar = hqbVar.I;
                    }
                }
                av9VarW = av9VarW.G();
                hqbVar = (av9VarW == null || (g5cVar2 = av9VarW.k0) == null) ? null : (j4h) g5cVar2.J;
            }
            if (arrayList == null) {
                return;
            }
            if (jt7Var2 != null) {
                if (!jt7Var2.E.R) {
                    b39.c("visitAncestors called on an unattached node");
                }
                hqb hqbVar3 = jt7Var2.E;
                av9 av9VarW2 = yfd.W(jt7Var2);
                fwb fwbVar2 = null;
                while (av9VarW2 != null) {
                    if ((((hqb) av9VarW2.k0.K).H & FreeTypeConstants.FT_LOAD_COMPUTE_METRICS) != 0) {
                        while (hqbVar3 != null) {
                            if ((hqbVar3.G & FreeTypeConstants.FT_LOAD_COMPUTE_METRICS) != 0) {
                                hqb hqbVarJ2 = hqbVar3;
                                wwb wwbVar2 = null;
                                while (hqbVarJ2 != null) {
                                    if (hqbVarJ2 instanceof u19) {
                                        if (fwbVar2 == null) {
                                            fwb fwbVar3 = v6f.a;
                                            fwbVar2 = new fwb();
                                        }
                                        fwbVar2.a(hqbVarJ2);
                                        z = false;
                                    } else {
                                        z = true;
                                    }
                                    if (z && (hqbVarJ2.G & FreeTypeConstants.FT_LOAD_COMPUTE_METRICS) != 0 && (hqbVarJ2 instanceof qw5)) {
                                        int i2 = 0;
                                        for (hqb hqbVar4 = ((qw5) hqbVarJ2).T; hqbVar4 != null; hqbVar4 = hqbVar4.J) {
                                            if ((hqbVar4.G & FreeTypeConstants.FT_LOAD_COMPUTE_METRICS) != 0) {
                                                i2++;
                                                if (i2 == 1) {
                                                    hqbVarJ2 = hqbVar4;
                                                } else {
                                                    if (wwbVar2 == null) {
                                                        wwbVar2 = new wwb(0, new hqb[16]);
                                                    }
                                                    if (hqbVarJ2 != null) {
                                                        wwbVar2.b(hqbVarJ2);
                                                        hqbVarJ2 = null;
                                                    }
                                                    wwbVar2.b(hqbVar4);
                                                }
                                            }
                                        }
                                        if (i2 == 1) {
                                        }
                                    }
                                    hqbVarJ2 = yfd.j(wwbVar2);
                                }
                            }
                            hqbVar3 = hqbVar3.I;
                        }
                    }
                    av9VarW2 = av9VarW2.G();
                    hqbVar3 = (av9VarW2 == null || (g5cVar = av9VarW2.k0) == null) ? null : (j4h) g5cVar.J;
                }
                fwbVar = fwbVar2;
            }
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                u19 u19Var = (u19) arrayList.get(i3);
                if (!(fwbVar != null ? fwbVar.c(u19Var) : false)) {
                    u19Var.v0();
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i, int i2) {
        jt7 jt7Var = ((ts7) getFocusOwner()).c;
        if (!jt7Var.R) {
            return;
        }
        if (!jt7Var.E.R) {
            b39.c("visitSubtreeIf called on an unattached node");
        }
        wwb wwbVar = new wwb(0, new hqb[16]);
        hqb hqbVar = jt7Var.E;
        hqb hqbVar2 = hqbVar.J;
        if (hqbVar2 == null) {
            yfd.i(wwbVar, hqbVar);
        } else {
            wwbVar.b(hqbVar2);
        }
        while (true) {
            int i3 = wwbVar.G;
            if (i3 == 0) {
                return;
            }
            hqb hqbVar3 = (hqb) wwbVar.m(i3 - 1);
            if ((hqbVar3.H & FreeTypeConstants.FT_LOAD_NO_RECURSE) != 0) {
                for (hqb hqbVar4 = hqbVar3; hqbVar4 != null && hqbVar4.R; hqbVar4 = hqbVar4.J) {
                    if ((hqbVar4.G & FreeTypeConstants.FT_LOAD_NO_RECURSE) != 0) {
                        hqb hqbVarJ = hqbVar4;
                        wwb wwbVar2 = null;
                        while (hqbVarJ != null) {
                            if (hqbVarJ instanceof jt7) {
                                jt7 jt7Var2 = (jt7) hqbVarJ;
                                if (jt7Var2.R && jt7Var2.r1().a) {
                                    super.addFocusables(arrayList, i, i2);
                                    jt7 jt7Var3 = ((ts7) getFocusOwner()).c;
                                    if (jt7Var3.R) {
                                        if (!jt7Var3.E.R) {
                                            b39.c("visitSubtreeIf called on an unattached node");
                                        }
                                        wwb wwbVar3 = new wwb(0, new hqb[16]);
                                        hqb hqbVar5 = jt7Var3.E;
                                        hqb hqbVar6 = hqbVar5.J;
                                        if (hqbVar6 == null) {
                                            yfd.i(wwbVar3, hqbVar5);
                                        } else {
                                            wwbVar3.b(hqbVar6);
                                        }
                                        while (true) {
                                            int i4 = wwbVar3.G;
                                            if (i4 == 0) {
                                                break;
                                            }
                                            hqb hqbVar7 = (hqb) wwbVar3.m(i4 - 1);
                                            if ((hqbVar7.H & FreeTypeConstants.FT_LOAD_NO_RECURSE) != 0) {
                                                for (hqb hqbVar8 = hqbVar7; hqbVar8 != null && hqbVar8.R; hqbVar8 = hqbVar8.J) {
                                                    if ((hqbVar8.G & FreeTypeConstants.FT_LOAD_NO_RECURSE) != 0) {
                                                        hqb hqbVarJ2 = hqbVar8;
                                                        wwb wwbVar4 = null;
                                                        while (hqbVarJ2 != null) {
                                                            if (hqbVarJ2 instanceof jt7) {
                                                                jt7 jt7Var4 = (jt7) hqbVarJ2;
                                                                if (jt7Var4.R) {
                                                                    ws7 ws7VarR1 = jt7Var4.r1();
                                                                    if (jt7Var4.R && !jt7Var4.S && ws7VarR1.a) {
                                                                        return;
                                                                    }
                                                                }
                                                            } else if ((hqbVarJ2.G & FreeTypeConstants.FT_LOAD_NO_RECURSE) != 0 && (hqbVarJ2 instanceof qw5)) {
                                                                int i5 = 0;
                                                                for (hqb hqbVar9 = ((qw5) hqbVarJ2).T; hqbVar9 != null; hqbVar9 = hqbVar9.J) {
                                                                    if ((hqbVar9.G & FreeTypeConstants.FT_LOAD_NO_RECURSE) != 0) {
                                                                        i5++;
                                                                        if (i5 == 1) {
                                                                            hqbVarJ2 = hqbVar9;
                                                                        } else {
                                                                            if (wwbVar4 == null) {
                                                                                wwbVar4 = new wwb(0, new hqb[16]);
                                                                            }
                                                                            if (hqbVarJ2 != null) {
                                                                                wwbVar4.b(hqbVarJ2);
                                                                                hqbVarJ2 = null;
                                                                            }
                                                                            wwbVar4.b(hqbVar9);
                                                                        }
                                                                    }
                                                                }
                                                                if (i5 == 1) {
                                                                }
                                                            }
                                                            hqbVarJ2 = yfd.j(wwbVar4);
                                                        }
                                                    }
                                                }
                                            }
                                            yfd.i(wwbVar3, hqbVar7);
                                        }
                                    }
                                    if (arrayList != null) {
                                        arrayList.remove(this);
                                        return;
                                    }
                                    return;
                                }
                            } else if ((hqbVarJ.G & FreeTypeConstants.FT_LOAD_NO_RECURSE) != 0 && (hqbVarJ instanceof qw5)) {
                                int i6 = 0;
                                for (hqb hqbVar10 = ((qw5) hqbVarJ).T; hqbVar10 != null; hqbVar10 = hqbVar10.J) {
                                    if ((hqbVar10.G & FreeTypeConstants.FT_LOAD_NO_RECURSE) != 0) {
                                        i6++;
                                        if (i6 == 1) {
                                            hqbVarJ = hqbVar10;
                                        } else {
                                            if (wwbVar2 == null) {
                                                wwbVar2 = new wwb(0, new hqb[16]);
                                            }
                                            if (hqbVarJ != null) {
                                                wwbVar2.b(hqbVarJ);
                                                hqbVarJ = null;
                                            }
                                            wwbVar2.b(hqbVar10);
                                        }
                                    }
                                }
                                if (i6 == 1) {
                                }
                            }
                            hqbVarJ = yfd.j(wwbVar2);
                        }
                    }
                }
            }
            yfd.i(wwbVar, hqbVar3);
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i) {
        view.getClass();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = generateDefaultLayoutParams();
        }
        addViewInLayout(view, i, layoutParams, true);
    }

    @Override // android.view.View
    public final void autofill(SparseArray sparseArray) {
        qjf qjfVarI;
        bz7 bz7Var;
        bz7 bz7Var2;
        gz gzVar = this._autofillManager;
        if (gzVar != null) {
            int size = sparseArray.size();
            for (int i = 0; i < size; i++) {
                int iKeyAt = sparseArray.keyAt(i);
                AutofillValue autofillValue = (AutofillValue) sparseArray.get(iKeyAt);
                av9 av9Var = (av9) gzVar.F.c.b(iKeyAt);
                if (av9Var != null && (qjfVarI = av9Var.I()) != null) {
                    ewb ewbVar = qjfVarI.E;
                    Object objG = ewbVar.g(ojf.g);
                    if (objG == null) {
                        objG = null;
                    }
                    e5 e5Var = (e5) objG;
                    if (e5Var != null && (bz7Var2 = (bz7) e5Var.b) != null) {
                    }
                    Object objG2 = ewbVar.g(ojf.h);
                    e5 e5Var2 = (e5) (objG2 != null ? objG2 : null);
                    if (e5Var2 != null && (bz7Var = (bz7) e5Var2.b) != null) {
                    }
                }
            }
        }
        dpf dpfVar = this.t0;
        if (dpfVar != null) {
            qpk.e(dpfVar, sparseArray);
        }
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i) {
        return this.g0.h(i, this.F, false);
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i) {
        return this.g0.h(i, this.F, true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        qvb qvbVar = this.l0;
        if (!isAttachedToWindow()) {
            m(getRoot());
        }
        u(true);
        ycg.j().m();
        this.n0 = true;
        Trace.beginSection("AndroidOwner:draw");
        try {
            jb2 jb2Var = this.W;
            iz izVar = jb2Var.a;
            Canvas canvas2 = izVar.a;
            izVar.a = canvas;
            getRoot().k(izVar, null);
            jb2Var.a.a = canvas2;
            if (qvbVar.i()) {
                int i = qvbVar.b;
                for (int i2 = 0; i2 < i; i2++) {
                    ((ma8) ((mmc) qvbVar.f(i2))).g();
                }
            }
            int i3 = sxi.E;
            qvbVar.d();
            this.n0 = false;
            Trace.endSection();
            qvb qvbVar2 = this.m0;
            if (qvbVar2 != null) {
                qvbVar.b(qvbVar2);
                qvbVar2.d();
            }
            if (o()) {
                te0.a(this, this.e1);
                View view = this.P;
                if (view != null) {
                    te0.a(view, this.f1);
                    if (!Float.isNaN(this.f1)) {
                        view.invalidate();
                        drawChild(canvas, view, getDrawingTime());
                    }
                }
                this.e1 = Float.NaN;
                this.f1 = Float.NaN;
            }
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:204:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x038a  */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v21, types: [hqb] */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v23, types: [hqb] */
    /* JADX WARN: Type inference failed for: r3v24, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX WARN: Type inference failed for: r3v37 */
    /* JADX WARN: Type inference failed for: r3v38 */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v25, types: [wwb] */
    /* JADX WARN: Type inference failed for: r5v26 */
    /* JADX WARN: Type inference failed for: r5v27 */
    /* JADX WARN: Type inference failed for: r5v28, types: [wwb] */
    /* JADX WARN: Type inference failed for: r5v37 */
    /* JADX WARN: Type inference failed for: r5v38 */
    /* JADX WARN: Type inference failed for: r5v47 */
    /* JADX WARN: Type inference failed for: r5v48, types: [hqb] */
    /* JADX WARN: Type inference failed for: r5v49 */
    /* JADX WARN: Type inference failed for: r5v50, types: [hqb] */
    /* JADX WARN: Type inference failed for: r5v51, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v52 */
    /* JADX WARN: Type inference failed for: r5v53 */
    /* JADX WARN: Type inference failed for: r5v54 */
    /* JADX WARN: Type inference failed for: r5v55 */
    /* JADX WARN: Type inference failed for: r5v57 */
    /* JADX WARN: Type inference failed for: r5v58 */
    /* JADX WARN: Type inference failed for: r5v59 */
    /* JADX WARN: Type inference failed for: r5v60 */
    /* JADX WARN: Type inference failed for: r5v61 */
    /* JADX WARN: Type inference failed for: r5v62 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v41 */
    /* JADX WARN: Type inference failed for: r6v42 */
    /* JADX WARN: Type inference failed for: r6v43 */
    /* JADX WARN: Type inference failed for: r6v44, types: [wwb] */
    /* JADX WARN: Type inference failed for: r6v45 */
    /* JADX WARN: Type inference failed for: r6v46 */
    /* JADX WARN: Type inference failed for: r6v47, types: [wwb] */
    /* JADX WARN: Type inference failed for: r6v58 */
    /* JADX WARN: Type inference failed for: r6v59 */
    /* JADX WARN: Type inference failed for: r6v60 */
    /* JADX WARN: Type inference failed for: r6v61 */
    /* JADX WARN: Type inference failed for: r7v32 */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean dispatchGenericMotionEvent(android.view.MotionEvent r38) {
        /*
            Method dump skipped, instruction units count: 1755
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeView.dispatchGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x0159  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean dispatchHoverEvent(android.view.MotionEvent r24) {
        /*
            Method dump skipped, instruction units count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeView.dispatchHoverEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int i = 0;
        if (!isFocused()) {
            return ((ts7) getFocusOwner()).f(keyEvent, new xz(this, i, keyEvent));
        }
        y1a y1aVar = getComposeViewContext().s;
        int metaState = keyEvent.getMetaState();
        y1aVar.getClass();
        lsc lscVar = tbj.a;
        flk.j().setValue(new i8d(metaState));
        return ((ts7) getFocusOwner()).f(keyEvent, qs7.G) || super.dispatchKeyEvent(keyEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:176:0x021f A[RETURN] */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean dispatchKeyEventPreIme(android.view.KeyEvent r15) {
        /*
            Method dump skipped, instruction units count: 544
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeView.dispatchKeyEventPreIme(android.view.KeyEvent):boolean");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideStructure(ViewStructure viewStructure) {
        if (Build.VERSION.SDK_INT < 28) {
            l00.a.a(viewStructure, getView());
        } else {
            super.dispatchProvideStructure(viewStructure);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Object objA;
        jt7 jt7VarH;
        if (this.i1) {
            oz ozVar = this.h1;
            removeCallbacks(ozVar);
            MotionEvent motionEvent2 = this.a1;
            motionEvent2.getClass();
            if (motionEvent.getActionMasked() == 0 && motionEvent2.getSource() == motionEvent.getSource() && motionEvent2.getToolType(0) == motionEvent.getToolType(0)) {
                this.i1 = false;
            } else {
                ozVar.run();
            }
        }
        if (!p(motionEvent) && isAttachedToWindow() && (motionEvent.getActionMasked() != 2 || r(motionEvent))) {
            int iL = l(motionEvent);
            if ((iL & 2) != 0) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
            boolean z = motionEvent.getActionMasked() == 0 || motionEvent.getActionMasked() == 5;
            boolean z2 = motionEvent.isFromSource(8194) || motionEvent.isFromSource(1048584);
            if (z && z2) {
                Object parent = getParent();
                View view = parent instanceof View ? (View) parent : null;
                if (view == null || (objA = view.getTag(R.id.auto_clear_focus_behavior_tag)) == null) {
                    objA = l71.a(1);
                }
                if (objA.equals(l71.a(1)) && (jt7VarH = ((ts7) getFocusOwner()).h()) != null) {
                    m5c m5cVarV = yfd.V(jt7VarH);
                    if (!nai.A(m5cVarV).J(m5cVarV, true).a((((long) Float.floatToRawIntBits(motionEvent.getX())) << 32) | (((long) Float.floatToRawIntBits(motionEvent.getY())) & 4294967295L))) {
                        ((ts7) getFocusOwner()).b(false);
                    }
                }
            }
            if ((iL & 1) != 0) {
                return true;
            }
        }
        return false;
    }

    public final View findViewByAccessibilityIdTraversal(int accessibilityId) throws IllegalAccessException, InvocationTargetException {
        try {
            if (Build.VERSION.SDK_INT < 29) {
                return j(this, accessibilityId);
            }
            Method declaredMethod = View.class.getDeclaredMethod("findViewByAccessibilityIdTraversal", Integer.TYPE);
            declaredMethod.setAccessible(true);
            Object objInvoke = declaredMethod.invoke(this, Integer.valueOf(accessibilityId));
            if (objInvoke instanceof View) {
                return (View) objInvoke;
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final View focusSearch(View view, int i) {
        l9e l9eVarA;
        if (view == null || this.D0.c) {
            return super.focusSearch(view, i);
        }
        View rootView = getRootView();
        rootView.getClass();
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus((ViewGroup) rootView, view, i);
        if (viewFindNextFocus == null || !u00.f(this, viewFindNextFocus)) {
            viewFindNextFocus = null;
        }
        if (view == this) {
            jt7 jt7VarL = cok.l(((ts7) getFocusOwner()).c);
            l9eVarA = jt7VarL != null ? cok.m(jt7VarL) : null;
            if (l9eVarA == null) {
                l9eVarA = ms7.a(view, this);
            }
        } else {
            l9eVarA = ms7.a(view, this);
        }
        wr7 wr7VarD = ms7.d(i);
        int i2 = wr7VarD != null ? wr7VarD.a : 6;
        dae daeVar = new dae();
        if (((ts7) getFocusOwner()).g(i2, l9eVarA, new zz(0, daeVar)) == null) {
            return view;
        }
        if (daeVar.E == null) {
            if (viewFindNextFocus == null) {
                return super.focusSearch(view, i);
            }
        } else if (viewFindNextFocus == null || aok.f(i2) || nvk.p(cok.m((jt7) daeVar.E), ms7.a(viewFindNextFocus, this), l9eVarA, i2)) {
            return this;
        }
        return viewFindNextFocus;
    }

    public final s70 getAndroidViewsHandler$ui() {
        if (this.A0 == null) {
            s70 s70Var = new s70(getContext());
            this.A0 = s70Var;
            addView(s70Var, -1);
            requestLayout();
        }
        s70 s70Var2 = this.A0;
        s70Var2.getClass();
        return s70Var2;
    }

    @Override // androidx.compose.ui.node.Owner
    public h91 getAutofill() {
        return this.t0;
    }

    @Override // androidx.compose.ui.node.Owner
    public m91 getAutofillManager() {
        return this._autofillManager;
    }

    @Override // androidx.compose.ui.node.Owner
    public n91 getAutofillTree() {
        return this.autofillTree;
    }

    public final hd4 getComposeViewContext() {
        return get_composeViewContext();
    }

    /* JADX INFO: renamed from: getComposeViewContextIncrementedDuringInit$ui, reason: from getter */
    public final boolean getComposeViewContextIncrementedDuringInit() {
        return this.composeViewContextIncrementedDuringInit;
    }

    public final Configuration getConfiguration() {
        return (Configuration) this.r0.getValue();
    }

    /* JADX INFO: renamed from: getContentCaptureManager$ui, reason: from getter */
    public final a10 getContentCaptureManager() {
        return this.contentCaptureManager;
    }

    @Override // androidx.compose.ui.node.Owner
    public c45 getCoroutineContext() {
        return this.coroutineContext;
    }

    @Override // androidx.compose.ui.node.Owner
    public cz5 getDensity() {
        return (cz5) this.O.getValue();
    }

    public l9e getEmbeddedViewFocusRect() {
        if (isFocused()) {
            jt7 jt7VarL = cok.l(((ts7) getFocusOwner()).c);
            if (jt7VarL != null) {
                return cok.m(jt7VarL);
            }
            return null;
        }
        View viewFindFocus = findFocus();
        if (viewFindFocus != null) {
            return ms7.a(viewFindFocus, this);
        }
        return null;
    }

    @Override // androidx.compose.ui.node.Owner
    public rs7 getFocusOwner() {
        return this.Q;
    }

    @Override // android.view.View
    public final void getFocusedRect(Rect rect) {
        l9e embeddedViewFocusRect = getEmbeddedViewFocusRect();
        if (embeddedViewFocusRect != null) {
            rect.left = Math.round(embeddedViewFocusRect.a);
            rect.top = Math.round(embeddedViewFocusRect.b);
            rect.right = Math.round(embeddedViewFocusRect.c);
            rect.bottom = Math.round(embeddedViewFocusRect.d);
            return;
        }
        if (x44.r(((ts7) getFocusOwner()).g(6, null, ex.H), Boolean.TRUE)) {
            super.getFocusedRect(rect);
        } else {
            rect.set(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
        }
    }

    @Override // androidx.compose.ui.node.Owner
    public wt7 getFontFamilyResolver() {
        return (wt7) this.fontFamilyResolver.getValue();
    }

    @Override // androidx.compose.ui.node.Owner
    public rt7 getFontLoader() {
        return this.fontLoader;
    }

    /* JADX INFO: renamed from: getFrameEndScheduler$ui, reason: from getter */
    public final s4a getFrameEndScheduler() {
        return this.frameEndScheduler;
    }

    @Override // androidx.compose.ui.node.Owner
    public ga8 getGraphicsContext() {
        return this.j0;
    }

    @Override // androidx.compose.ui.node.Owner
    public gf8 getHapticFeedBack() {
        return this.hapticFeedBack;
    }

    public boolean getHasPendingMeasureOrLayout() {
        return this.D0.b.z() || !this.M.isEmpty();
    }

    @Override // android.view.View
    public int getImportantForAutofill() {
        return 1;
    }

    @Override // androidx.compose.ui.node.Owner
    public m49 getInputModeManager() {
        return this.X0;
    }

    public final i59 getInsetsListener() {
        return this.insetsListener;
    }

    /* JADX INFO: renamed from: getLastMatrixRecalculationAnimationTime$ui, reason: from getter */
    public final long getLastMatrixRecalculationAnimationTime() {
        return this.lastMatrixRecalculationAnimationTime;
    }

    @Override // android.view.View, android.view.ViewParent, androidx.compose.ui.node.Owner
    public fu9 getLayoutDirection() {
        return (fu9) this.V0.getValue();
    }

    @Override // androidx.compose.ui.node.Owner
    public gea getLocaleList() {
        return (gea) this.s0.getValue();
    }

    public long getMeasureIteration() {
        j5b j5bVar = this.D0;
        if (!j5bVar.c) {
            b39.a("measureIteration should be only used during the measure/layout pass");
        }
        return j5bVar.g;
    }

    public lqb getModifierLocalManager() {
        return this.modifierLocalManager;
    }

    @Override // androidx.compose.ui.node.Owner
    public AndroidComposeView getOutOfFrameExecutor() {
        if (isAttachedToWindow()) {
            return this;
        }
        return null;
    }

    @Override // androidx.compose.ui.node.Owner
    public b3d getPlacementScope() {
        int i = d3d.b;
        return new gma(1, this);
    }

    @Override // androidx.compose.ui.node.Owner
    public y7d getPointerIconService() {
        return this.q1;
    }

    /* JADX INFO: renamed from: getPrimaryDirectionalMotionAxisOverride-dqNNBbU$ui, reason: not valid java name and from getter */
    public final l19 getPrimaryDirectionalMotionAxisOverride() {
        return this.primaryDirectionalMotionAxisOverride;
    }

    @Override // androidx.compose.ui.node.Owner
    public n9e getRectManager() {
        return this.rectManager;
    }

    @Override // androidx.compose.ui.node.Owner
    public ore getRetainedValuesStore() {
        return this.retainedValuesStore;
    }

    @Override // androidx.compose.ui.node.Owner
    public av9 getRoot() {
        return this.root;
    }

    public gve getRootForTest() {
        return this;
    }

    public final boolean getScrollCaptureInProgress$ui() {
        tk5 tk5Var;
        if (Build.VERSION.SDK_INT < 31 || (tk5Var = this.o1) == null) {
            return false;
        }
        return ((Boolean) ((lsc) tk5Var.F).getValue()).booleanValue();
    }

    @Override // androidx.compose.ui.node.Owner
    public zjf getSemanticsOwner() {
        return this.semanticsOwner;
    }

    @Override // androidx.compose.ui.node.Owner
    public cv9 getSharedDrawScope() {
        return this.sharedDrawScope;
    }

    @Override // androidx.compose.ui.node.Owner
    public boolean getShowLayoutBounds() {
        return Build.VERSION.SDK_INT >= 30 ? ne0.a.a(this) : this.showLayoutBounds;
    }

    @Override // androidx.compose.ui.node.Owner
    public omc getSnapshotObserver() {
        return this.snapshotObserver;
    }

    @Override // androidx.compose.ui.node.Owner
    public beg getSoftwareKeyboardController() {
        fx5 fx5Var = this.S0;
        if (fx5Var != null) {
            return fx5Var;
        }
        fx5 fx5Var2 = new fx5(getTextInputService());
        this.S0 = fx5Var2;
        return fx5Var2;
    }

    @Override // androidx.compose.ui.node.Owner
    public jjh getTextInputService() {
        jjh jjhVar = this.Q0;
        if (jjhVar != null) {
            return jjhVar;
        }
        jjh jjhVar2 = new jjh(getLegacyTextInputServiceAndroid());
        this.Q0 = jjhVar2;
        return jjhVar2;
    }

    @Override // androidx.compose.ui.node.Owner
    public wkh getTextToolbar() {
        return this.Z0;
    }

    public final fve getUncaughtExceptionHandler$ui() {
        return null;
    }

    public View getView() {
        return this;
    }

    @Override // androidx.compose.ui.node.Owner
    public ovi getViewConfiguration() {
        return this.a0;
    }

    public final uz getViewTreeOwners() {
        ij0.x(this.N0.getValue());
        return null;
    }

    @Override // androidx.compose.ui.node.Owner
    public sbj getWindowInfo() {
        return getComposeViewContext().s;
    }

    /* JADX INFO: renamed from: get_autofillManager$ui, reason: from getter */
    public final gz get_autofillManager() {
        return this._autofillManager;
    }

    public final mmc i(pz7 pz7Var, j5c j5cVar, ja8 ja8Var) {
        wwb wwbVar;
        Reference referencePoll;
        Object obj;
        if (ja8Var != null) {
            return new ma8(ja8Var, null, this, pz7Var, j5cVar);
        }
        do {
            cbf cbfVar = this.c1;
            ReferenceQueue referenceQueue = (ReferenceQueue) cbfVar.G;
            wwbVar = (wwb) cbfVar.F;
            referencePoll = referenceQueue.poll();
            if (referencePoll != null) {
                wwbVar.l(referencePoll);
            }
        } while (referencePoll != null);
        while (true) {
            int i = wwbVar.G;
            if (i == 0) {
                obj = null;
                break;
            }
            obj = ((Reference) wwbVar.m(i - 1)).get();
            if (obj != null) {
                break;
            }
        }
        mmc mmcVar = (mmc) obj;
        if (mmcVar == null) {
            return new ma8(getGraphicsContext().c(), getGraphicsContext(), this, pz7Var, j5cVar);
        }
        ma8 ma8Var = (ma8) mmcVar;
        ga8 ga8Var = ma8Var.F;
        if (ga8Var == null) {
            throw sq6.z("currently reuse is only supported when we manage the layer lifecycle");
        }
        if (!ma8Var.E.s) {
            b39.a("layer should have been released before reuse");
        }
        ma8Var.E = ga8Var.c();
        ma8Var.K = false;
        ma8Var.H = pz7Var;
        ma8Var.I = j5cVar;
        ma8Var.U = false;
        ma8Var.V = false;
        ma8Var.W = true;
        nwa.d(ma8Var.L);
        float[] fArr = ma8Var.M;
        if (fArr != null) {
            nwa.d(fArr);
        }
        ma8Var.S = d5i.b;
        ma8Var.X = false;
        ma8Var.J = 9223372034707292159L;
        ma8Var.T = null;
        ma8Var.R = 0;
        return mmcVar;
    }

    public final void k(av9 av9Var, boolean z) {
        this.D0.h(av9Var, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x007b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int l(android.view.MotionEvent r17) {
        /*
            Method dump skipped, instruction units count: 373
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeView.l(android.view.MotionEvent):int");
    }

    public final void n(av9 av9Var) {
        this.D0.s(av9Var, false);
        wwb wwbVarM = av9Var.M();
        Object[] objArr = wwbVarM.E;
        int i = wwbVarM.G;
        for (int i2 = 0; i2 < i; i2++) {
            n((av9) objArr[i2]);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        ore oreVar;
        Object obj;
        super.onAttachedToWindow();
        setAttached(true);
        int i = Build.VERSION.SDK_INT;
        if (i < 30) {
            setShowLayoutBounds(oq5.A());
        }
        this.insetsListener.onViewAttachedToWindow(this);
        int i2 = 0;
        if (i > 28) {
            if (v1 == null) {
                qz qzVar = new qz(i2);
                v1 = qzVar;
                StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
                try {
                    if (r1 == null) {
                        r1 = Class.forName("android.os.SystemProperties");
                    }
                    if (t1 == null) {
                        StrictMode.setVmPolicy(StrictMode.VmPolicy.LAX);
                        Class cls = r1;
                        t1 = cls != null ? cls.getDeclaredMethod("addChangeCallback", Runnable.class) : null;
                    }
                    Method method = t1;
                    if (method != null) {
                        method.invoke(null, qzVar);
                    }
                } catch (Throwable unused) {
                }
                StrictMode.setVmPolicy(vmPolicy);
            }
            qvb qvbVar = u1;
            synchronized (qvbVar) {
                qvbVar.a(this);
            }
        }
        if (!this.composeViewContextIncrementedDuringInit) {
            getComposeViewContext().c();
        }
        this.composeViewContextIncrementedDuringInit = false;
        n(getRoot());
        m(getRoot());
        getSnapshotObserver().a.e();
        dpf dpfVar = this.t0;
        if (dpfVar != null) {
            j91 j91Var = j91.a;
            j91Var.getClass();
            ((AutofillManager) dpfVar.H).registerCallback(j91Var);
        }
        m4a m4aVar = getComposeViewContext().c;
        eyi eyiVar = getComposeViewContext().e;
        s4a s4aVar = this.frameEndScheduler;
        if (m4aVar == null || eyiVar == null || s4aVar == null) {
            oreVar = null;
        } else {
            dyi dyiVarF = eyiVar.f();
            ayi ayiVar = new ayi();
            i95 i95Var = i95.b;
            dyiVarF.getClass();
            i95Var.getClass();
            dpf dpfVar2 = new dpf(dyiVarF, ayiVar, i95Var);
            pl9 pl9VarB = jce.a.b(u4a.class);
            String strD = pl9VarB.d();
            if (strD == null) {
                sz6.p("Local and anonymous classes can not be ViewModels");
                return;
            }
            u4a u4aVar = (u4a) dpfVar2.L(pl9VarB, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strD));
            Object parent = getParent();
            parent.getClass();
            int id = ((View) parent).getId();
            xub xubVar = u4aVar.b;
            Object objB = xubVar.b(id);
            if (objB == null) {
                objB = new qvb(1);
                xubVar.i(id, objB);
            }
            qvb qvbVar2 = (qvb) objB;
            Object[] objArr = qvbVar2.a;
            int i3 = qvbVar2.b;
            while (true) {
                if (i2 >= i3) {
                    obj = null;
                    break;
                }
                obj = objArr[i2];
                if (!((t4a) obj).c) {
                    break;
                } else {
                    i2++;
                }
            }
            t4a t4aVar = (t4a) obj;
            if (t4aVar == null) {
                t4aVar = new t4a();
                qvbVar2.a(t4aVar);
            }
            t4aVar.c = true;
            this.K = t4aVar;
            oreVar = t4aVar.b;
        }
        if (oreVar == null) {
            oreVar = a5.I;
        }
        this.retainedValuesStore = oreVar;
        bz7 bz7Var = this.O0;
        if (bz7Var != null) {
            bz7Var.invoke(getComposeViewContext());
            this.O0 = null;
        }
        c4a c4aVarA = getComposeViewContext().c.a();
        c4aVarA.a(this);
        c4aVarA.a(this.contentCaptureManager);
        this.X0.a.setValue(new l49(isInTouchMode() ? 1 : 2));
        getViewTreeObserver().addOnGlobalLayoutListener(this);
        getViewTreeObserver().addOnScrollChangedListener(this);
        getViewTreeObserver().addOnTouchModeChangeListener(this);
        if (Build.VERSION.SDK_INT >= 31) {
            r00.a.b(this);
        }
        gz gzVar = this._autofillManager;
        if (gzVar != null) {
            ((ts7) getFocusOwner()).g.a(gzVar);
            getSemanticsOwner().d.a(gzVar);
        }
        ((ts7) getFocusOwner()).g.a(this);
    }

    @Override // android.view.View
    public final boolean onCheckIsTextEditor() {
        ftf ftfVar = (ftf) this.R0.get();
        k40 k40Var = (k40) (ftfVar != null ? ftfVar.b : null);
        if (k40Var == null) {
            return getLegacyTextInputServiceAndroid().d;
        }
        ftf ftfVar2 = (ftf) k40Var.H.get();
        j49 j49Var = (j49) (ftfVar2 != null ? ftfVar2.b : null);
        return j49Var != null && (j49Var.e ^ true);
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        K(configuration);
    }

    @Override // android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        int i;
        ftf ftfVar = (ftf) this.R0.get();
        k40 k40Var = (k40) (ftfVar != null ? ftfVar.b : null);
        if (k40Var == null) {
            ljh legacyTextInputServiceAndroid = getLegacyTextInputServiceAndroid();
            if (legacyTextInputServiceAndroid.d) {
                xy8 xy8Var = legacyTextInputServiceAndroid.h;
                cjh cjhVar = legacyTextInputServiceAndroid.g;
                int i2 = xy8Var.e;
                boolean z = xy8Var.a;
                int i3 = 4;
                if (i2 == 1) {
                    i = z ? 6 : 0;
                } else if (i2 == 0) {
                    i = 1;
                } else if (i2 == 2) {
                    i = 2;
                } else if (i2 == 6) {
                    i = 5;
                } else if (i2 == 5) {
                    i = 7;
                } else if (i2 == 3) {
                    i = 3;
                } else if (i2 == 4) {
                    i = 4;
                } else {
                    if (i2 != 7) {
                        sz6.j("invalid ImeAction");
                        return null;
                    }
                }
                editorInfo.imeOptions = i;
                int i4 = xy8Var.d;
                if (i4 == 1) {
                    editorInfo.inputType = 1;
                } else if (i4 == 2) {
                    editorInfo.inputType = 1;
                    editorInfo.imeOptions = Integer.MIN_VALUE | i;
                } else if (i4 == 3) {
                    editorInfo.inputType = 2;
                } else if (i4 == 4) {
                    editorInfo.inputType = 3;
                } else if (i4 == 5) {
                    editorInfo.inputType = 17;
                } else if (i4 == 6) {
                    editorInfo.inputType = 33;
                } else if (i4 == 7) {
                    editorInfo.inputType = 129;
                } else if (i4 == 8) {
                    editorInfo.inputType = 18;
                } else {
                    if (i4 != 9) {
                        sz6.j("Invalid Keyboard Type");
                        return null;
                    }
                    editorInfo.inputType = 8194;
                }
                if (!z) {
                    int i5 = editorInfo.inputType;
                    if ((i5 & 1) == 1) {
                        editorInfo.inputType = i5 | 131072;
                        if (i2 == 1) {
                            editorInfo.imeOptions |= 1073741824;
                        }
                    }
                }
                int i6 = editorInfo.inputType;
                if ((i6 & 1) == 1) {
                    int i7 = xy8Var.b;
                    if (i7 == 1) {
                        editorInfo.inputType = i6 | FreeTypeConstants.FT_LOAD_MONOCHROME;
                    } else if (i7 == 2) {
                        editorInfo.inputType = i6 | FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
                    } else if (i7 == 3) {
                        editorInfo.inputType = i6 | 16384;
                    }
                    if (xy8Var.c) {
                        editorInfo.inputType |= FreeTypeConstants.FT_LOAD_NO_AUTOHINT;
                    }
                }
                long j = cjhVar.b;
                int i8 = kkh.c;
                editorInfo.initialSelStart = (int) (j >> 32);
                editorInfo.initialSelEnd = (int) (j & 4294967295L);
                ez1.T(editorInfo, cjhVar.a.F);
                editorInfo.imeOptions |= 33554432;
                if (gl6.d()) {
                    gl6.a().i(editorInfo);
                }
                g9e g9eVar = new g9e(legacyTextInputServiceAndroid.g, new fnf(i3, legacyTextInputServiceAndroid), legacyTextInputServiceAndroid.h.c);
                legacyTextInputServiceAndroid.i.add(new WeakReference(g9eVar));
                return g9eVar;
            }
        } else {
            ftf ftfVar2 = (ftf) k40Var.H.get();
            j49 j49Var = (j49) (ftfVar2 != null ? ftfVar2.b : null);
            if (j49Var != null) {
                synchronized (j49Var.c) {
                    if (j49Var.e) {
                        return null;
                    }
                    InputConnection inputConnectionG = j49Var.a.g(editorInfo);
                    defpackage.e0 e0Var = new defpackage.e0(20, j49Var);
                    InputConnection s9cVar = Build.VERSION.SDK_INT >= 34 ? new s9c(inputConnectionG, e0Var) : new r9c(inputConnectionG, e0Var);
                    j49Var.d.b(new o6j(s9cVar));
                    return s9cVar;
                }
            }
        }
        return null;
    }

    @Override // android.view.View
    public final void onCreateVirtualViewTranslationRequests(long[] jArr, int[] iArr, Consumer consumer) {
        a10 a10Var = this.contentCaptureManager;
        a10Var.getClass();
        tpk.i(a10Var, jArr, consumer);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setAttached(false);
        this.insetsListener.onViewDetachedFromWindow(this);
        View view = this.P;
        if (o() && view != null) {
            removeView(view);
        }
        int i = Build.VERSION.SDK_INT;
        if (i > 28) {
            qvb qvbVar = u1;
            synchronized (qvbVar) {
                qvbVar.j(this);
            }
        }
        getComposeViewContext().b();
        odg odgVar = getSnapshotObserver().a;
        cd cdVar = (cd) odgVar.i;
        if (cdVar != null) {
            cdVar.h();
        }
        odgVar.a();
        c4a c4aVarA = getComposeViewContext().c.a();
        c4aVarA.c(this.contentCaptureManager);
        c4aVarA.c(this);
        dpf dpfVar = this.t0;
        if (dpfVar != null) {
            j91 j91Var = j91.a;
            j91Var.getClass();
            ((AutofillManager) dpfVar.H).unregisterCallback(j91Var);
        }
        getViewTreeObserver().removeOnGlobalLayoutListener(this);
        getViewTreeObserver().removeOnScrollChangedListener(this);
        getViewTreeObserver().removeOnTouchModeChangeListener(this);
        t4a t4aVar = this.K;
        if (t4aVar != null) {
            t4aVar.c = false;
        }
        this.K = null;
        if (i >= 31) {
            r00.a.a(this);
        }
        gz gzVar = this._autofillManager;
        if (gzVar != null) {
            getSemanticsOwner().d.j(gzVar);
            ((ts7) getFocusOwner()).g.j(gzVar);
        }
        n9e rectManager = getRectManager();
        rectManager.f = rectManager.c.b(0L, 0L, null, 0, 0);
        getRectManager().a();
        n9e rectManager2 = getRectManager();
        pz pzVar = rectManager2.h;
        if (pzVar != null) {
            rectManager2.a.removeCallbacks(pzVar);
            rectManager2.h = null;
        }
        ((ts7) getFocusOwner()).g.j(this);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (z || hasFocus()) {
            return;
        }
        ts7 ts7Var = (ts7) getFocusOwner();
        sf5.n(ts7Var.c, true);
        if (ts7Var.h() != null) {
            jt7 jt7VarH = ts7Var.h();
            ts7Var.k(null);
            if (jt7VarH != null) {
                jt7VarH.q1(ft7.E, ft7.G);
            }
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        this.lastMatrixRecalculationAnimationTime = 0L;
        L();
        int i = Build.VERSION.SDK_INT;
        if (32 > i || i >= 34) {
            return;
        }
        K(getResources().getConfiguration());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Trace.beginSection("AndroidOwner:onLayout");
        try {
            this.lastMatrixRecalculationAnimationTime = 0L;
            this.D0.m(this.k1);
            this.B0 = null;
            L();
            if (this.A0 != null) {
                Trace.beginSection("AndroidOwner:viewLayout");
                getAndroidViewsHandler$ui().layout(0, 0, i3 - i, i4 - i2);
                Trace.endSection();
            }
        } catch (Throwable th) {
            throw th;
        } finally {
            Trace.endSection();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x009b, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x009f, code lost:
    
        throw r8;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r9, int r10) {
        /*
            r8 = this;
            j5b r0 = r8.D0
            java.lang.String r1 = "AndroidOwner:onMeasure"
            android.os.Trace.beginSection(r1)
            boolean r1 = r8.isAttachedToWindow()     // Catch: java.lang.Throwable -> L9b
            if (r1 != 0) goto L14
            av9 r1 = r8.getRoot()     // Catch: java.lang.Throwable -> L9b
            r8.n(r1)     // Catch: java.lang.Throwable -> L9b
        L14:
            long r1 = h(r9)     // Catch: java.lang.Throwable -> L9b
            r9 = 32
            long r3 = r1 >>> r9
            int r3 = (int) r3     // Catch: java.lang.Throwable -> L9b
            r4 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r1 = r1 & r4
            int r1 = (int) r1     // Catch: java.lang.Throwable -> L9b
            long r6 = h(r10)     // Catch: java.lang.Throwable -> L9b
            long r9 = r6 >>> r9
            int r9 = (int) r9     // Catch: java.lang.Throwable -> L9b
            long r4 = r4 & r6
            int r10 = (int) r4     // Catch: java.lang.Throwable -> L9b
            long r9 = defpackage.sf5.F(r3, r1, r9, r10)     // Catch: java.lang.Throwable -> L9b
            rl4 r1 = r8.B0     // Catch: java.lang.Throwable -> L9b
            if (r1 != 0) goto L40
            rl4 r1 = new rl4     // Catch: java.lang.Throwable -> L9b
            r1.<init>(r9)     // Catch: java.lang.Throwable -> L9b
            r8.B0 = r1     // Catch: java.lang.Throwable -> L9b
            r1 = 0
            r8.C0 = r1     // Catch: java.lang.Throwable -> L9b
            goto L4b
        L40:
            long r1 = r1.a     // Catch: java.lang.Throwable -> L9b
            boolean r1 = defpackage.rl4.b(r1, r9)     // Catch: java.lang.Throwable -> L9b
            if (r1 != 0) goto L4b
            r1 = 1
            r8.C0 = r1     // Catch: java.lang.Throwable -> L9b
        L4b:
            r0.t(r9)     // Catch: java.lang.Throwable -> L9b
            r0.o()     // Catch: java.lang.Throwable -> L9b
            av9 r9 = r8.getRoot()     // Catch: java.lang.Throwable -> L9b
            int r9 = r9.J()     // Catch: java.lang.Throwable -> L9b
            av9 r10 = r8.getRoot()     // Catch: java.lang.Throwable -> L9b
            int r10 = r10.s()     // Catch: java.lang.Throwable -> L9b
            r8.setMeasuredDimension(r9, r10)     // Catch: java.lang.Throwable -> L9b
            s70 r9 = r8.A0     // Catch: java.lang.Throwable -> L9b
            if (r9 == 0) goto L97
            java.lang.String r9 = "AndroidOwner:androidViewMeasure"
            android.os.Trace.beginSection(r9)     // Catch: java.lang.Throwable -> L9b
            s70 r9 = r8.getAndroidViewsHandler$ui()     // Catch: java.lang.Throwable -> L92
            av9 r10 = r8.getRoot()     // Catch: java.lang.Throwable -> L92
            int r10 = r10.J()     // Catch: java.lang.Throwable -> L92
            r0 = 1073741824(0x40000000, float:2.0)
            int r10 = android.view.View.MeasureSpec.makeMeasureSpec(r10, r0)     // Catch: java.lang.Throwable -> L92
            av9 r8 = r8.getRoot()     // Catch: java.lang.Throwable -> L92
            int r8 = r8.s()     // Catch: java.lang.Throwable -> L92
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r0)     // Catch: java.lang.Throwable -> L92
            r9.measure(r10, r8)     // Catch: java.lang.Throwable -> L92
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> L9b
            goto L97
        L92:
            r8 = move-exception
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> L9b
            throw r8     // Catch: java.lang.Throwable -> L9b
        L97:
            android.os.Trace.endSection()
            return
        L9b:
            r8 = move-exception
            android.os.Trace.endSection()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeView.onMeasure(int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00a0  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onProvideAutofillVirtualStructure(android.view.ViewStructure r11, int r12) {
        /*
            r10 = this;
            if (r11 == 0) goto Lb0
            gz r12 = r10._autofillManager
            if (r12 == 0) goto La9
            zjf r0 = r12.F
            av9 r0 = r0.a
            android.view.autofill.AutofillId r1 = r12.K
            java.lang.String r2 = r12.I
            n9e r12 = r12.H
            defpackage.tvj.d(r11, r0, r1, r2, r12)
            java.lang.Object[] r3 = defpackage.wac.a
            qvb r3 = new qvb
            r4 = 2
            r3.<init>(r4)
            r3.a(r0)
            r3.a(r11)
        L21:
            boolean r0 = r3.i()
            if (r0 == 0) goto La9
            int r0 = r3.b
            int r0 = r0 + (-1)
            java.lang.Object r0 = r3.k(r0)
            r0.getClass()
            android.view.ViewStructure r0 = (android.view.ViewStructure) r0
            int r4 = r3.b
            int r4 = r4 + (-1)
            java.lang.Object r4 = r3.k(r4)
            r4.getClass()
            av9 r4 = (defpackage.av9) r4
            java.util.List r4 = r4.q()
            int r5 = r4.size()
            r6 = 0
        L4a:
            if (r6 >= r5) goto L21
            r7 = r4
            vwb r7 = (defpackage.vwb) r7
            java.lang.Object r7 = r7.get(r6)
            av9 r7 = (defpackage.av9) r7
            boolean r8 = r7.u0
            if (r8 != 0) goto La6
            boolean r8 = r7.X()
            if (r8 == 0) goto La6
            boolean r8 = r7.Y()
            if (r8 != 0) goto L66
            goto La6
        L66:
            qjf r8 = r7.I()
            if (r8 == 0) goto La0
            ewb r8 = r8.E
            dkf r9 = defpackage.ojf.g
            boolean r9 = r8.b(r9)
            if (r9 != 0) goto L8e
            dkf r9 = defpackage.ojf.h
            boolean r9 = r8.b(r9)
            if (r9 != 0) goto L8e
            dkf r9 = defpackage.akf.r
            boolean r9 = r8.b(r9)
            if (r9 != 0) goto L8e
            dkf r9 = defpackage.akf.s
            boolean r8 = r8.b(r9)
            if (r8 == 0) goto La0
        L8e:
            int r8 = defpackage.hj6.q(r0)
            android.view.ViewStructure r8 = defpackage.hj6.K(r0, r8)
            defpackage.tvj.d(r8, r7, r1, r2, r12)
            r3.a(r7)
            r3.a(r8)
            goto La6
        La0:
            r3.a(r7)
            r3.a(r0)
        La6:
            int r6 = r6 + 1
            goto L4a
        La9:
            dpf r10 = r10.t0
            if (r10 == 0) goto Lb0
            defpackage.qpk.f(r10, r11)
        Lb0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeView.onProvideAutofillVirtualStructure(android.view.ViewStructure, int):void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i) {
        x7d x7dVar;
        int toolType = motionEvent.getToolType(i);
        return (motionEvent.isFromSource(8194) || !motionEvent.isFromSource(16386) || !(toolType == 2 || toolType == 4) || (x7dVar = ((b00) getPointerIconService()).a) == null) ? super.onResolvePointerIcon(motionEvent, i) : s00.b(getContext(), x7dVar);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onResume(m4a m4aVar) {
        za2 za2VarS;
        if (Build.VERSION.SDK_INT < 30) {
            setShowLayoutBounds(oq5.A());
        }
        t4a t4aVar = this.K;
        if (t4aVar != null) {
            s4a s4aVar = this.frameEndScheduler;
            s4aVar.getClass();
            gmf gmfVar = t4aVar.a;
            aqa aqaVar = (aqa) gmfVar.F;
            if (!aqaVar.E || aqaVar.G) {
                return;
            }
            try {
                za2VarS = ((lij) s4aVar).E.s(new v01(27, t4aVar));
            } catch (CancellationException unused) {
                aqa aqaVar2 = (aqa) gmfVar.F;
                if (!aqaVar2.F) {
                    if (aqaVar2.G) {
                        abd.a("ManagedValuesStore tried to enter composition twice. Did you attempt to install the same store multiple times or into two compositions?");
                    }
                    aqaVar2.a();
                    aqaVar2.G = true;
                }
                za2VarS = null;
            }
            za2 za2Var = t4aVar.d;
            if (za2Var != null) {
                za2Var.cancel();
            }
            t4aVar.d = za2VarS;
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        if (this.G) {
            int[] iArr = ms7.a;
            fu9 fu9Var = fu9.E;
            fu9 fu9Var2 = i != 0 ? i != 1 ? null : fu9.F : fu9Var;
            if (fu9Var2 != null) {
                fu9Var = fu9Var2;
            }
            setLayoutDirection(fu9Var);
        }
    }

    @Override // android.view.View
    public final void onScrollCaptureSearch(Rect rect, Point point, Consumer consumer) {
        tk5 tk5Var;
        if (Build.VERSION.SDK_INT < 31 || (tk5Var = this.o1) == null) {
            return;
        }
        zjf semanticsOwner = getSemanticsOwner();
        c45 coroutineContext = getCoroutineContext();
        wwb wwbVar = new wwb(0, new w8f[16]);
        quk.j(semanticsOwner.a(), 0, new ks0(wwbVar));
        Arrays.sort(wwbVar.E, 0, wwbVar.G, nai.q(p9d.b0, p9d.c0));
        int i = wwbVar.G;
        w8f w8fVar = (w8f) (i == 0 ? null : wwbVar.E[i - 1]);
        if (w8fVar == null) {
            return;
        }
        yc4 yc4Var = new yc4(w8fVar.b(), w8fVar.c(), fd9.c(coroutineContext), tk5Var, this);
        cu9 cu9VarA = w8fVar.a();
        l9e l9eVarJ = nai.A(cu9VarA).J(cu9VarA, true);
        long jE = w8fVar.c().e();
        ScrollCaptureTarget scrollCaptureTargetN = n5d.n(this, mwa.Q(eve.R(l9eVarJ)), new Point((int) (jE >> 32), (int) (jE & 4294967295L)), yc4Var);
        scrollCaptureTargetN.setScrollBounds(mwa.Q(w8fVar.c()));
        consumer.accept(scrollCaptureTargetN);
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        L();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStop(m4a m4aVar) {
        t4a t4aVar = this.K;
        if (t4aVar != null) {
            aqa aqaVar = (aqa) t4aVar.a.F;
            if (aqaVar.E && !aqaVar.G) {
                za2 za2Var = t4aVar.d;
                if (za2Var != null) {
                    za2Var.cancel();
                }
                t4aVar.d = null;
                return;
            }
            if (aqaVar.F) {
                return;
            }
            if (!aqaVar.G) {
                abd.a("ManagedValuesStore tried to leave composition twice. Is the store installed in multiple places?");
            }
            if (!aqaVar.H.i()) {
                abd.a("Attempted to start retaining exited values with pending exited values");
            }
            aqaVar.G = false;
        }
    }

    @Override // android.view.ViewTreeObserver.OnTouchModeChangeListener
    public final void onTouchModeChanged(boolean z) {
        this.X0.a.setValue(new l49(z ? 1 : 2));
    }

    @Override // android.view.View
    public final void onVirtualViewTranslationResponses(LongSparseArray longSparseArray) {
        a10 a10Var = this.contentCaptureManager;
        a10Var.getClass();
        tpk.j(a10Var, longSparseArray);
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        boolean zA;
        this.m1 = true;
        super.onWindowFocusChanged(z);
        if (!z || Build.VERSION.SDK_INT >= 30 || getShowLayoutBounds() == (zA = oq5.A())) {
            return;
        }
        setShowLayoutBounds(zA);
        m(getRoot());
    }

    public final boolean q(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        return MTTypesetterKt.kLineSkipLimitMultiplier <= x && x <= ((float) getWidth()) && MTTypesetterKt.kLineSkipLimitMultiplier <= y && y <= ((float) getHeight());
    }

    public final boolean r(MotionEvent motionEvent) {
        MotionEvent motionEvent2;
        return (motionEvent.getPointerCount() == 1 && (motionEvent2 = this.a1) != null && motionEvent2.getPointerCount() == motionEvent.getPointerCount() && motionEvent.getRawX() == motionEvent2.getRawX() && motionEvent.getRawY() == motionEvent2.getRawY()) ? false : true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i, Rect rect) {
        int i2 = 1;
        if (!isFocused()) {
            wr7 wr7VarD = ms7.d(i);
            int i3 = wr7VarD != null ? wr7VarD.a : 7;
            Boolean boolG = ((ts7) getFocusOwner()).g(i3, rect != null ? mwa.S(rect) : null, new c00(i3, 0));
            Boolean bool = Boolean.TRUE;
            if (!x44.r(boolG, bool)) {
                if (!x44.r(((ts7) getFocusOwner()).g(i3, null, new c00(i3, i2)), bool)) {
                    if (hasFocus() && aok.f(i3)) {
                        return ((ts7) getFocusOwner()).j(i3);
                    }
                    return false;
                }
            }
        }
        return true;
    }

    public final void s(float[] fArr) {
        C();
        nwa.h(fArr, this.H0);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (this.L0 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (this.L0 & 4294967295L));
        float[] fArr2 = this.G0;
        nwa.d(fArr2);
        nwa.i(fArr2, fIntBitsToFloat, fIntBitsToFloat2);
        u00.H(fArr, fArr2);
    }

    public void setAccessibilityEventBatchIntervalMillis(long intervalMillis) {
        this.g0.L = intervalMillis;
    }

    public final void setComposeViewContext(hd4 hd4Var) {
        if (getCoroutineContext() != hd4Var.b.j() && !((vwb) getRoot().q()).isEmpty()) {
            b39.a("Changing ComposeViewContext cannot change the coroutine context without disposing of the composition first.");
        }
        rcg rcgVarZ = fd9.Z();
        bz7 bz7VarE = rcgVarZ != null ? rcgVarZ.e() : null;
        rcg rcgVarK0 = fd9.k0(rcgVarZ);
        try {
            hd4 hd4Var2 = get_composeViewContext();
            if (hd4Var != hd4Var2) {
                if (isAttachedToWindow()) {
                    hd4Var2.b();
                    hd4Var.c();
                }
                set_composeViewContext(hd4Var);
                setCoroutineContext(hd4Var.b.j());
            }
        } finally {
            fd9.s0(rcgVarZ, rcgVarK0, bz7VarE);
        }
    }

    public final void setComposeViewContextIncrementedDuringInit$ui(boolean z) {
        this.composeViewContextIncrementedDuringInit = z;
    }

    public final void setConfiguration(Configuration configuration) {
        this.r0.setValue(configuration);
    }

    public final void setContentCaptureManager$ui(a10 a10Var) {
        this.contentCaptureManager = a10Var;
    }

    public void setCoroutineContext(c45 c45Var) {
        this.coroutineContext = c45Var;
    }

    public final void setFrameEndScheduler$ui(s4a s4aVar) {
        this.frameEndScheduler = s4aVar;
    }

    public final void setLastMatrixRecalculationAnimationTime$ui(long j) {
        this.lastMatrixRecalculationAnimationTime = j;
    }

    public final void setOnReadyForComposition(bz7 callback) {
        getDerivedIsAttached();
        if (isAttachedToWindow() || this.composeViewContextIncrementedDuringInit) {
            callback.invoke(getComposeViewContext());
        } else {
            this.O0 = callback;
        }
    }

    /* JADX INFO: renamed from: setPrimaryDirectionalMotionAxisOverride-r2epLt8$ui, reason: not valid java name */
    public final void m4setPrimaryDirectionalMotionAxisOverrider2epLt8$ui(l19 l19Var) {
        this.primaryDirectionalMotionAxisOverride = l19Var;
    }

    @Override // androidx.compose.ui.node.Owner
    public void setShowLayoutBounds(boolean z) {
        this.showLayoutBounds = z;
    }

    public void setUncaughtExceptionHandler(fve handler) {
        this.D0.getClass();
    }

    public final void setUncaughtExceptionHandler$ui(fve fveVar) {
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public final long t(long j) {
        C();
        long jB = nwa.b(j, this.H0);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (this.L0 >> 32)) + Float.intBitsToFloat((int) (jB >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (this.L0 & 4294967295L)) + Float.intBitsToFloat((int) (jB & 4294967295L));
        return (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L);
    }

    public final void u(boolean z) {
        wz wzVar;
        j5b j5bVar = this.D0;
        if (j5bVar.b.z() || ((wwb) j5bVar.e.F).G != 0) {
            Trace.beginSection("AndroidOwner:measureAndLayout");
            if (z) {
                try {
                    wzVar = this.k1;
                } finally {
                    Trace.endSection();
                }
            } else {
                wzVar = null;
            }
            if (j5bVar.m(wzVar)) {
                requestLayout();
            }
            j5bVar.c(false);
            getRectManager().a();
            if (this.o0) {
                getViewTreeObserver().dispatchOnGlobalLayout();
                this.o0 = false;
            }
        }
    }

    public final void v(av9 av9Var, long j) {
        j5b j5bVar = this.D0;
        Trace.beginSection("AndroidOwner:measureAndLayout");
        try {
            j5bVar.n(av9Var, j);
            if (!j5bVar.b.z()) {
                j5bVar.c(false);
                getRectManager().a();
                if (this.o0) {
                    getViewTreeObserver().dispatchOnGlobalLayout();
                    this.o0 = false;
                }
            }
        } finally {
            Trace.endSection();
        }
    }

    public final boolean w(int i) {
        if (i != 7 && i != 8) {
            Integer numC = ms7.c(i);
            if (numC == null) {
                throw sq6.z("Invalid focus direction");
            }
            int iIntValue = numC.intValue();
            jt7 jt7VarH = ((ts7) getFocusOwner()).h();
            if (jt7VarH == null) {
                sz6.j("findNextViewInEmbeddedView called when owner does not have anything focused.");
                return false;
            }
            Integer numC2 = ms7.c(i);
            if (numC2 == null) {
                throw sq6.z("Invalid focus direction");
            }
            int iIntValue2 = numC2.intValue();
            nxi nxiVar = yfd.W(jt7VarH).T;
            View interopView = nxiVar != null ? nxiVar.getInteropView() : null;
            View viewFindFocus = findFocus();
            FocusFinder focusFinder = FocusFinder.getInstance();
            View rootView = getRootView();
            rootView.getClass();
            View viewFindNextFocus = focusFinder.findNextFocus((ViewGroup) rootView, viewFindFocus, iIntValue2);
            if (viewFindNextFocus == null || interopView == null || !u00.f(interopView, viewFindNextFocus)) {
                viewFindNextFocus = null;
            }
            if (viewFindNextFocus != null) {
                return ms7.b(viewFindNextFocus, Integer.valueOf(iIntValue), null);
            }
        }
        return false;
    }

    public final void x() {
        qvb qvbVar;
        Object[] objArr;
        if (this.v0) {
            odg odgVar = getSnapshotObserver().a;
            synchronized (odgVar.h) {
                try {
                    wwb wwbVar = (wwb) odgVar.g;
                    int i = wwbVar.G;
                    int i2 = 0;
                    int i3 = 0;
                    while (true) {
                        objArr = wwbVar.E;
                        if (i2 >= i) {
                            break;
                        }
                        ndg ndgVar = (ndg) objArr[i2];
                        ndgVar.d();
                        if (!ndgVar.f.j()) {
                            i3++;
                        } else if (i3 > 0) {
                            Object[] objArr2 = wwbVar.E;
                            objArr2[i2 - i3] = objArr2[i2];
                        }
                        i2++;
                    }
                    int i4 = i - i3;
                    Arrays.fill(objArr, i4, i, (Object) null);
                    wwbVar.G = i4;
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.v0 = false;
        }
        s70 s70Var = this.A0;
        if (s70Var != null) {
            g(s70Var);
        }
        gz gzVar = this._autofillManager;
        if (gzVar != null) {
            yub yubVar = gzVar.L;
            if (yubVar.d == 0 && gzVar.M) {
                ((AutofillManager) gzVar.E.F).commit();
                gzVar.M = false;
            }
            if (yubVar.d != 0) {
                gzVar.M = true;
            }
        }
        while (this.d1.i() && this.d1.f(0) != null) {
            int i5 = this.d1.b;
            int i6 = 0;
            while (true) {
                qvbVar = this.d1;
                if (i6 < i5) {
                    zy7 zy7Var = (zy7) qvbVar.f(i6);
                    this.d1.n(i6, null);
                    if (zy7Var != null) {
                        zy7Var.a();
                    }
                    i6++;
                }
            }
            qvbVar.l(0, i5);
        }
    }

    public final void y(av9 av9Var) {
        k00 k00Var = this.g0;
        k00Var.b0 = true;
        if (k00Var.q()) {
            k00Var.r(av9Var);
        }
        a10 a10Var = this.contentCaptureManager;
        a10Var.K = true;
        if (a10Var.e()) {
            a10Var.L.r(iei.a);
        }
    }

    public final void z(av9 av9Var, boolean z, boolean z2, boolean z3) {
        av9 av9VarG;
        av9 av9VarG2;
        j5b j5bVar = this.D0;
        if (!z) {
            if (j5bVar.s(av9Var, z2) && z3) {
                F(av9Var);
                return;
            }
            return;
        }
        fj0 fj0Var = j5bVar.b;
        if (av9Var.M == null) {
            b39.c("Error: requestLookaheadRemeasure cannot be called on a node outside LookaheadScope");
        }
        int iOrdinal = av9Var.w().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return;
            }
            if (iOrdinal != 2 && iOrdinal != 3) {
                if (iOrdinal != 4) {
                    mr9.b();
                    return;
                }
                if (!av9Var.y() || z2) {
                    av9Var.g0();
                    av9Var.h0();
                    if (av9Var.u0) {
                        return;
                    }
                    if ((x44.r(av9Var.a0(), Boolean.TRUE) || j5b.j(av9Var)) && ((av9VarG = av9Var.G()) == null || !av9VarG.y())) {
                        fj0Var.b(av9Var, sb9.E);
                    } else if ((av9Var.Y() || j5b.k(av9Var)) && ((av9VarG2 = av9Var.G()) == null || !av9VarG2.B())) {
                        fj0Var.b(av9Var, sb9.G);
                    }
                    if (j5bVar.d || !z3) {
                        return;
                    }
                    F(av9Var);
                    return;
                }
                return;
            }
        }
        j5bVar.h.b(new i5b(av9Var, true, z2));
    }

    @Override // androidx.compose.ui.node.Owner
    public bz getAccessibilityManager() {
        return this.accessibilityManager;
    }

    @Override // androidx.compose.ui.node.Owner
    public mz getClipboard() {
        return this.clipboard;
    }

    @Override // androidx.compose.ui.node.Owner
    public nz getClipboardManager() {
        return this.clipboardManager;
    }

    @Override // androidx.compose.ui.node.Owner
    public x10 getDragAndDropManager() {
        return this.dragAndDropManager;
    }

    public xub getLayoutNodes() {
        return this.layoutNodes;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        addView(view, -1);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, int i2) {
        ViewGroup.LayoutParams layoutParamsGenerateDefaultLayoutParams = generateDefaultLayoutParams();
        layoutParamsGenerateDefaultLayoutParams.width = i;
        layoutParamsGenerateDefaultLayoutParams.height = i2;
        addViewInLayout(view, -1, layoutParamsGenerateDefaultLayoutParams, true);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        addViewInLayout(view, i, layoutParams, true);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        addViewInLayout(view, -1, layoutParams, true);
    }
}
