package jp.hiroki19990625.modframework.core.handler.sound;

import net.minecraft.util.SoundEvent;

import javax.annotation.Nonnull;

public interface IRegisterSoundEvent {
    @Nonnull
    SoundEvent getSoundEvent();
}
