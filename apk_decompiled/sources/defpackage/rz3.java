package defpackage;

import com.anthropic.claude.R;
import com.anthropic.claude.code.remote.c;
import com.anthropic.claude.code.remote.d;
import com.anthropic.claude.code.remote.e;
import com.anthropic.claude.sessions.types.SessionResource;
import com.anthropic.claude.sessions.types.SessionStatus;
import com.anthropic.claude.types.strings.SessionId;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class rz3 extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public int F;
    public final /* synthetic */ c G;
    public final /* synthetic */ String H;
    public final /* synthetic */ bz7 I;
    public final /* synthetic */ wt3 J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rz3(c cVar, String str, bz7 bz7Var, wt3 wt3Var, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.G = cVar;
        this.H = str;
        this.I = bz7Var;
        this.J = wt3Var;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        switch (this.E) {
            case 0:
                return new rz3(this.G, this.H, this.I, this.J, tp4Var, 0);
            default:
                return new rz3(this.G, this.H, this.I, this.J, tp4Var, 1);
        }
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        l45 l45Var = (l45) obj;
        tp4 tp4Var = (tp4) obj2;
        switch (i) {
        }
        return ((rz3) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        final wt3 wt3Var = this.J;
        m45 m45Var = m45.E;
        final c cVar = this.G;
        final int i2 = 1;
        switch (i) {
            case 0:
                int i3 = this.F;
                if (i3 == 0) {
                    sf5.h0(obj);
                    jwf jwfVar = cVar.c;
                    String string = cVar.b.getString(R.string.ccr_error_unknown);
                    string.getClass();
                    final int i4 = 0;
                    final String str = this.H;
                    bz7 bz7Var = new bz7(cVar, wt3Var, str, i4) { // from class: qz3
                        public final /* synthetic */ int E;
                        public final /* synthetic */ c F;
                        public final /* synthetic */ String G;

                        {
                            this.E = i4;
                            this.G = str;
                        }

                        @Override // defpackage.bz7
                        public final Object invoke(Object obj2) {
                            int i5 = this.E;
                            iei ieiVar2 = iei.a;
                            String str2 = this.G;
                            c cVar2 = this.F;
                            switch (i5) {
                                case 0:
                                    List<SessionResource> listX = cVar2.X();
                                    ArrayList arrayList = new ArrayList(x44.y(listX, 10));
                                    for (SessionResource sessionResourceM870copy3s6jSc4$default : listX) {
                                        if (SessionId.m1117equalsimpl0(sessionResourceM870copy3s6jSc4$default.m875getIdOcx55TE(), str2)) {
                                            sessionResourceM870copy3s6jSc4$default = SessionResource.m870copy3s6jSc4$default(sessionResourceM870copy3s6jSc4$default, null, null, null, SessionStatus.ARCHIVED, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, 8388599, null);
                                        }
                                        arrayList.add(sessionResourceM870copy3s6jSc4$default);
                                    }
                                    cVar2.f0(arrayList);
                                    ad9 ad9Var = e.a;
                                    break;
                                default:
                                    List<SessionResource> listX2 = cVar2.X();
                                    ArrayList arrayList2 = new ArrayList(x44.y(listX2, 10));
                                    for (SessionResource sessionResourceM870copy3s6jSc4$default2 : listX2) {
                                        if (SessionId.m1117equalsimpl0(sessionResourceM870copy3s6jSc4$default2.m875getIdOcx55TE(), str2)) {
                                            List list = d.a;
                                            sessionResourceM870copy3s6jSc4$default2 = SessionResource.m870copy3s6jSc4$default(sessionResourceM870copy3s6jSc4$default2, null, null, null, (fe5.i(sessionResourceM870copy3s6jSc4$default2) && sessionResourceM870copy3s6jSc4$default2.getSession_context().getSources().isEmpty()) ? SessionStatus.IDLE : SessionStatus.PENDING, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, 8388599, null);
                                        }
                                        arrayList2.add(sessionResourceM870copy3s6jSc4$default2);
                                    }
                                    cVar2.f0(arrayList2);
                                    ad9 ad9Var2 = e.a;
                                    break;
                            }
                            return ieiVar2;
                        }
                    };
                    this.F = 1;
                    if (rwk.i(jwfVar, str, string, bz7Var, this.I, this) == m45Var) {
                    }
                } else if (i3 != 1) {
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    sf5.h0(obj);
                }
                break;
            default:
                int i5 = this.F;
                if (i5 == 0) {
                    sf5.h0(obj);
                    jwf jwfVar2 = cVar.c;
                    String string2 = cVar.b.getString(R.string.ccr_error_unknown);
                    string2.getClass();
                    final String str2 = this.H;
                    bz7 bz7Var2 = new bz7(cVar, wt3Var, str2, i2) { // from class: qz3
                        public final /* synthetic */ int E;
                        public final /* synthetic */ c F;
                        public final /* synthetic */ String G;

                        {
                            this.E = i2;
                            this.G = str2;
                        }

                        @Override // defpackage.bz7
                        public final Object invoke(Object obj2) {
                            int i52 = this.E;
                            iei ieiVar2 = iei.a;
                            String str22 = this.G;
                            c cVar2 = this.F;
                            switch (i52) {
                                case 0:
                                    List<SessionResource> listX = cVar2.X();
                                    ArrayList arrayList = new ArrayList(x44.y(listX, 10));
                                    for (SessionResource sessionResourceM870copy3s6jSc4$default : listX) {
                                        if (SessionId.m1117equalsimpl0(sessionResourceM870copy3s6jSc4$default.m875getIdOcx55TE(), str22)) {
                                            sessionResourceM870copy3s6jSc4$default = SessionResource.m870copy3s6jSc4$default(sessionResourceM870copy3s6jSc4$default, null, null, null, SessionStatus.ARCHIVED, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, 8388599, null);
                                        }
                                        arrayList.add(sessionResourceM870copy3s6jSc4$default);
                                    }
                                    cVar2.f0(arrayList);
                                    ad9 ad9Var = e.a;
                                    break;
                                default:
                                    List<SessionResource> listX2 = cVar2.X();
                                    ArrayList arrayList2 = new ArrayList(x44.y(listX2, 10));
                                    for (SessionResource sessionResourceM870copy3s6jSc4$default2 : listX2) {
                                        if (SessionId.m1117equalsimpl0(sessionResourceM870copy3s6jSc4$default2.m875getIdOcx55TE(), str22)) {
                                            List list = d.a;
                                            sessionResourceM870copy3s6jSc4$default2 = SessionResource.m870copy3s6jSc4$default(sessionResourceM870copy3s6jSc4$default2, null, null, null, (fe5.i(sessionResourceM870copy3s6jSc4$default2) && sessionResourceM870copy3s6jSc4$default2.getSession_context().getSources().isEmpty()) ? SessionStatus.IDLE : SessionStatus.PENDING, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, 8388599, null);
                                        }
                                        arrayList2.add(sessionResourceM870copy3s6jSc4$default2);
                                    }
                                    cVar2.f0(arrayList2);
                                    ad9 ad9Var2 = e.a;
                                    break;
                            }
                            return ieiVar2;
                        }
                    };
                    this.F = 1;
                    if (rwk.r(jwfVar2, str2, string2, bz7Var2, this.I, this) == m45Var) {
                    }
                } else if (i5 != 1) {
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    sf5.h0(obj);
                }
                break;
        }
        return m45Var;
    }
}
