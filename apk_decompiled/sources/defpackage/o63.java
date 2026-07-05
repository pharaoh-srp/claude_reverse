package defpackage;

import android.app.NotificationManager;
import android.content.Context;
import com.anthropic.claude.chat.ChatScreenParams;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o63 implements bz7 {
    public final /* synthetic */ int E = 1;
    public final /* synthetic */ boolean F;
    public final /* synthetic */ Object G;
    public final /* synthetic */ Object H;
    public final /* synthetic */ Object I;
    public final /* synthetic */ Object J;
    public final /* synthetic */ Object K;

    public /* synthetic */ o63(m2a m2aVar, boolean z, sbj sbjVar, zhh zhhVar, cjh cjhVar, occ occVar) {
        this.G = m2aVar;
        this.F = z;
        this.H = sbjVar;
        this.I = zhhVar;
        this.J = cjhVar;
        this.K = occVar;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        njh njhVar;
        cu9 cu9Var;
        cu9 cu9Var2;
        int i = this.E;
        Object obj2 = this.K;
        Object obj3 = this.J;
        Object obj4 = this.I;
        Object obj5 = this.H;
        boolean z = this.F;
        Object obj6 = this.G;
        char c = 1;
        switch (i) {
            case 0:
                t53 t53Var = (t53) obj6;
                mn5 mn5Var = t53Var.g;
                Context context = (Context) obj5;
                ChatScreenParams chatScreenParams = (ChatScreenParams) obj4;
                zy7 zy7Var = (zy7) obj3;
                bz7 bz7Var = (bz7) obj2;
                r4a r4aVar = (r4a) obj;
                r4aVar.getClass();
                if (z) {
                    return new le(r4aVar, 6);
                }
                t53Var.F0.setValue(mn5Var.f());
                lsc lscVar = t53Var.G0;
                Long l = (Long) lscVar.getValue();
                long jLongValue = l != null ? l.longValue() : mn5Var.a();
                lz1 lz1Var = uh6.F;
                long jR = v40.R(mn5Var.a() - jLongValue, zh6.MILLISECONDS);
                lscVar.setValue(Long.valueOf(mn5Var.a()));
                tp4 tp4Var = null;
                if (uh6.d(jR, v40.Q(t53Var.P0().getResume_refresh_debounce_sec(), zh6.SECONDS)) < 0 || t53Var.d1() || !t53Var.I0() || t53Var.b1() || t53Var.U0().b() || t53Var.L0() != null) {
                    List list = xah.a;
                    String strP = uh6.p(jR);
                    boolean zD1 = t53Var.d1();
                    boolean zI0 = t53Var.I0();
                    boolean zB1 = t53Var.b1();
                    b13 b13VarU0 = t53Var.U0();
                    boolean z2 = t53Var.L0() != null;
                    StringBuilder sb = new StringBuilder("maybeRefreshConversationOnResume: skipped, timeSinceLastResume=");
                    sb.append(strP);
                    sb.append(", isNewChat=");
                    sb.append(zD1);
                    sb.append(", hasLoaded=");
                    ij0.A(sb, zI0, ", isLoading=", zB1, ", responseState=");
                    sb.append(b13VarU0);
                    sb.append(", inputSession=");
                    sb.append(z2);
                    xah.e(6, sb.toString(), null, null);
                } else {
                    List list2 = xah.a;
                    xah.e(6, "maybeRefreshConversationOnResume: refreshing, timeSinceLastResume=".concat(uh6.p(jR)), null, null);
                    t53Var.B1 = gb9.D(t53Var.a, null, null, new o43(t53Var.B1, t53Var, tp4Var, c == true ? 1 : 0), 3);
                }
                String strM591getChatIdRjYBDck = chatScreenParams.m591getChatIdRjYBDck();
                context.getClass();
                strM591getChatIdRjYBDck.getClass();
                NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
                if (notificationManager != null) {
                    notificationManager.cancel(strM591getChatIdRjYBDck.hashCode());
                }
                if (((Boolean) t53Var.d2.getValue()).booleanValue()) {
                    zy7Var.a();
                } else if (((Boolean) t53Var.g2.getValue()).booleanValue()) {
                    t53Var.f2.setValue(Boolean.TRUE);
                    String str = (String) t53Var.e2.getValue();
                    if (str != null) {
                        bz7Var.invoke(str);
                    }
                }
                return new h83(0);
            default:
                m2a m2aVar = (m2a) obj6;
                lsc lscVar2 = m2aVar.o;
                sbj sbjVar = (sbj) obj5;
                zhh zhhVar = (zhh) obj4;
                cjh cjhVar = (cjh) obj3;
                occ occVar = (occ) obj2;
                cu9 cu9Var3 = (cu9) obj;
                m2aVar.h = cu9Var3;
                zjh zjhVarD = m2aVar.d();
                if (zjhVarD != null) {
                    zjhVarD.b = cu9Var3;
                }
                if (z) {
                    if (m2aVar.a() == we8.F) {
                        if (((Boolean) m2aVar.l.getValue()).booleanValue() && ((y1a) sbjVar).b()) {
                            zhhVar.y();
                        } else {
                            zhhVar.u();
                        }
                        m2aVar.m.setValue(Boolean.valueOf(vok.o(zhhVar, true)));
                        m2aVar.n.setValue(Boolean.valueOf(vok.o(zhhVar, false)));
                        lscVar2.setValue(Boolean.valueOf(kkh.d(cjhVar.b)));
                    } else if (m2aVar.a() == we8.G) {
                        lscVar2.setValue(Boolean.valueOf(vok.o(zhhVar, true)));
                    }
                    dch.L(m2aVar, cjhVar, occVar);
                    zjh zjhVarD2 = m2aVar.d();
                    if (zjhVarD2 != null && (njhVar = m2aVar.e) != null && m2aVar.b() && (cu9Var = zjhVarD2.b) != null && cu9Var.n() && (cu9Var2 = zjhVarD2.c) != null) {
                        yjh yjhVar = zjhVarD2.a;
                        u3a u3aVar = new u3a(23, cu9Var);
                        l9e l9eVarR = u00.R(cu9Var);
                        l9e l9eVarJ = cu9Var.J(cu9Var2, false);
                        if (x44.r((njh) njhVar.a.b.get(), njhVar)) {
                            njhVar.b.f(cjhVar, occVar, yjhVar, u3aVar, l9eVarR, l9eVarJ);
                        }
                    }
                }
                return iei.a;
        }
    }

    public /* synthetic */ o63(boolean z, t53 t53Var, Context context, ChatScreenParams chatScreenParams, zy7 zy7Var, bz7 bz7Var) {
        this.F = z;
        this.G = t53Var;
        this.H = context;
        this.I = chatScreenParams;
        this.J = zy7Var;
        this.K = bz7Var;
    }
}
