package defpackage;

import com.anthropic.claude.mcpapps.transport.HostCapabilities;
import com.anthropic.claude.mcpapps.transport.HostContext;
import com.anthropic.claude.mcpapps.transport.HostInfo;
import com.anthropic.claude.mcpapps.transport.InitializeResult;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class r29 implements w28 {
    public static final r29 a;
    private static final SerialDescriptor descriptor;

    static {
        r29 r29Var = new r29();
        a = r29Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.mcpapps.transport.InitializeResult", r29Var, 4);
        pluginGeneratedSerialDescriptor.j("protocolVersion", true);
        pluginGeneratedSerialDescriptor.j("hostInfo", false);
        pluginGeneratedSerialDescriptor.j("hostCapabilities", true);
        pluginGeneratedSerialDescriptor.j("hostContext", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{srg.a, dp8.a, yo8.a, ap8.a};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        boolean z = true;
        int i = 0;
        String strV = null;
        HostInfo hostInfo = null;
        HostCapabilities hostCapabilities = null;
        HostContext hostContext = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                strV = ud4VarC.v(serialDescriptor, 0);
                i |= 1;
            } else if (iX == 1) {
                hostInfo = (HostInfo) ud4VarC.l(serialDescriptor, 1, dp8.a, hostInfo);
                i |= 2;
            } else if (iX == 2) {
                hostCapabilities = (HostCapabilities) ud4VarC.l(serialDescriptor, 2, yo8.a, hostCapabilities);
                i |= 4;
            } else {
                if (iX != 3) {
                    sz6.e(iX);
                    return null;
                }
                hostContext = (HostContext) ud4VarC.l(serialDescriptor, 3, ap8.a, hostContext);
                i |= 8;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new InitializeResult(i, strV, hostInfo, hostCapabilities, hostContext, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        InitializeResult initializeResult = (InitializeResult) obj;
        encoder.getClass();
        initializeResult.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        InitializeResult.write$Self$Claude_mcpapp(initializeResult, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
