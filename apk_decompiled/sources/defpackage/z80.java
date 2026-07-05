package defpackage;

import androidx.compose.ui.node.Owner;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.health.platform.client.proto.g;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.pvporbit.freetype.FreeTypeConstants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public final class z80 extends ts9 implements pz7 {
    public static final z80 G;
    public static final z80 H;
    public static final z80 I;
    public static final z80 J;
    public static final z80 K;
    public static final z80 L;
    public static final z80 M;
    public static final z80 N;
    public static final z80 O;
    public static final z80 P;
    public static final z80 Q;
    public static final z80 R;
    public static final z80 S;
    public static final z80 T;
    public static final z80 U;
    public static final z80 V;
    public static final z80 W;
    public static final z80 X;
    public static final z80 Y;
    public static final z80 Z;
    public static final z80 a0;
    public static final z80 b0;
    public static final z80 c0;
    public static final z80 d0;
    public static final z80 e0;
    public static final z80 f0;
    public static final z80 g0;
    public static final z80 h0;
    public static final z80 i0;
    public static final z80 j0;
    public final /* synthetic */ int F;

    static {
        int i = 2;
        G = new z80(i, 0);
        H = new z80(i, 1);
        I = new z80(i, 2);
        J = new z80(i, 3);
        K = new z80(i, 4);
        L = new z80(i, 5);
        M = new z80(i, 6);
        N = new z80(i, 7);
        O = new z80(i, 8);
        P = new z80(i, 9);
        Q = new z80(i, 10);
        R = new z80(i, 11);
        S = new z80(i, 12);
        T = new z80(i, 13);
        U = new z80(i, 14);
        V = new z80(i, 15);
        W = new z80(i, 16);
        X = new z80(i, 17);
        Y = new z80(i, 18);
        Z = new z80(i, 19);
        a0 = new z80(i, 20);
        b0 = new z80(i, 21);
        c0 = new z80(i, 22);
        d0 = new z80(i, 23);
        e0 = new z80(i, 24);
        f0 = new z80(i, 25);
        g0 = new z80(i, 26);
        h0 = new z80(i, 27);
        i0 = new z80(i, 28);
        j0 = new z80(i, 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z80(int i, int i2) {
        super(i);
        this.F = i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13, types: [hqb] */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9, types: [hqb] */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [wwb] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9, types: [wwb] */
    /* JADX WARN: Type inference failed for: r5v5 */
    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        String str;
        qz7 qz7Var;
        int i = this.F;
        int i2 = 1;
        iei ieiVar = iei.a;
        switch (i) {
            case 0:
                long j = ((g79) obj).a;
                long j2 = ((g79) obj2).a;
                l9e l9eVar = nzi.a;
                return kxk.K(MTTypesetterKt.kLineSkipLimitMultiplier, 400.0f, new g79(4294967297L), 1);
            case 1:
                zo6 zo6Var = (zo6) obj2;
                if (((zo6) obj) == zo6Var && zo6Var == zo6.G) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 2:
                ld4 ld4Var = (ld4) obj;
                int iIntValue = ((Number) obj2).intValue();
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    e18Var.T();
                }
                return ieiVar;
            case 3:
                ld4 ld4Var2 = (ld4) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                e18 e18Var2 = (e18) ld4Var2;
                if (!e18Var2.Q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    e18Var2.T();
                }
                return ieiVar;
            case 4:
                ((Number) obj2).intValue();
                ((av9) ((dd4) obj)).getClass();
                return ieiVar;
            case 5:
                ((av9) ((dd4) obj)).C0((o5b) obj2);
                return ieiVar;
            case 6:
                ((av9) ((dd4) obj)).D0((iqb) obj2);
                return ieiVar;
            case 7:
                qe4 qe4Var = (qe4) obj2;
                av9 av9Var = (av9) ((dd4) obj);
                av9Var.g0 = qe4Var;
                g5c g5cVar = av9Var.k0;
                umg umgVar = ve4.h;
                hyc hycVar = (hyc) qe4Var;
                hycVar.getClass();
                av9Var.z0((cz5) u00.I(hycVar, umgVar));
                hyc hycVar2 = (hyc) qe4Var;
                fu9 fu9Var = (fu9) u00.I(hycVar2, ve4.n);
                if (av9Var.e0 != fu9Var) {
                    av9Var.e0 = fu9Var;
                    av9Var.T();
                    av9 av9VarG = av9Var.G();
                    if (av9VarG != null) {
                        av9VarG.Q();
                    } else {
                        Owner owner = av9Var.S;
                        if (owner != null) {
                            ((AndroidComposeView) owner).invalidate();
                        }
                    }
                    av9Var.R();
                    for (hqb hqbVar = (hqb) g5cVar.K; hqbVar != null; hqbVar = hqbVar.J) {
                        hqbVar.f0();
                    }
                }
                av9Var.E0((ovi) u00.I(hycVar2, ve4.u));
                hqb hqbVar2 = (hqb) g5cVar.K;
                if ((hqbVar2.H & FreeTypeConstants.FT_LOAD_NO_AUTOHINT) != 0) {
                    while (hqbVar2 != null) {
                        if ((hqbVar2.G & FreeTypeConstants.FT_LOAD_NO_AUTOHINT) != 0) {
                            ?? J2 = hqbVar2;
                            ?? wwbVar = 0;
                            while (J2 != 0) {
                                if (J2 instanceof oe4) {
                                    hqb hqbVarX0 = ((oe4) J2).x0();
                                    if (hqbVarX0.R) {
                                        s5c.c(hqbVarX0);
                                    } else {
                                        hqbVarX0.N = true;
                                    }
                                } else if ((J2.G & FreeTypeConstants.FT_LOAD_NO_AUTOHINT) != 0 && (J2 instanceof qw5)) {
                                    hqb hqbVar3 = ((qw5) J2).T;
                                    int i3 = 0;
                                    J2 = J2;
                                    wwbVar = wwbVar;
                                    while (hqbVar3 != null) {
                                        if ((hqbVar3.G & FreeTypeConstants.FT_LOAD_NO_AUTOHINT) != 0) {
                                            i3++;
                                            wwbVar = wwbVar;
                                            if (i3 == 1) {
                                                J2 = hqbVar3;
                                            } else {
                                                if (wwbVar == 0) {
                                                    wwbVar = new wwb(0, new hqb[16]);
                                                }
                                                if (J2 != 0) {
                                                    wwbVar.b(J2);
                                                    J2 = 0;
                                                }
                                                wwbVar.b(hqbVar3);
                                            }
                                        }
                                        hqbVar3 = hqbVar3.J;
                                        J2 = J2;
                                        wwbVar = wwbVar;
                                    }
                                    if (i3 == 1) {
                                    }
                                }
                                J2 = yfd.j(wwbVar);
                            }
                        }
                        if ((hqbVar2.H & FreeTypeConstants.FT_LOAD_NO_AUTOHINT) != 0) {
                            hqbVar2 = hqbVar2.J;
                        }
                    }
                }
                return ieiVar;
            case 8:
                ((nma) obj2).E = new zu9(i2, (av9) obj);
                return ieiVar;
            case 9:
                l9e l9eVar2 = (l9e) obj;
                l9e l9eVar3 = (l9e) obj2;
                l9eVar2.getClass();
                l9eVar3.getClass();
                return Boolean.valueOf(new khc(l9eVar2.b, l9eVar2.d).a(Float.valueOf(fcc.g(l9eVar3.f()))));
            case 10:
                Collection collection = (List) obj;
                List list = (List) obj2;
                if (collection == null) {
                    collection = lm6.E;
                }
                return w44.a1(collection, list);
            case 11:
                return (b10) obj;
            case 12:
                List list2 = (List) obj;
                List list3 = (List) obj2;
                if (list2 == null) {
                    return list3;
                }
                ArrayList arrayList = new ArrayList(list2);
                arrayList.addAll(list3);
                return arrayList;
            case 13:
                return (ro4) obj;
            case 14:
                return (g20) obj;
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                return (iei) obj;
            case 16:
                return (iei) obj;
            case g.MAX_FIELD_NUMBER /* 17 */:
                throw new IllegalStateException("merge function called on unmergeable property IsDialog. A dialog should not be a child of a clickable/focusable node.");
            case g.AVG_FIELD_NUMBER /* 18 */:
                throw new IllegalStateException("merge function called on unmergeable property IsPopup. A popup should not be a child of a clickable/focusable node.");
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return (iei) obj;
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                throw new IllegalStateException("merge function called on unmergeable property PaneTitle.");
            case 21:
                vue vueVar = (vue) obj;
                int i4 = ((vue) obj2).a;
                return vueVar;
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return (e0g) obj;
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return (String) obj;
            case 24:
                List list4 = (List) obj;
                List list5 = (List) obj2;
                if (list4 == null) {
                    return list5;
                }
                ArrayList arrayList2 = new ArrayList(list4);
                arrayList2.addAll(list5);
                return arrayList2;
            case BuildConfig.VERSION_CODE /* 25 */:
                Float f = (Float) obj;
                ((Number) obj2).floatValue();
                return f;
            case 26:
                return (String) obj;
            case 27:
                Boolean bool = (Boolean) obj;
                ((Boolean) obj2).booleanValue();
                return bool;
            case 28:
                e5 e5Var = (e5) obj;
                e5 e5Var2 = (e5) obj2;
                if (e5Var == null || (str = e5Var.a) == null) {
                    str = e5Var2.a;
                }
                if (e5Var == null || (qz7Var = e5Var.b) == null) {
                    qz7Var = e5Var2.b;
                }
                return new e5(str, qz7Var);
            default:
                return obj == null ? obj2 : obj;
        }
    }
}
