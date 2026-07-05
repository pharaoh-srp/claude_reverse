package defpackage;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import java.util.regex.Pattern;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import okhttp3.internal.http2.ConnectionShutdownException;

/* JADX INFO: loaded from: classes.dex */
public final class b92 implements f89 {
    public static final b92 F = new b92(0);
    public static final b92 G = new b92(1);
    public final /* synthetic */ int E;

    public /* synthetic */ b92(int i) {
        this.E = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:74:0x00d3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.kie a(defpackage.pqe r10, defpackage.w47 r11, defpackage.v4e r12) throws java.net.ProtocolException {
        /*
            Method dump skipped, instruction units count: 372
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b92.a(pqe, w47, v4e):kie");
    }

    public static boolean b(IOException iOException, f4e f4eVar, v4e v4eVar, kie kieVar) {
        tie tieVar;
        boolean z = iOException instanceof ConnectionShutdownException;
        if (!v4eVar.q) {
            return false;
        }
        if ((!z && (((tieVar = kieVar.d) != null && tieVar.isOneShot()) || (iOException instanceof FileNotFoundException))) || (iOException instanceof ProtocolException)) {
            return false;
        }
        if (iOException instanceof InterruptedIOException) {
            if (!(iOException instanceof SocketTimeoutException) || !z) {
                return false;
            }
        } else if (((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) {
            return false;
        }
        w47 w47Var = f4eVar.W;
        if (w47Var == null || !w47Var.b) {
            return false;
        }
        z47 z47Var = f4eVar.M;
        z47Var.getClass();
        z4e z4eVarC = z47Var.c();
        w47 w47Var2 = f4eVar.W;
        return z4eVarC.a(w47Var2 != null ? w47Var2.c() : null);
    }

    public static int d(pqe pqeVar, int i) {
        String strA = pqeVar.J.a("Retry-After");
        if (strA == null) {
            strA = null;
        }
        if (strA == null) {
            return i;
        }
        Pattern patternCompile = Pattern.compile("\\d+");
        patternCompile.getClass();
        if (!patternCompile.matcher(strA).matches()) {
            return Integer.MAX_VALUE;
        }
        Integer numValueOf = Integer.valueOf(strA);
        numValueOf.getClass();
        return numValueOf.intValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:441:?, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0116, code lost:
    
        r2.g(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01b1, code lost:
    
        throw new java.lang.IllegalStateException("Check failed.");
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:310:0x0693  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x069a  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x06e6 A[Catch: IOException -> 0x06b3, TryCatch #4 {IOException -> 0x06b3, blocks: (B:315:0x069b, B:317:0x06a4, B:320:0x06b6, B:329:0x06dd, B:331:0x06e6, B:332:0x06f3, B:333:0x070c, B:338:0x0724, B:344:0x0733, B:345:0x073a, B:347:0x073d, B:350:0x0746, B:356:0x0754, B:358:0x078d, B:360:0x079e, B:364:0x07a9, B:371:0x07c2, B:374:0x07cf, B:375:0x07f3, B:366:0x07af, B:357:0x0776), top: B:389:0x069b }] */
    /* JADX WARN: Removed duplicated region for block: B:335:0x071e  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x0721  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x0724 A[Catch: IOException -> 0x06b3, TryCatch #4 {IOException -> 0x06b3, blocks: (B:315:0x069b, B:317:0x06a4, B:320:0x06b6, B:329:0x06dd, B:331:0x06e6, B:332:0x06f3, B:333:0x070c, B:338:0x0724, B:344:0x0733, B:345:0x073a, B:347:0x073d, B:350:0x0746, B:356:0x0754, B:358:0x078d, B:360:0x079e, B:364:0x07a9, B:371:0x07c2, B:374:0x07cf, B:375:0x07f3, B:366:0x07af, B:357:0x0776), top: B:389:0x069b }] */
    /* JADX WARN: Removed duplicated region for block: B:347:0x073d A[Catch: IOException -> 0x06b3, TryCatch #4 {IOException -> 0x06b3, blocks: (B:315:0x069b, B:317:0x06a4, B:320:0x06b6, B:329:0x06dd, B:331:0x06e6, B:332:0x06f3, B:333:0x070c, B:338:0x0724, B:344:0x0733, B:345:0x073a, B:347:0x073d, B:350:0x0746, B:356:0x0754, B:358:0x078d, B:360:0x079e, B:364:0x07a9, B:371:0x07c2, B:374:0x07cf, B:375:0x07f3, B:366:0x07af, B:357:0x0776), top: B:389:0x069b }] */
    /* JADX WARN: Removed duplicated region for block: B:353:0x074f  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x0776 A[Catch: IOException -> 0x06b3, TryCatch #4 {IOException -> 0x06b3, blocks: (B:315:0x069b, B:317:0x06a4, B:320:0x06b6, B:329:0x06dd, B:331:0x06e6, B:332:0x06f3, B:333:0x070c, B:338:0x0724, B:344:0x0733, B:345:0x073a, B:347:0x073d, B:350:0x0746, B:356:0x0754, B:358:0x078d, B:360:0x079e, B:364:0x07a9, B:371:0x07c2, B:374:0x07cf, B:375:0x07f3, B:366:0x07af, B:357:0x0776), top: B:389:0x069b }] */
    /* JADX WARN: Removed duplicated region for block: B:360:0x079e A[Catch: IOException -> 0x06b3, TryCatch #4 {IOException -> 0x06b3, blocks: (B:315:0x069b, B:317:0x06a4, B:320:0x06b6, B:329:0x06dd, B:331:0x06e6, B:332:0x06f3, B:333:0x070c, B:338:0x0724, B:344:0x0733, B:345:0x073a, B:347:0x073d, B:350:0x0746, B:356:0x0754, B:358:0x078d, B:360:0x079e, B:364:0x07a9, B:371:0x07c2, B:374:0x07cf, B:375:0x07f3, B:366:0x07af, B:357:0x0776), top: B:389:0x069b }] */
    /* JADX WARN: Removed duplicated region for block: B:366:0x07af A[Catch: IOException -> 0x06b3, TryCatch #4 {IOException -> 0x06b3, blocks: (B:315:0x069b, B:317:0x06a4, B:320:0x06b6, B:329:0x06dd, B:331:0x06e6, B:332:0x06f3, B:333:0x070c, B:338:0x0724, B:344:0x0733, B:345:0x073a, B:347:0x073d, B:350:0x0746, B:356:0x0754, B:358:0x078d, B:360:0x079e, B:364:0x07a9, B:371:0x07c2, B:374:0x07cf, B:375:0x07f3, B:366:0x07af, B:357:0x0776), top: B:389:0x069b }] */
    /* JADX WARN: Removed duplicated region for block: B:381:0x07fc A[ADDED_TO_REGION, REMOVE] */
    /* JADX WARN: Removed duplicated region for block: B:440:0x06f3 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r11v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r11v20, types: [y47] */
    /* JADX WARN: Type inference failed for: r11v44 */
    /* JADX WARN: Type inference failed for: r11v45 */
    /* JADX WARN: Type inference failed for: r1v32 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r23v0 */
    /* JADX WARN: Type inference failed for: r23v1 */
    /* JADX WARN: Type inference failed for: r23v10 */
    /* JADX WARN: Type inference failed for: r23v14 */
    /* JADX WARN: Type inference failed for: r23v16 */
    /* JADX WARN: Type inference failed for: r23v17 */
    /* JADX WARN: Type inference failed for: r23v2 */
    /* JADX WARN: Type inference failed for: r23v3 */
    /* JADX WARN: Type inference failed for: r23v4 */
    /* JADX WARN: Type inference failed for: r23v5 */
    /* JADX WARN: Type inference failed for: r23v6 */
    /* JADX WARN: Type inference failed for: r23v7 */
    /* JADX WARN: Type inference failed for: r23v8 */
    /* JADX WARN: Type inference failed for: r23v9 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.f89
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.pqe c(defpackage.v4e r44) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2058
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b92.c(v4e):pqe");
    }
}
