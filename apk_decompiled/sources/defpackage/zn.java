package defpackage;

import android.app.DownloadManager;
import android.content.ContentResolver;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.util.Base64;
import androidx.health.platform.client.proto.g;
import com.anthropic.claude.code.remote.c;
import com.anthropic.claude.code.remote.stores.a;
import com.anthropic.claude.conway.f;
import com.anthropic.claude.conway.protocol.UploadRequest;
import com.anthropic.claude.conway.protocol.UploadResult;
import com.anthropic.claude.conway.protocol.b0;
import com.anthropic.claude.mcpapps.transport.SandboxResourceReadyParams;
import com.anthropic.claude.tool.model.PhoneCallCompletedOutput;
import com.anthropic.claude.types.strings.TaskId;
import com.anthropic.claude.types.strings.ToolUseId;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.regex.Pattern;
import okio.Okio;
import okio.RealBufferedSink;
import okio.RealBufferedSource;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public final class zn extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public /* synthetic */ Object F;
    public final /* synthetic */ Object G;
    public final /* synthetic */ Object H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zn(wxc wxcVar, nwb nwbVar, nwb nwbVar2, tp4 tp4Var) {
        super(2, tp4Var);
        this.E = 11;
        this.F = wxcVar;
        this.H = nwbVar;
        this.G = nwbVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object d(java.lang.Object r9) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zn.d(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object n(java.lang.Object r23) {
        /*
            Method dump skipped, instruction units count: 296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zn.n(java.lang.Object):java.lang.Object");
    }

    private final Object p(Object obj) {
        sf5.h0(obj);
        vza vzaVar = (vza) this.F;
        if (((Boolean) vzaVar.d.getValue()).booleanValue() && !vzaVar.b()) {
            String str = ((vya) this.G).j;
            if (str != null) {
                zfa.a.getClass();
                if (yfa.b()) {
                    CopyOnWriteArrayList copyOnWriteArrayList = yfa.b;
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : copyOnWriteArrayList) {
                        ((n30) ((zfa) obj2)).getClass();
                        arrayList.add(obj2);
                    }
                    if (!arrayList.isEmpty()) {
                        zfa.a.getClass();
                        String strU = grc.u("Sending sandbox-resource-ready with HTML (", str.length(), " chars)");
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            ((n30) ((zfa) it.next())).b(sfa.INFO, "McpAppViewHost", strU);
                        }
                    }
                }
                aya ayaVar = vzaVar.a;
                bg9 bg9Var = (bg9) this.H;
                SandboxResourceReadyParams sandboxResourceReadyParams = new SandboxResourceReadyParams(str);
                bg9Var.getClass();
                ayaVar.d("ui/notifications/sandbox-resource-ready", ch9.i(bg9Var.c(sandboxResourceReadyParams, SandboxResourceReadyParams.Companion.serializer())));
            } else {
                zfa.a.getClass();
                if (yfa.b()) {
                    CopyOnWriteArrayList copyOnWriteArrayList2 = yfa.b;
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj3 : copyOnWriteArrayList2) {
                        ((n30) ((zfa) obj3)).getClass();
                        arrayList2.add(obj3);
                    }
                    if (!arrayList2.isEmpty()) {
                        zfa.a.getClass();
                        Iterator it2 = arrayList2.iterator();
                        while (it2.hasNext()) {
                            ((n30) ((zfa) it2.next())).b(sfa.WARN, "McpAppViewHost", "Sandbox proxy ready but no HTML content available");
                        }
                    }
                }
            }
        }
        return iei.a;
    }

    private final Object r(Object obj) {
        sf5.h0(obj);
        k1d k1dVar = ((p0d) this.F).g;
        String strM1158constructorimpl = ToolUseId.m1158constructorimpl((String) this.G);
        PhoneCallCompletedOutput phoneCallCompletedOutput = (PhoneCallCompletedOutput) this.H;
        k1dVar.getClass();
        strM1158constructorimpl.getClass();
        k1dVar.b.put(ToolUseId.m1157boximpl(strM1158constructorimpl), phoneCallCompletedOutput != null ? new h1d(phoneCallCompletedOutput) : i1d.a);
        return iei.a;
    }

    private final Object s(Object obj) {
        sf5.h0(obj);
        t0d t0dVar = (t0d) this.F;
        s0d s0dVar = t0dVar instanceof s0d ? (s0d) t0dVar : null;
        iei ieiVar = iei.a;
        if (s0dVar != null) {
            c1d c1dVar = s0dVar.a;
            if (c1dVar.equals(w0d.a) || c1dVar.equals(y0d.a)) {
                i2d i2dVar = (i2d) this.G;
                if (!i2dVar.e) {
                    i2dVar.e = true;
                    ((zy7) this.H).a();
                    return ieiVar;
                }
            } else if (!c1dVar.equals(z0d.a) && !c1dVar.equals(b1d.a) && !c1dVar.equals(x0d.a) && !(c1dVar instanceof a1d)) {
                wg6.i();
                return null;
            }
        }
        return ieiVar;
    }

    private final Object t(Object obj) {
        sf5.h0(obj);
        for (rna rnaVar : ((HashMap) ((bna) this.F).c()).values()) {
            rnaVar.getClass();
            String str = rnaVar.d;
            if (rnaVar.f == null && isg.q0(str, "data:", false) && bsg.G0(str, "base64,", 0, false, 6) > 0) {
                try {
                    byte[] bArrDecode = Base64.decode(str.substring(bsg.F0(str, ',', 0, 6) + 1), 0);
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inScaled = true;
                    options.inDensity = 160;
                    rnaVar.f = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length, options);
                } catch (IllegalArgumentException e) {
                    oga.b("data URL did not have correct base64 format.", e);
                }
            }
            Context context = (Context) this.G;
            String str2 = (String) this.H;
            if (rnaVar.f == null && str2 != null) {
                try {
                    InputStream inputStreamOpen = context.getAssets().open(str2 + str);
                    inputStreamOpen.getClass();
                    Bitmap bitmapDecodeStream = null;
                    try {
                        BitmapFactory.Options options2 = new BitmapFactory.Options();
                        options2.inScaled = true;
                        options2.inDensity = 160;
                        bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamOpen, null, options2);
                    } catch (IllegalArgumentException e2) {
                        oga.b("Unable to decode image.", e2);
                    }
                    if (bitmapDecodeStream != null) {
                        rnaVar.f = zpi.d(bitmapDecodeStream, rnaVar.a, rnaVar.b);
                    }
                } catch (IOException e3) {
                    oga.b("Unable to open asset.", e3);
                }
            }
        }
        return iei.a;
    }

    private final Object v(Object obj) {
        String str = (String) this.F;
        sf5.h0(obj);
        ((bz7) this.G).invoke(str);
        ((t4g) this.H).a();
        return Boolean.TRUE;
    }

    private final Object w(Object obj) {
        sf5.h0(obj);
        t5l t5lVarA = t5l.a(1).a();
        dfk dfkVarT = gb9.t((Context) this.F);
        lm0 lm0Var = ((g6d) this.G).a;
        xpa xpaVar = (xpa) this.H;
        dfkVarT.getClass();
        dfk.b(lm0Var, xpaVar, t5lVarA);
        return iei.a;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        int i = this.E;
        Object obj2 = this.H;
        Object obj3 = this.G;
        switch (i) {
            case 0:
                return new zn((wxc) this.F, (an) obj3, (nwb) obj2, tp4Var, 0);
            case 1:
                zn znVar = new zn((k90) obj3, (vve) obj2, tp4Var, 1);
                znVar.F = obj;
                return znVar;
            case 2:
                zn znVar2 = new zn((v90) obj3, (vve) obj2, tp4Var, 2);
                znVar2.F = obj;
                return znVar2;
            case 3:
                zn znVar3 = new zn((pz7) obj3, (mj1) obj2, tp4Var, 3);
                znVar3.F = obj;
                return znVar3;
            case 4:
                zn znVar4 = new zn((List) obj3, (zy7) obj2, tp4Var, 4);
                znVar4.F = obj;
                return znVar4;
            case 5:
                zn znVar5 = new zn((Set) obj3, (t53) obj2, tp4Var, 5);
                znVar5.F = obj;
                return znVar5;
            case 6:
                zn znVar6 = new zn((fn1) obj3, (xc3) obj2, tp4Var, 6);
                znVar6.F = obj;
                return znVar6;
            case 7:
                return new zn((wxc) this.F, (c) obj3, (nwb) obj2, tp4Var, 7);
            case 8:
                return new zn((dk4) this.F, (zy7) obj3, (nwb) obj2, tp4Var, 8);
            case 9:
                zn znVar7 = new zn((rs4) obj3, (String) obj2, tp4Var, 9);
                znVar7.F = obj;
                return znVar7;
            case 10:
                return new zn((c61) this.F, (String) obj3, (File) obj2, tp4Var, 10);
            case 11:
                return new zn((wxc) this.F, (nwb) obj2, (nwb) obj3, tp4Var);
            case 12:
                return new zn((byte[]) this.F, (b0) obj3, (String) obj2, tp4Var, 12);
            case 13:
                return new zn((p05) this.F, (f) obj3, (nwb) obj2, tp4Var, 13);
            case 14:
                zn znVar8 = new zn((zy7) obj3, (bz7) obj2, tp4Var, 14);
                znVar8.F = obj;
                return znVar8;
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                zn znVar9 = new zn((String) obj3, (String) obj2, tp4Var, 15);
                znVar9.F = obj;
                return znVar9;
            case 16:
                return new zn((String) this.F, (kl8) obj3, (zy7) obj2, tp4Var, 16);
            case g.MAX_FIELD_NUMBER /* 17 */:
                zn znVar10 = new zn((si7) obj3, (oda) obj2, tp4Var, 17);
                znVar10.F = obj;
                return znVar10;
            case g.AVG_FIELD_NUMBER /* 18 */:
                zn znVar11 = new zn((oda) obj3, (Uri) obj2, tp4Var, 18);
                znVar11.F = obj;
                return znVar11;
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                zn znVar12 = new zn((e8d) obj3, (zeh) obj2, tp4Var, 19);
                znVar12.F = obj;
                return znVar12;
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                return new zn((mra) this.F, (ka2) obj3, (nwb) obj2, tp4Var, 20);
            case 21:
                return new zn((vza) this.F, (vya) obj3, (bg9) obj2, tp4Var, 21);
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                zn znVar13 = new zn((lbb) obj3, (String) obj2, tp4Var, 22);
                znVar13.F = obj;
                return znVar13;
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return new zn((String) this.F, (lgb) obj3, (String) obj2, tp4Var, 23);
            case 24:
                return new zn((p0d) this.F, (String) obj3, (PhoneCallCompletedOutput) obj2, tp4Var, 24);
            case BuildConfig.VERSION_CODE /* 25 */:
                return new zn((t0d) this.F, (i2d) obj3, (zy7) obj2, tp4Var, 25);
            case 26:
                return new zn((bna) this.F, (Context) obj3, (String) obj2, tp4Var, 26);
            case 27:
                zn znVar14 = new zn((bz7) obj3, (t4g) obj2, tp4Var, 27);
                znVar14.F = obj;
                return znVar14;
            case 28:
                return new zn((Context) this.F, (g6d) obj3, (xpa) obj2, tp4Var, 28);
            default:
                zn znVar15 = new zn((vfh) obj3, (e8d) obj2, tp4Var, 29);
                znVar15.F = obj;
                return znVar15;
        }
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        switch (i) {
            case 0:
                ((zn) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                ((zn) create((nk1) obj, (tp4) obj2)).invokeSuspend(ieiVar);
                break;
            case 4:
                ((zn) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
                break;
            case 5:
                ((zn) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
                break;
            case 6:
                ((zn) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
                break;
            case 7:
                ((zn) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
                break;
            case 8:
                ((zn) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                ((zn) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
                break;
            case 12:
                break;
            case 13:
                ((zn) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
                break;
            case 14:
                ((zn) create((kj6) obj, (tp4) obj2)).invokeSuspend(ieiVar);
                break;
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                break;
            case 16:
                ((zn) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
                break;
            case g.MAX_FIELD_NUMBER /* 17 */:
                break;
            case g.AVG_FIELD_NUMBER /* 18 */:
                break;
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                break;
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                ((zn) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
                break;
            case 21:
                ((zn) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
                break;
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                break;
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                break;
            case 24:
                ((zn) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
                break;
            case BuildConfig.VERSION_CODE /* 25 */:
                ((zn) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
                break;
            case 26:
                ((zn) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
                break;
            case 27:
                ((zn) create((String) obj, (tp4) obj2)).invokeSuspend(ieiVar);
                break;
            case 28:
                ((zn) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
                break;
            default:
                ((zn) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
                break;
        }
        return ieiVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        Object hreVar;
        Object hreVar2;
        Object hreVar3;
        pqe pqeVarF;
        RealBufferedSink realBufferedSink;
        long j;
        Object hreVar4;
        int i = this.E;
        int i2 = 4;
        yxc yxcVar = yxc.a;
        sfa sfaVar = sfa.WARN;
        int i3 = 20;
        o45 o45Var = o45.H;
        int i4 = 2;
        int i5 = 3;
        int i6 = 1;
        boolean z = false;
        z = false;
        z = false;
        iei ieiVar = iei.a;
        tp4 tp4Var = null;
        Object obj2 = this.H;
        Object obj3 = this.G;
        switch (i) {
            case 0:
                sf5.h0(obj);
                nwb nwbVar = (nwb) obj2;
                if (((Boolean) nwbVar.getValue()).booleanValue() && x44.r(((wxc) this.F).e(), yxcVar)) {
                    wk wkVar = ((vm) ((an) obj3).b).t;
                    gb9.D((mp4) wkVar.d, null, null, new cj(wkVar, tp4Var, i4), 3);
                    nwbVar.setValue(Boolean.FALSE);
                }
                return ieiVar;
            case 1:
                sf5.h0(obj);
                l45 l45Var = (l45) this.F;
                k90 k90Var = (k90) obj3;
                vve vveVar = (vve) obj2;
                gb9.D(l45Var, null, null, new j90(k90Var, vveVar, tp4Var, z ? 1 : 0), 3);
                gb9.D(l45Var, null, null, new j90(k90Var, vveVar, tp4Var, i6), 3);
                gb9.D(l45Var, null, null, new j90(k90Var, vveVar, tp4Var, i4), 3);
                return gb9.D(l45Var, null, null, new j90(k90Var, vveVar, tp4Var, i5), 3);
            case 2:
                sf5.h0(obj);
                l45 l45Var2 = (l45) this.F;
                v90 v90Var = (v90) obj3;
                vve vveVar2 = (vve) obj2;
                gb9.D(l45Var2, null, null, new t90(v90Var, vveVar2, tp4Var, i6), 3);
                gb9.D(l45Var2, null, null, new t90(v90Var, vveVar2, tp4Var, i4), 3);
                gb9.D(l45Var2, null, null, new t90(v90Var, vveVar2, tp4Var, i5), 3);
                return gb9.D(l45Var2, null, null, new t90(v90Var, vveVar2, tp4Var, i2), 3);
            case 3:
                nk1 nk1Var = (nk1) this.F;
                sf5.h0(obj);
                if (x44.r(nk1Var, nk1.a)) {
                    ((pz7) obj3).invoke(Boolean.valueOf(((mj1) obj2).L), null);
                    return ieiVar;
                }
                wg6.i();
                return null;
            case 4:
                l45 l45Var3 = (l45) this.F;
                sf5.h0(obj);
                for (MediaPlayer mediaPlayer : (List) obj3) {
                    try {
                        mediaPlayer.stop();
                        hreVar2 = ieiVar;
                    } catch (Throwable th) {
                        hreVar2 = new hre(th);
                    }
                    Throwable thA = jre.a(hreVar2);
                    if (thA != null) {
                        zfa.a.getClass();
                        if (yfa.b()) {
                            String strE = iuj.E(l45Var3);
                            CopyOnWriteArrayList copyOnWriteArrayList = yfa.b;
                            ArrayList arrayList = new ArrayList();
                            for (Object obj4 : copyOnWriteArrayList) {
                                ((n30) ((zfa) obj4)).getClass();
                                arrayList.add(obj4);
                            }
                            if (!arrayList.isEmpty()) {
                                String strS = sq6.s(zfa.a, thA, "preview stop: ");
                                Iterator it = arrayList.iterator();
                                while (it.hasNext()) {
                                    ((n30) ((zfa) it.next())).b(sfaVar, strE, strS);
                                }
                            }
                        }
                    }
                    try {
                        mediaPlayer.release();
                        hreVar3 = ieiVar;
                    } catch (Throwable th2) {
                        hreVar3 = new hre(th2);
                    }
                    Throwable thA2 = jre.a(hreVar3);
                    if (thA2 != null) {
                        zfa.a.getClass();
                        if (yfa.b()) {
                            String strE2 = iuj.E(l45Var3);
                            CopyOnWriteArrayList copyOnWriteArrayList2 = yfa.b;
                            ArrayList arrayList2 = new ArrayList();
                            for (Object obj5 : copyOnWriteArrayList2) {
                                ((n30) ((zfa) obj5)).getClass();
                                arrayList2.add(obj5);
                            }
                            if (!arrayList2.isEmpty()) {
                                String strS2 = sq6.s(zfa.a, thA2, "preview release: ");
                                Iterator it2 = arrayList2.iterator();
                                while (it2.hasNext()) {
                                    ((n30) ((zfa) it2.next())).b(sfaVar, strE2, strS2);
                                }
                            }
                        }
                    }
                }
                try {
                    hreVar = ((zy7) obj2).a();
                    break;
                } catch (Throwable th3) {
                    hreVar = new hre(th3);
                }
                Throwable thA3 = jre.a(hreVar);
                if (thA3 != null) {
                    zfa.a.getClass();
                    if (yfa.b()) {
                        String strE3 = iuj.E(l45Var3);
                        CopyOnWriteArrayList copyOnWriteArrayList3 = yfa.b;
                        ArrayList arrayList3 = new ArrayList();
                        for (Object obj6 : copyOnWriteArrayList3) {
                            ((n30) ((zfa) obj6)).getClass();
                            arrayList3.add(obj6);
                        }
                        if (!arrayList3.isEmpty()) {
                            String strS3 = sq6.s(zfa.a, thA3, "release onComplete: ");
                            Iterator it3 = arrayList3.iterator();
                            while (it3.hasNext()) {
                                ((n30) ((zfa) it3.next())).b(sfaVar, strE3, strS3);
                            }
                        }
                    }
                }
                return ieiVar;
            case 5:
                l45 l45Var4 = (l45) this.F;
                sf5.h0(obj);
                t53 t53Var = (t53) obj2;
                Iterator it4 = ((Set) obj3).iterator();
                while (it4.hasNext()) {
                    gb9.D(l45Var4, null, null, new m33(t53Var, ((TaskId) it4.next()).m1134unboximpl(), tp4Var, z ? 1 : 0), 3);
                }
                return ieiVar;
            case 6:
                l45 l45Var5 = (l45) this.F;
                sf5.h0(obj);
                fn1 fn1Var = (fn1) obj3;
                xc3 xc3Var = (xc3) obj2;
                gb9.D(l45Var5, null, null, new wc3(fn1Var, xc3Var, tp4Var, z ? 1 : 0), 3);
                gb9.D(l45Var5, null, null, new wc3(xc3Var, fn1Var, null), 3);
                gb9.D(l45Var5, null, null, new wc3(fn1Var, xc3Var, tp4Var, i4), 3);
                gb9.D(l45Var5, null, null, new wc3(fn1Var, xc3Var, tp4Var, i5), 3);
                gb9.D(l45Var5, null, null, new wc3(fn1Var, xc3Var, tp4Var, i2), 3);
                return ieiVar;
            case 7:
                c cVar = (c) obj3;
                lsc lscVar = cVar.S;
                a aVar = cVar.i;
                sf5.h0(obj);
                ((nwb) obj2).setValue(Boolean.FALSE);
                zxc zxcVarE = ((wxc) this.F).e();
                if (x44.r(zxcVarE, yxcVar)) {
                    lsc lscVar2 = cVar.Q;
                    Boolean bool = Boolean.TRUE;
                    lscVar2.setValue(bool);
                    SharedPreferences.Editor editorEdit = aVar.a.edit();
                    editorEdit.putBoolean("notification_prompt_seen", true);
                    editorEdit.apply();
                    lscVar.setValue(bool);
                    return ieiVar;
                }
                if (!(zxcVarE instanceof xxc)) {
                    wg6.i();
                    return null;
                }
                if (!((xxc) zxcVarE).a) {
                    return ieiVar;
                }
                vb7.B(aVar.a, "notification_prompt_seen", true);
                lscVar.setValue(Boolean.TRUE);
                return ieiVar;
            case 8:
                sf5.h0(obj);
                nwb nwbVar2 = (nwb) obj2;
                if (!((Boolean) nwbVar2.getValue()).booleanValue() && ((dk4) this.F) != dk4.H) {
                    nwbVar2.setValue(Boolean.TRUE);
                    ((zy7) obj3).a();
                }
                return ieiVar;
            case 9:
                rs4 rs4Var = (rs4) obj3;
                l45 l45Var6 = (l45) this.F;
                sf5.h0(obj);
                try {
                    hdc hdcVar = rs4Var.d;
                    jie jieVar = new jie();
                    jieVar.g(rs4Var.a + "/sandbox/containers/" + ((String) obj2));
                    rs4Var.b(jieVar);
                    jieVar.c();
                    pqeVarF = new f4e(hdcVar, new kie(jieVar), false).f();
                } catch (IOException e) {
                    zfa.a.getClass();
                    if (yfa.b()) {
                        String strE4 = iuj.E(l45Var6);
                        CopyOnWriteArrayList copyOnWriteArrayList4 = yfa.b;
                        ArrayList arrayList4 = new ArrayList();
                        for (Object obj7 : copyOnWriteArrayList4) {
                            ((n30) ((zfa) obj7)).getClass();
                            arrayList4.add(obj7);
                        }
                        if (!arrayList4.isEmpty()) {
                            zfa.a.getClass();
                            String strI = ij0.i("Container liveness check failed: ", e.getMessage());
                            Iterator it5 = arrayList4.iterator();
                            while (it5.hasNext()) {
                                ((n30) ((zfa) it5.next())).b(sfaVar, strE4, strI);
                            }
                        }
                    }
                }
                try {
                    boolean z2 = pqeVarF.U;
                    pqeVarF.close();
                    z = z2;
                    return Boolean.valueOf(z);
                } finally {
                }
            case 10:
                sf5.h0(obj);
                c61 c61Var = (c61) this.F;
                String str = (String) obj3;
                jie jieVarC = c61.c(c61Var, c61.d(c61Var, "plugins", str, "bundle"));
                jieVarC.c();
                pqe pqeVarF2 = new f4e((hdc) c61Var.H, new kie(jieVarC), false).f();
                File file = (File) obj2;
                try {
                    if (!pqeVarF2.U) {
                        throw new IOException("export plugin: HTTP " + pqeVarF2.H);
                    }
                    Pattern patternCompile = Pattern.compile("[^A-Za-z0-9._-]");
                    patternCompile.getClass();
                    str.getClass();
                    String strReplaceAll = patternCompile.matcher(str).replaceAll("_");
                    strReplaceAll.getClass();
                    File file2 = new File(file, strReplaceAll.concat(".cnw.zip"));
                    InputStream inputStreamM0 = pqeVarF2.K.G0().M0();
                    try {
                        FileOutputStream fileOutputStream = new FileOutputStream(file2);
                        try {
                            zni.o(inputStreamM0, fileOutputStream);
                            fileOutputStream.close();
                            inputStreamM0.close();
                            pqeVarF2.close();
                            return file2;
                        } finally {
                        }
                    } finally {
                    }
                } finally {
                }
            case 11:
                nwb nwbVar3 = (nwb) obj3;
                wxc wxcVar = (wxc) this.F;
                sf5.h0(obj);
                if (Build.VERSION.SDK_INT >= 33 && ((Boolean) ((nwb) obj2).getValue()).booleanValue() && !((Boolean) nwbVar3.getValue()).booleanValue() && !oq5.I(wxcVar.e()) && !oq5.D(wxcVar.e())) {
                    nwbVar3.setValue(Boolean.TRUE);
                    wxcVar.f();
                }
                return ieiVar;
            case 12:
                sf5.h0(obj);
                String strEncodeToString = java.util.Base64.getEncoder().encodeToString((byte[]) this.F);
                ih9 ih9Var = ex4.a;
                strEncodeToString.getClass();
                UploadRequest uploadRequest = new UploadRequest(strEncodeToString);
                ih9Var.getClass();
                String strD = ih9Var.d(uploadRequest, UploadRequest.Companion.serializer());
                b0 b0Var = (b0) obj3;
                String strO = kgh.o(b0Var.a, "/sandbox/upload");
                us8 us8Var = new us8();
                us8Var.h(null, strO);
                us8 us8VarF = us8Var.c().f();
                us8VarF.b("filename", (String) obj2);
                vs8 vs8VarC = us8VarF.c();
                jie jieVar2 = new jie();
                jieVar2.a = vs8VarC;
                b0Var.f(jieVar2);
                sie sieVar = tie.Companion;
                p8b p8bVar = b0.q;
                sieVar.getClass();
                jieVar2.e("POST", sie.b(strD, p8bVar));
                String str2 = (String) b0Var.i.get();
                if (str2 != null) {
                    jieVar2.d("X-Client-Id", str2);
                }
                pqe pqeVarF3 = new f4e(b0Var.c, new kie(jieVar2), false).f();
                try {
                    String strF = pqeVarF3.K.f();
                    if (pqeVarF3.U) {
                        UploadResult uploadResult = (UploadResult) ih9Var.b(strF, UploadResult.Companion.serializer());
                        pqeVarF3.close();
                        return uploadResult;
                    }
                    throw new IOException("POST /sandbox/upload failed: HTTP " + pqeVarF3.H + " " + strF);
                } finally {
                }
            case 13:
                sf5.h0(obj);
                if (((hsf) ((nwb) obj2).getValue()) != null) {
                    ((p05) this.F).S();
                    f fVar = (f) obj3;
                    b0 b0VarQ0 = fVar.q0();
                    if (b0VarQ0 == null) {
                        fVar.U.setValue(ez4.a);
                    } else {
                        fkg fkgVar = fVar.W;
                        if (fkgVar != null) {
                            fkgVar.d(null);
                        }
                        fVar.W = gb9.D(fVar.a, null, null, new ed3(fVar, b0VarQ0, tp4Var, i3), 3);
                    }
                }
                return ieiVar;
            case 14:
                kj6 kj6Var = (kj6) this.F;
                sf5.h0(obj);
                int iOrdinal = kj6Var.ordinal();
                if (iOrdinal == 0) {
                    ((zy7) obj3).a();
                    return ieiVar;
                }
                if (iOrdinal == 1) {
                    ((bz7) obj2).invoke(new tt6(false));
                    return ieiVar;
                }
                wg6.i();
                return null;
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                sf5.h0(obj);
                yvb yvbVar = (yvb) this.F;
                yvb yvbVar2 = new yvb(new LinkedHashMap(yvbVar.a()), false);
                String str3 = (String) obj3;
                String str4 = (String) obj2;
                xbd xbdVar = m68.g;
                Set set = (Set) yvbVar.c(xbdVar);
                if (set == null) {
                    set = um6.E;
                }
                yvbVar2.e(xbdVar, dxf.q0(set, str3));
                m68.d.getClass();
                yvbVar2.e(new xbd("provider:".concat(str3)), str4);
                return new yvb(new LinkedHashMap(yvbVar2.a()), true);
            case 16:
                sf5.h0(obj);
                if (((String) this.F) == null) {
                    ((kl8) obj3).f.r(new tt6(true));
                    ((zy7) obj2).a();
                }
                return ieiVar;
            case g.MAX_FIELD_NUMBER /* 17 */:
                oda odaVar = (oda) obj2;
                u0h u0hVar = odaVar.d;
                ContentResolver contentResolver = odaVar.c;
                si7 si7Var = (si7) obj3;
                l45 l45Var7 = (l45) this.F;
                sf5.h0(obj);
                try {
                    ide ideVar = p8b.e;
                    String str5 = si7Var.d;
                    Uri uri = si7Var.a;
                    long j2 = si7Var.c;
                    p8b p8bVarD = nai.D(str5);
                    contentResolver.getClass();
                    uri.getClass();
                    tie s49Var = new s49(p8bVarD, j2, new w95(contentResolver, 29, uri));
                    if (x44.r(uri.getScheme(), "content") && j2 <= 67108864) {
                        ((File) u0hVar.getValue()).mkdirs();
                        File file3 = new File((File) u0hVar.getValue(), UUID.randomUUID().toString());
                        try {
                            InputStream inputStreamOpenInputStream = contentResolver.openInputStream(uri);
                            if (inputStreamOpenInputStream == null) {
                                throw new IllegalStateException("ContentResolver.openInputStream returned null");
                            }
                            RealBufferedSource realBufferedSource = new RealBufferedSource(Okio.g(inputStreamOpenInputStream));
                            try {
                                realBufferedSink = new RealBufferedSink(Okio.e(new FileOutputStream(file3, false)));
                                j = 0;
                            } catch (Throwable th4) {
                                try {
                                    throw th4;
                                } catch (Throwable th5) {
                                    wd6.Z(realBufferedSource, th4);
                                    throw th5;
                                }
                            }
                            while (true) {
                                try {
                                    long jA0 = realBufferedSource.A0(realBufferedSink.F, 65536L);
                                    if (jA0 != -1) {
                                        j += jA0;
                                        if (j > 67108864) {
                                            throw new IOException("content:// source exceeded PREPARE_COPY_MAX_BYTES");
                                        }
                                        realBufferedSink.c();
                                        fd9.S(l45Var7);
                                    } else {
                                        realBufferedSink.close();
                                        realBufferedSource.close();
                                        if (j2 > 0 && file3.length() < j2) {
                                            throw new IllegalStateException(("content:// copy short-read: expected " + j2 + ", got " + file3.length()).toString());
                                        }
                                        tie.Companion.getClass();
                                        s49Var = new nie(p8bVarD, file3);
                                    }
                                } finally {
                                }
                                throw th4;
                            }
                        } catch (CancellationException e2) {
                            file3.delete();
                            throw e2;
                        } catch (Exception e3) {
                            List list = xah.a;
                            xah.f(e3, "LocalFileUtils: content:// cache copy failed; falling back to streaming body", null, null, 28);
                            file3.delete();
                        }
                    }
                    tie tieVar = s49Var;
                    return new dk7(si7Var.b, tieVar, tieVar.contentLength(), p8bVarD);
                } catch (CancellationException e4) {
                    throw e4;
                } catch (Exception e5) {
                    List list2 = xah.a;
                    xah.f(e5, "Failed to load local file into upload info", null, null, 28);
                    return null;
                }
            case g.AVG_FIELD_NUMBER /* 18 */:
                return d(obj);
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                sf5.h0(obj);
                l45 l45Var8 = (l45) this.F;
                e8d e8dVar = (e8d) obj3;
                zeh zehVar = (zeh) obj2;
                gb9.D(l45Var8, null, o45Var, new a35(e8dVar, zehVar, tp4Var, i6), 1);
                return gb9.D(l45Var8, null, o45Var, new a35(e8dVar, zehVar, tp4Var, i4), 1);
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                return n(obj);
            case 21:
                return p(obj);
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                sf5.h0(obj);
                try {
                    hreVar4 = ((lbb) obj3).g.a((String) obj2);
                    break;
                } catch (Throwable th6) {
                    hreVar4 = new hre(th6);
                }
                return new jre(hreVar4);
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                lgb lgbVar = (lgb) obj3;
                sf5.h0(obj);
                String str6 = (String) this.F;
                if (str6.length() == 0) {
                    str6 = "download_" + UUID.randomUUID();
                }
                String str7 = str6;
                try {
                    DownloadManager.Request requestA = lgb.a(lgbVar, (String) obj2, str7);
                    Object systemService = lgbVar.a.getSystemService("download");
                    systemService.getClass();
                    return new pa6(((DownloadManager) systemService).enqueue(requestA));
                } catch (Exception e6) {
                    String message = e6.getMessage();
                    Exception exc = new Exception(message != null ? isg.n0(message, str7, "[filename]", false) : null);
                    exc.setStackTrace(e6.getStackTrace());
                    List list3 = xah.a;
                    Map mapSingletonMap = Collections.singletonMap("original_exception_class", e6.getClass().getSimpleName());
                    mapSingletonMap.getClass();
                    xah.f(exc, "Failed to start downloading file", null, mapSingletonMap, 20);
                    return null;
                }
            case 24:
                return r(obj);
            case BuildConfig.VERSION_CODE /* 25 */:
                return s(obj);
            case 26:
                return t(obj);
            case 27:
                return v(obj);
            case 28:
                return w(obj);
            default:
                sf5.h0(obj);
                l45 l45Var9 = (l45) this.F;
                vfh vfhVar = (vfh) obj3;
                sih sihVar = vfhVar.W;
                e8d e8dVar2 = (e8d) obj2;
                ytf ytfVar = new ytf(sihVar, 17, vfhVar);
                tp4 tp4Var2 = null;
                gb9.D(l45Var9, null, o45Var, new ufh(sihVar, e8dVar2, tp4Var2, z ? 1 : 0), 1);
                gb9.D(l45Var9, null, o45Var, new lza(vfhVar, sihVar, e8dVar2, ytfVar, (tp4) null, 23), 1);
                gb9.D(l45Var9, null, o45Var, new v2h(sihVar, e8dVar2, ytfVar, tp4Var2, 6), 1);
                return ieiVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zn(Object obj, Object obj2, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.G = obj;
        this.H = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zn(Object obj, Object obj2, Object obj3, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.F = obj;
        this.G = obj2;
        this.H = obj3;
    }
}
