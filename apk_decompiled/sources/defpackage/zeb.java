package defpackage;

import android.content.Context;
import com.anthropic.claude.R;
import com.anthropic.claude.tool.model.MessageComposeV0InputKind;

/* JADX INFO: loaded from: classes3.dex */
public final class zeb implements v0i {
    public final MessageComposeV0InputKind E;

    public zeb(MessageComposeV0InputKind messageComposeV0InputKind) {
        this.E = messageComposeV0InputKind;
    }

    @Override // defpackage.v0i
    public final String H(Context context, boolean z, boolean z2) {
        context.getClass();
        MessageComposeV0InputKind messageComposeV0InputKind = this.E;
        String string = context.getString(z2 ? messageComposeV0InputKind == MessageComposeV0InputKind.EMAIL ? R.string.email_tool_status_creation_failed : R.string.text_message_tool_status_creation_failed : z ? messageComposeV0InputKind == MessageComposeV0InputKind.EMAIL ? R.string.email_tool_status_creation_success : R.string.text_message_tool_status_creation_success : messageComposeV0InputKind == MessageComposeV0InputKind.EMAIL ? R.string.email_tool_status_creating : R.string.text_message_tool_status_creating);
        string.getClass();
        return string;
    }
}
