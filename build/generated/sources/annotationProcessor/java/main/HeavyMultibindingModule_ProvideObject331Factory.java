import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.processing.Generated;

@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class HeavyMultibindingModule_ProvideObject331Factory implements Factory<Object> {
  private final HeavyMultibindingModule module;

  public HeavyMultibindingModule_ProvideObject331Factory(HeavyMultibindingModule module) {
    this.module = module;
  }

  @Override
  public Object get() {
    return provideObject331(module);
  }

  public static HeavyMultibindingModule_ProvideObject331Factory create(
      HeavyMultibindingModule module) {
    return new HeavyMultibindingModule_ProvideObject331Factory(module);
  }

  public static Object provideObject331(HeavyMultibindingModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideObject331());
  }
}
