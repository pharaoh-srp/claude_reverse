package defpackage;

import android.content.res.Resources;
import android.os.Build;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.LocaleSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.ScaleXSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.SubscriptSpan;
import androidx.health.platform.client.proto.g;
import com.agog.mathdisplay.render.MTTypesetterKt;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public final class c0 extends ts9 implements pz7 {
    public static final c0 G;
    public static final c0 H;
    public static final c0 I;
    public static final c0 J;
    public static final c0 K;
    public static final c0 L;
    public static final c0 M;
    public static final c0 N;
    public static final c0 O;
    public static final c0 P;
    public static final c0 Q;
    public static final c0 R;
    public static final c0 S;
    public static final c0 T;
    public static final c0 U;
    public static final c0 V;
    public static final c0 W;
    public static final c0 X;
    public static final c0 Y;
    public static final c0 Z;
    public static final c0 a0;
    public static final c0 b0;
    public static final c0 c0;
    public static final c0 d0;
    public static final c0 e0;
    public static final c0 f0;
    public static final c0 g0;
    public static final c0 h0;
    public static final c0 i0;
    public static final c0 j0;
    public final /* synthetic */ int F;

    static {
        int i = 2;
        G = new c0(i, 0);
        H = new c0(i, 1);
        I = new c0(i, 2);
        J = new c0(i, 3);
        K = new c0(i, 4);
        L = new c0(i, 5);
        M = new c0(i, 6);
        N = new c0(i, 7);
        O = new c0(i, 8);
        P = new c0(i, 9);
        Q = new c0(i, 10);
        R = new c0(i, 11);
        S = new c0(i, 12);
        T = new c0(i, 13);
        U = new c0(i, 14);
        V = new c0(i, 15);
        W = new c0(i, 16);
        X = new c0(i, 17);
        Y = new c0(i, 18);
        Z = new c0(i, 19);
        a0 = new c0(i, 20);
        b0 = new c0(i, 21);
        c0 = new c0(i, 22);
        d0 = new c0(i, 23);
        e0 = new c0(i, 24);
        f0 = new c0(i, 25);
        g0 = new c0(i, 26);
        h0 = new c0(i, 27);
        i0 = new c0(i, 28);
        j0 = new c0(i, 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c0(int i, int i2) {
        super(i);
        this.F = i2;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int fontWeightAdjustment;
        int i = this.F;
        int i2 = 0;
        z = false;
        boolean z = false;
        iei ieiVar = iei.a;
        switch (i) {
            case 0:
                b0 b0Var = (b0) obj;
                hab habVar = (hab) obj2;
                b0Var.getClass();
                habVar.getClass();
                return b0Var.c.get(habVar);
            case 1:
                b0 b0Var2 = (b0) obj;
                hab habVar2 = (hab) obj2;
                b0Var2.getClass();
                habVar2.getClass();
                return b0Var2.b.get(habVar2);
            case 2:
                uj5.d((av9) obj).setResetBlock((bz7) obj2);
                return ieiVar;
            case 3:
                uj5.d((av9) obj).setUpdateBlock((bz7) obj2);
                return ieiVar;
            case 4:
                uj5.d((av9) obj).setReleaseBlock((bz7) obj2);
                return ieiVar;
            case 5:
                uj5.d((av9) obj).setUpdateBlock((bz7) obj2);
                return ieiVar;
            case 6:
                uj5.d((av9) obj).setReleaseBlock((bz7) obj2);
                return ieiVar;
            case 7:
                uj5.d((av9) obj).setModifier((iqb) obj2);
                return ieiVar;
            case 8:
                uj5.d((av9) obj).setDensity((cz5) obj2);
                return ieiVar;
            case 9:
                uj5.d((av9) obj).setLifecycleOwner((m4a) obj2);
                return ieiVar;
            case 10:
                uj5.d((av9) obj).setSavedStateRegistryOwner((u5f) obj2);
                return ieiVar;
            case 11:
                nxi nxiVarD = uj5.d((av9) obj);
                int iOrdinal = ((fu9) obj2).ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal != 1) {
                        wg6.i();
                        return null;
                    }
                    i2 = 1;
                }
                nxiVarD.setLayoutDirection(i2);
                return ieiVar;
            case 12:
                String str = (String) obj;
                gqb gqbVar = (gqb) obj2;
                if (str.length() == 0) {
                    return gqbVar.toString();
                }
                return str + ", " + gqbVar;
            case 13:
                ld4 ld4Var = (ld4) obj;
                int iIntValue = ((Number) obj2).intValue();
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    e18Var.T();
                }
                return ieiVar;
            case 14:
                ld4 ld4Var2 = (ld4) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                e18 e18Var2 = (e18) ld4Var2;
                if (!e18Var2.Q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    e18Var2.T();
                }
                return ieiVar;
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                return Boolean.FALSE;
            case 16:
                return Integer.valueOf(((v57) obj).a.compareTo(((v57) obj2).a));
            case g.MAX_FIELD_NUMBER /* 17 */:
                return Integer.valueOf(((l67) obj).a.compareTo(((l67) obj2).a));
            case g.AVG_FIELD_NUMBER /* 18 */:
                l9e l9eVar = (l9e) obj;
                l9e l9eVar2 = (l9e) obj2;
                l9eVar.getClass();
                l9eVar2.getClass();
                float f = l9eVar.a;
                float f2 = l9eVar.c;
                float f3 = fcc.f(l9eVar2.f());
                if (f3 >= f && f3 < f2) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                wjf wjfVar = (wjf) obj2;
                Object objValueOf = Float.valueOf(MTTypesetterKt.kLineSkipLimitMultiplier);
                qjf qjfVar = ((wjf) obj).d;
                dkf dkfVar = akf.u;
                Object objG = qjfVar.E.g(dkfVar);
                if (objG == null) {
                    objG = objValueOf;
                }
                float fFloatValue = ((Number) objG).floatValue();
                Object objG2 = wjfVar.d.E.g(dkfVar);
                if (objG2 != null) {
                    objValueOf = objG2;
                }
                return Integer.valueOf(Float.compare(fFloatValue, ((Number) objValueOf).floatValue()));
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                mwb mwbVar = (mwb) obj;
                AbsoluteSizeSpan absoluteSizeSpan = (AbsoluteSizeSpan) obj2;
                mwbVar.getClass();
                absoluteSizeSpan.getClass();
                mwbVar.c = eve.L((absoluteSizeSpan.getDip() ? absoluteSizeSpan.getSize() * Resources.getSystem().getDisplayMetrics().density : absoluteSizeSpan.getSize()) / Resources.getSystem().getDisplayMetrics().scaledDensity, 4294967296L);
                return ieiVar;
            case 21:
                mwb mwbVar2 = (mwb) obj;
                BackgroundColorSpan backgroundColorSpan = (BackgroundColorSpan) obj2;
                mwbVar2.getClass();
                backgroundColorSpan.getClass();
                mwbVar2.i = d4c.m(backgroundColorSpan.getBackgroundColor());
                return ieiVar;
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                mwb mwbVar3 = (mwb) obj;
                ForegroundColorSpan foregroundColorSpan = (ForegroundColorSpan) obj2;
                mwbVar3.getClass();
                foregroundColorSpan.getClass();
                mwbVar3.b = d4c.m(foregroundColorSpan.getForegroundColor());
                return ieiVar;
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                mwb mwbVar4 = (mwb) obj;
                LocaleSpan localeSpan = (LocaleSpan) obj2;
                mwbVar4.getClass();
                localeSpan.getClass();
                String languageTags = localeSpan.getLocales().toLanguageTags();
                languageTags.getClass();
                mwbVar4.l = new gea(languageTags);
                return ieiVar;
            case 24:
                mwb mwbVar5 = (mwb) obj;
                RelativeSizeSpan relativeSizeSpan = (RelativeSizeSpan) obj2;
                mwbVar5.getClass();
                relativeSizeSpan.getClass();
                mwbVar5.c = eve.L(relativeSizeSpan.getSizeChange(), 8589934592L);
                return ieiVar;
            case BuildConfig.VERSION_CODE /* 25 */:
                mwb mwbVar6 = (mwb) obj;
                ScaleXSpan scaleXSpan = (ScaleXSpan) obj2;
                mwbVar6.getClass();
                scaleXSpan.getClass();
                fjh fjhVar = mwbVar6.k;
                mwbVar6.k = fjhVar != null ? new fjh(scaleXSpan.getScaleX() * fjhVar.a, fjhVar.b) : new fjh(scaleXSpan.getScaleX(), MTTypesetterKt.kLineSkipLimitMultiplier);
                return ieiVar;
            case 26:
                mwb mwbVar7 = (mwb) obj;
                if (obj2 != null) {
                    throw new ClassCastException();
                }
                mwbVar7.getClass();
                throw null;
            case 27:
                mwb mwbVar8 = (mwb) obj;
                mwbVar8.getClass();
                ((StrikethroughSpan) obj2).getClass();
                qeh qehVar = mwbVar8.j;
                if (qehVar == null) {
                    qehVar = qeh.b;
                }
                mwbVar8.j = new qeh(qehVar.a | 2);
                return ieiVar;
            case 28:
                mwb mwbVar9 = (mwb) obj;
                StyleSpan styleSpan = (StyleSpan) obj2;
                mwbVar9.getClass();
                styleSpan.getClass();
                int style = styleSpan.getStyle();
                if (style == 0) {
                    mwbVar9.e = new wu7(0);
                } else if (style == 2 || style == 3) {
                    mwbVar9.e = new wu7(1);
                }
                dv7 dv7Var = mwbVar9.d;
                int style2 = styleSpan.getStyle();
                if (style2 == 0) {
                    dv7Var = dv7.J;
                } else if (style2 == 1 || style2 == 3) {
                    dv7Var = dv7.M;
                }
                if (Build.VERSION.SDK_INT >= 33 && 1 <= (fontWeightAdjustment = styleSpan.getFontWeightAdjustment()) && fontWeightAdjustment < 1001) {
                    dv7Var = new dv7(Math.max(Math.min(styleSpan.getFontWeightAdjustment() + (dv7Var != null ? dv7Var.E : dv7.J.E), 1000), 1));
                }
                mwbVar9.d = dv7Var;
                return ieiVar;
            default:
                mwb mwbVar10 = (mwb) obj;
                mwbVar10.getClass();
                ((SubscriptSpan) obj2).getClass();
                mwbVar10.h = new ue1(-0.5f);
                return ieiVar;
        }
    }
}
