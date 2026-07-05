package com.anthropic.claude.chat.bottomsheet;

import com.anthropic.claude.api.chat.ChatFeedbackType;
import com.anthropic.claude.chat.bottomsheet.ChatScreenModalBottomSheetDestination;
import com.anthropic.claude.types.strings.MessageId;
import defpackage.d4c;
import defpackage.e79;
import defpackage.ehb;
import defpackage.ps2;
import defpackage.sz6;
import defpackage.ud4;
import defpackage.vd4;
import defpackage.w28;
import defpackage.zt1;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h implements w28 {
    public static final h a;
    private static final SerialDescriptor descriptor;

    static {
        h hVar = new h();
        a = hVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.chat.bottomsheet.ChatScreenModalBottomSheetDestination.Feedback", hVar, 4);
        pluginGeneratedSerialDescriptor.j("messageId", false);
        pluginGeneratedSerialDescriptor.j("messageIndex", false);
        pluginGeneratedSerialDescriptor.j("feedbackType", false);
        pluginGeneratedSerialDescriptor.j("isFeedbackTypeChangeable", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{ehb.a, e79.a, d4c.S(ps2.d), zt1.a};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        boolean z = true;
        int i = 0;
        int iR = 0;
        boolean zU = false;
        String strM1057unboximpl = null;
        ChatFeedbackType chatFeedbackType = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                MessageId messageId = (MessageId) ud4VarC.l(serialDescriptor, 0, ehb.a, strM1057unboximpl != null ? MessageId.m1051boximpl(strM1057unboximpl) : null);
                strM1057unboximpl = messageId != null ? messageId.m1057unboximpl() : null;
                i |= 1;
            } else if (iX == 1) {
                iR = ud4VarC.r(serialDescriptor, 1);
                i |= 2;
            } else if (iX == 2) {
                chatFeedbackType = (ChatFeedbackType) ud4VarC.m(serialDescriptor, 2, ps2.d, chatFeedbackType);
                i |= 4;
            } else {
                if (iX != 3) {
                    sz6.e(iX);
                    return null;
                }
                zU = ud4VarC.u(serialDescriptor, 3);
                i |= 8;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new ChatScreenModalBottomSheetDestination.Feedback(i, strM1057unboximpl, iR, chatFeedbackType, zU, null, null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        ChatScreenModalBottomSheetDestination.Feedback feedback = (ChatScreenModalBottomSheetDestination.Feedback) obj;
        encoder.getClass();
        feedback.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        ChatScreenModalBottomSheetDestination.Feedback.write$Self$chat(feedback, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
