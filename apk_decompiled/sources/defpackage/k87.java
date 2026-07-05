package defpackage;

import android.webkit.URLUtil;
import com.anthropic.claude.api.experience.CacheType;
import com.anthropic.claude.api.experience.ExperienceClientAction;
import com.anthropic.claude.api.experience.NewChatAction;
import com.anthropic.claude.api.experience.OpenLinkAction;
import com.anthropic.claude.api.experience.RefreshCacheAction;
import com.anthropic.claude.api.experience.RemoteAction;
import com.anthropic.claude.api.experience.UnknownClientAction;
import com.anthropic.claude.core.telemetry.SilentException;

/* JADX INFO: loaded from: classes3.dex */
public final class k87 {
    public final pz7 a;
    public final bz7 b;
    public final pz7 c;
    public final sz7 d;

    public k87(bz7 bz7Var) {
        this(new lc4(25), bz7Var, new vj(2, null, 9), new i87(4, null));
    }

    public final Object a(ExperienceClientAction experienceClientAction, Boolean bool, vp4 vp4Var) {
        String str;
        boolean zBooleanValue;
        if (experienceClientAction instanceof NewChatAction) {
            NewChatAction newChatAction = (NewChatAction) experienceClientAction;
            zBooleanValue = ((Boolean) this.a.invoke(newChatAction.getInput_text(), newChatAction.getModel_id())).booleanValue();
        } else {
            if (experienceClientAction instanceof OpenLinkAction) {
                OpenLinkAction openLinkAction = (OpenLinkAction) experienceClientAction;
                if (URLUtil.isValidUrl(openLinkAction.getUrl()) || isg.q0(openLinkAction.getUrl(), "claude://", false)) {
                    this.b.invoke(openLinkAction.getUrl());
                    zBooleanValue = true;
                } else {
                    SilentException.a(new SilentException(ij0.i("Experience: open_link action with invalid URL: ", openLinkAction.getUrl())), null, false, 3);
                }
            } else {
                if (experienceClientAction instanceof RefreshCacheAction) {
                    CacheType cache = ((RefreshCacheAction) experienceClientAction).getCache();
                    int i = cache == null ? -1 : j87.a[cache.ordinal()];
                    if (i == -1) {
                        str = "Experience: refresh_cache action missing cache";
                    } else {
                        if (i != 1) {
                            return this.c.invoke(cache, vp4Var);
                        }
                        str = "Experience: refresh_cache action with unknown cache";
                    }
                } else if (experienceClientAction instanceof RemoteAction) {
                    RemoteAction remoteAction = (RemoteAction) experienceClientAction;
                    String id = remoteAction.getId();
                    if (id != null) {
                        return this.d.i(id, remoteAction.getParams(), bool, vp4Var);
                    }
                    str = "Experience: remote action missing id";
                } else if (experienceClientAction instanceof UnknownClientAction) {
                    str = "Experience: failed to handle unknown action";
                } else {
                    if (experienceClientAction != null) {
                        wg6.i();
                        return null;
                    }
                    str = "Experience: failed to handle null action";
                }
                ebh.A(str, null, false, 3);
            }
            zBooleanValue = false;
        }
        return Boolean.valueOf(zBooleanValue);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k87)) {
            return false;
        }
        k87 k87Var = (k87) obj;
        return x44.r(this.a, k87Var.a) && x44.r(this.b, k87Var.b) && x44.r(this.c, k87Var.c) && x44.r(this.d, k87Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + qy1.e(this.b, this.a.hashCode() * 31, 31)) * 31);
    }

    public final String toString() {
        return "ExperienceActionCallbacks(onNewChat=" + this.a + ", onOpenLink=" + this.b + ", onRefreshCache=" + this.c + ", onRemoteAction=" + this.d + ")";
    }

    public k87(pz7 pz7Var, bz7 bz7Var, pz7 pz7Var2, sz7 sz7Var) {
        this.a = pz7Var;
        this.b = bz7Var;
        this.c = pz7Var2;
        this.d = sz7Var;
    }
}
