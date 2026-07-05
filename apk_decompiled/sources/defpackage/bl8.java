package defpackage;

import com.anthropic.claude.analytics.health.HealthMetricOutcome;
import com.anthropic.claude.analytics.health.HealthMetricReport;
import com.anthropic.claude.api.events.EventLoggingRequest;
import com.anthropic.claude.api.events.HealthMetricEventConfig;
import com.anthropic.claude.api.events.HealthMetricEventData;
import java.util.UUID;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes2.dex */
public final class bl8 extends xzg implements pz7 {
    public int E;
    public /* synthetic */ Object F;
    public final /* synthetic */ HealthMetricReport G;
    public final /* synthetic */ dl8 H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bl8(HealthMetricReport healthMetricReport, dl8 dl8Var, tp4 tp4Var) {
        super(2, tp4Var);
        this.G = healthMetricReport;
        this.H = dl8Var;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        bl8 bl8Var = new bl8(this.G, this.H, tp4Var);
        bl8Var.F = obj;
        return bl8Var;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        return ((bl8) create((l45) obj, (tp4) obj2)).invokeSuspend(iei.a);
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) throws Throwable {
        HealthMetricReport healthMetricReport = this.G;
        l45 l45Var = (l45) this.F;
        int i = this.E;
        iei ieiVar = iei.a;
        dl8 dl8Var = this.H;
        try {
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            try {
                dl8Var.P.invoke("Health-metric event queueing failed", e2);
            } catch (Throwable unused) {
            }
        }
        if (i != 0) {
            if (i == 1) {
                sf5.h0(obj);
                return ieiVar;
            }
            sz6.j("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        sf5.h0(obj);
        String stringValue = healthMetricReport.getAction().getStringValue();
        HealthMetricEventConfig healthMetricEventConfig = (HealthMetricEventConfig) dl8Var.K.a();
        if (healthMetricEventConfig != null && healthMetricEventConfig.permits(stringValue)) {
            String string = UUID.randomUUID().toString();
            string.getClass();
            c69 c69VarC = dl8Var.O.c();
            String strG1 = bsg.g1(stringValue, '.');
            String content = ch9.j(dl8Var.E.c(healthMetricReport.getOutcome(), HealthMetricOutcome.Companion.serializer())).getContent();
            String error_type = healthMetricReport.getError_type();
            ide ideVar = dl8.T;
            EventLoggingRequest.HealthMetric healthMetric = new EventLoggingRequest.HealthMetric(new HealthMetricEventData(string, c69VarC, stringValue, strG1, content, error_type, yb5.K(healthMetricReport.getError_code()), yb5.K(healthMetricReport.getVariant()), yb5.K(healthMetricReport.getModel()), dl8Var.I, dl8Var.J, healthMetricReport.getDuration_ms()));
            jz6 jz6Var = dl8Var.Q;
            this.F = l45Var;
            this.E = 1;
            Object objF = jz6Var.f(healthMetric, this);
            m45 m45Var = m45.E;
            if (objF == m45Var) {
                return m45Var;
            }
        }
        return ieiVar;
    }
}
