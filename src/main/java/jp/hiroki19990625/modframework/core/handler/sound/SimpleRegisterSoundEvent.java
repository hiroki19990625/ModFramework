package jp.hiroki19990625.modframework.core.handler.sound;

import net.minecraft.util.SoundEvent;

import javax.annotation.Nonnull;

public class SimpleRegisterSoundEvent implements IRegisterSoundEvent {
    private SoundEvent soundEventInstance;

    public SimpleRegisterSoundEvent(@Nonnull SoundEvent soundEvent) {
        this.soundEventInstance = soundEvent;
    }

    @Nonnull
    @Override
    public SoundEvent getSoundEvent() {
        return this.soundEventInstance;
    }
}
