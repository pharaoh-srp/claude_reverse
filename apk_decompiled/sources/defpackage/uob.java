package defpackage;

import com.anthropic.claude.api.model.Badge;
import com.anthropic.claude.api.model.ThinkingOption;
import com.anthropic.claude.types.strings._ServerLocalizedString;

/* JADX INFO: loaded from: classes.dex */
public abstract class uob {
    /* JADX WARN: Removed duplicated region for block: B:34:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.anthropic.claude.api.model.ModelSelectorEntry a(com.anthropic.claude.api.model.ModelSelectorEntry r19, defpackage.lea r20) {
        /*
            Method dump skipped, instruction units count: 232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uob.a(com.anthropic.claude.api.model.ModelSelectorEntry, lea):com.anthropic.claude.api.model.ModelSelectorEntry");
    }

    public static final ThinkingOption b(ThinkingOption thinkingOption, lea leaVar) {
        _ServerLocalizedString _serverlocalizedstringC = c(thinkingOption.getName(), leaVar);
        _ServerLocalizedString description = thinkingOption.getDescription();
        Badge badgeCopy$default = null;
        _ServerLocalizedString _serverlocalizedstringC2 = description != null ? c(description, leaVar) : null;
        Badge badge = thinkingOption.getBadge();
        if (badge != null) {
            _ServerLocalizedString message = badge.getMessage();
            badgeCopy$default = Badge.copy$default(badge, message != null ? c(message, leaVar) : null, null, 2, null);
        }
        return ThinkingOption.copy$default(thinkingOption, null, _serverlocalizedstringC, _serverlocalizedstringC2, false, badgeCopy$default, 9, null);
    }

    public static final _ServerLocalizedString c(_ServerLocalizedString _serverlocalizedstring, lea leaVar) {
        return new _ServerLocalizedString(_serverlocalizedstring.getEnglish(), leaVar.b(_serverlocalizedstring.getEnglish()));
    }
}
