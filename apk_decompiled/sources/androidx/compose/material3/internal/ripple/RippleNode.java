package androidx.compose.material3.internal.ripple;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.material3.b;
import androidx.compose.material3.c;
import androidx.compose.material3.internal.ripple.RippleNode;
import com.agog.mathdisplay.render.MTTypesetterKt;
import defpackage.a80;
import defpackage.bue;
import defpackage.csg;
import defpackage.cv9;
import defpackage.cz5;
import defpackage.d54;
import defpackage.d7;
import defpackage.eeg;
import defpackage.efe;
import defpackage.fb2;
import defpackage.fcc;
import defpackage.fj0;
import defpackage.gb9;
import defpackage.grc;
import defpackage.hqb;
import defpackage.ib2;
import defpackage.iue;
import defpackage.jz;
import defpackage.k54;
import defpackage.knk;
import defpackage.l50;
import defpackage.lrb;
import defpackage.lsc;
import defpackage.mdj;
import defpackage.mpk;
import defpackage.mr9;
import defpackage.mwa;
import defpackage.ndd;
import defpackage.odd;
import defpackage.oe4;
import defpackage.oue;
import defpackage.pdd;
import defpackage.pue;
import defpackage.qdd;
import defpackage.qvb;
import defpackage.rrb;
import defpackage.rsk;
import defpackage.v79;
import defpackage.vd6;
import defpackage.w00;
import defpackage.w79;
import defpackage.wd6;
import defpackage.xd6;
import defpackage.yb5;
import defpackage.yfd;
import defpackage.yt9;
import defpackage.zh4;
import defpackage.zte;
import defpackage.zy7;
import java.util.ArrayList;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b!\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001\bR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Landroidx/compose/material3/internal/ripple/RippleNode;", "Lhqb;", "Loe4;", "Lvd6;", "Lyt9;", "Lk54;", "color", "Lk54;", "lrb", "material3"}, k = 1, mv = {2, 1, 0}, xi = mdj.f)
public abstract class RippleNode extends hqb implements oe4, vd6, yt9 {
    public final w79 S;
    public final boolean T;
    public final float U;
    public final b V;
    public float W;
    public boolean Y;
    public v79 c0;
    private final k54 color;
    public lrb f0;
    public long X = 0;
    public final qvb Z = new qvb();
    public final a80 a0 = zh4.a(MTTypesetterKt.kLineSkipLimitMultiplier);
    public final ArrayList b0 = new ArrayList();
    public final a80 d0 = zh4.a(MTTypesetterKt.kLineSkipLimitMultiplier);
    public final lsc e0 = mpk.P(Boolean.FALSE);

    public RippleNode(w79 w79Var, boolean z, float f, c cVar, b bVar) {
        this.S = w79Var;
        this.T = z;
        this.U = f;
        this.color = cVar;
        this.V = bVar;
    }

