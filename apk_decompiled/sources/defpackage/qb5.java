package defpackage;

import android.R;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.Menu;
import android.view.ViewGroup;
import android.widget.AbsSeekBar;
import android.widget.EditText;
import androidx.compose.foundation.layout.b;
import androidx.health.platform.client.proto.g;
import androidx.media3.container.ObuParser$NotYetImplementedException;
import coil3.compose.AsyncImagePainter;
import coil3.compose.AsyncImagePainter$State$Loading;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.chromium.net.CronetEngine;

/* JADX INFO: loaded from: classes2.dex */
public class qb5 implements y4h, tc2, kjb, lfh, qg5, cvg, ocg, fjc, occ, nsg {
    public static final int[] G = {R.attr.indeterminateDrawable, R.attr.progressDrawable};
    public Object E;
    public Object F;

    public qb5(int i) {
        switch (i) {
            case 11:
                this.E = new epk(new zl4(12));
                this.F = new epk(new yl4());
                break;
            case g.AVG_FIELD_NUMBER /* 18 */:
                this.E = new HashMap();
                this.F = p34.b;
                break;
            case 29:
                this.E = null;
                this.F = null;
                break;
            default:
                this.E = ByteBuffer.allocateDirect(500);
                break;
        }
    }

    public static void d(qb5 qb5Var, p34 p34Var) {
        qb5Var.getClass();
        for (Map.Entry entry : new HashMap((HashMap) qb5Var.E).entrySet()) {
            if (entry.getKey() != null) {
                mr9.o();
                return;
            } else {
                List list = (List) entry.getValue();
                if (!j(p34Var, list).equals(j((p34) qb5Var.F, list))) {
                    throw null;
                }
            }
        }
        qb5Var.F = p34Var;
    }

    public static p34 j(p34 p34Var, List list) {
        p34Var.getClass();
        Map map = p34Var.a;
        HashMap map2 = new HashMap(map);
        HashSet hashSet = new HashSet(list);
        for (String str : map.keySet()) {
            if (!hashSet.contains(str)) {
                map2.remove(str);
            }
        }
        return new p34(map2);
    }

