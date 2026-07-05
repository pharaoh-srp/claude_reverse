package defpackage;

import android.content.Context;
import com.anthropic.claude.R;
import com.anthropic.claude.tool.model.HealthConnectQueryV0Output;
import com.anthropic.claude.tool.model.HealthConnectQueryV0OutputHealthConnectQueryError;
import com.anthropic.claude.tool.model.HealthConnectQueryV0OutputHealthConnectQueryErrorErrorType;

/* JADX INFO: loaded from: classes3.dex */
public final class dj8 implements v0i {
    public final HealthConnectQueryV0OutputHealthConnectQueryErrorErrorType E;
    public final boolean F;

    public dj8(HealthConnectQueryV0Output healthConnectQueryV0Output) {
        boolean z = healthConnectQueryV0Output instanceof HealthConnectQueryV0OutputHealthConnectQueryError;
        HealthConnectQueryV0OutputHealthConnectQueryError healthConnectQueryV0OutputHealthConnectQueryError = z ? (HealthConnectQueryV0OutputHealthConnectQueryError) healthConnectQueryV0Output : null;
        this.E = healthConnectQueryV0OutputHealthConnectQueryError != null ? healthConnectQueryV0OutputHealthConnectQueryError.getError_type() : null;
        this.F = (z ? (HealthConnectQueryV0OutputHealthConnectQueryError) healthConnectQueryV0Output : null) != null;
    }

    @Override // defpackage.v0i
    public final String H(Context context, boolean z, boolean z2) {
        context.getClass();
        HealthConnectQueryV0OutputHealthConnectQueryErrorErrorType healthConnectQueryV0OutputHealthConnectQueryErrorErrorType = HealthConnectQueryV0OutputHealthConnectQueryErrorErrorType.SYSTEM_PERMISSION_DENIED;
        HealthConnectQueryV0OutputHealthConnectQueryErrorErrorType healthConnectQueryV0OutputHealthConnectQueryErrorErrorType2 = this.E;
        if (healthConnectQueryV0OutputHealthConnectQueryErrorErrorType2 == healthConnectQueryV0OutputHealthConnectQueryErrorErrorType) {
            String string = context.getString(R.string.health_connect_query_permission_denied_system);
            string.getClass();
            return string;
        }
        if (healthConnectQueryV0OutputHealthConnectQueryErrorErrorType2 == HealthConnectQueryV0OutputHealthConnectQueryErrorErrorType.HEALTH_CONNECT_UNAVAILABLE) {
            String string2 = context.getString(R.string.health_connect_query_unavailable);
            string2.getClass();
            return string2;
        }
        if (z2 || this.F) {
            String string3 = context.getString(R.string.health_connect_query_status_failed);
            string3.getClass();
            return string3;
        }
        if (z) {
            String string4 = context.getString(R.string.health_connect_query_status_success);
            string4.getClass();
            return string4;
        }
        String string5 = context.getString(R.string.health_connect_query_status_querying);
        string5.getClass();
        return string5;
    }
}
