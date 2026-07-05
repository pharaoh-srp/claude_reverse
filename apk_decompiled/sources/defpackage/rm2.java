package defpackage;

import com.anthropic.claude.api.chat.messages.StreamEvent;
import com.anthropic.claude.chat.parse.sse.ServerSentEventError;
import com.anthropic.claude.chat.parse.sse.ServerSentEventException;
import com.anthropic.claude.core.telemetry.SilentException;
import io.sentry.h1;
import io.sentry.n0;
import io.sentry.t4;
import java.util.List;
import kotlinx.serialization.SerializationException;

/* JADX INFO: loaded from: classes2.dex */
public final class rm2 extends gb9 {
    public final /* synthetic */ d7 c;
    public final /* synthetic */ ljg d;
    public final /* synthetic */ rib e;
    public final /* synthetic */ aid f;
    public final /* synthetic */ a33 g;
    public final /* synthetic */ nn h;
    public final /* synthetic */ bo i;
    public final /* synthetic */ bo j;
    public final /* synthetic */ zy7 k;
    public final /* synthetic */ sm2 l;

    public rm2(d7 d7Var, ljg ljgVar, rib ribVar, aid aidVar, a33 a33Var, nn nnVar, bo boVar, bo boVar2, zy7 zy7Var, sm2 sm2Var) {
        this.c = d7Var;
        this.d = ljgVar;
        this.e = ribVar;
        this.f = aidVar;
        this.g = a33Var;
        this.h = nnVar;
        this.i = boVar;
        this.j = boVar2;
        this.k = zy7Var;
        this.l = sm2Var;
    }

    @Override // defpackage.gb9
    public final void E(m4e m4eVar) {
        this.f.m(null);
    }

    @Override // defpackage.gb9
    public final void F(m4e m4eVar, String str, String str2) {
        Object pibVar;
        ljg ljgVar = this.d;
        if (ljgVar != null) {
            try {
                ljgVar.c(str, str2);
            } catch (Throwable unused) {
            }
        }
        boolean zR = x44.r(str, "error");
        rib ribVar = this.e;
        if (zR) {
            pibVar = new oib(dj3.a(ribVar.b.a, 500, str2));
        } else {
            boolean zR2 = x44.r(str, "ping");
            Object obj = qib.a;
            if (zR2) {
                pibVar = obj;
            } else {
                if (str == null) {
                    urk.b(new SilentException("Unexpected null event type in SSE messages"), "null_event_type");
                } else {
                    try {
                        pibVar = new pib((StreamEvent) ribVar.a.b(str2, StreamEvent.Companion.serializer()));
                    } catch (SerializationException e) {
                        List list = xah.a;
                        xah.f(e, "Failed to parse SSE event JSON", null, null, 28);
                        pibVar = obj;
                    }
                }
                pibVar = obj;
            }
        }
        if (pibVar instanceof qib) {
            return;
        }
        boolean z = pibVar instanceof oib;
        aid aidVar = this.f;
        if (z) {
            aidVar.m(new ServerSentEventError(((oib) pibVar).a));
            return;
        }
        if (!(pibVar instanceof pib)) {
            wg6.i();
            return;
        }
        try {
            im2 im2VarB = ribVar.b(((pib) pibVar).a, this.g, this.h, this.i, this.j, this.k);
            if (im2VarB != null) {
                aidVar.r(im2VarB);
            }
        } catch (ServerSentEventError e2) {
            aidVar.m(e2);
        } catch (SerializationException e3) {
            List list2 = xah.a;
            xah.f(e3, "Failed to parse SSE event JSON", null, null, 28);
        } catch (Exception e4) {
            h1 h1VarG = t4.g();
            h1VarG.getClass();
            h1VarG.D(e4, new n0());
            aidVar.m(new ServerSentEventException(e4));
        }
    }

    @Override // defpackage.gb9
    public final void G(m4e m4eVar, Exception exc, pqe pqeVar) {
        Throwable serverSentEventException;
        String message;
        kie kieVar = (kie) m4eVar.F;
        boolean z = false;
        if (pqeVar != null && pqeVar.U && (exc instanceof IllegalStateException) && (message = ((IllegalStateException) exc).getMessage()) != null && isg.q0(message, "Invalid content-type", false)) {
            z = true;
        }
        if (pqeVar == null || (pqeVar.U && !z)) {
            if (exc == null) {
                exc = new RuntimeException("Null throwable in SSE onFailure()");
            }
            knk.I(exc, kieVar);
            serverSentEventException = new ServerSentEventException(exc);
        } else {
            try {
                serverSentEventException = new ServerSentEventError(dj3.a(this.l.b.a, pqeVar.H, pqeVar.K.f()));
            } catch (Exception e) {
                knk.I(e, kieVar);
                serverSentEventException = new ServerSentEventException(e);
            }
        }
        this.f.m(serverSentEventException);
    }

    @Override // defpackage.gb9
    public final void H(m4e m4eVar, pqe pqeVar) {
        this.c.a();
    }
}
