package defpackage;

import com.anthropic.claude.api.chat.tool.ObjectProperty;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class yac implements w28 {
    public static final yac a;
    private static final SerialDescriptor descriptor;

    static {
        yac yacVar = new yac();
        a = yacVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("object", yacVar, 3);
        pluginGeneratedSerialDescriptor.j("description", true);
        pluginGeneratedSerialDescriptor.j("properties", true);
        pluginGeneratedSerialDescriptor.j("required", true);
        pluginGeneratedSerialDescriptor.k(new xmb(7));
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        kw9[] kw9VarArr = ObjectProperty.$childSerializers;
        return new KSerializer[]{d4c.S(srg.a), d4c.S((KSerializer) kw9VarArr[1].getValue()), d4c.S((KSerializer) kw9VarArr[2].getValue())};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = ObjectProperty.$childSerializers;
        boolean z = true;
        int i = 0;
        String str = null;
        Map map = null;
        List list = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                str = (String) ud4VarC.m(serialDescriptor, 0, srg.a, str);
                i |= 1;
            } else if (iX == 1) {
                map = (Map) ud4VarC.m(serialDescriptor, 1, (s06) kw9VarArr[1].getValue(), map);
                i |= 2;
            } else {
                if (iX != 2) {
                    sz6.e(iX);
                    return null;
                }
                list = (List) ud4VarC.m(serialDescriptor, 2, (s06) kw9VarArr[2].getValue(), list);
                i |= 4;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new ObjectProperty(i, str, map, list, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        ObjectProperty objectProperty = (ObjectProperty) obj;
        encoder.getClass();
        objectProperty.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        ObjectProperty.write$Self$api(objectProperty, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
