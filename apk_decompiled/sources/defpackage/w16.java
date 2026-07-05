package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class w16 implements n7d {
    public gx F;
    public final lqh E = new lqh();
    public boolean G = true;

    /* JADX WARN: Removed duplicated region for block: B:12:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    @Override // defpackage.n7d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.segment.analytics.kotlin.core.BaseEvent a(com.segment.analytics.kotlin.core.BaseEvent r5) {
        /*
            r4 = this;
            r5.getClass()
            kotlinx.serialization.json.JsonObject r0 = r5.getIntegrations()
            r1 = 0
            if (r0 == 0) goto L33
            r2 = r4
            pff r2 = (defpackage.pff) r2
            ih9 r3 = defpackage.dj9.a
            java.lang.String r2 = r2.J
            r2.getClass()
            java.lang.Object r0 = r0.get(r2)
            kotlinx.serialization.json.JsonElement r0 = (kotlinx.serialization.json.JsonElement) r0
            if (r0 == 0) goto L2b
            boolean r2 = r0 instanceof kotlinx.serialization.json.JsonPrimitive
            if (r2 == 0) goto L23
            kotlinx.serialization.json.JsonPrimitive r0 = (kotlinx.serialization.json.JsonPrimitive) r0
            goto L24
        L23:
            r0 = r1
        L24:
            if (r0 == 0) goto L2b
            java.lang.Boolean r0 = defpackage.ch9.e(r0)
            goto L2c
        L2b:
            r0 = r1
        L2c:
            if (r0 == 0) goto L33
            boolean r0 = r0.booleanValue()
            goto L34
        L33:
            r0 = 1
        L34:
            boolean r2 = r4.G
            if (r2 == 0) goto L92
            if (r0 == 0) goto L92
            m7d r0 = defpackage.m7d.E
            lqh r2 = r4.E
            com.segment.analytics.kotlin.core.BaseEvent r5 = r2.c(r0, r5)
            m7d r0 = defpackage.m7d.F
            com.segment.analytics.kotlin.core.BaseEvent r5 = r2.c(r0, r5)
            if (r5 == 0) goto L8b
            boolean r0 = r5 instanceof com.segment.analytics.kotlin.core.IdentifyEvent
            if (r0 == 0) goto L57
            com.segment.analytics.kotlin.core.IdentifyEvent r5 = (com.segment.analytics.kotlin.core.IdentifyEvent) r5
            pff r4 = (defpackage.pff) r4
            r4.d(r5)
        L55:
            r1 = r5
            goto L8b
        L57:
            boolean r0 = r5 instanceof com.segment.analytics.kotlin.core.TrackEvent
            if (r0 == 0) goto L63
            com.segment.analytics.kotlin.core.TrackEvent r5 = (com.segment.analytics.kotlin.core.TrackEvent) r5
            pff r4 = (defpackage.pff) r4
            r4.d(r5)
            goto L55
        L63:
            boolean r0 = r5 instanceof com.segment.analytics.kotlin.core.GroupEvent
            if (r0 == 0) goto L6f
            com.segment.analytics.kotlin.core.GroupEvent r5 = (com.segment.analytics.kotlin.core.GroupEvent) r5
            pff r4 = (defpackage.pff) r4
            r4.d(r5)
            goto L55
        L6f:
            boolean r0 = r5 instanceof com.segment.analytics.kotlin.core.ScreenEvent
            if (r0 == 0) goto L7b
            com.segment.analytics.kotlin.core.ScreenEvent r5 = (com.segment.analytics.kotlin.core.ScreenEvent) r5
            pff r4 = (defpackage.pff) r4
            r4.d(r5)
            goto L55
        L7b:
            boolean r0 = r5 instanceof com.segment.analytics.kotlin.core.AliasEvent
            if (r0 == 0) goto L87
            com.segment.analytics.kotlin.core.AliasEvent r5 = (com.segment.analytics.kotlin.core.AliasEvent) r5
            pff r4 = (defpackage.pff) r4
            r4.d(r5)
            goto L55
        L87:
            defpackage.mr9.b()
            return r1
        L8b:
            m7d r4 = defpackage.m7d.H
            com.segment.analytics.kotlin.core.BaseEvent r4 = r2.c(r4, r1)
            return r4
        L92:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w16.a(com.segment.analytics.kotlin.core.BaseEvent):com.segment.analytics.kotlin.core.BaseEvent");
    }

    @Override // defpackage.n7d
    public final gx e() {
        gx gxVar = this.F;
        if (gxVar != null) {
            return gxVar;
        }
        x44.o0("analytics");
        throw null;
    }

    @Override // defpackage.n7d
    public final m7d getType() {
        return m7d.G;
    }
}
