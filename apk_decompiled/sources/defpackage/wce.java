package defpackage;

import com.anthropic.claude.api.experience.CacheType;
import com.anthropic.claude.api.experience.RefreshCacheAction;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class wce implements w28 {
    public static final wce a;
    private static final SerialDescriptor descriptor;

    static {
        wce wceVar = new wce();
        a = wceVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("refresh_cache", wceVar, 1);
        pluginGeneratedSerialDescriptor.j("cache", true);
        pluginGeneratedSerialDescriptor.k(new gl0(5));
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{d4c.S(q52.d)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        vnf vnfVar = null;
        boolean z = true;
        int i = 0;
        CacheType cacheType = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else {
                if (iX != 0) {
                    sz6.e(iX);
                    return null;
                }
                cacheType = (CacheType) ud4VarC.m(serialDescriptor, 0, q52.d, cacheType);
                i = 1;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new RefreshCacheAction(i, cacheType, vnfVar);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        RefreshCacheAction refreshCacheAction = (RefreshCacheAction) obj;
        encoder.getClass();
        refreshCacheAction.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        RefreshCacheAction.write$Self$api(refreshCacheAction, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
