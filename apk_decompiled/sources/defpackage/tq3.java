package defpackage;

import com.anthropic.claude.analytics.events.CodeBlockEvents$CodeBlockAction;
import com.anthropic.claude.analytics.events.CodeBlockEvents$CodeBlockActionClicked;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class tq3 implements w28 {
    public static final tq3 a;
    private static final SerialDescriptor descriptor;

    static {
        tq3 tq3Var = new tq3();
        a = tq3Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("code_block_action_clicked", tq3Var, 6);
        pluginGeneratedSerialDescriptor.j("organization_uuid", true);
        pluginGeneratedSerialDescriptor.j("chat_uuid", true);
        pluginGeneratedSerialDescriptor.j("message_uuid", true);
        pluginGeneratedSerialDescriptor.j("action", false);
        pluginGeneratedSerialDescriptor.j("code_language", true);
        pluginGeneratedSerialDescriptor.j("code_length", false);
        pluginGeneratedSerialDescriptor.k(new pi(15));
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        kw9[] kw9VarArr = CodeBlockEvents$CodeBlockActionClicked.$childSerializers;
        srg srgVar = srg.a;
        return new KSerializer[]{d4c.S(srgVar), d4c.S(srgVar), d4c.S(srgVar), kw9VarArr[3].getValue(), d4c.S(srgVar), e79.a};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = CodeBlockEvents$CodeBlockActionClicked.$childSerializers;
        boolean z = true;
        int i = 0;
        int iR = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        CodeBlockEvents$CodeBlockAction codeBlockEvents$CodeBlockAction = null;
        String str4 = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            switch (iX) {
                case -1:
                    z = false;
                    break;
                case 0:
                    str = (String) ud4VarC.m(serialDescriptor, 0, srg.a, str);
                    i |= 1;
                    break;
                case 1:
                    str2 = (String) ud4VarC.m(serialDescriptor, 1, srg.a, str2);
                    i |= 2;
                    break;
                case 2:
                    str3 = (String) ud4VarC.m(serialDescriptor, 2, srg.a, str3);
                    i |= 4;
                    break;
                case 3:
                    codeBlockEvents$CodeBlockAction = (CodeBlockEvents$CodeBlockAction) ud4VarC.l(serialDescriptor, 3, (s06) kw9VarArr[3].getValue(), codeBlockEvents$CodeBlockAction);
                    i |= 8;
                    break;
                case 4:
                    str4 = (String) ud4VarC.m(serialDescriptor, 4, srg.a, str4);
                    i |= 16;
                    break;
                case 5:
                    iR = ud4VarC.r(serialDescriptor, 5);
                    i |= 32;
                    break;
                default:
                    sz6.e(iX);
                    return null;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new CodeBlockEvents$CodeBlockActionClicked(i, str, str2, str3, codeBlockEvents$CodeBlockAction, str4, iR, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        CodeBlockEvents$CodeBlockActionClicked codeBlockEvents$CodeBlockActionClicked = (CodeBlockEvents$CodeBlockActionClicked) obj;
        encoder.getClass();
        codeBlockEvents$CodeBlockActionClicked.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        CodeBlockEvents$CodeBlockActionClicked.write$Self$analytics(codeBlockEvents$CodeBlockActionClicked, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
