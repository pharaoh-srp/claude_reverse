package defpackage;

import com.anthropic.claude.api.memory.MelangeMeta;
import java.util.Date;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class o9b implements w28 {
    public static final o9b a;
    private static final SerialDescriptor descriptor;

    static {
        o9b o9bVar = new o9b();
        a = o9bVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.api.memory.MelangeMeta", o9bVar, 5);
        pluginGeneratedSerialDescriptor.j("path", false);
        pluginGeneratedSerialDescriptor.j("size_bytes", false);
        pluginGeneratedSerialDescriptor.j("updated_at", true);
        pluginGeneratedSerialDescriptor.j("display_name", true);
        pluginGeneratedSerialDescriptor.j("category_id", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        srg srgVar = srg.a;
        return new KSerializer[]{srgVar, xka.a, d4c.S(bc9.a), d4c.S(srgVar), d4c.S(srgVar)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        int i = 0;
        String strV = null;
        Date date = null;
        String str = null;
        String str2 = null;
        long j = 0;
        boolean z = true;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                strV = ud4VarC.v(serialDescriptor, 0);
                i |= 1;
            } else if (iX == 1) {
                j = ud4VarC.j(serialDescriptor, 1);
                i |= 2;
            } else if (iX == 2) {
                date = (Date) ud4VarC.m(serialDescriptor, 2, bc9.a, date);
                i |= 4;
            } else if (iX == 3) {
                str = (String) ud4VarC.m(serialDescriptor, 3, srg.a, str);
                i |= 8;
            } else {
                if (iX != 4) {
                    sz6.e(iX);
                    return null;
                }
                str2 = (String) ud4VarC.m(serialDescriptor, 4, srg.a, str2);
                i |= 16;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new MelangeMeta(i, strV, j, date, str, str2, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        MelangeMeta melangeMeta = (MelangeMeta) obj;
        encoder.getClass();
        melangeMeta.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        MelangeMeta.write$Self$api(melangeMeta, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
