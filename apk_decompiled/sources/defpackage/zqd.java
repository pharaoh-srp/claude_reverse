package defpackage;

import com.anthropic.claude.api.experience.ChatInputBannerContent;
import com.anthropic.claude.api.experience.Experience;
import com.anthropic.claude.api.experience.ExperienceButton;
import com.anthropic.claude.api.experience.ExperienceButtonType;
import com.anthropic.claude.api.experience.ExperienceConfig;
import com.anthropic.claude.api.experience.ExperienceContent;
import com.anthropic.claude.api.experience.ExperiencePlacement;
import com.anthropic.claude.api.experience.OpenLinkAction;
import com.pvporbit.freetype.FreeTypeConstants;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zqd {
    public static final /* synthetic */ int a = 0;

    static {
        new Experience("preview", "preview-chat-input-banner", ExperiencePlacement.ANDROID_CHAT_INPUT_BANNER, (ExperienceContent) new ChatInputBannerContent("Give Claude Pro for free", "Invite a friend — if they subscribe you **both** get a bonus month.", "gift", x44.W(new ExperienceButton(ExperienceButtonType.SECONDARY, "Send an invite", x44.W(new OpenLinkAction("claude://settings/guest-pass")))), (Boolean) null, (Integer) null, 48, (mq5) null), false, (ExperienceConfig) null, 48, (mq5) null);
    }

    public static final void a(Experience experience, zy7 zy7Var, zy7 zy7Var2, pz7 pz7Var, iqb iqbVar, ld4 ld4Var, int i) {
        int i2;
        zy7 zy7Var3;
        zy7 zy7Var4;
        pz7 pz7Var2;
        iqb iqbVar2;
        experience.getClass();
        zy7Var.getClass();
        zy7Var2.getClass();
        pz7Var.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(295169300);
        if ((i & 6) == 0) {
            i2 = (e18Var.f(experience) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            zy7Var3 = zy7Var;
            i2 |= e18Var.h(zy7Var3) ? 32 : 16;
        } else {
            zy7Var3 = zy7Var;
        }
        if ((i & 384) == 0) {
            zy7Var4 = zy7Var2;
            i2 |= e18Var.h(zy7Var4) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        } else {
            zy7Var4 = zy7Var2;
        }
        if ((i & 3072) == 0) {
            pz7Var2 = pz7Var;
            i2 |= e18Var.h(pz7Var2) ? 2048 : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        } else {
            pz7Var2 = pz7Var;
        }
        int i3 = i2 | 24576;
        if (e18Var.Q(i3 & 1, (i3 & 9363) != 9362)) {
            ExperienceContent content = experience.getContent();
            ChatInputBannerContent chatInputBannerContent = content instanceof ChatInputBannerContent ? (ChatInputBannerContent) content : null;
            if (chatInputBannerContent == null) {
                r7e r7eVarS = e18Var.s();
                if (r7eVarS != null) {
                    r7eVarS.d = new bg6(experience, zy7Var3, zy7Var4, pz7Var2, i);
                    return;
                }
                return;
            }
            eli eliVar = (eli) e18Var.j(ve4.t);
            boolean zF = e18Var.f(eliVar);
            Object objN = e18Var.N();
            lz1 lz1Var = jd4.a;
            if (zF || objN == lz1Var) {
                objN = new k87(new pac(1, eliVar, eli.class, "openUri", "openUri(Ljava/lang/String;)V", 0, 20));
                e18Var.k0(objN);
            }
            k87 k87Var = (k87) objN;
            Object objN2 = e18Var.N();
            if (objN2 == lz1Var) {
                objN2 = fd9.O(im6.E, e18Var);
                e18Var.k0(objN2);
            }
            l45 l45Var = (l45) objN2;
            ExperienceButton experienceButton = (ExperienceButton) w44.N0(chatInputBannerContent.getButtons());
            String title = chatInputBannerContent.getTitle();
            ud0 ud0Var = ud0.d;
            ud0 ud0VarW = v40.w(chatInputBannerContent.getTitle_icon());
            String description = chatInputBannerContent.getDescription();
            String text = experienceButton != null ? experienceButton.getText() : null;
            Boolean dismissible = chatInputBannerContent.getDismissible();
            boolean zBooleanValue = dismissible != null ? dismissible.booleanValue() : true;
            boolean zF2 = e18Var.f(experienceButton) | e18Var.h(l45Var) | e18Var.h(k87Var) | ((i3 & 7168) == 2048);
            Object objN3 = e18Var.N();
            if (zF2 || objN3 == lz1Var) {
                objN3 = new xqd(experienceButton, l45Var, k87Var, pz7Var, 0);
                e18Var.k0(objN3);
            }
            fqb fqbVar = fqb.E;
            b(title, zy7Var, zy7Var2, fqbVar, ud0VarW, description, text, zBooleanValue, (zy7) objN3, e18Var, (i3 & 1008) | 3072, 0);
            iqbVar2 = fqbVar;
        } else {
            e18Var.T();
            iqbVar2 = iqbVar;
        }
        r7e r7eVarS2 = e18Var.s();
        if (r7eVarS2 != null) {
            r7eVarS2.d = new pk(experience, zy7Var, zy7Var2, pz7Var, iqbVar2, i, 26);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:176:0x0452  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0464  */
    /* JADX WARN: Removed duplicated region for block: B:183:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0118  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(java.lang.String r39, defpackage.zy7 r40, defpackage.zy7 r41, defpackage.iqb r42, defpackage.ud0 r43, java.lang.String r44, java.lang.String r45, boolean r46, defpackage.zy7 r47, defpackage.ld4 r48, int r49, int r50) {
        /*
            Method dump skipped, instruction units count: 1144
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zqd.b(java.lang.String, zy7, zy7, iqb, ud0, java.lang.String, java.lang.String, boolean, zy7, ld4, int, int):void");
    }
}
