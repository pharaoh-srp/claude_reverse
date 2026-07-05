package defpackage;

import io.sentry.j6;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class hmf implements j6 {
    public static final Set b = mp0.Z0(new String[]{"ANR", "AppExitInfo", "HistoricalAppExitInfo"});
    public final qi3 a;

    public hmf(qi3 qi3Var) {
        this.a = qi3Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0040 A[Catch: Exception -> 0x0087, TRY_LEAVE, TryCatch #0 {Exception -> 0x0087, blocks: (B:4:0x0006, B:6:0x000d, B:8:0x0015, B:10:0x001b, B:12:0x001f, B:14:0x0023, B:17:0x002c, B:18:0x002e, B:23:0x003a, B:25:0x0040, B:28:0x0048, B:36:0x0057, B:38:0x005f, B:40:0x0065, B:43:0x0073, B:47:0x0079, B:32:0x004f), top: B:50:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0048 A[Catch: Exception -> 0x0087, TRY_ENTER, TryCatch #0 {Exception -> 0x0087, blocks: (B:4:0x0006, B:6:0x000d, B:8:0x0015, B:10:0x001b, B:12:0x001f, B:14:0x0023, B:17:0x002c, B:18:0x002e, B:23:0x003a, B:25:0x0040, B:28:0x0048, B:36:0x0057, B:38:0x005f, B:40:0x0065, B:43:0x0073, B:47:0x0079, B:32:0x004f), top: B:50:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x005f A[Catch: Exception -> 0x0087, TryCatch #0 {Exception -> 0x0087, blocks: (B:4:0x0006, B:6:0x000d, B:8:0x0015, B:10:0x001b, B:12:0x001f, B:14:0x0023, B:17:0x002c, B:18:0x002e, B:23:0x003a, B:25:0x0040, B:28:0x0048, B:36:0x0057, B:38:0x005f, B:40:0x0065, B:43:0x0073, B:47:0x0079, B:32:0x004f), top: B:50:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006f  */
    @Override // io.sentry.j6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final io.sentry.j5 a(io.sentry.j5 r7, io.sentry.n0 r8) {
        /*
            r6 = this;
            io.sentry.t5 r8 = r7.Y
            io.sentry.t5 r0 = io.sentry.t5.FATAL
            if (r8 != r0) goto L87
            java.util.ArrayList r8 = r7.e()     // Catch: java.lang.Exception -> L87
            r0 = 0
            if (r8 == 0) goto L14
            java.lang.Object r8 = defpackage.w44.N0(r8)     // Catch: java.lang.Exception -> L87
            io.sentry.protocol.v r8 = (io.sentry.protocol.v) r8     // Catch: java.lang.Exception -> L87
            goto L15
        L14:
            r8 = r0
        L15:
            java.util.Set r1 = defpackage.hmf.b     // Catch: java.lang.Exception -> L87
            java.lang.Iterable r1 = (java.lang.Iterable) r1     // Catch: java.lang.Exception -> L87
            if (r8 == 0) goto L22
            io.sentry.protocol.o r2 = r8.J     // Catch: java.lang.Exception -> L87
            if (r2 == 0) goto L22
            java.lang.String r2 = r2.E     // Catch: java.lang.Exception -> L87
            goto L23
        L22:
            r2 = r0
        L23:
            boolean r1 = defpackage.w44.G0(r1, r2)     // Catch: java.lang.Exception -> L87
            r2 = 0
            if (r1 != 0) goto L39
            if (r8 == 0) goto L2e
            java.lang.String r0 = r8.E     // Catch: java.lang.Exception -> L87
        L2e:
            java.lang.String r1 = "ApplicationNotResponding"
            boolean r0 = defpackage.x44.r(r0, r1)     // Catch: java.lang.Exception -> L87
            if (r0 == 0) goto L37
            goto L39
        L37:
            r0 = r2
            goto L3a
        L39:
            r0 = 1
        L3a:
            java.lang.String r1 = r7.a()     // Catch: java.lang.Exception -> L87
            if (r1 == 0) goto L44
            boolean r2 = java.lang.Boolean.parseBoolean(r1)     // Catch: java.lang.Exception -> L87
        L44:
            java.lang.String r1 = ""
            if (r8 == 0) goto L56
            java.lang.String r3 = r8.F     // Catch: java.lang.Exception -> L87
            if (r3 == 0) goto L56
            if (r2 == 0) goto L4f
            goto L53
        L4f:
            java.lang.String r3 = defpackage.aph.d(r3)     // Catch: java.lang.Exception -> L87
        L53:
            if (r3 == 0) goto L56
            goto L57
        L56:
            r3 = r1
        L57:
            qi3 r6 = r6.a     // Catch: java.lang.Exception -> L87
            com.anthropic.claude.analytics.events.SentryEvents$SentryEvent r2 = new com.anthropic.claude.analytics.events.SentryEvents$SentryEvent     // Catch: java.lang.Exception -> L87
            io.sentry.t5 r4 = r7.Y     // Catch: java.lang.Exception -> L87
            if (r4 == 0) goto L6f
            java.lang.String r4 = r4.name()     // Catch: java.lang.Exception -> L87
            if (r4 == 0) goto L6f
            java.util.Locale r5 = java.util.Locale.ROOT     // Catch: java.lang.Exception -> L87
            java.lang.String r4 = r4.toLowerCase(r5)     // Catch: java.lang.Exception -> L87
            r4.getClass()     // Catch: java.lang.Exception -> L87
            goto L71
        L6f:
            java.lang.String r4 = "unknown"
        L71:
            if (r8 == 0) goto L79
            java.lang.String r8 = r8.E     // Catch: java.lang.Exception -> L87
            if (r8 != 0) goto L78
            goto L79
        L78:
            r1 = r8
        L79:
            r2.<init>(r4, r1, r3, r0)     // Catch: java.lang.Exception -> L87
            nmf r8 = com.anthropic.claude.analytics.events.SentryEvents$SentryEvent.Companion     // Catch: java.lang.Exception -> L87
            kotlinx.serialization.KSerializer r8 = r8.serializer()     // Catch: java.lang.Exception -> L87
            znf r8 = (defpackage.znf) r8     // Catch: java.lang.Exception -> L87
            r6.e(r2, r8)     // Catch: java.lang.Exception -> L87
        L87:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hmf.a(io.sentry.j5, io.sentry.n0):io.sentry.j5");
    }
}
