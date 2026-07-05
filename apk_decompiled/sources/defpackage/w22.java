package defpackage;

import android.view.View;
import com.anthropic.claude.analytics.events.ChatEvents$UploadSource;
import com.anthropic.claude.api.chat.ChatConversationWithProjectReference;
import com.anthropic.claude.chat.input.files.a;
import com.anthropic.claude.conway.protocol.b0;
import com.anthropic.claude.mcpapps.transport.JsonRpcRequest;
import java.util.List;
import kotlinx.serialization.json.JsonPrimitive;

/* JADX INFO: loaded from: classes2.dex */
public final class w22 extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public int F;
    public /* synthetic */ Object G;
    public Object H;
    public Object I;
    public Object J;
    public Object K;
    public final /* synthetic */ Object L;
    public Object M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w22(xs5 xs5Var, List list, pl3 pl3Var, View view, nwb nwbVar, nwb nwbVar2, nwb nwbVar3, tp4 tp4Var) {
        super(2, tp4Var);
        this.E = 14;
        this.K = xs5Var;
        this.G = list;
        this.L = pl3Var;
        this.M = view;
        this.H = nwbVar;
        this.I = nwbVar2;
        this.J = nwbVar3;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00e1 A[Catch: all -> 0x0037, TryCatch #0 {all -> 0x0037, blocks: (B:9:0x0032, B:72:0x0223, B:75:0x022b, B:77:0x022f, B:79:0x0233, B:80:0x023f, B:81:0x0244, B:82:0x0245, B:16:0x0050, B:59:0x01d4, B:61:0x01de, B:64:0x01f4, B:66:0x01fe, B:63:0x01e4, B:19:0x005f, B:53:0x017d, B:55:0x0187, B:73:0x0227, B:83:0x024c, B:84:0x0251, B:22:0x006a, B:30:0x00bc, B:32:0x00c2, B:36:0x00d5, B:38:0x00e1, B:39:0x00ea, B:43:0x0148, B:45:0x0154, B:50:0x0160, B:25:0x008a, B:27:0x00ac), top: B:87:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x017d A[Catch: all -> 0x0037, PHI: r2 r3
      0x017d: PHI (r2v10 hi6) = (r2v6 hi6), (r2v21 hi6) binds: [B:51:0x0179, B:20:0x0062] A[DONT_GENERATE, DONT_INLINE]
      0x017d: PHI (r3v18 java.lang.Object) = (r3v14 java.lang.Object), (r3v29 java.lang.Object) binds: [B:51:0x0179, B:20:0x0062] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x0037, blocks: (B:9:0x0032, B:72:0x0223, B:75:0x022b, B:77:0x022f, B:79:0x0233, B:80:0x023f, B:81:0x0244, B:82:0x0245, B:16:0x0050, B:59:0x01d4, B:61:0x01de, B:64:0x01f4, B:66:0x01fe, B:63:0x01e4, B:19:0x005f, B:53:0x017d, B:55:0x0187, B:73:0x0227, B:83:0x024c, B:84:0x0251, B:22:0x006a, B:30:0x00bc, B:32:0x00c2, B:36:0x00d5, B:38:0x00e1, B:39:0x00ea, B:43:0x0148, B:45:0x0154, B:50:0x0160, B:25:0x008a, B:27:0x00ac), top: B:87:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0187 A[Catch: all -> 0x0037, TryCatch #0 {all -> 0x0037, blocks: (B:9:0x0032, B:72:0x0223, B:75:0x022b, B:77:0x022f, B:79:0x0233, B:80:0x023f, B:81:0x0244, B:82:0x0245, B:16:0x0050, B:59:0x01d4, B:61:0x01de, B:64:0x01f4, B:66:0x01fe, B:63:0x01e4, B:19:0x005f, B:53:0x017d, B:55:0x0187, B:73:0x0227, B:83:0x024c, B:84:0x0251, B:22:0x006a, B:30:0x00bc, B:32:0x00c2, B:36:0x00d5, B:38:0x00e1, B:39:0x00ea, B:43:0x0148, B:45:0x0154, B:50:0x0160, B:25:0x008a, B:27:0x00ac), top: B:87:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01e4 A[Catch: all -> 0x0037, TryCatch #0 {all -> 0x0037, blocks: (B:9:0x0032, B:72:0x0223, B:75:0x022b, B:77:0x022f, B:79:0x0233, B:80:0x023f, B:81:0x0244, B:82:0x0245, B:16:0x0050, B:59:0x01d4, B:61:0x01de, B:64:0x01f4, B:66:0x01fe, B:63:0x01e4, B:19:0x005f, B:53:0x017d, B:55:0x0187, B:73:0x0227, B:83:0x024c, B:84:0x0251, B:22:0x006a, B:30:0x00bc, B:32:0x00c2, B:36:0x00d5, B:38:0x00e1, B:39:0x00ea, B:43:0x0148, B:45:0x0154, B:50:0x0160, B:25:0x008a, B:27:0x00ac), top: B:87:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01fe A[Catch: all -> 0x0037, TryCatch #0 {all -> 0x0037, blocks: (B:9:0x0032, B:72:0x0223, B:75:0x022b, B:77:0x022f, B:79:0x0233, B:80:0x023f, B:81:0x0244, B:82:0x0245, B:16:0x0050, B:59:0x01d4, B:61:0x01de, B:64:0x01f4, B:66:0x01fe, B:63:0x01e4, B:19:0x005f, B:53:0x017d, B:55:0x0187, B:73:0x0227, B:83:0x024c, B:84:0x0251, B:22:0x006a, B:30:0x00bc, B:32:0x00c2, B:36:0x00d5, B:38:0x00e1, B:39:0x00ea, B:43:0x0148, B:45:0x0154, B:50:0x0160, B:25:0x008a, B:27:0x00ac), top: B:87:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0227 A[Catch: all -> 0x0037, TryCatch #0 {all -> 0x0037, blocks: (B:9:0x0032, B:72:0x0223, B:75:0x022b, B:77:0x022f, B:79:0x0233, B:80:0x023f, B:81:0x0244, B:82:0x0245, B:16:0x0050, B:59:0x01d4, B:61:0x01de, B:64:0x01f4, B:66:0x01fe, B:63:0x01e4, B:19:0x005f, B:53:0x017d, B:55:0x0187, B:73:0x0227, B:83:0x024c, B:84:0x0251, B:22:0x006a, B:30:0x00bc, B:32:0x00c2, B:36:0x00d5, B:38:0x00e1, B:39:0x00ea, B:43:0x0148, B:45:0x0154, B:50:0x0160, B:25:0x008a, B:27:0x00ac), top: B:87:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x022f A[Catch: all -> 0x0037, TryCatch #0 {all -> 0x0037, blocks: (B:9:0x0032, B:72:0x0223, B:75:0x022b, B:77:0x022f, B:79:0x0233, B:80:0x023f, B:81:0x0244, B:82:0x0245, B:16:0x0050, B:59:0x01d4, B:61:0x01de, B:64:0x01f4, B:66:0x01fe, B:63:0x01e4, B:19:0x005f, B:53:0x017d, B:55:0x0187, B:73:0x0227, B:83:0x024c, B:84:0x0251, B:22:0x006a, B:30:0x00bc, B:32:0x00c2, B:36:0x00d5, B:38:0x00e1, B:39:0x00ea, B:43:0x0148, B:45:0x0154, B:50:0x0160, B:25:0x008a, B:27:0x00ac), top: B:87:0x0016 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object d(java.lang.Object r57) {
        /*
            Method dump skipped, instruction units count: 602
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w22.d(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        int i = this.E;
        Object obj2 = this.L;
        switch (i) {
            case 0:
                return new w22((h86) this.G, (nwb) this.J, (nwb) this.K, (hdc) obj2, (String) this.M, tp4Var);
            case 1:
                w22 w22Var = new w22((fk) obj2, (ue2) this.M, (h86) this.G, tp4Var);
                w22Var.K = obj;
                return w22Var;
            case 2:
                return new w22((a) this.H, (String) this.M, (sw2) this.I, (String) this.J, (tw2) this.K, (ChatEvents$UploadSource) this.G, (pz7) obj2, tp4Var);
            case 3:
                return new w22((ChatConversationWithProjectReference) this.K, (jkf) this.G, (oq4) obj2, tp4Var, 3);
            case 4:
                return new w22((b0) this.H, (dae) this.I, (String) this.M, (f8) this.J, (bae) this.K, (lqa) this.G, (z9e) obj2, tp4Var);
            case 5:
                w22 w22Var2 = new w22((String) this.K, (bj5) this.G, (String) obj2, tp4Var, 5);
                w22Var2.J = obj;
                return w22Var2;
            case 6:
                return new w22((no6) this.H, (dae) this.I, (dae) this.J, (jx8) this.K, this.G, (dae) obj2, (tqh) this.M, tp4Var, 6);
            case 7:
                return new w22((oo6) this.H, (dae) this.I, (dae) this.J, (kx8) this.K, this.G, (dae) obj2, (rz6) this.M, tp4Var, 7);
            case 8:
                return new w22((no6) this.H, (jx8) this.I, this.J, (qjc) this.K, (tqh) this.G, (mab) obj2, (ns5) this.M, tp4Var, 8);
            case 9:
                return new w22((oo6) this.H, (kx8) this.I, this.J, (rjc) this.K, (rz6) this.G, (nab) obj2, (ns5) this.M, tp4Var, 9);
            case 10:
                w22 w22Var3 = new w22((JsonPrimitive) this.J, (pz7) this.K, (JsonRpcRequest) this.G, (lya) obj2, (JsonPrimitive) this.M, tp4Var);
                w22Var3.I = obj;
                return w22Var3;
            case 11:
                w22 w22Var4 = new w22((tec) obj2, (zy7) this.M, tp4Var);
                w22Var4.G = obj;
                return w22Var4;
            case 12:
                return new w22((x4j) this.K, (String) this.G, (yv5) obj2, tp4Var, 12);
            case 13:
                w22 w22Var5 = new w22((x4j) this.G, (String) obj2, tp4Var);
                w22Var5.K = obj;
                return w22Var5;
            default:
                return new w22((xs5) this.K, (List) this.G, (pl3) obj2, (View) this.M, (nwb) this.H, (nwb) this.I, (nwb) this.J, tp4Var);
        }
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        switch (i) {
        }
        return ((w22) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:(1:(1:(1:(1:(2:23|416)(2:24|72))(2:25|417))(10:26|407|27|28|391|60|61|(1:418)|70|71))(1:31))(4:33|(1:35)|36|(1:419)(4:39|(1:42)|70|71))|395|43|(6:45|46|399|47|48|49)|54|55|393|56|(5:59|391|60|61|(0))|70|71) */
    /* JADX WARN: Can't wrap try/catch for region: R(5:389|(1:(1:(7:318|319|320|346|352|329|445)(2:321|353))(4:322|382|323|324))(4:326|(1:328)(2:330|(5:335|336|(1:339)|344|446)(1:334))|329|445)|403|340|(4:342|(5:345|346|352|329|445)|344|446)(5:348|349|352|329|445)) */
    /* JADX WARN: Code restructure failed: missing block: B:347:0x07df, code lost:
    
        r4 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01ac, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01ad, code lost:
    
        r13 = r3;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:418:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:420:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v110 */
    /* JADX WARN: Type inference failed for: r1v111 */
    /* JADX WARN: Type inference failed for: r1v112 */
    /* JADX WARN: Type inference failed for: r1v113 */
    /* JADX WARN: Type inference failed for: r1v114 */
    /* JADX WARN: Type inference failed for: r1v87 */
    /* JADX WARN: Type inference failed for: r1v88, types: [lf9] */
    /* JADX WARN: Type inference failed for: r1v89, types: [lf9] */
    /* JADX WARN: Type inference failed for: r1v93 */
    /* JADX WARN: Type inference failed for: r2v17, types: [int] */
    /* JADX WARN: Type inference failed for: r2v18, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v68 */
    /* JADX WARN: Type inference failed for: r2v69 */
    @Override // defpackage.vd1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2184
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w22.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w22(fk fkVar, ue2 ue2Var, h86 h86Var, tp4 tp4Var) {
        super(2, tp4Var);
        this.E = 1;
        this.L = fkVar;
        this.M = ue2Var;
        this.G = h86Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w22(h86 h86Var, nwb nwbVar, nwb nwbVar2, hdc hdcVar, String str, tp4 tp4Var) {
        super(2, tp4Var);
        this.E = 0;
        this.G = h86Var;
        this.J = nwbVar;
        this.K = nwbVar2;
        this.L = hdcVar;
        this.M = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w22(tec tecVar, zy7 zy7Var, tp4 tp4Var) {
        super(2, tp4Var);
        this.E = 11;
        this.L = tecVar;
        this.M = zy7Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w22(x4j x4jVar, String str, tp4 tp4Var) {
        super(2, tp4Var);
        this.E = 13;
        this.G = x4jVar;
        this.L = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w22(a aVar, String str, sw2 sw2Var, String str2, tw2 tw2Var, ChatEvents$UploadSource chatEvents$UploadSource, pz7 pz7Var, tp4 tp4Var) {
        super(2, tp4Var);
        this.E = 2;
        this.H = aVar;
        this.M = str;
        this.I = sw2Var;
        this.J = str2;
        this.K = tw2Var;
        this.G = chatEvents$UploadSource;
        this.L = pz7Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w22(b0 b0Var, dae daeVar, String str, f8 f8Var, bae baeVar, lqa lqaVar, z9e z9eVar, tp4 tp4Var) {
        super(2, tp4Var);
        this.E = 4;
        this.H = b0Var;
        this.I = daeVar;
        this.M = str;
        this.J = f8Var;
        this.K = baeVar;
        this.G = lqaVar;
        this.L = z9eVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w22(Object obj, Object obj2, Object obj3, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.K = obj;
        this.G = obj2;
        this.L = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w22(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.H = obj;
        this.I = obj2;
        this.J = obj3;
        this.K = obj4;
        this.G = obj5;
        this.L = obj6;
        this.M = obj7;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w22(JsonPrimitive jsonPrimitive, pz7 pz7Var, JsonRpcRequest jsonRpcRequest, lya lyaVar, JsonPrimitive jsonPrimitive2, tp4 tp4Var) {
        super(2, tp4Var);
        this.E = 10;
        this.J = jsonPrimitive;
        this.K = pz7Var;
        this.G = jsonRpcRequest;
        this.L = lyaVar;
        this.M = jsonPrimitive2;
    }
}
