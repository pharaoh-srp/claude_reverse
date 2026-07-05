package defpackage;

import com.anthropic.claude.conway.f;

/* JADX INFO: loaded from: classes2.dex */
public final class ux4 extends xzg implements pz7 {
    public fkg E;
    public int F;
    public int G;
    public /* synthetic */ Object H;
    public final /* synthetic */ f I;
    public final /* synthetic */ String J;
    public final /* synthetic */ boolean K;
    public final /* synthetic */ String L;
    public final /* synthetic */ String M;
    public final /* synthetic */ boolean N;
    public final /* synthetic */ boolean O;
    public final /* synthetic */ boolean P;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ux4(f fVar, String str, boolean z, String str2, String str3, boolean z2, boolean z3, boolean z4, tp4 tp4Var) {
        super(2, tp4Var);
        this.I = fVar;
        this.J = str;
        this.K = z;
        this.L = str2;
        this.M = str3;
        this.N = z2;
        this.O = z3;
        this.P = z4;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        ux4 ux4Var = new ux4(this.I, this.J, this.K, this.L, this.M, this.N, this.O, this.P, tp4Var);
        ux4Var.H = obj;
        return ux4Var;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        return ((ux4) create((l45) obj, (tp4) obj2)).invokeSuspend(iei.a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(29:0|2|(1:181)|(1:(1:(6:6|7|(1:110)|111|174|175)(2:15|16))(3:17|18|19))(8:20|184|21|22|(1:27)(1:26)|182|28|(26:30|(1:32)(5:33|(4:36|(2:38|203)(1:204)|39|34)|202|40|(3:42|(2:45|43)|205))|46|54|55|56|(1:58)(1:60)|61|(1:63)|64|65|(5:68|(5:188|71|(2:73|192)(1:193)|74|69)|190|81|(3:83|(2:86|84)|200))|88|(2:91|89)|201|93|(1:95)|96|(1:98)|99|(1:101)(1:102)|103|104|186|105|106)(4:48|49|50|(2:52|108)))|53|54|55|56|(0)(0)|61|(0)|64|65|(0)|88|(1:89)|201|93|(0)|96|(0)|99|(0)(0)|103|104|186|105|106|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0286, code lost:
    
        if (r4.a(r5, r34) != r13) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0296, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x029a, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x029d, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x028b A[PHI: r12
      0x028b: PHI (r12v3 fkg) = (r12v2 fkg), (r12v24 fkg) binds: [B:172:0x03af, B:109:0x0289] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02cf A[Catch: all -> 0x0024, TryCatch #3 {all -> 0x0024, blocks: (B:7:0x001f, B:136:0x02be, B:151:0x032f, B:154:0x033f, B:156:0x034f, B:161:0x0361, B:167:0x0390, B:171:0x03a9, B:170:0x0396, B:162:0x0370, B:166:0x0382, B:139:0x02cf, B:140:0x02e0, B:142:0x02e6, B:144:0x02f5, B:145:0x02f9, B:147:0x02ff, B:148:0x031d, B:150:0x0323, B:176:0x03b6, B:18:0x0035, B:58:0x0110, B:63:0x0138, B:106:0x0262, B:24:0x004d, B:30:0x0062, B:46:0x00d1, B:33:0x0070, B:34:0x007d, B:36:0x0083, B:38:0x0095, B:40:0x009a, B:42:0x00a0, B:43:0x00bf, B:45:0x00c5), top: B:181:0x0017 }] */
    /* JADX WARN: Removed duplicated region for block: B:154:0x033f A[Catch: all -> 0x0024, TRY_ENTER, TryCatch #3 {all -> 0x0024, blocks: (B:7:0x001f, B:136:0x02be, B:151:0x032f, B:154:0x033f, B:156:0x034f, B:161:0x0361, B:167:0x0390, B:171:0x03a9, B:170:0x0396, B:162:0x0370, B:166:0x0382, B:139:0x02cf, B:140:0x02e0, B:142:0x02e6, B:144:0x02f5, B:145:0x02f9, B:147:0x02ff, B:148:0x031d, B:150:0x0323, B:176:0x03b6, B:18:0x0035, B:58:0x0110, B:63:0x0138, B:106:0x0262, B:24:0x004d, B:30:0x0062, B:46:0x00d1, B:33:0x0070, B:34:0x007d, B:36:0x0083, B:38:0x0095, B:40:0x009a, B:42:0x00a0, B:43:0x00bf, B:45:0x00c5), top: B:181:0x0017 }] */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0370 A[Catch: all -> 0x0024, TryCatch #3 {all -> 0x0024, blocks: (B:7:0x001f, B:136:0x02be, B:151:0x032f, B:154:0x033f, B:156:0x034f, B:161:0x0361, B:167:0x0390, B:171:0x03a9, B:170:0x0396, B:162:0x0370, B:166:0x0382, B:139:0x02cf, B:140:0x02e0, B:142:0x02e6, B:144:0x02f5, B:145:0x02f9, B:147:0x02ff, B:148:0x031d, B:150:0x0323, B:176:0x03b6, B:18:0x0035, B:58:0x0110, B:63:0x0138, B:106:0x0262, B:24:0x004d, B:30:0x0062, B:46:0x00d1, B:33:0x0070, B:34:0x007d, B:36:0x0083, B:38:0x0095, B:40:0x009a, B:42:0x00a0, B:43:0x00bf, B:45:0x00c5), top: B:181:0x0017 }] */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0396 A[Catch: all -> 0x0024, TryCatch #3 {all -> 0x0024, blocks: (B:7:0x001f, B:136:0x02be, B:151:0x032f, B:154:0x033f, B:156:0x034f, B:161:0x0361, B:167:0x0390, B:171:0x03a9, B:170:0x0396, B:162:0x0370, B:166:0x0382, B:139:0x02cf, B:140:0x02e0, B:142:0x02e6, B:144:0x02f5, B:145:0x02f9, B:147:0x02ff, B:148:0x031d, B:150:0x0323, B:176:0x03b6, B:18:0x0035, B:58:0x0110, B:63:0x0138, B:106:0x0262, B:24:0x004d, B:30:0x0062, B:46:0x00d1, B:33:0x0070, B:34:0x007d, B:36:0x0083, B:38:0x0095, B:40:0x009a, B:42:0x00a0, B:43:0x00bf, B:45:0x00c5), top: B:181:0x0017 }] */
    /* JADX WARN: Removed duplicated region for block: B:178:0x03b9  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0110 A[Catch: all -> 0x0024, Exception -> 0x0027, CancellationException -> 0x002a, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x0024, blocks: (B:7:0x001f, B:136:0x02be, B:151:0x032f, B:154:0x033f, B:156:0x034f, B:161:0x0361, B:167:0x0390, B:171:0x03a9, B:170:0x0396, B:162:0x0370, B:166:0x0382, B:139:0x02cf, B:140:0x02e0, B:142:0x02e6, B:144:0x02f5, B:145:0x02f9, B:147:0x02ff, B:148:0x031d, B:150:0x0323, B:176:0x03b6, B:18:0x0035, B:58:0x0110, B:63:0x0138, B:106:0x0262, B:24:0x004d, B:30:0x0062, B:46:0x00d1, B:33:0x0070, B:34:0x007d, B:36:0x0083, B:38:0x0095, B:40:0x009a, B:42:0x00a0, B:43:0x00bf, B:45:0x00c5), top: B:181:0x0017 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0138 A[Catch: all -> 0x0024, Exception -> 0x0027, CancellationException -> 0x002a, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x0024, blocks: (B:7:0x001f, B:136:0x02be, B:151:0x032f, B:154:0x033f, B:156:0x034f, B:161:0x0361, B:167:0x0390, B:171:0x03a9, B:170:0x0396, B:162:0x0370, B:166:0x0382, B:139:0x02cf, B:140:0x02e0, B:142:0x02e6, B:144:0x02f5, B:145:0x02f9, B:147:0x02ff, B:148:0x031d, B:150:0x0323, B:176:0x03b6, B:18:0x0035, B:58:0x0110, B:63:0x0138, B:106:0x0262, B:24:0x004d, B:30:0x0062, B:46:0x00d1, B:33:0x0070, B:34:0x007d, B:36:0x0083, B:38:0x0095, B:40:0x009a, B:42:0x00a0, B:43:0x00bf, B:45:0x00c5), top: B:181:0x0017 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0156 A[Catch: all -> 0x02aa, Exception -> 0x02ae, CancellationException -> 0x02b1, TRY_ENTER, TryCatch #13 {CancellationException -> 0x02b1, Exception -> 0x02ae, all -> 0x02aa, blocks: (B:53:0x00f7, B:54:0x00fa, B:56:0x0108, B:61:0x0127, B:64:0x014a, B:68:0x0156, B:69:0x0167, B:28:0x005c, B:48:0x00db, B:50:0x00e7), top: B:182:0x005c }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01ec A[Catch: all -> 0x0185, Exception -> 0x0189, CancellationException -> 0x018d, LOOP:4: B:89:0x01e6->B:91:0x01ec, LOOP_END, TRY_ENTER, TRY_LEAVE, TryCatch #10 {CancellationException -> 0x018d, Exception -> 0x0189, all -> 0x0185, blocks: (B:71:0x016d, B:73:0x017f, B:83:0x0197, B:84:0x01b1, B:86:0x01b7, B:91:0x01ec, B:95:0x0224, B:98:0x0232), top: B:188:0x016d }] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0224 A[Catch: all -> 0x0185, Exception -> 0x0189, CancellationException -> 0x018d, TRY_ENTER, TRY_LEAVE, TryCatch #10 {CancellationException -> 0x018d, Exception -> 0x0189, all -> 0x0185, blocks: (B:71:0x016d, B:73:0x017f, B:83:0x0197, B:84:0x01b1, B:86:0x01b7, B:91:0x01ec, B:95:0x0224, B:98:0x0232), top: B:188:0x016d }] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0232 A[Catch: all -> 0x0185, Exception -> 0x0189, CancellationException -> 0x018d, TRY_ENTER, TRY_LEAVE, TryCatch #10 {CancellationException -> 0x018d, Exception -> 0x0189, all -> 0x0185, blocks: (B:71:0x016d, B:73:0x017f, B:83:0x0197, B:84:0x01b1, B:86:0x01b7, B:91:0x01ec, B:95:0x0224, B:98:0x0232), top: B:188:0x016d }] */
    /* JADX WARN: Type inference failed for: r3v17, types: [int] */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v23 */
    @Override // defpackage.vd1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r35) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 963
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ux4.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
