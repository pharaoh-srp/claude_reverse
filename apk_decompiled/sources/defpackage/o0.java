package defpackage;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.view.View;
import androidx.health.platform.client.proto.g;
import coil3.compose.AsyncImagePainter;
import com.anthropic.claude.analytics.events.VoiceEvents$VoiceErrorKind;
import com.anthropic.claude.api.chat.ChatFeedbackType;
import com.anthropic.claude.audio.input.MicrophoneAudioException;
import com.anthropic.claude.bell.BellModeService;
import com.anthropic.claude.bell.api.VoiceSelection;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public final class o0 extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public int F;
    public Object G;
    public Object H;
    public final /* synthetic */ Object I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o0(Object obj, Object obj2, Object obj3, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.G = obj;
        this.H = obj2;
        this.I = obj3;
    }

    private final Object d(Object obj) throws Throwable {
        boolean zIsTerminated;
        boolean zIsTerminated2;
        boolean zIsTerminated3;
        boolean zIsTerminated4;
        AutoCloseable autoCloseable = (m6b) this.I;
        AutoCloseable autoCloseable2 = (m6b) this.H;
        ki1 ki1Var = (ki1) this.G;
        zy1 zy1Var = ki1Var.r;
        zy1 zy1Var2 = ki1Var.p;
        zy1 zy1Var3 = ki1Var.n;
        int i = this.F;
        TimeUnit timeUnit = TimeUnit.DAYS;
        boolean z = false;
        try {
            if (i == 0) {
                sf5.h0(obj);
                pi1 pi1Var = ki1Var.a;
                this.F = 1;
                Object objE = pi1Var.e(this);
                m45 m45Var = m45.E;
                if (objE == m45Var) {
                    return m45Var;
                }
            } else {
                if (i != 1) {
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                sf5.h0(obj);
            }
            if (autoCloseable2 != null) {
                if (autoCloseable2 instanceof AutoCloseable) {
                    autoCloseable2.close();
                } else {
                    if (!(autoCloseable2 instanceof ExecutorService)) {
                        mr9.y();
                        return null;
                    }
                    ExecutorService executorService = (ExecutorService) autoCloseable2;
                    if (executorService != ForkJoinPool.commonPool() && !(zIsTerminated4 = executorService.isTerminated())) {
                        executorService.shutdown();
                        boolean z2 = false;
                        while (!zIsTerminated4) {
                            try {
                                zIsTerminated4 = executorService.awaitTermination(1L, timeUnit);
                            } catch (InterruptedException unused) {
                                if (!z2) {
                                    executorService.shutdownNow();
                                    z2 = true;
                                }
                            }
                        }
                        if (z2) {
                            Thread.currentThread().interrupt();
                        }
                    }
                }
            }
            if (autoCloseable != null) {
                if (autoCloseable instanceof AutoCloseable) {
                    autoCloseable.close();
                } else {
                    if (!(autoCloseable instanceof ExecutorService)) {
                        mr9.y();
                        return null;
                    }
                    ExecutorService executorService2 = (ExecutorService) autoCloseable;
                    if (executorService2 != ForkJoinPool.commonPool() && !(zIsTerminated3 = executorService2.isTerminated())) {
                        executorService2.shutdown();
                        while (!zIsTerminated3) {
                            try {
                                zIsTerminated3 = executorService2.awaitTermination(1L, timeUnit);
                            } catch (InterruptedException unused2) {
                                if (!z) {
                                    executorService2.shutdownNow();
                                    z = true;
                                }
                            }
                        }
                        if (z) {
                            Thread.currentThread().interrupt();
                        }
                    }
                }
            }
            zy1Var3.m(null);
            zy1Var2.m(null);
            zy1Var.m(null);
            return iei.a;
        } catch (Throwable th) {
            if (autoCloseable2 != null) {
                if (autoCloseable2 instanceof AutoCloseable) {
                    autoCloseable2.close();
                } else {
                    if (!(autoCloseable2 instanceof ExecutorService)) {
                        mr9.y();
                        return null;
                    }
                    ExecutorService executorService3 = (ExecutorService) autoCloseable2;
                    if (executorService3 != ForkJoinPool.commonPool() && !(zIsTerminated2 = executorService3.isTerminated())) {
                        executorService3.shutdown();
                        boolean z3 = false;
                        while (!zIsTerminated2) {
                            try {
                                zIsTerminated2 = executorService3.awaitTermination(1L, timeUnit);
                            } catch (InterruptedException unused3) {
                                if (!z3) {
                                    executorService3.shutdownNow();
                                    z3 = true;
                                }
                            }
                        }
                        if (z3) {
                            Thread.currentThread().interrupt();
                        }
                    }
                }
            }
            if (autoCloseable != null) {
                if (autoCloseable instanceof AutoCloseable) {
                    autoCloseable.close();
                } else {
                    if (!(autoCloseable instanceof ExecutorService)) {
                        mr9.y();
                        return null;
                    }
                    ExecutorService executorService4 = (ExecutorService) autoCloseable;
                    if (executorService4 != ForkJoinPool.commonPool() && !(zIsTerminated = executorService4.isTerminated())) {
                        executorService4.shutdown();
                        while (!zIsTerminated) {
                            try {
                                zIsTerminated = executorService4.awaitTermination(1L, timeUnit);
                            } catch (InterruptedException unused4) {
                                if (!z) {
                                    executorService4.shutdownNow();
                                    z = true;
                                }
                            }
                        }
                        if (z) {
                            Thread.currentThread().interrupt();
                        }
                    }
                }
            }
            zy1Var3.m(null);
            zy1Var2.m(null);
            zy1Var.m(null);
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0033 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0049  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0031 -> B:12:0x0034). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object n(java.lang.Object r5) {
        /*
            r4 = this;
            m45 r0 = defpackage.m45.E
            int r1 = r4.F
            r2 = 1
            if (r1 == 0) goto L18
            if (r1 != r2) goto L11
            java.lang.Object r1 = r4.G
            sy1 r1 = (defpackage.sy1) r1
            defpackage.sf5.h0(r5)
            goto L34
        L11:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r4)
            r4 = 0
            return r4
        L18:
            defpackage.sf5.h0(r5)
            java.lang.Object r5 = r4.H
            tn1 r5 = (defpackage.tn1) r5
            zy1 r5 = r5.K
            r5.getClass()
            sy1 r1 = new sy1
            r1.<init>(r5)
        L29:
            r4.G = r1
            r4.F = r2
            java.lang.Object r5 = r1.b(r4)
            if (r5 != r0) goto L34
            return r0
        L34:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L49
            r1.c()
            java.lang.Object r5 = r4.I
            com.anthropic.claude.bell.BellModeService r5 = (com.anthropic.claude.bell.BellModeService) r5
            bz7 r3 = com.anthropic.claude.bell.BellModeService.T
            r5.f()
            goto L29
        L49:
            iei r4 = defpackage.iei.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o0.n(java.lang.Object):java.lang.Object");
    }

    private final Object p(Object obj) throws IOException {
        xm1 xm1Var = (xm1) this.I;
        AudioAttributes audioAttributes = xm1Var.g;
        int i = this.F;
        if (i == 0) {
            sf5.h0(obj);
            dhg dhgVar = (dhg) this.H;
            String str = dhgVar.c;
            if (str == null) {
                Integer num = (Integer) xm1Var.h.get(VoiceSelection.m573boximpl(dhgVar.a));
                if (num != null) {
                    return MediaPlayer.create(xm1Var.a, num.intValue(), audioAttributes, 0);
                }
                List list = xah.a;
                xah.f(new IllegalStateException("No preview source for voice"), null, null, null, 30);
                return null;
            }
            x4j x4jVar = xm1Var.b;
            this.G = null;
            this.F = 1;
            obj = fd9.N(new w22(x4jVar, str, (tp4) null), this);
            m45 m45Var = m45.E;
            if (obj == m45Var) {
                return m45Var;
            }
        } else {
            if (i != 1) {
                sz6.j("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            sf5.h0(obj);
        }
        MediaPlayer mediaPlayer = new MediaPlayer();
        mediaPlayer.setAudioAttributes(audioAttributes);
        mediaPlayer.setDataSource(((File) obj).getPath());
        mediaPlayer.prepare();
        return mediaPlayer;
    }

    private final Object r(Object obj) throws Throwable {
        tn1 tn1Var = (tn1) this.H;
        int i = this.F;
        iei ieiVar = iei.a;
        int i2 = 1;
        m45 m45Var = m45.E;
        try {
            if (i == 0) {
                sf5.h0(obj);
                zv5 zv5Var = (zv5) this.G;
                this.F = 1;
                obj = zv5Var.w(this);
                if (obj != m45Var) {
                }
                return m45Var;
            }
            if (i != 1) {
                if (i == 2) {
                    sf5.h0(obj);
                    return ieiVar;
                }
                sz6.j("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            sf5.h0(obj);
            if (((Boolean) obj).booleanValue()) {
                mh2 mh2Var = tn1Var.r.z;
                pn1 pn1Var = new pn1(tn1Var, i2);
                this.F = 2;
                if (mh2Var.a(pn1Var, this) == m45Var) {
                    return m45Var;
                }
            }
            return ieiVar;
        } catch (MicrophoneAudioException e) {
            boolean z = e.E;
            String str = z ? "mic_dead_object" : "mic_init_failed";
            List list = xah.a;
            xah.f(e, "Bell mic stream failed", z ? ozf.F : ozf.G, null, 24);
            tn1Var.B(str.equals("prompt_too_long_error") ? new qj1(null) : new pj1(null), str, VoiceEvents$VoiceErrorKind.AUDIO);
            fd9.z((l45) this.I, null);
            return ieiVar;
        }
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        int i = this.E;
        Object obj2 = this.I;
        switch (i) {
            case 0:
                return new o0((zub) this.G, (ndd) this.H, (y86) obj2, tp4Var, 0);
            case 1:
                return new o0((w3c) this.G, (String) this.H, this.I, tp4Var, 1);
            case 2:
                return new o0((kk) this.G, (fk) this.H, (String) obj2, tp4Var, 2);
            case 3:
                return new o0((sl) this.G, (qi3) this.H, (nwb) obj2, tp4Var, 3);
            case 4:
                return new o0((vm) this.G, (String) this.H, (wm) obj2, tp4Var, 4);
            case 5:
                return new o0((lu) this.H, (Set) obj2, tp4Var, 5);
            case 6:
                return new o0((jw) this.G, (List) this.H, (ybg) obj2, tp4Var, 6);
            case 7:
                return new o0((jw) this.G, (iaj) this.H, (ybg) obj2, tp4Var, 7);
            case 8:
                return new o0((pz7) this.G, this.H, (l45) obj2, tp4Var, 8);
            case 9:
                o0 o0Var = new o0((zy7) this.H, (pz7) obj2, tp4Var, 9);
                o0Var.G = obj;
                return o0Var;
            case 10:
                o0 o0Var2 = new o0((rz7) this.H, (ry) obj2, tp4Var, 10);
                o0Var2.G = obj;
                return o0Var2;
            case 11:
                o0 o0Var3 = new o0((sz7) this.H, (ry) obj2, tp4Var, 11);
                o0Var3.G = obj;
                return o0Var3;
            case 12:
                return new o0((dae) this.H, (zv5) obj2, tp4Var, 12);
            case 13:
                return new o0((ive) this.G, (Context) this.H, (nm0) obj2, tp4Var, 13);
            case 14:
                return new o0((AsyncImagePainter) this.H, (q01) obj2, tp4Var, 14);
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                o0 o0Var4 = new o0((AudioManager) this.H, (List) obj2, tp4Var, 15);
                o0Var4.G = obj;
                return o0Var4;
            case 16:
                return new o0((AudioManager) this.G, (AudioDeviceInfo) this.H, (p41) obj2, tp4Var, 16);
            case g.MAX_FIELD_NUMBER /* 17 */:
                return new o0((amg) this.H, (l2i) obj2, tp4Var, 17);
            case g.AVG_FIELD_NUMBER /* 18 */:
                return new o0((ft7) this.G, (nwb) this.H, (l2i) obj2, tp4Var, 18);
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return new o0((ki1) obj2, tp4Var);
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                o0 o0Var5 = new o0((l45) this.H, (ki1) obj2, tp4Var, 20);
                o0Var5.G = obj;
                return o0Var5;
            case 21:
                return new o0((ki1) this.G, (m6b) this.H, (qd) obj2, tp4Var, 21);
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return new o0((ki1) this.G, (m6b) this.H, (m6b) obj2, tp4Var, 22);
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return new o0((jud) this.G, (String) this.H, (ChatFeedbackType) obj2, tp4Var, 23);
            case 24:
                return new o0((fn1) this.G, (rwe) this.H, (View) obj2, tp4Var, 24);
            case BuildConfig.VERSION_CODE /* 25 */:
                return new o0((fn1) this.G, (pl3) this.H, (View) obj2, tp4Var, 25);
            case 26:
                return new o0((tn1) this.H, (BellModeService) obj2, tp4Var, 26);
            case 27:
                o0 o0Var6 = new o0((dhg) this.H, (xm1) obj2, tp4Var, 27);
                o0Var6.G = obj;
                return o0Var6;
            case 28:
                return new o0((zv5) this.G, (tn1) this.H, (l45) obj2, tp4Var, 28);
            default:
                o0 o0Var7 = new o0((zy7) this.H, (a80) obj2, tp4Var, 29);
                o0Var7.G = obj;
                return o0Var7;
        }
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        int i = this.E;
        iei ieiVar = iei.a;
        switch (i) {
            case 0:
                return ((o0) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case 1:
                return ((o0) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case 2:
                return ((o0) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case 3:
                return ((o0) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case 4:
                return ((o0) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case 5:
                return ((o0) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case 6:
                return ((o0) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case 7:
                return ((o0) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case 8:
                return ((o0) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case 9:
                return ((o0) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case 10:
                return ((o0) create((vq5) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case 11:
                return ((o0) create((cpc) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case 12:
                return ((o0) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case 13:
                return ((o0) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case 14:
                return ((o0) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                return ((o0) create((aid) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case 16:
                return ((o0) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case g.MAX_FIELD_NUMBER /* 17 */:
                return ((o0) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case g.AVG_FIELD_NUMBER /* 18 */:
                return ((o0) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return ((o0) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                return ((o0) create((AudioDeviceInfo) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case 21:
                return ((o0) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return ((o0) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return ((o0) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case 24:
                ((o0) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
                return m45.E;
            case BuildConfig.VERSION_CODE /* 25 */:
                return ((o0) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case 26:
                return ((o0) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case 27:
                return ((o0) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case 28:
                return ((o0) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            default:
                return ((o0) create((kp7) obj, (tp4) obj2)).invokeSuspend(ieiVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x005b, code lost:
    
        if (defpackage.a80.c(r0, r1, null, null, r4, 14) != r6) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x0415, code lost:
    
        if (defpackage.j8.u(r1, r0, r4) == r5) goto L218;
     */
    /* JADX WARN: Code restructure failed: missing block: B:267:0x0521, code lost:
    
        if (r0 == r5) goto L272;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0547  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x055c  */
    /* JADX WARN: Removed duplicated region for block: B:392:0x078a  */
    /* JADX WARN: Type inference failed for: r2v94, types: [gi1] */
    /* JADX WARN: Type inference failed for: r6v30, types: [gi1] */
    @Override // defpackage.vd1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2602
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o0(Object obj, Object obj2, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.H = obj;
        this.I = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(ki1 ki1Var, tp4 tp4Var) {
        super(2, tp4Var);
        this.E = 19;
        this.I = ki1Var;
    }
}