    public Drawable A(Drawable drawable, boolean z) {
        if (!(drawable instanceof LayerDrawable)) {
            if (!(drawable instanceof BitmapDrawable)) {
                return drawable;
            }
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            Bitmap bitmap = bitmapDrawable.getBitmap();
            if (((Bitmap) this.F) == null) {
                this.F = bitmap;
            }
            ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null));
            shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
            shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
            return z ? new ClipDrawable(shapeDrawable, 3, 1) : shapeDrawable;
        }
        LayerDrawable layerDrawable = (LayerDrawable) drawable;
        int numberOfLayers = layerDrawable.getNumberOfLayers();
        Drawable[] drawableArr = new Drawable[numberOfLayers];
        for (int i = 0; i < numberOfLayers; i++) {
            int id = layerDrawable.getId(i);
            drawableArr[i] = A(layerDrawable.getDrawable(i), id == 16908301 || id == 16908303);
        }
        LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
        for (int i2 = 0; i2 < numberOfLayers; i2++) {
            layerDrawable2.setId(i2, layerDrawable.getId(i2));
            layerDrawable2.setLayerGravity(i2, layerDrawable.getLayerGravity(i2));
            layerDrawable2.setLayerWidth(i2, layerDrawable.getLayerWidth(i2));
            layerDrawable2.setLayerHeight(i2, layerDrawable.getLayerHeight(i2));
            layerDrawable2.setLayerInsetLeft(i2, layerDrawable.getLayerInsetLeft(i2));
            layerDrawable2.setLayerInsetRight(i2, layerDrawable.getLayerInsetRight(i2));
            layerDrawable2.setLayerInsetTop(i2, layerDrawable.getLayerInsetTop(i2));
            layerDrawable2.setLayerInsetBottom(i2, layerDrawable.getLayerInsetBottom(i2));
            layerDrawable2.setLayerInsetStart(i2, layerDrawable.getLayerInsetStart(i2));
            layerDrawable2.setLayerInsetEnd(i2, layerDrawable.getLayerInsetEnd(i2));
        }
        return layerDrawable2;
    }

    public void B(ArrayList arrayList) {
        qbc qbcVar;
        for (int i = 0; i < arrayList.size(); i++) {
            if (((pbc) arrayList.get(i)).a == 1) {
                try {
                    qbcVar = new qbc((pbc) arrayList.get(i));
                } catch (ObuParser$NotYetImplementedException unused) {
                    qbcVar = null;
                }
                this.F = qbcVar;
            }
        }
    }

    public xv8 C(sxb sxbVar, String str) {
        String strB = sxbVar.b();
        strB.getClass();
        return new xv8(this, new hab(strB + '#' + str));
    }

    @Override // defpackage.occ
    public int D(int i) {
        return ztj.e(((zb0) this.E).F, i, (String) this.F);
    }

    public d0 E(sxb sxbVar, String str) {
        sxbVar.getClass();
        String strB = sxbVar.b();
        strB.getClass();
        return new d0(this, new hab(strB.concat(str)));
    }

    @Override // defpackage.cvg
    public boolean H(u95 u95Var) {
        return true;
    }

    @Override // defpackage.fjc
    public List a(Integer num) {
        List listA = ((fjc) this.E).a(null);
        vag vagVar = (vag) this.F;
        int i = vagVar.v;
        return i < 0 ? listA : w44.a1(jpk.e(vagVar, num, i, Integer.valueOf(vagVar.E(i, vagVar.b))), listA);
    }

    @Override // defpackage.cvg
    public dvg apply() {
        return ((nv9) this.E).f(this.F);
    }

    @Override // defpackage.y4h
    public void b(wv8 wv8Var) {
        bpc bpcVarM;
        jx8 jx8Var = (jx8) this.E;
        AsyncImagePainter asyncImagePainter = (AsyncImagePainter) this.F;
        bpc bpcVarD = wv8Var != null ? auk.d(wv8Var, jx8Var.a, asyncImagePainter.T) : null;
        if (bpcVarD == null && ((Boolean) dch.y(jx8Var, idi.b)).booleanValue() && (bpcVarM = asyncImagePainter.m()) != null) {
            bpcVarD = bpcVarM;
        }
        AsyncImagePainter.l(asyncImagePainter, new AsyncImagePainter$State$Loading(bpcVarD));
    }

    @Override // defpackage.ocg
    public float c(float f, float f2) {
        float fAbs = Math.abs(f2);
        List list = ((x0a) this.E).h().k;
        int i = 0;
        if (!list.isEmpty()) {
            int size = list.size();
            int size2 = list.size();
            int i2 = 0;
            while (i < size2) {
                i2 += ((q0a) list.get(i)).q;
                i++;
            }
            i = i2 / size;
        }
        float f3 = fAbs - i;
        if (f3 < MTTypesetterKt.kLineSkipLimitMultiplier) {
            f3 = 0.0f;
        }
        return Math.signum(f2) * f3;
    }

    @Override // defpackage.cvg
    public void cancel() {
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00a7  */
    @Override // defpackage.ocg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public float e(float r17) {
        /*
            r16 = this;
            r0 = r16
            java.lang.Object r1 = r0.E
            x0a r1 = (defpackage.x0a) r1
            p0a r2 = r1.h()
            java.util.List r2 = r2.k
            java.lang.Object r0 = r0.F
            pcg r0 = (defpackage.pcg) r0
            r3 = r2
            java.util.Collection r3 = (java.util.Collection) r3
            int r3 = r3.size()
            r5 = 2139095040(0x7f800000, float:Infinity)
            r6 = 0
            r9 = r5
            r7 = r6
            r8 = -8388608(0xffffffffff800000, float:-Infinity)
        L1e:
            r10 = 0
            r11 = 1
            if (r7 >= r3) goto L73
            java.lang.Object r12 = r2.get(r7)
            q0a r12 = (defpackage.q0a) r12
            if (r12 == 0) goto L2c
            r13 = r12
            goto L2d
        L2c:
            r13 = 0
        L2d:
            if (r13 == 0) goto L36
            boolean r13 = r13.t
            if (r13 != r11) goto L36
            r16 = -8388608(0xffffffffff800000, float:-Infinity)
            goto L70
        L36:
            p0a r11 = r1.h()
            int r11 = defpackage.nvj.h(r11)
            p0a r13 = r1.h()
            int r13 = r13.l
            int r13 = -r13
            p0a r14 = r1.h()
            int r14 = r14.q
            int r15 = r12.q
            int r12 = r12.p
            r16 = -8388608(0xffffffffff800000, float:-Infinity)
            p0a r4 = r1.h()
            int r4 = r4.n
            int r4 = r0.e(r11, r15, r13, r14)
            float r4 = (float) r4
            float r11 = (float) r12
            float r11 = r11 - r4
            int r4 = (r11 > r10 ? 1 : (r11 == r10 ? 0 : -1))
            if (r4 > 0) goto L67
            int r4 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1))
            if (r4 <= 0) goto L67
            r8 = r11
        L67:
            int r4 = (r11 > r10 ? 1 : (r11 == r10 ? 0 : -1))
            if (r4 < 0) goto L70
            int r4 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r4 >= 0) goto L70
            r9 = r11
        L70:
            int r7 = r7 + 1
            goto L1e
        L73:
            r16 = -8388608(0xffffffffff800000, float:-Infinity)
            lsc r0 = r1.f
            java.lang.Object r0 = r0.getValue()
            p0a r0 = (defpackage.p0a) r0
            cz5 r0 = r0.i
            float r1 = java.lang.Math.abs(r17)
            r2 = 1137180672(0x43c80000, float:400.0)
            float r0 = r0.q0(r2)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            r1 = 2
            if (r0 >= 0) goto L8f
            goto L96
        L8f:
            int r0 = (r17 > r10 ? 1 : (r17 == r10 ? 0 : -1))
            if (r0 <= 0) goto L95
            r6 = r11
            goto L96
        L95:
            r6 = r1
        L96:
            if (r6 != 0) goto La5
            float r0 = java.lang.Math.abs(r9)
            float r1 = java.lang.Math.abs(r8)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto Lad
            goto La7
        La5:
            if (r6 != r11) goto La9
        La7:
            r8 = r9
            goto Lad
        La9:
            if (r6 != r1) goto Lac
            goto Lad
        Lac:
            r8 = r10
        Lad:
            int r0 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r0 != 0) goto Lb2
            goto Lb6
        Lb2:
            int r0 = (r8 > r16 ? 1 : (r8 == r16 ? 0 : -1))
            if (r0 != 0) goto Lb7
        Lb6:
            return r10
        Lb7:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qb5.e(float):float");
    }

    public i81 f() {
        String str = ((ArrayList) this.E) == null ? " events" : "";
        if (str.isEmpty()) {
            return new i81((ArrayList) this.E, (byte[]) this.F);
        }
        sz6.j("Missing required properties:".concat(str));
        return null;
    }

    @Override // defpackage.fjc
    public boolean g() {
        return ((fjc) this.E).g();
    }

    public sb5 h() {
        if (((am4) this.F) == null) {
            this.F = svj.b;
        }
        CronetEngine cronetEngine = (CronetEngine) this.E;
        ExecutorService executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(4);
        ExecutorService executorServiceNewCachedThreadPool = Executors.newCachedThreadPool();
        return new sb5(new cke(cronetEngine, executorServiceNewFixedThreadPool, new mvd(new cm4(), 2, new xzd(6, executorServiceNewCachedThreadPool)), new sqe(), (am4) this.F));
    }

    public void i() {
        this.E = null;
        this.F = null;
    }

    @Override // defpackage.cvg
    public boolean isComplete() {
        return true;
    }

    @Override // defpackage.lfh
    public void k(ta4 ta4Var, ld4 ld4Var, int i) {
        boolean z;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(1987694419);
        int i2 = i | (e18Var.f(this) ? 32 : 16);
        if (e18Var.Q(i2 & 1, (i2 & 19) != 18)) {
            iqb iqbVarK = gb9.K(b.c(fqb.E, 1.0f), 16.0f, 14.0f);
            yih yihVar = (yih) this.E;
            znd zndVar = (znd) this.F;
            o5b o5bVarD = dw1.d(lja.G, false);
            int iHashCode = Long.hashCode(e18Var.T);
            hyc hycVarL = e18Var.l();
            iqb iqbVarE = kxk.E(e18Var, iqbVarK);
            dd4.e.getClass();
            re4 re4Var = cd4.b;
            e18Var.e0();
            if (e18Var.S) {
                e18Var.k(re4Var);
            } else {
                e18Var.n0();
            }
            d4c.i0(e18Var, cd4.f, o5bVarD);
            d4c.i0(e18Var, cd4.e, hycVarL);
            d4c.i0(e18Var, cd4.g, Integer.valueOf(iHashCode));
            d4c.h0(e18Var, cd4.h);
            d4c.i0(e18Var, cd4.d, iqbVarE);
            if (yihVar.d().G.length() == 0) {
                e18Var.a0(237654309);
                z = true;
                tjh.b(zndVar.c.d, null, gm3.a(e18Var).O, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var).e.E).g, e18Var, 0, 0, 131066);
                e18Var = e18Var;
                e18Var.p(false);
            } else {
                z = true;
                e18Var.a0(237941493);
                e18Var.p(false);
            }
            vb7.y(6, ta4Var, e18Var, z);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new t04(this, ta4Var, i, 27);
        }
    }

    @Override // defpackage.occ
    public int l(int i) {
        return ztj.e((String) this.F, i, ((zb0) this.E).F);
    }

    public a51 m(jw7 jw7Var, p31 p31Var) {
        boolean zBooleanValue;
        jw7Var.getClass();
        int i = jw7Var.H;
        p31Var.getClass();
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 29 || i == -1) {
            return a51.d;
        }
        Context context = (Context) this.E;
        Boolean bool = (Boolean) this.F;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            if (context != null) {
                String parameters = x41.j(context).getParameters("offloadVariableRateSupported");
                this.F = Boolean.valueOf(parameters != null && parameters.equals("offloadVariableRateSupported=1"));
            } else {
                this.F = Boolean.FALSE;
            }
            zBooleanValue = ((Boolean) this.F).booleanValue();
        }
        String str = jw7Var.o;
        str.getClass();
        int iB = gkb.b(str, jw7Var.k);
        if (iB == 0 || i2 < tpi.l(iB)) {
            return a51.d;
        }
        int iM = tpi.m(jw7Var.G);
        if (iM == 0) {
            return a51.d;
        }
        try {
            AudioFormat audioFormatBuild = new AudioFormat.Builder().setSampleRate(i).setChannelMask(iM).setEncoding(iB).build();
            if (i2 >= 33) {
                int directPlaybackSupport = AudioManager.getDirectPlaybackSupport(audioFormatBuild, p31Var.a());
                if ((directPlaybackSupport & 1) == 0) {
                    return a51.d;
                }
                z = (directPlaybackSupport & 3) == 3;
                z41 z41Var = new z41();
                z41Var.a = true;
                z41Var.b = z;
                z41Var.c = zBooleanValue;
                return z41Var.a();
            }
            if (i2 < 31) {
                if (!AudioManager.isOffloadedPlaybackSupported(audioFormatBuild, p31Var.a())) {
                    return a51.d;
                }
                z41 z41Var2 = new z41();
                z41Var2.a = true;
                z41Var2.c = zBooleanValue;
                return z41Var2.a();
            }
            int playbackOffloadSupport = AudioManager.getPlaybackOffloadSupport(audioFormatBuild, p31Var.a());
            if (playbackOffloadSupport == 0) {
                return a51.d;
            }
            z41 z41Var3 = new z41();
            if (i2 > 32 && playbackOffloadSupport == 2) {
                z = true;
            }
            z41Var3.a = true;
            z41Var3.b = z;
            z41Var3.c = zBooleanValue;
            return z41Var3.a();
        } catch (IllegalArgumentException unused) {
            return a51.d;
        }
    }

    @Override // defpackage.qg5
    public tg5 n() {
        return new nq5((Context) this.E, ((ucc) this.F).n());
    }

    public String o() {
        return ij0.j("HealthData#", (String) this.E, "#androidx.health.ACTION_BIND_HEALTH_DATA_SERVICE");
    }

    public void p(long j, Bundle bundle, String str, String str2) {
        try {
            u5k u5kVar = (u5k) ((o5k) this.E);
            Parcel parcelB = u5kVar.b();
            parcelB.writeString(str);
            parcelB.writeString(str2);
            qxj.d(parcelB, bundle);
            parcelB.writeLong(j);
            u5kVar.K(parcelB, 1);
        } catch (RemoteException e) {
            umk umkVar = ((AppMeasurementDynamiteService) this.F).i;
            if (umkVar != null) {
                qgk qgkVar = umkVar.M;
                umk.d(qgkVar);
                qgkVar.M.c("Event interceptor threw exception", e);
            }
        }
    }

    @Override // defpackage.tc2
    public void p0(ee2 ee2Var, pd1 pd1Var) {
        ge2 ge2Var = (ge2) this.E;
        if (ge2Var == null) {
            x44.o0("context");
            throw null;
        }
        oub oubVar = (oub) this.F;
        if (oubVar == null) {
            x44.o0("layerDimensions");
            throw null;
        }
        if (ee2Var == null) {
            return;
        }
        pd1Var.h(ge2Var, oubVar, ee2Var);
    }

    @Override // defpackage.nsg
    public void q(nab nabVar, Bitmap bitmap, Map map) {
        int i;
        int iD = zik.d(bitmap);
        f5e f5eVar = (f5e) this.F;
        synchronized (f5eVar.c) {
            i = f5eVar.a;
        }
        f5e f5eVar2 = (f5e) this.F;
        if (iD <= i) {
            f5eVar2.d(nabVar, new d5e(bitmap, map, iD));
        } else {
            f5eVar2.e(nabVar);
            ((at) this.E).p(nabVar, bitmap, map, iD);
        }
    }

    public void r(AttributeSet attributeSet, int i) {
        AbsSeekBar absSeekBar = (AbsSeekBar) this.E;
        lrb lrbVarP = lrb.P(absSeekBar.getContext(), attributeSet, G, i);
        Drawable drawableZ = lrbVarP.z(0);
        if (drawableZ != null) {
            if (drawableZ instanceof AnimationDrawable) {
                AnimationDrawable animationDrawable = (AnimationDrawable) drawableZ;
                int numberOfFrames = animationDrawable.getNumberOfFrames();
                AnimationDrawable animationDrawable2 = new AnimationDrawable();
                animationDrawable2.setOneShot(animationDrawable.isOneShot());
                for (int i2 = 0; i2 < numberOfFrames; i2++) {
                    Drawable drawableA = A(animationDrawable.getFrame(i2), true);
                    drawableA.setLevel(yr6.INVALID_OWNERSHIP);
                    animationDrawable2.addFrame(drawableA, animationDrawable.getDuration(i2));
                }
                animationDrawable2.setLevel(yr6.INVALID_OWNERSHIP);
                drawableZ = animationDrawable2;
            }
            absSeekBar.setIndeterminateDrawable(drawableZ);
        }
        Drawable drawableZ2 = lrbVarP.z(1);
        if (drawableZ2 != null) {
            absSeekBar.setProgressDrawable(A(drawableZ2, false));
        }
        lrbVarP.S();
    }

    public void s(ob obVar) {
        c61 c61Var = (c61) this.E;
        ((ActionMode.Callback) c61Var.F).onDestroyActionMode(c61Var.p(obVar));
        ah0 ah0Var = (ah0) this.F;
        if (ah0Var.S != null) {
            ah0Var.J.getDecorView().removeCallbacks(ah0Var.T);
        }
        if (ah0Var.R != null) {
            gyi gyiVar = ah0Var.U;
            if (gyiVar != null) {
                gyiVar.b();
            }
            gyi gyiVarA = mvi.a(ah0Var.R);
            gyiVarA.a(MTTypesetterKt.kLineSkipLimitMultiplier);
            ah0Var.U = gyiVarA;
            gyiVarA.d(new rg0(2, this));
        }
        ah0Var.Q = null;
        ViewGroup viewGroup = ah0Var.X;
        WeakHashMap weakHashMap = mvi.a;
        viewGroup.requestApplyInsets();
        ah0Var.x();
    }

    public boolean t(ob obVar, Menu menu) {
        ViewGroup viewGroup = ((ah0) this.F).X;
        WeakHashMap weakHashMap = mvi.a;
        viewGroup.requestApplyInsets();
        c61 c61Var = (c61) this.E;
        ActionMode.Callback callback = (ActionMode.Callback) c61Var.F;
        syg sygVarP = c61Var.p(obVar);
        w6g w6gVar = (w6g) c61Var.I;
        Menu zdbVar = (Menu) w6gVar.get(menu);
        if (zdbVar == null) {
            zdbVar = new zdb((Context) c61Var.G, (vcb) menu);
            w6gVar.put(menu, zdbVar);
        }
        return callback.onPrepareActionMode(sygVarP, zdbVar);
    }

    public void u(mu7 mu7Var) {
        fq1 fq1Var = (fq1) this.F;
        xzd xzdVar = (xzd) this.E;
        int i = mu7Var.b;
        if (i != 0) {
            fq1Var.execute(new wmj(xzdVar, i));
        } else {
            fq1Var.execute(new s2k(xzdVar, 3, mu7Var.a));
        }
    }

    public void v(zpf zpfVar) {
        mdg mdgVar = (mdg) this.F;
        zpfVar.getClass();
        if (!(zpfVar instanceof leb)) {
            if ((zpfVar instanceof rvh) || (zpfVar instanceof c44) || (zpfVar instanceof g44) || (zpfVar instanceof ejb) || (zpfVar instanceof bde) || (zpfVar instanceof dde) || (zpfVar instanceof lei)) {
                return;
            }
            wg6.i();
            return;
        }
        leb lebVar = (leb) zpfVar;
        int i = 0;
        for (Object obj : lebVar.d) {
            int i2 = i + 1;
            if (i < 0) {
                x44.n0();
                throw null;
            }
            spf spfVar = (spf) obj;
            if (spfVar instanceof xdh) {
                String str = lebVar.a + "_" + i;
                if (!mdgVar.containsKey(str)) {
                    try {
                        mdgVar.put(str, ((z74) this.E).a(((xdh) spfVar).a));
                    } catch (Throwable unused) {
                    }
                }
            }
            i = i2;
        }
    }

    @Override // defpackage.nsg
    public pab w(nab nabVar) {
        d5e d5eVar = (d5e) ((f5e) this.F).c(nabVar);
        if (d5eVar != null) {
            return new pab(d5eVar.a, d5eVar.b);
        }
        return null;
    }

    public void x(ArrayList arrayList) {
        this.E = arrayList;
    }

    public void y(byte[] bArr) {
        this.F = bArr;
    }

    @Override // defpackage.nsg
    public void z(int i) {
        int i2;
        f5e f5eVar = (f5e) this.F;
        if (i >= 40) {
            f5eVar.h(-1);
            return;
        }
        if (10 > i || i >= 20) {
            return;
        }
        synchronized (f5eVar.c) {
            i2 = f5eVar.d;
        }
        f5eVar.h(i2 / 2);
    }

    public /* synthetic */ qb5(Object obj, Object obj2, boolean z) {
        this.E = obj;
        this.F = obj2;
    }

    public qb5(AbsSeekBar absSeekBar) {
        this.E = absSeekBar;
    }

    public qb5(Context context, int i) {
        switch (i) {
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                ucc uccVar = new ucc();
                uccVar.G = new epk(20);
                uccVar.E = 8000;
                uccVar.F = 8000;
                this.E = context.getApplicationContext();
                this.F = uccVar;
                break;
            default:
                this.E = context == null ? null : context.getApplicationContext();
                break;
        }
    }

    public /* synthetic */ qb5(Object obj, Object obj2) {
        this.F = obj;
        this.E = obj2;
    }

    public qb5(rl rlVar, HashMap map, HashMap map2) {
        this.E = rlVar;
        this.F = map;
    }

    public qb5(EditText editText) {
        this.E = editText;
        zl6 zl6Var = new zl6(editText);
        this.F = zl6Var;
        editText.addTextChangedListener(zl6Var);
        if (ml6.b == null) {
            synchronized (ml6.a) {
                try {
                    if (ml6.b == null) {
                        ml6 ml6Var = new ml6();
                        try {
                            ml6.c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, ml6.class.getClassLoader());
                        } catch (Throwable unused) {
                        }
                        ml6.b = ml6Var;
                    }
                } finally {
                }
            }
        }
        editText.setEditableFactory(ml6.b);
    }
}
