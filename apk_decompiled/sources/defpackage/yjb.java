package defpackage;

import android.media.AudioRecord;

/* JADX INFO: loaded from: classes2.dex */
public final class yjb extends xzg implements pz7 {
    public AudioRecord E;
    public dae F;
    public dae G;
    public bae H;
    public z9e I;
    public short[] J;
    public dae K;
    public int L;
    public int M;
    public int N;
    public /* synthetic */ Object O;
    public final /* synthetic */ akb P;
    public final /* synthetic */ int Q;
    public final /* synthetic */ bkb R;
    public final /* synthetic */ boolean S;
    public final /* synthetic */ bz7 T;
    public final /* synthetic */ qd U;
    public final /* synthetic */ int V;
    public final /* synthetic */ bz7 W;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yjb(akb akbVar, int i, bkb bkbVar, boolean z, bz7 bz7Var, qd qdVar, int i2, bz7 bz7Var2, tp4 tp4Var) {
        super(2, tp4Var);
        this.P = akbVar;
        this.Q = i;
        this.R = bkbVar;
        this.S = z;
        this.T = bz7Var;
        this.U = qdVar;
        this.V = i2;
        this.W = bz7Var2;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        yjb yjbVar = new yjb(this.P, this.Q, this.R, this.S, this.T, this.U, this.V, this.W, tp4Var);
        yjbVar.O = obj;
        return yjbVar;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        return ((yjb) create((lp7) obj, (tp4) obj2)).invokeSuspend(iei.a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|2|331|(1:(9:(1:(1:(1:(7:9|10|11|255|350|73|(9:264|329|265|266|(1:268)|269|(1:271)|272|273)(2:75|(2:89|(6:248|249|250|346|251|(1:386)(5:254|255|350|73|(0)(0)))(7:93|(1:95)|96|(1:98)|99|100|(2:102|(9:241|242|(1:244)|245|364|255|350|73|(0)(0))(2:104|(5:106|(1:108)(5:109|(4:112|(2:114|377)(1:378)|115|110)|376|116|(3:118|(2:121|119)|379))|122|123|(1:387)(26:126|127|336|128|(5:130|131|325|132|(1:388)(8:135|354|136|33f|147|148|209|(0)(0)))(3:161|162|163)|155|156|334|164|38b|169|(1:171)|172|(1:174)|175|176|(1:178)|179|180|358|181|(1:183)(5:184|(9:187|332|188|189|356|190|(2:192|367)(1:368)|193|185)|366|202|(3:204|(2:207|205)|375))|208|148|209|(0)(0)))(2:239|240)))(2:246|247)))(7:77|(1:79)|365|80|(1:82)|83|(3:85|54|253)(7:86|87|88|255|350|73|(0)(0)))))(2:16|17))(7:18|362|19|20|354|136|33f))(13:28|352|29|30|127|336|128|(0)(0)|155|156|334|164|38b))(10:35|348|36|37|87|88|255|350|73|(0)(0))|338|297|298|(1:300)|301|(1:303)|304|305)(4:42|360|43|44))(8:49|342|50|51|52|(1:55)|54|253)|56|(5:58|(1:63)(1:62)|64|(1:69)(1:68)|70)|71|72|350|73|(0)(0)|(3:(0)|(1:355)|(1:357))) */
    /* JADX WARN: Can't wrap try/catch for region: R(13:(14:126|127|336|128|(5:130|131|325|132|(1:388)(8:135|354|136|33f|147|148|209|(0)(0)))(3:161|162|163)|155|156|358|181|(1:183)(5:184|(9:187|332|188|189|356|190|(2:192|367)(1:368)|193|185)|366|202|(3:204|(2:207|205)|375))|208|148|209|(0)(0))|334|164|38b|169|(1:171)|172|(1:174)|175|176|(1:178)|179|180) */
    /* JADX WARN: Can't wrap try/catch for region: R(14:126|127|336|128|(5:130|131|325|132|(1:388)(8:135|354|136|33f|147|148|209|(0)(0)))(3:161|162|163)|155|156|358|181|(1:183)(5:184|(9:187|332|188|189|356|190|(2:192|367)(1:368)|193|185)|366|202|(3:204|(2:207|205)|375))|208|148|209|(0)(0)) */
    /* JADX WARN: Can't wrap try/catch for region: R(5:130|131|325|132|(1:388)(8:135|354|136|33f|147|148|209|(0)(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x037b, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x0458, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:260:0x052d, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:262:0x0531, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x021d A[Catch: all -> 0x00cf, Exception -> 0x00d3, TRY_ENTER, TryCatch #25 {Exception -> 0x00d3, all -> 0x00cf, blocks: (B:104:0x021d, B:106:0x0223, B:122:0x02b2, B:109:0x0238, B:110:0x0249, B:112:0x024f, B:114:0x0265, B:116:0x026d, B:118:0x0275, B:119:0x02a0, B:121:0x02a6, B:239:0x049f, B:240:0x04c0, B:43:0x00c6), top: B:360:0x00c6 }] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02f2 A[Catch: all -> 0x0033, CancellationException -> 0x0377, Exception -> 0x037b, TRY_LEAVE, TryCatch #10 {all -> 0x0033, blocks: (B:10:0x002c, B:79:0x019a, B:80:0x01a6, B:82:0x01b7, B:83:0x01bb, B:87:0x01e5, B:91:0x01f0, B:93:0x01f4, B:95:0x01fa, B:96:0x01fd, B:98:0x0206, B:99:0x0209, B:127:0x02da, B:128:0x02df, B:130:0x02f2, B:132:0x0313, B:136:0x0323, B:137:0x033f, B:146:0x035b, B:147:0x035c, B:153:0x036d, B:154:0x036e, B:171:0x0397, B:174:0x03a0, B:178:0x03ac, B:274:0x055a, B:276:0x055e, B:291:0x05cc, B:295:0x05d7, B:294:0x05d1, B:279:0x056c, B:280:0x057d, B:282:0x0583, B:284:0x0592, B:285:0x0596, B:287:0x059c, B:288:0x05ba, B:290:0x05c0, B:296:0x05d8, B:220:0x0470, B:221:0x0474, B:224:0x0479, B:225:0x047a, B:227:0x0480, B:228:0x0483, B:230:0x0489, B:231:0x048c, B:233:0x0495, B:234:0x0498, B:235:0x049b, B:237:0x049d, B:238:0x049e, B:162:0x037f, B:163:0x0386, B:242:0x04c2, B:244:0x04c6, B:245:0x04cf, B:246:0x04da, B:247:0x04fb, B:56:0x0129, B:58:0x0146, B:60:0x0152, B:64:0x015b, B:66:0x0165, B:70:0x016e, B:71:0x0174, B:52:0x00fd), top: B:331:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:161:0x037e  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0475  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x04c1  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0534  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x055e A[Catch: all -> 0x0033, TryCatch #10 {all -> 0x0033, blocks: (B:10:0x002c, B:79:0x019a, B:80:0x01a6, B:82:0x01b7, B:83:0x01bb, B:87:0x01e5, B:91:0x01f0, B:93:0x01f4, B:95:0x01fa, B:96:0x01fd, B:98:0x0206, B:99:0x0209, B:127:0x02da, B:128:0x02df, B:130:0x02f2, B:132:0x0313, B:136:0x0323, B:137:0x033f, B:146:0x035b, B:147:0x035c, B:153:0x036d, B:154:0x036e, B:171:0x0397, B:174:0x03a0, B:178:0x03ac, B:274:0x055a, B:276:0x055e, B:291:0x05cc, B:295:0x05d7, B:294:0x05d1, B:279:0x056c, B:280:0x057d, B:282:0x0583, B:284:0x0592, B:285:0x0596, B:287:0x059c, B:288:0x05ba, B:290:0x05c0, B:296:0x05d8, B:220:0x0470, B:221:0x0474, B:224:0x0479, B:225:0x047a, B:227:0x0480, B:228:0x0483, B:230:0x0489, B:231:0x048c, B:233:0x0495, B:234:0x0498, B:235:0x049b, B:237:0x049d, B:238:0x049e, B:162:0x037f, B:163:0x0386, B:242:0x04c2, B:244:0x04c6, B:245:0x04cf, B:246:0x04da, B:247:0x04fb, B:56:0x0129, B:58:0x0146, B:60:0x0152, B:64:0x015b, B:66:0x0165, B:70:0x016e, B:71:0x0174, B:52:0x00fd), top: B:331:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:296:0x05d8 A[Catch: all -> 0x0033, TRY_LEAVE, TryCatch #10 {all -> 0x0033, blocks: (B:10:0x002c, B:79:0x019a, B:80:0x01a6, B:82:0x01b7, B:83:0x01bb, B:87:0x01e5, B:91:0x01f0, B:93:0x01f4, B:95:0x01fa, B:96:0x01fd, B:98:0x0206, B:99:0x0209, B:127:0x02da, B:128:0x02df, B:130:0x02f2, B:132:0x0313, B:136:0x0323, B:137:0x033f, B:146:0x035b, B:147:0x035c, B:153:0x036d, B:154:0x036e, B:171:0x0397, B:174:0x03a0, B:178:0x03ac, B:274:0x055a, B:276:0x055e, B:291:0x05cc, B:295:0x05d7, B:294:0x05d1, B:279:0x056c, B:280:0x057d, B:282:0x0583, B:284:0x0592, B:285:0x0596, B:287:0x059c, B:288:0x05ba, B:290:0x05c0, B:296:0x05d8, B:220:0x0470, B:221:0x0474, B:224:0x0479, B:225:0x047a, B:227:0x0480, B:228:0x0483, B:230:0x0489, B:231:0x048c, B:233:0x0495, B:234:0x0498, B:235:0x049b, B:237:0x049d, B:238:0x049e, B:162:0x037f, B:163:0x0386, B:242:0x04c2, B:244:0x04c6, B:245:0x04cf, B:246:0x04da, B:247:0x04fb, B:56:0x0129, B:58:0x0146, B:60:0x0152, B:64:0x015b, B:66:0x0165, B:70:0x016e, B:71:0x0174, B:52:0x00fd), top: B:331:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:300:0x05e5  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x05ee  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x0340 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x018d A[Catch: all -> 0x052d, Exception -> 0x0531, TRY_LEAVE, TryCatch #31 {Exception -> 0x0531, all -> 0x052d, blocks: (B:73:0x0183, B:75:0x018d, B:249:0x04ff), top: B:350:0x0183 }] */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v10 */
    /* JADX WARN: Type inference failed for: r17v11 */
    /* JADX WARN: Type inference failed for: r17v12 */
    /* JADX WARN: Type inference failed for: r17v13 */
    /* JADX WARN: Type inference failed for: r17v14 */
    /* JADX WARN: Type inference failed for: r17v17 */
    /* JADX WARN: Type inference failed for: r17v18 */
    /* JADX WARN: Type inference failed for: r17v19 */
    /* JADX WARN: Type inference failed for: r17v2 */
    /* JADX WARN: Type inference failed for: r17v20 */
    /* JADX WARN: Type inference failed for: r17v3 */
    /* JADX WARN: Type inference failed for: r17v4 */
    /* JADX WARN: Type inference failed for: r17v5 */
    /* JADX WARN: Type inference failed for: r17v6 */
    /* JADX WARN: Type inference failed for: r17v7 */
    /* JADX WARN: Type inference failed for: r17v8 */
    /* JADX WARN: Type inference failed for: r17v9 */
    /* JADX WARN: Type inference failed for: r20v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r20v1 */
    /* JADX WARN: Type inference failed for: r20v10 */
    /* JADX WARN: Type inference failed for: r20v11 */
    /* JADX WARN: Type inference failed for: r20v12 */
    /* JADX WARN: Type inference failed for: r20v13 */
    /* JADX WARN: Type inference failed for: r20v14 */
    /* JADX WARN: Type inference failed for: r20v15 */
    /* JADX WARN: Type inference failed for: r20v16, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r20v18 */
    /* JADX WARN: Type inference failed for: r20v19 */
    /* JADX WARN: Type inference failed for: r20v2 */
    /* JADX WARN: Type inference failed for: r20v20 */
    /* JADX WARN: Type inference failed for: r20v21 */
    /* JADX WARN: Type inference failed for: r20v23 */
    /* JADX WARN: Type inference failed for: r20v24 */
    /* JADX WARN: Type inference failed for: r20v25 */
    /* JADX WARN: Type inference failed for: r20v26 */
    /* JADX WARN: Type inference failed for: r20v27 */
    /* JADX WARN: Type inference failed for: r20v28 */
    /* JADX WARN: Type inference failed for: r20v29 */
    /* JADX WARN: Type inference failed for: r20v3 */
    /* JADX WARN: Type inference failed for: r20v30 */
    /* JADX WARN: Type inference failed for: r20v31 */
    /* JADX WARN: Type inference failed for: r20v32 */
    /* JADX WARN: Type inference failed for: r20v33 */
    /* JADX WARN: Type inference failed for: r20v34 */
    /* JADX WARN: Type inference failed for: r20v35 */
    /* JADX WARN: Type inference failed for: r20v36 */
    /* JADX WARN: Type inference failed for: r20v37 */
    /* JADX WARN: Type inference failed for: r20v38 */
    /* JADX WARN: Type inference failed for: r20v39 */
    /* JADX WARN: Type inference failed for: r20v4 */
    /* JADX WARN: Type inference failed for: r20v40 */
    /* JADX WARN: Type inference failed for: r20v41 */
    /* JADX WARN: Type inference failed for: r20v42 */
    /* JADX WARN: Type inference failed for: r20v5 */
    /* JADX WARN: Type inference failed for: r20v6 */
    /* JADX WARN: Type inference failed for: r20v7 */
    /* JADX WARN: Type inference failed for: r20v8 */
    /* JADX WARN: Type inference failed for: r20v9 */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, lp7] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v26, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v27, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v29, types: [java.lang.Object, lp7] */
    /* JADX WARN: Type inference failed for: r2v30 */
    /* JADX WARN: Type inference failed for: r2v31 */
    /* JADX WARN: Type inference failed for: r2v32 */
    /* JADX WARN: Type inference failed for: r2v33 */
    /* JADX WARN: Type inference failed for: r2v34 */
    /* JADX WARN: Type inference failed for: r2v35 */
    /* JADX WARN: Type inference failed for: r2v36 */
    /* JADX WARN: Type inference failed for: r2v37 */
    /* JADX WARN: Type inference failed for: r2v38 */
    /* JADX WARN: Type inference failed for: r2v39 */
    /* JADX WARN: Type inference failed for: r2v40 */
    /* JADX WARN: Type inference failed for: r2v41 */
    /* JADX WARN: Type inference failed for: r2v42 */
    /* JADX WARN: Type inference failed for: r2v43 */
    /* JADX WARN: Type inference failed for: r2v44 */
    /* JADX WARN: Type inference failed for: r2v45 */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v30 */
    /* JADX WARN: Type inference failed for: r3v34 */
    /* JADX WARN: Type inference failed for: r3v38 */
    /* JADX WARN: Type inference failed for: r3v48 */
    /* JADX WARN: Type inference failed for: r3v50 */
    /* JADX WARN: Type inference failed for: r3v51 */
    /* JADX WARN: Type inference failed for: r3v52 */
    /* JADX WARN: Type inference failed for: r3v58 */
    /* JADX WARN: Type inference failed for: r3v59 */
    /* JADX WARN: Type inference failed for: r3v60 */
    /* JADX WARN: Type inference failed for: r3v61 */
    /* JADX WARN: Type inference failed for: r3v62 */
    /* JADX WARN: Type inference failed for: r3v63 */
    /* JADX WARN: Type inference failed for: r3v64 */
    /* JADX WARN: Type inference failed for: r3v65 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [android.media.AudioRecord] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v27, types: [android.media.AudioRecord] */
    /* JADX WARN: Type inference failed for: r4v28 */
    /* JADX WARN: Type inference failed for: r4v35 */
    /* JADX WARN: Type inference failed for: r4v36 */
    /* JADX WARN: Type inference failed for: r4v37, types: [android.media.AudioRecord] */
    /* JADX WARN: Type inference failed for: r4v38 */
    /* JADX WARN: Type inference failed for: r4v40 */
    /* JADX WARN: Type inference failed for: r4v41 */
    /* JADX WARN: Type inference failed for: r4v42 */
    /* JADX WARN: Type inference failed for: r4v44 */
    /* JADX WARN: Type inference failed for: r4v47 */
    /* JADX WARN: Type inference failed for: r4v48 */
    /* JADX WARN: Type inference failed for: r4v50 */
    /* JADX WARN: Type inference failed for: r4v52 */
    /* JADX WARN: Type inference failed for: r4v54 */
    /* JADX WARN: Type inference failed for: r4v56 */
    /* JADX WARN: Type inference failed for: r4v57, types: [android.media.AudioRecord] */
    /* JADX WARN: Type inference failed for: r4v58 */
    /* JADX WARN: Type inference failed for: r4v59 */
    /* JADX WARN: Type inference failed for: r4v60 */
    /* JADX WARN: Type inference failed for: r4v61 */
    /* JADX WARN: Type inference failed for: r4v62 */
    /* JADX WARN: Type inference failed for: r4v63 */
    /* JADX WARN: Type inference failed for: r4v64 */
    /* JADX WARN: Type inference failed for: r4v65 */
    /* JADX WARN: Type inference failed for: r4v66 */
    /* JADX WARN: Type inference failed for: r4v7, types: [android.media.AudioRecord] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v25 */
    /* JADX WARN: Type inference failed for: r5v27 */
    /* JADX WARN: Type inference failed for: r5v29 */
    /* JADX WARN: Type inference failed for: r5v33, types: [android.media.AudioRecord] */
    /* JADX WARN: Type inference failed for: r5v47 */
    /* JADX WARN: Type inference failed for: r5v50, types: [android.media.AudioRecord] */
    /* JADX WARN: Type inference failed for: r5v59 */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r6v25 */
    /* JADX WARN: Type inference failed for: r6v26, types: [android.media.AudioRecord] */
    /* JADX WARN: Type inference failed for: r6v29 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v19, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v27, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v28 */
    /* JADX WARN: Type inference failed for: r7v29, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v31, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v39 */
    /* JADX WARN: Type inference failed for: r7v44 */
    /* JADX WARN: Type inference failed for: r7v46 */
    /* JADX WARN: Type inference failed for: r7v47 */
    /* JADX WARN: Type inference failed for: r7v48 */
    /* JADX WARN: Type inference failed for: r7v49 */
    /* JADX WARN: Type inference failed for: r7v50 */
    /* JADX WARN: Type inference failed for: r7v51 */
    /* JADX WARN: Type inference failed for: r7v52 */
    /* JADX WARN: Type inference failed for: r7v53 */
    /* JADX WARN: Type inference failed for: r7v54 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:209:0x0454 -> B:103:0x021b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:254:0x0521 -> B:255:0x0522). Please report as a decompilation issue!!! */
    @Override // defpackage.vd1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 1630
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yjb.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
