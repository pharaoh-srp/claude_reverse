package defpackage;

import com.anthropic.claude.api.notification.TestPushCategory;
import com.anthropic.claude.api.notification.TestPushRequest;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class adh implements w28 {
    public static final adh a;
    private static final SerialDescriptor descriptor;

    static {
        adh adhVar = new adh();
        a = adhVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.api.notification.TestPushRequest", adhVar, 1);
        pluginGeneratedSerialDescriptor.j("category", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{TestPushRequest.$childSerializers[0].getValue()};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = TestPushRequest.$childSerializers;
        vnf vnfVar = null;
        boolean z = true;
        int i = 0;
        TestPushCategory testPushCategory = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else {
                if (iX != 0) {
                    sz6.e(iX);
                    return null;
                }
                testPushCategory = (TestPushCategory) ud4VarC.l(serialDescriptor, 0, (s06) kw9VarArr[0].getValue(), testPushCategory);
                i = 1;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new TestPushRequest(i, testPushCategory, vnfVar);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        TestPushRequest testPushRequest = (TestPushRequest) obj;
        encoder.getClass();
        testPushRequest.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        vd4VarC.r(serialDescriptor, 0, (znf) TestPushRequest.$childSerializers[0].getValue(), testPushRequest.category);
        vd4VarC.b(serialDescriptor);
    }
}
