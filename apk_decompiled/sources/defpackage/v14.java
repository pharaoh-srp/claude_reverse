package defpackage;

import android.content.SharedPreferences;
import com.anthropic.claude.R;
import com.anthropic.claude.api.result.ApiResult;
import com.anthropic.claude.code.remote.i;
import com.anthropic.claude.code.remote.stores.a;
import com.anthropic.claude.sessions.types.AskUserQuestionInput;
import com.anthropic.claude.sessions.types.CoworkSafetyFlag;
import com.anthropic.claude.sessions.types.CoworkSafetyFlagsResponse;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class v14 extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public int F;
    public final /* synthetic */ i G;
    public String H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v14(i iVar, String str, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.G = iVar;
        this.H = str;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        int i = this.E;
        i iVar = this.G;
        switch (i) {
            case 0:
                return new v14(iVar, this.H, tp4Var, 0);
            case 1:
                return new v14(iVar, this.H, tp4Var, 1);
            case 2:
                return new v14(iVar, this.H, tp4Var, 2);
            case 3:
                return new v14(iVar, this.H, tp4Var, 3);
            default:
                return new v14(tp4Var, iVar);
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
        return ((v14) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        int i;
        String strE0;
        int i2 = this.E;
        m45 m45Var = m45.E;
        i iVar = this.G;
        iei ieiVar = iei.a;
        switch (i2) {
            case 0:
                int i3 = this.F;
                if (i3 != 0) {
                    if (i3 != 1) {
                        sz6.j("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        sf5.h0(obj);
                    }
                    break;
                } else {
                    sf5.h0(obj);
                    hi6 hi6Var = iVar.X0;
                    String str = this.H;
                    this.F = 1;
                    if (hi6Var.B(str, this) == m45Var) {
                    }
                }
                break;
            case 1:
                int i4 = this.F;
                if (i4 != 0) {
                    if (i4 != 1) {
                        sz6.j("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        sf5.h0(obj);
                    }
                    break;
                } else {
                    sf5.h0(obj);
                    psf psfVar = iVar.z;
                    String str2 = this.H;
                    this.F = 1;
                    if (psfVar.e(str2, lm6.E, this) == m45Var) {
                    }
                }
                break;
            case 2:
                String str3 = this.H;
                lsc lscVar = iVar.J0;
                int i5 = this.F;
                if (i5 != 0) {
                    if (i5 != 1) {
                        sz6.j("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        sf5.h0(obj);
                    }
                    break;
                } else {
                    sf5.h0(obj);
                    jwf jwfVar = iVar.c;
                    this.F = 1;
                    obj = jwfVar.a.E(jwfVar.b, str3, this);
                    if (obj == m45Var) {
                    }
                }
                ApiResult apiResult = (ApiResult) obj;
                boolean z = apiResult instanceof of0;
                if (!z) {
                    if (!(apiResult instanceof nf0)) {
                        wg6.i();
                    }
                    break;
                } else {
                    CoworkSafetyFlagsResponse coworkSafetyFlagsResponse = (CoworkSafetyFlagsResponse) ((of0) apiResult).b;
                    if (!coworkSafetyFlagsResponse.getFlags().isEmpty()) {
                        lscVar.setValue(sta.m0((Map) lscVar.getValue(), new cpc(str3, coworkSafetyFlagsResponse.getFlags())));
                        a aVar = iVar.k;
                        List<CoworkSafetyFlag> flags = coworkSafetyFlagsResponse.getFlags();
                        aVar.getClass();
                        str3.getClass();
                        flags.getClass();
                        Map mapM0 = sta.m0(sta.i0(str3, aVar.b()), new cpc(str3, flags));
                        if (mapM0.size() > 200) {
                            List<Map.Entry> listI0 = w44.I0(mapM0.entrySet(), mapM0.size() - 200);
                            int iD0 = tta.d0(x44.y(listI0, 10));
                            if (iD0 < 16) {
                                iD0 = 16;
                            }
                            LinkedHashMap linkedHashMap = new LinkedHashMap(iD0);
                            for (Map.Entry entry : listI0) {
                                linkedHashMap.put(entry.getKey(), entry.getValue());
                            }
                            mapM0 = linkedHashMap;
                        }
                        try {
                            SharedPreferences.Editor editorEdit = aVar.a.edit();
                            editorEdit.putString("cowork_safety_flags_v1", aVar.b.d(mapM0, new f7a(srg.a, new uo0(CoworkSafetyFlag.Companion.serializer(), 0))));
                            editorEdit.apply();
                            break;
                        } catch (Throwable unused) {
                        }
                    }
                }
                if (!z) {
                    if (!(apiResult instanceof nf0)) {
                        wg6.i();
                    } else {
                        nf0 nf0Var = (nf0) apiResult;
                        if (!(nf0Var instanceof lf0) || (i = ((lf0) nf0Var).a) >= 500 || i == 429 || i == 408 || i == 425) {
                            iVar.K0.remove(str3);
                            iVar.L0.add(str3);
                        }
                    }
                }
                break;
            case 3:
                int i6 = this.F;
                if (i6 != 0) {
                    if (i6 != 1) {
                        sz6.j("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        sf5.h0(obj);
                    }
                    break;
                } else {
                    sf5.h0(obj);
                    hi6 hi6Var2 = iVar.X0;
                    String str4 = this.H;
                    this.F = 1;
                    obj = hi6Var2.B(str4, this);
                    if (obj == m45Var) {
                    }
                }
                if (!((Boolean) obj).booleanValue()) {
                    n2g n2gVar = iVar.g1;
                    String string = iVar.o.getString(R.string.ccr_model_save_failed);
                    string.getClass();
                    n2gVar.f(string);
                }
                break;
            default:
                psf psfVar2 = iVar.z;
                int i7 = this.F;
                if (i7 != 0) {
                    if (i7 != 1) {
                        if (i7 != 2) {
                            sz6.j("call to 'resume' before 'invoke' with coroutine");
                        } else {
                            sf5.h0(obj);
                        }
                        break;
                    } else {
                        strE0 = this.H;
                        sf5.h0(obj);
                        this.H = null;
                        this.F = 2;
                        if (psfVar2.d(strE0, null, this) == m45Var) {
                        }
                    }
                } else {
                    sf5.h0(obj);
                    strE0 = iVar.E0();
                    if (strE0 != null) {
                        mdg mdgVar = iVar.R1;
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap(tta.d0(mdgVar.size()));
                        for (Map.Entry entry2 : mdgVar.F) {
                            linkedHashMap2.put(entry2.getKey(), bg9.d.c((AskUserQuestionInput) entry2.getValue(), AskUserQuestionInput.Companion.serializer()));
                        }
                        this.H = strE0;
                        this.F = 1;
                        if (psfVar2.f(strE0, linkedHashMap2, this) == m45Var) {
                        }
                        this.H = null;
                        this.F = 2;
                        if (psfVar2.d(strE0, null, this) == m45Var) {
                        }
                    }
                }
                break;
        }
        return ieiVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v14(tp4 tp4Var, i iVar) {
        super(2, tp4Var);
        this.E = 4;
        this.G = iVar;
    }
}
