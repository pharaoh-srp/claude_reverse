package defpackage;

import com.anthropic.claude.api.experience.ChatInputBannerContent;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class qt2 implements w28 {
    public static final qt2 a;
    private static final SerialDescriptor descriptor;

    static {
        qt2 qt2Var = new qt2();
        a = qt2Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("android-chat-input-banner", qt2Var, 6);
        pluginGeneratedSerialDescriptor.j("title", true);
        pluginGeneratedSerialDescriptor.j("description", true);
        pluginGeneratedSerialDescriptor.j("title_icon", true);
        pluginGeneratedSerialDescriptor.j("buttons", true);
        pluginGeneratedSerialDescriptor.j("dismissible", true);
        pluginGeneratedSerialDescriptor.j("min_messages", true);
        pluginGeneratedSerialDescriptor.k(new gl0(6));
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        kw9[] kw9VarArr = ChatInputBannerContent.$childSerializers;
        srg srgVar = srg.a;
        return new KSerializer[]{d4c.S(srgVar), d4c.S(srgVar), d4c.S(srgVar), kw9VarArr[3].getValue(), d4c.S(zt1.a), d4c.S(e79.a)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = ChatInputBannerContent.$childSerializers;
        boolean z = true;
        int i = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        List list = null;
        Boolean bool = null;
        Integer num = null;
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
                    list = (List) ud4VarC.l(serialDescriptor, 3, (s06) kw9VarArr[3].getValue(), list);
                    i |= 8;
                    break;
                case 4:
                    bool = (Boolean) ud4VarC.m(serialDescriptor, 4, zt1.a, bool);
                    i |= 16;
                    break;
                case 5:
                    num = (Integer) ud4VarC.m(serialDescriptor, 5, e79.a, num);
                    i |= 32;
                    break;
                default:
                    sz6.e(iX);
                    return null;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new ChatInputBannerContent(i, str, str2, str3, list, bool, num, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        ChatInputBannerContent chatInputBannerContent = (ChatInputBannerContent) obj;
        encoder.getClass();
        chatInputBannerContent.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        ChatInputBannerContent.write$Self$api(chatInputBannerContent, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
