package defpackage;

import com.anthropic.claude.analytics.events.ConwayEvents$ConwayScreenViewed;
import com.anthropic.claude.analytics.events.GroveEvents$GrovePolicyViewed;
import com.anthropic.claude.conway.f;

/* JADX INFO: loaded from: classes2.dex */
public final class jp extends xzg implements bz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ Object F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jp(Object obj, tp4 tp4Var, int i) {
        super(1, tp4Var);
        this.E = i;
        this.F = obj;
    }

    @Override // defpackage.vd1
    public final tp4 create(tp4 tp4Var) {
        int i = this.E;
        Object obj = this.F;
        switch (i) {
            case 0:
                return new jp((ep) obj, tp4Var, 0);
            case 1:
                return new jp((a80) obj, tp4Var, 1);
            case 2:
                return new jp((t4g) obj, tp4Var, 2);
            case 3:
                return new jp((db3) obj, tp4Var, 3);
            case 4:
                return new jp((wg4) obj, tp4Var, 4);
            case 5:
                return new jp((f) obj, tp4Var, 5);
            case 6:
                return new jp((ub8) obj, tp4Var, 6);
            case 7:
                return new jp((c9c) obj, tp4Var, 7);
            case 8:
                return new jp((w1g) obj, tp4Var, 8);
            case 9:
                return new jp((s2g) obj, tp4Var, 9);
            default:
                return new jp((l5j) obj, tp4Var, 10);
        }
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        tp4 tp4Var = (tp4) obj;
        switch (i) {
            case 0:
                ((jp) create(tp4Var)).invokeSuspend(ieiVar);
                break;
            case 1:
                ((jp) create(tp4Var)).invokeSuspend(ieiVar);
                break;
            case 2:
                ((jp) create(tp4Var)).invokeSuspend(ieiVar);
                break;
            case 3:
                ((jp) create(tp4Var)).invokeSuspend(ieiVar);
                break;
            case 4:
                ((jp) create(tp4Var)).invokeSuspend(ieiVar);
                break;
            case 5:
                ((jp) create(tp4Var)).invokeSuspend(ieiVar);
                break;
            case 6:
                ((jp) create(tp4Var)).invokeSuspend(ieiVar);
                break;
            case 7:
                ((jp) create(tp4Var)).invokeSuspend(ieiVar);
                break;
            case 8:
                ((jp) create(tp4Var)).invokeSuspend(ieiVar);
                break;
            case 9:
                ((jp) create(tp4Var)).invokeSuspend(ieiVar);
                break;
            default:
                ((jp) create(tp4Var)).invokeSuspend(ieiVar);
                break;
        }
        return ieiVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        int i = this.E;
        tp4 tp4Var = null;
        int i2 = 3;
        iei ieiVar = iei.a;
        Object obj2 = this.F;
        switch (i) {
            case 0:
                sf5.h0(obj);
                ep epVar = (ep) obj2;
                gb9.D(epVar.a, null, null, new yo(epVar, tp4Var, i2), 3);
                break;
            case 1:
                sf5.h0(obj);
                a80.a((a80) obj2);
                break;
            case 2:
                sf5.h0(obj);
                ((t4g) obj2).c();
                break;
            case 3:
                sf5.h0(obj);
                db3 db3Var = (db3) obj2;
                db3Var.i.a(sx.SHARE_CHAT);
                if (!((Boolean) db3Var.l.getValue()).booleanValue()) {
                    db3Var.S(true);
                    gb9.D(db3Var.a, null, null, new nn1(db3Var, tp4Var, 28), 3);
                }
                break;
            case 4:
                sf5.h0(obj);
                wg4 wg4Var = (wg4) obj2;
                gb9.D(wg4Var.a, null, null, new cj(wg4Var, tp4Var, 15), 3);
                break;
            case 5:
                sf5.h0(obj);
                f fVar = (f) obj2;
                qi3 qi3Var = fVar.l;
                qi3Var.a(sx.CONWAY);
                qi3Var.e(new ConwayEvents$ConwayScreenViewed(fVar.f.e), ConwayEvents$ConwayScreenViewed.Companion.serializer());
                f.k0(fVar, false, false, 7);
                break;
            case 6:
                sf5.h0(obj);
                ub8 ub8Var = (ub8) obj2;
                ub8Var.f.e(new GroveEvents$GrovePolicyViewed(ub8Var.b, ub8Var.P()), GroveEvents$GrovePolicyViewed.Companion.serializer());
                gb9.D(ub8Var.a, null, null, new cj(ub8Var, tp4Var, 27), 3);
                break;
            case 7:
                sf5.h0(obj);
                ((c9c) obj2).b.a(sx.NOTIFICATION_SETTINGS);
                break;
            case 8:
                sf5.h0(obj);
                ((w1g) obj2).g.a(sx.VIEW_SHARED_CHAT);
                break;
            case 9:
                sf5.h0(obj);
                ((s2g) obj2).g.a(sx.SHARED_LINKS_SETTINGS);
                break;
            default:
                sf5.h0(obj);
                ((l5j) obj2).e.a(sx.VOICE_SETTINGS);
                break;
        }
        return ieiVar;
    }
}
