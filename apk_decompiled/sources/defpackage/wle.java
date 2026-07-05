package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class wle extends xzg implements pz7 {
    public jme E;
    public z9e F;
    public cae G;
    public bae H;
    public jme I;
    public of0 J;
    public int K;
    public /* synthetic */ Object L;
    public final /* synthetic */ yle M;
    public final /* synthetic */ String N;
    public final /* synthetic */ long O;
    public final /* synthetic */ String P;
    public final /* synthetic */ String Q;
    public final /* synthetic */ rre R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wle(yle yleVar, String str, long j, String str2, String str3, rre rreVar, tp4 tp4Var) {
        super(2, tp4Var);
        this.M = yleVar;
        this.N = str;
        this.O = j;
        this.P = str2;
        this.Q = str3;
        this.R = rreVar;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        wle wleVar = new wle(this.M, this.N, this.O, this.P, this.Q, this.R, tp4Var);
        wleVar.L = obj;
        return wleVar;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        return ((wle) create((lp7) obj, (tp4) obj2)).invokeSuspend(iei.a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:135|(1:279)|136|(5:139|(4:262|142|143|140)|302|146|(3:148|(2:151|149)|305))|153|154|269|155|156|(14:(2:250|159)(1:162)|(1:164)(1:165)|(1:167)(1:169)|168|(1:171)(1:172)|(1:174)(1:175)|(2:177|178)(1:179)|180|181|275|182|183|184|(2:186|307)(1:310))) */
    /* JADX WARN: Can't wrap try/catch for region: R(16:38|(1:40)(1:41)|281|42|43|273|44|45|277|46|47|289|48|(5:51|22|256|52|(36:271|54|55|300|56|(32:293|58|(0)(1:67)|71|287|72|77|(1:79)|80|(1:(1:83)(22:85|291|86|87|258|88|89|254|90|91|267|92|(1:94)|95|96|265|97|98|285|99|100|(2:102|306)(9:103|104|283|131|(3:133|297|(10:135|279|136|(5:139|(4:262|142|143|140)|302|146|(3:148|(2:151|149)|305))|153|154|269|155|156|(14:(2:250|159)(1:162)|(1:164)(1:165)|(1:167)(1:169)|168|(1:171)(1:172)|(1:174)(1:175)|(2:177|178)(1:179)|180|181|275|182|183|184|(2:186|307)(1:310)))(2:198|199))(1:200)|193|201|236|(2:238|(1:309)(3:241|242|(1:308)(4:245|246|36|(0))))(3:247|36|(0)))))|84|291|86|87|258|88|89|254|90|91|267|92|(0)|95|96|265|97|98|285|99|100|(0)(0))|70|71|287|72|77|(0)|80|(0)|84|291|86|87|258|88|89|254|90|91|267|92|(0)|95|96|265|97|98|285|99|100|(0)(0))(4:127|260|128|(8:130|283|131|(0)(0)|193|201|236|(0)(0))(4:202|252|203|204)))|31|244) */
    /* JADX WARN: Can't wrap try/catch for region: R(36:(1:271)|54|55|300|56|(32:293|58|(0)(1:67)|71|287|72|77|(1:79)|80|(1:(1:83)(22:85|291|86|87|258|88|89|254|90|91|267|92|(1:94)|95|96|265|97|98|285|99|100|(2:102|306)(9:103|104|283|131|(3:133|297|(10:135|279|136|(5:139|(4:262|142|143|140)|302|146|(3:148|(2:151|149)|305))|153|154|269|155|156|(14:(2:250|159)(1:162)|(1:164)(1:165)|(1:167)(1:169)|168|(1:171)(1:172)|(1:174)(1:175)|(2:177|178)(1:179)|180|181|275|182|183|184|(2:186|307)(1:310)))(2:198|199))(1:200)|193|201|236|(2:238|(1:309)(3:241|242|(1:308)(4:245|246|36|(0))))(3:247|36|(0)))))|84|291|86|87|258|88|89|254|90|91|267|92|(0)|95|96|265|97|98|285|99|100|(0)(0))|70|71|287|72|77|(0)|80|(0)|84|291|86|87|258|88|89|254|90|91|267|92|(0)|95|96|265|97|98|285|99|100|(0)(0)) */
    /* JADX WARN: Can't wrap try/catch for region: R(36:271|54|55|300|56|(32:293|58|(0)(1:67)|71|287|72|77|(1:79)|80|(1:(1:83)(22:85|291|86|87|258|88|89|254|90|91|267|92|(1:94)|95|96|265|97|98|285|99|100|(2:102|306)(9:103|104|283|131|(3:133|297|(10:135|279|136|(5:139|(4:262|142|143|140)|302|146|(3:148|(2:151|149)|305))|153|154|269|155|156|(14:(2:250|159)(1:162)|(1:164)(1:165)|(1:167)(1:169)|168|(1:171)(1:172)|(1:174)(1:175)|(2:177|178)(1:179)|180|181|275|182|183|184|(2:186|307)(1:310)))(2:198|199))(1:200)|193|201|236|(2:238|(1:309)(3:241|242|(1:308)(4:245|246|36|(0))))(3:247|36|(0)))))|84|291|86|87|258|88|89|254|90|91|267|92|(0)|95|96|265|97|98|285|99|100|(0)(0))|70|71|287|72|77|(0)|80|(0)|84|291|86|87|258|88|89|254|90|91|267|92|(0)|95|96|265|97|98|285|99|100|(0)(0)) */
    /* JADX WARN: Can't wrap try/catch for region: R(5:51|22|256|52|(36:271|54|55|300|56|(32:293|58|(0)(1:67)|71|287|72|77|(1:79)|80|(1:(1:83)(22:85|291|86|87|258|88|89|254|90|91|267|92|(1:94)|95|96|265|97|98|285|99|100|(2:102|306)(9:103|104|283|131|(3:133|297|(10:135|279|136|(5:139|(4:262|142|143|140)|302|146|(3:148|(2:151|149)|305))|153|154|269|155|156|(14:(2:250|159)(1:162)|(1:164)(1:165)|(1:167)(1:169)|168|(1:171)(1:172)|(1:174)(1:175)|(2:177|178)(1:179)|180|181|275|182|183|184|(2:186|307)(1:310)))(2:198|199))(1:200)|193|201|236|(2:238|(1:309)(3:241|242|(1:308)(4:245|246|36|(0))))(3:247|36|(0)))))|84|291|86|87|258|88|89|254|90|91|267|92|(0)|95|96|265|97|98|285|99|100|(0)(0))|70|71|287|72|77|(0)|80|(0)|84|291|86|87|258|88|89|254|90|91|267|92|(0)|95|96|265|97|98|285|99|100|(0)(0))(4:127|260|128|(8:130|283|131|(0)(0)|193|201|236|(0)(0))(4:202|252|203|204))) */
    /* JADX WARN: Can't wrap try/catch for region: R(9:103|104|283|131|(3:133|297|(10:135|279|136|(5:139|(4:262|142|143|140)|302|146|(3:148|(2:151|149)|305))|153|154|269|155|156|(14:(2:250|159)(1:162)|(1:164)(1:165)|(1:167)(1:169)|168|(1:171)(1:172)|(1:174)(1:175)|(2:177|178)(1:179)|180|181|275|182|183|184|(2:186|307)(1:310)))(2:198|199))(1:200)|193|201|236|(2:238|(1:309)(3:241|242|(1:308)(4:245|246|36|(0))))(3:247|36|(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0211, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0212, code lost:
    
        r11 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0214, code lost:
    
        r15 = r5;
        r2 = r9;
        r8 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x021a, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x021b, code lost:
    
        r5 = r6;
        r11 = r17;
        r28 = r27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0223, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0224, code lost:
    
        r5 = r6;
        r28 = r11;
        r11 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x022c, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x022d, code lost:
    
        r5 = r6;
        r28 = r11;
        r11 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0235, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0236, code lost:
    
        r5 = r6;
        r28 = r11;
        r11 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x023d, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x023e, code lost:
    
        r5 = r6;
        r28 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0241, code lost:
    
        r11 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0243, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0244, code lost:
    
        r28 = r11;
        r5 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0248, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0249, code lost:
    
        r28 = r11;
        r5 = r13;
        r11 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x034e, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x034f, code lost:
    
        r6 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x0353, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x0354, code lost:
    
        r2 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x0376, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x0377, code lost:
    
        r25 = r5;
        r2 = r9;
        r28 = r11;
        r5 = r13;
        r6 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x037f, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x0380, code lost:
    
        r25 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x0382, code lost:
    
        r2 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x0383, code lost:
    
        r28 = r11;
        r6 = r14;
        r7 = r4;
        r4 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x038a, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x038b, code lost:
    
        r17 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:217:0x038e, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:218:0x038f, code lost:
    
        r17 = r2;
        r25 = r5;
        r24 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x0396, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:220:0x0397, code lost:
    
        r17 = r2;
        r25 = r5;
        r24 = r7;
        r2 = r9;
        r23 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00d6, code lost:
    
        if (r2.g(r0, r30) == r14) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00dd, code lost:
    
        if (r0.b != false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x018f, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0195, code lost:
    
        r0 = new defpackage.hre(r0);
     */
    /* JADX WARN: Not initialized variable reg: 4, insn: 0x0065: MOVE (r7 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]), block:B:12:0x005c */
    /* JADX WARN: Path cross not found for [B:153:0x02d5, B:139:0x0277], limit reached: 304 */
    /* JADX WARN: Path cross not found for [B:293:0x0157, B:70:0x0182], limit reached: 304 */
    /* JADX WARN: Path cross not found for [B:82:0x01a0, B:84:0x01a4], limit reached: 304 */
    /* JADX WARN: Path cross not found for [B:84:0x01a4, B:82:0x01a0], limit reached: 304 */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0265 A[Catch: Exception -> 0x0353, TryCatch #17 {Exception -> 0x0353, blocks: (B:131:0x025f, B:133:0x0265, B:135:0x0269, B:139:0x0277, B:140:0x0286, B:146:0x02a3, B:153:0x02d5), top: B:283:0x025f }] */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0361  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x040b  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x044c  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x045b  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0469  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0142 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:308:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01c4  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:245:0x044c -> B:246:0x044e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:247:0x045b -> B:36:0x00f6). Please report as a decompilation issue!!! */
    @Override // defpackage.vd1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r31) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 1150
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wle.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
