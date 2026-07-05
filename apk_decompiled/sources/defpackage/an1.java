package defpackage;

import com.anthropic.claude.analytics.events.VoiceEvents$VoiceTurnOutcome;
import com.anthropic.claude.bell.api.BellApiClientMessage;

/* JADX INFO: loaded from: classes2.dex */
public final class an1 extends xzg implements pz7 {
    public int E;
    public final /* synthetic */ tn1 F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public an1(tn1 tn1Var, tp4 tp4Var) {
        super(2, tp4Var);
        this.F = tn1Var;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        return new an1(this.F, tp4Var);
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        return ((an1) create((l45) obj, (tp4) obj2)).invokeSuspend(iei.a);
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        m45 m45Var = m45.E;
        int i = this.E;
        if (i == 0) {
            sf5.h0(obj);
            x51 x51Var = this.F.t;
            this.E = 1;
            if (x51Var.c(this) == m45Var) {
                return m45Var;
            }
        } else {
            if (i != 1) {
                sz6.j("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            sf5.h0(obj);
        }
        if (this.F.q().d) {
            return iei.a;
        }
        tn1 tn1Var = this.F;
        cp3 cp3Var = tn1Var.C;
        int i2 = tn1Var.t.h;
        synchronized (cp3Var) {
            Integer num = (Integer) cp3Var.f;
            if (num != null) {
                int iIntValue = num.intValue();
                if (!cp3Var.d) {
                    int i3 = i2 - iIntValue;
                    if (i3 < 0) {
                        i3 = 0;
                    }
                    cp3Var.a += i3;
                    cp3Var.b = i3;
                    cp3Var.f = Integer.valueOf(i2);
                    cp3Var.d = true;
                }
            }
        }
        this.F.s.b(BellApiClientMessage.PlaybackComplete.INSTANCE);
        tn1 tn1Var2 = this.F;
        synchronized (tn1Var2.H) {
            no1 no1VarQ = tn1Var2.q();
            no1VarQ.getClass();
            tn1Var2.G.setValue(no1.a(no1VarQ, true, false, false, false, false, false, false, false, false, false, 1000));
        }
        this.F.x.c();
        this.F.v.a(false);
        if (this.F.g.c()) {
            this.F.L(true);
        }
        this.F.R(VoiceEvents$VoiceTurnOutcome.COMPLETED);
        return iei.a;
    }
}
