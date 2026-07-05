package defpackage;

import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.b;
import com.anthropic.claude.mainactivity.AssistantOverlayActivity;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ay0 implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ jy0 F;
    public final /* synthetic */ String G;
    public final /* synthetic */ l45 H;
    public final /* synthetic */ v4g I;
    public final /* synthetic */ AssistantOverlayActivity J;

    public /* synthetic */ ay0(jy0 jy0Var, String str, l45 l45Var, v4g v4gVar, AssistantOverlayActivity assistantOverlayActivity, int i) {
        this.E = i;
        this.F = jy0Var;
        this.G = str;
        this.H = l45Var;
        this.I = v4gVar;
        this.J = assistantOverlayActivity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        lz1 lz1Var = jd4.a;
        final AssistantOverlayActivity assistantOverlayActivity = this.J;
        final v4g v4gVar = this.I;
        final l45 l45Var = this.H;
        jy0 jy0Var = this.F;
        Object[] objArr = 0;
        final int i2 = 1;
        switch (i) {
            case 0:
                ld4 ld4Var = (ld4) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i3 = AssistantOverlayActivity.d0;
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(1 & iIntValue, (iIntValue & 3) != 2)) {
                    e18Var.T();
                } else {
                    boolean zH = e18Var.h(jy0Var);
                    Object objN = e18Var.N();
                    if (zH || objN == lz1Var) {
                        objN = new ly0(jy0Var, null, 0);
                        e18Var.k0(objN);
                    }
                    fd9.i(e18Var, (pz7) objN, ieiVar);
                    FillElement fillElement = b.c;
                    boolean zH2 = e18Var.h(l45Var) | e18Var.f(v4gVar) | e18Var.h(assistantOverlayActivity);
                    Object objN2 = e18Var.N();
                    if (zH2 || objN2 == lz1Var) {
                        final Object[] objArr2 = objArr == true ? 1 : 0;
                        objN2 = new pz7() { // from class: by0
                            @Override // defpackage.pz7
                            public final Object invoke(Object obj3, Object obj4) {
                                int i4 = objArr2;
                                iei ieiVar2 = iei.a;
                                final AssistantOverlayActivity assistantOverlayActivity2 = assistantOverlayActivity;
                                v4g v4gVar2 = v4gVar;
                                l45 l45Var2 = l45Var;
                                ((Boolean) obj3).getClass();
                                int i5 = AssistantOverlayActivity.d0;
                                switch (i4) {
                                    case 0:
                                        final int i6 = 0;
                                        gb9.D(l45Var2, null, null, new my0(v4gVar2, null, 0), 3).D0(new bz7() { // from class: cy0
                                            @Override // defpackage.bz7
                                            public final Object invoke(Object obj5) {
                                                int i7 = i6;
                                                iei ieiVar3 = iei.a;
                                                AssistantOverlayActivity assistantOverlayActivity3 = assistantOverlayActivity2;
                                                int i8 = AssistantOverlayActivity.d0;
                                                switch (i7) {
                                                    case 0:
                                                        assistantOverlayActivity3.o();
                                                        break;
                                                    default:
                                                        assistantOverlayActivity3.o();
                                                        break;
                                                }
                                                return ieiVar3;
                                            }
                                        });
                                        break;
                                    default:
                                        final int i7 = 1;
                                        gb9.D(l45Var2, null, null, new my0(v4gVar2, null, 1), 3).D0(new bz7() { // from class: cy0
                                            @Override // defpackage.bz7
                                            public final Object invoke(Object obj5) {
                                                int i72 = i7;
                                                iei ieiVar3 = iei.a;
                                                AssistantOverlayActivity assistantOverlayActivity3 = assistantOverlayActivity2;
                                                int i8 = AssistantOverlayActivity.d0;
                                                switch (i72) {
                                                    case 0:
                                                        assistantOverlayActivity3.o();
                                                        break;
                                                    default:
                                                        assistantOverlayActivity3.o();
                                                        break;
                                                }
                                                return ieiVar3;
                                            }
                                        });
                                        break;
                                }
                                return ieiVar2;
                            }
                        };
                        e18Var.k0(objN2);
                    }
                    com.anthropic.claude.bell.b.b(this.G, null, null, null, null, false, (pz7) objN2, fillElement, true, o1j.F, null, null, e18Var, 918777264, 3072);
                }
                break;
            default:
                ld4 ld4Var2 = (ld4) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                int i4 = AssistantOverlayActivity.d0;
                e18 e18Var2 = (e18) ld4Var2;
                if (!e18Var2.Q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    e18Var2.T();
                } else {
                    boolean zH3 = e18Var2.h(jy0Var);
                    Object objN3 = e18Var2.N();
                    if (zH3 || objN3 == lz1Var) {
                        objN3 = new ly0(jy0Var, null, 1);
                        e18Var2.k0(objN3);
                    }
                    fd9.i(e18Var2, (pz7) objN3, ieiVar);
                    FillElement fillElement2 = b.c;
                    boolean zH4 = e18Var2.h(l45Var) | e18Var2.f(v4gVar) | e18Var2.h(assistantOverlayActivity);
                    Object objN4 = e18Var2.N();
                    if (zH4 || objN4 == lz1Var) {
                        objN4 = new pz7() { // from class: by0
                            @Override // defpackage.pz7
                            public final Object invoke(Object obj3, Object obj4) {
                                int i42 = i2;
                                iei ieiVar2 = iei.a;
                                final AssistantOverlayActivity assistantOverlayActivity2 = assistantOverlayActivity;
                                v4g v4gVar2 = v4gVar;
                                l45 l45Var2 = l45Var;
                                ((Boolean) obj3).getClass();
                                int i5 = AssistantOverlayActivity.d0;
                                switch (i42) {
                                    case 0:
                                        final int i6 = 0;
                                        gb9.D(l45Var2, null, null, new my0(v4gVar2, null, 0), 3).D0(new bz7() { // from class: cy0
                                            @Override // defpackage.bz7
                                            public final Object invoke(Object obj5) {
                                                int i72 = i6;
                                                iei ieiVar3 = iei.a;
                                                AssistantOverlayActivity assistantOverlayActivity3 = assistantOverlayActivity2;
                                                int i8 = AssistantOverlayActivity.d0;
                                                switch (i72) {
                                                    case 0:
                                                        assistantOverlayActivity3.o();
                                                        break;
                                                    default:
                                                        assistantOverlayActivity3.o();
                                                        break;
                                                }
                                                return ieiVar3;
                                            }
                                        });
                                        break;
                                    default:
                                        final int i7 = 1;
                                        gb9.D(l45Var2, null, null, new my0(v4gVar2, null, 1), 3).D0(new bz7() { // from class: cy0
                                            @Override // defpackage.bz7
                                            public final Object invoke(Object obj5) {
                                                int i72 = i7;
                                                iei ieiVar3 = iei.a;
                                                AssistantOverlayActivity assistantOverlayActivity3 = assistantOverlayActivity2;
                                                int i8 = AssistantOverlayActivity.d0;
                                                switch (i72) {
                                                    case 0:
                                                        assistantOverlayActivity3.o();
                                                        break;
                                                    default:
                                                        assistantOverlayActivity3.o();
                                                        break;
                                                }
                                                return ieiVar3;
                                            }
                                        });
                                        break;
                                }
                                return ieiVar2;
                            }
                        };
                        e18Var2.k0(objN4);
                    }
                    com.anthropic.claude.bell.b.b(this.G, null, null, null, null, false, (pz7) objN4, fillElement2, true, o1j.F, null, null, e18Var2, 918777264, 3072);
                }
                break;
        }
        return ieiVar;
    }
}
