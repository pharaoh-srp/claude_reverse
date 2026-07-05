package defpackage;

import android.content.Context;
import com.anthropic.claude.R;
import com.anthropic.claude.tool.model.MessageComposeV1InputKind;

/* JADX INFO: loaded from: classes3.dex */
public final class afb implements v0i {
    public final MessageComposeV1InputKind E;

    public afb(MessageComposeV1InputKind messageComposeV1InputKind) {
        this.E = messageComposeV1InputKind;
    }

    @Override // defpackage.v0i
    public final String H(Context context, boolean z, boolean z2) {
        context.getClass();
        MessageComposeV1InputKind messageComposeV1InputKind = this.E;
        String string = context.getString(z2 ? messageComposeV1InputKind == MessageComposeV1InputKind.EMAIL ? R.string.email_tool_status_creation_failed : R.string.text_message_tool_status_creation_failed : z ? messageComposeV1InputKind == MessageComposeV1InputKind.EMAIL ? R.string.email_tool_status_creation_success : R.string.text_message_tool_status_creation_success : messageComposeV1InputKind == MessageComposeV1InputKind.EMAIL ? R.string.email_tool_status_creating : R.string.text_message_tool_status_creating);
        string.getClass();
        return string;
    }
}
