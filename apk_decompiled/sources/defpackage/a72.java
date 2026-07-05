package defpackage;

import android.content.Context;
import com.anthropic.claude.R;
import com.anthropic.claude.tool.model.EventDeleteV0Output;
import com.anthropic.claude.tool.model.EventDeleteV0OutputEventDeleteErrorErrorType;
import com.anthropic.claude.tool.model.EventDeleteV0OutputEventDeleteResult;

/* JADX INFO: loaded from: classes3.dex */
public final class a72 implements v0i {
    public final EventDeleteV0Output E;
    public final EventDeleteV0OutputEventDeleteResult F;
    public final int G;
    public final int H;
    public final EventDeleteV0OutputEventDeleteErrorErrorType I;
    public final boolean J;

    /* JADX WARN: Removed duplicated region for block: B:25:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public a72(com.anthropic.claude.tool.model.EventDeleteV0Output r5) {
        /*
            r4 = this;
            r4.<init>()
            r4.E = r5
            boolean r0 = r5 instanceof com.anthropic.claude.tool.model.EventDeleteV0OutputEventDeleteResult
            r1 = 0
            if (r0 == 0) goto Ld
            com.anthropic.claude.tool.model.EventDeleteV0OutputEventDeleteResult r5 = (com.anthropic.claude.tool.model.EventDeleteV0OutputEventDeleteResult) r5
            goto Le
        Ld:
            r5 = r1
        Le:
            r4.F = r5
            r0 = 0
            if (r5 == 0) goto L49
            java.util.List r5 = r5.getDelete_results()
            if (r5 == 0) goto L49
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            boolean r2 = r5 instanceof java.util.Collection
            if (r2 == 0) goto L29
            r2 = r5
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L29
            goto L49
        L29:
            java.util.Iterator r5 = r5.iterator()
            r2 = r0
        L2e:
            boolean r3 = r5.hasNext()
            if (r3 == 0) goto L4a
            java.lang.Object r3 = r5.next()
            com.anthropic.claude.tool.model.EventDeleteV0OutputEventDeleteResultDeleteResultsItem r3 = (com.anthropic.claude.tool.model.EventDeleteV0OutputEventDeleteResultDeleteResultsItem) r3
            com.anthropic.claude.tool.model.EventDeleteV0OutputEventDeleteResultDeleteResultsItemError r3 = r3.getError()
            if (r3 != 0) goto L2e
            int r2 = r2 + 1
            if (r2 < 0) goto L45
            goto L2e
        L45:
            defpackage.x44.m0()
            throw r1
        L49:
            r2 = r0
        L4a:
            r4.G = r2
            com.anthropic.claude.tool.model.EventDeleteV0OutputEventDeleteResult r5 = r4.F
            if (r5 == 0) goto L5b
            java.util.List r5 = r5.getDelete_results()
            if (r5 == 0) goto L5b
            int r5 = r5.size()
            goto L5c
        L5b:
            r5 = r0
        L5c:
            int r5 = r5 - r2
            r4.H = r5
            com.anthropic.claude.tool.model.EventDeleteV0Output r5 = r4.E
            boolean r2 = r5 instanceof com.anthropic.claude.tool.model.EventDeleteV0OutputEventDeleteError
            if (r2 == 0) goto L68
            com.anthropic.claude.tool.model.EventDeleteV0OutputEventDeleteError r5 = (com.anthropic.claude.tool.model.EventDeleteV0OutputEventDeleteError) r5
            goto L69
        L68:
            r5 = r1
        L69:
            if (r5 == 0) goto L70
            com.anthropic.claude.tool.model.EventDeleteV0OutputEventDeleteErrorErrorType r5 = r5.getError_type()
            goto L71
        L70:
            r5 = r1
        L71:
            r4.I = r5
            com.anthropic.claude.tool.model.EventDeleteV0Output r5 = r4.E
            boolean r2 = r5 instanceof com.anthropic.claude.tool.model.EventDeleteV0OutputEventDeleteError
            if (r2 == 0) goto L7c
            r1 = r5
            com.anthropic.claude.tool.model.EventDeleteV0OutputEventDeleteError r1 = (com.anthropic.claude.tool.model.EventDeleteV0OutputEventDeleteError) r1
        L7c:
            if (r1 == 0) goto L7f
            r0 = 1
        L7f:
            r4.J = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a72.<init>(com.anthropic.claude.tool.model.EventDeleteV0Output):void");
    }

    @Override // defpackage.v0i
    public final String H(Context context, boolean z, boolean z2) {
        int i;
        context.getClass();
        EventDeleteV0OutputEventDeleteErrorErrorType eventDeleteV0OutputEventDeleteErrorErrorType = EventDeleteV0OutputEventDeleteErrorErrorType.APP_PERMISSION_DENIED;
        EventDeleteV0OutputEventDeleteErrorErrorType eventDeleteV0OutputEventDeleteErrorErrorType2 = this.I;
        if (eventDeleteV0OutputEventDeleteErrorErrorType2 == eventDeleteV0OutputEventDeleteErrorErrorType) {
            String string = context.getString(R.string.calendar_events_permission_denied_app);
            string.getClass();
            return string;
        }
        if (eventDeleteV0OutputEventDeleteErrorErrorType2 == EventDeleteV0OutputEventDeleteErrorErrorType.SYSTEM_PERMISSION_DENIED) {
            String string2 = context.getString(R.string.calendar_events_permission_denied_system);
            string2.getClass();
            return string2;
        }
        if (eventDeleteV0OutputEventDeleteErrorErrorType2 == EventDeleteV0OutputEventDeleteErrorErrorType.RESTRICTED_ACCESS) {
            String string3 = context.getString(R.string.calendar_events_access_restricted);
            string3.getClass();
            return string3;
        }
        if (z2 || this.J) {
            String string4 = context.getString(R.string.calendar_event_delete_status_failed);
            string4.getClass();
            return string4;
        }
        int i2 = this.G;
        if (z && (i = this.H) > 0 && i2 == 0) {
            String quantityString = context.getResources().getQuantityString(R.plurals.calendar_event_delete_status_failed_count, i, Integer.valueOf(i));
            quantityString.getClass();
            return quantityString;
        }
        if (!z || i2 <= 0) {
            String string5 = context.getString(R.string.calendar_event_delete_status_deleting);
            string5.getClass();
            return string5;
        }
        String quantityString2 = context.getResources().getQuantityString(R.plurals.calendar_event_delete_status_deleted, i2, Integer.valueOf(i2));
        quantityString2.getClass();
        return quantityString2;
    }
}