    @Override // defpackage.vd6
    public final void I0(cv9 cv9Var) throws Throwable {
        fj0 fj0Var;
        long j;
        cv9 cv9Var2 = cv9Var;
        cv9Var2.a();
        l50 l50Var = (l50) this;
        ib2 ib2Var = cv9Var2.E;
        fb2 fb2VarP = ib2Var.F.p();
        bue bueVar = l50Var.h0;
        if (bueVar != null) {
            bueVar.e(l50Var.X, mwa.L(l50Var.W), l50Var.color.a(), ((pue) l50Var.V.a()).d() instanceof oue ? 0.1f : 0.0f);
            bueVar.draw(jz.b(fb2VarP));
        }
        float fFloatValue = ((Number) this.a0.e()).floatValue();
        if (fFloatValue > MTTypesetterKt.kLineSkipLimitMultiplier) {
            long jB = d54.b(fFloatValue, this.color.a());
            if (this.T) {
                float fIntBitsToFloat = Float.intBitsToFloat((int) (ib2Var.g() >> 32));
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (ib2Var.g() & 4294967295L));
                fj0 fj0Var2 = ib2Var.F;
                long jW = fj0Var2.w();
                fj0Var2.p().g();
                try {
                    ((efe) fj0Var2.E).k(MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, fIntBitsToFloat, fIntBitsToFloat2, 1);
                    try {
                        fj0Var = fj0Var2;
                        j = jW;
                        try {
                            xd6.C0(cv9Var2, jB, this.W, 0L, null, 124);
                            grc.y(fj0Var, j);
                            cv9Var2 = cv9Var;
                        } catch (Throwable th) {
                            th = th;
                            grc.y(fj0Var, j);
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        j = jW;
                        fj0Var = fj0Var2;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    fj0Var = fj0Var2;
                    j = jW;
                }
            } else {
                cv9Var2 = cv9Var;
                xd6.C0(cv9Var2, jB, this.W, 0L, null, 124);
            }
        }
        if (((Number) this.d0.e()).floatValue() > MTTypesetterKt.kLineSkipLimitMultiplier) {
            lrb lrbVar = this.f0;
            if (lrbVar == null) {
                lrbVar = new lrb(this);
            }
            this.f0 = lrbVar;
            rsk rskVarB = ((pue) this.V.a()).b();
            final iue iueVar = rskVarB instanceof iue ? (iue) rskVarB : null;
            if (iueVar == null) {
                return;
            }
            knk knkVarA = iueVar.x().a(ib2Var.g(), cv9Var2.getLayoutDirection(), cv9Var2);
            lrb lrbVar2 = this.f0;
            lrbVar2.getClass();
            final int i = 0;
            zy7 zy7Var = new zy7(iueVar, this, i) { // from class: fue
                public final /* synthetic */ int E;
                public final /* synthetic */ RippleNode F;

                {
                    this.E = i;
                    this.F = this;
                }

                @Override // defpackage.zy7
                public final Object a() {
                    int i2 = this.E;
                    RippleNode rippleNode = this.F;
                    switch (i2) {
                        case 0:
                            return new va6(((Number) rippleNode.d0.e()).floatValue() * 3.0f);
                        case 1:
                            return new va6(((Number) rippleNode.d0.e()).floatValue() * 1.0f);
                        case 2:
                            return new va6(((Number) rippleNode.d0.e()).floatValue() * 2.0f);
                        default:
                            return new va6(((Number) rippleNode.d0.e()).floatValue() * MTTypesetterKt.kLineSkipLimitMultiplier);
                    }
                }
            };
            final int i2 = 1;
            lrbVar2.s(cv9Var, zy7Var, new zy7(iueVar, this, i2) { // from class: fue
                public final /* synthetic */ int E;
                public final /* synthetic */ RippleNode F;

                {
                    this.E = i2;
                    this.F = this;
                }

                @Override // defpackage.zy7
                public final Object a() {
                    int i22 = this.E;
                    RippleNode rippleNode = this.F;
                    switch (i22) {
                        case 0:
                            return new va6(((Number) rippleNode.d0.e()).floatValue() * 3.0f);
                        case 1:
                            return new va6(((Number) rippleNode.d0.e()).floatValue() * 1.0f);
                        case 2:
                            return new va6(((Number) rippleNode.d0.e()).floatValue() * 2.0f);
                        default:
                            return new va6(((Number) rippleNode.d0.e()).floatValue() * MTTypesetterKt.kLineSkipLimitMultiplier);
                    }
                }
            }, new eeg(((c) iueVar.v()).a()), knkVarA);
            lrb lrbVar3 = this.f0;
            lrbVar3.getClass();
            final int i3 = 2;
            final int i4 = 3;
            lrbVar3.s(cv9Var, new zy7(iueVar, this, i3) { // from class: fue
                public final /* synthetic */ int E;
                public final /* synthetic */ RippleNode F;

                {
                    this.E = i3;
                    this.F = this;
                }

                @Override // defpackage.zy7
                public final Object a() {
                    int i22 = this.E;
                    RippleNode rippleNode = this.F;
                    switch (i22) {
                        case 0:
                            return new va6(((Number) rippleNode.d0.e()).floatValue() * 3.0f);
                        case 1:
                            return new va6(((Number) rippleNode.d0.e()).floatValue() * 1.0f);
                        case 2:
                            return new va6(((Number) rippleNode.d0.e()).floatValue() * 2.0f);
                        default:
                            return new va6(((Number) rippleNode.d0.e()).floatValue() * MTTypesetterKt.kLineSkipLimitMultiplier);
                    }
                }
            }, new zy7(iueVar, this, i4) { // from class: fue
                public final /* synthetic */ int E;
                public final /* synthetic */ RippleNode F;

                {
                    this.E = i4;
                    this.F = this;
                }

                @Override // defpackage.zy7
                public final Object a() {
                    int i22 = this.E;
                    RippleNode rippleNode = this.F;
                    switch (i22) {
                        case 0:
                            return new va6(((Number) rippleNode.d0.e()).floatValue() * 3.0f);
                        case 1:
                            return new va6(((Number) rippleNode.d0.e()).floatValue() * 1.0f);
                        case 2:
                            return new va6(((Number) rippleNode.d0.e()).floatValue() * 2.0f);
                        default:
                            return new va6(((Number) rippleNode.d0.e()).floatValue() * MTTypesetterKt.kLineSkipLimitMultiplier);
                    }
                }
            }, new eeg(((c) iueVar.w()).a()), knkVarA);
        }
    }

    @Override // defpackage.yt9, defpackage.s5b
    public final void c(long j) {
        float fQ0;
        this.Y = true;
        cz5 cz5Var = yfd.W(this).d0;
        this.X = csg.T(j);
        float f = this.U;
        if (Float.isNaN(f)) {
            long j2 = this.X;
            float fIntBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32));
            fQ0 = fcc.d((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32)) / 2.0f;
            if (this.T) {
                fQ0 += cz5Var.q0(10.0f);
            }
        } else {
            fQ0 = cz5Var.q0(f);
        }
        this.W = fQ0;
        qvb qvbVar = this.Z;
        Object[] objArr = qvbVar.a;
        int i = qvbVar.b;
        for (int i2 = 0; i2 < i; i2++) {
            p1((qdd) objArr[i2]);
        }
        qvbVar.d();
    }

    @Override // defpackage.hqb
    public final boolean e1() {
        return false;
    }

    @Override // defpackage.hqb
    public final void h1() {
        gb9.D(d1(), null, null, new rrb(this, null, 3), 3);
    }

    public final void p1(qdd qddVar) {
        bue bueVar;
        if (!(qddVar instanceof odd)) {
            if (qddVar instanceof pdd) {
                bue bueVar2 = ((l50) this).h0;
                if (bueVar2 != null) {
                    bueVar2.d();
                    return;
                }
                return;
            }
            if (!(qddVar instanceof ndd) || (bueVar = ((l50) this).h0) == null) {
                return;
            }
            bueVar.d();
            return;
        }
        odd oddVar = (odd) qddVar;
        long j = this.X;
        float f = this.W;
        l50 l50Var = (l50) this;
        zte zteVar = l50Var.g0;
        if (zteVar == null) {
            Object obj = (View) yb5.o(l50Var, w00.f);
            while (!(obj instanceof ViewGroup)) {
                ViewParent parent = ((View) obj).getParent();
                if (!(parent instanceof View)) {
                    mr9.q(grc.t(obj, "Couldn't find a valid parent for ", ". Are you overriding LocalView and providing a View that is not attached to the view hierarchy?"));
                    return;
                }
                obj = parent;
            }
            ViewGroup viewGroup = (ViewGroup) obj;
            int childCount = viewGroup.getChildCount();
            int i = 0;
            while (true) {
                if (i >= childCount) {
                    zte zteVar2 = new zte(viewGroup.getContext());
                    viewGroup.addView(zteVar2);
                    zteVar = zteVar2;
                    break;
                } else {
                    View childAt = viewGroup.getChildAt(i);
                    if (childAt instanceof zte) {
                        zteVar = (zte) childAt;
                        break;
                    }
                    i++;
                }
            }
            l50Var.g0 = zteVar;
        }
        bue bueVarB = zteVar.b(l50Var);
        bueVarB.b(oddVar, l50Var.T, j, mwa.L(f), l50Var.color.a(), ((pue) l50Var.V.a()).d() instanceof oue ? 0.1f : MTTypesetterKt.kLineSkipLimitMultiplier, new d7(3, l50Var));
        l50Var.h0 = bueVarB;
        wd6.t0(l50Var);
    }
}
